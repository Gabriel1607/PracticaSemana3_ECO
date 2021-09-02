package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ConfigActivity extends AppCompatActivity {
private Button azulBtn,blancoBtn,negroBtn;
private TextView tituloConfig,texticoConfig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);
        SharedPreferences sp = getSharedPreferences("colorcitos",MODE_PRIVATE);
        azulBtn = findViewById(R.id.azulBtn);
        azulBtn.setOnClickListener(
                (v) ->{
                    sp.edit().putString("color","#2196F3").apply();
                    finish();
                }
        );
        blancoBtn = findViewById(R.id.blancoBtn);
        blancoBtn.setOnClickListener(
                (v) ->{
                    sp.edit().putString("color","#FFFFFF").apply();
                    finish();
                }
        );
        negroBtn = findViewById(R.id.negroBtn);
        negroBtn.setOnClickListener(
                (v) ->{
                    sp.edit().putString("color","#000000").apply();
                    finish();
                }
        );
        tituloConfig = findViewById(R.id.tituloConfig);
        texticoConfig = findViewById(R.id.texticoConfig);

    }
}