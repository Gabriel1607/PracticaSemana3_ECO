package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

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
        azulBtn = findViewById(R.id.azulBtn);
        blancoBtn = findViewById(R.id.blancoBtn);
        negroBtn = findViewById(R.id.negroBtn);
        tituloConfig = findViewById(R.id.tituloConfig);
        texticoConfig = findViewById(R.id.texticoConfig);

    }
}