package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ConfigActivity extends AppCompatActivity {
private Button azulBtn,blancoBtn,negroBtn;
private TextView tituloConfig,texticoConfig;
private ConstraintLayout bgConfig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);
        bgConfig = findViewById(R.id.bgConfig);
        SharedPreferences sp = getSharedPreferences("colorcitos",MODE_PRIVATE);
        azulBtn = findViewById(R.id.azulBtn);
        azulBtn.setOnClickListener(
                (v) ->{
                    sp.edit().putString("color","#8acae7").apply();
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
    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sp = getSharedPreferences("colorcitos",MODE_PRIVATE);
        String color = sp.getString("color","#FFFFFF");
        bgConfig.setBackgroundColor(Color.parseColor(color));
    }
}