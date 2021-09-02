package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button configBtn,continuarBtn;
private TextView textico;
private EditText nombreEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configBtn = findViewById(R.id.configBtn);
        continuarBtn = findViewById(R.id.continuarBtn);
        textico = findViewById(R.id.textico);
        nombreEdit = findViewById(R.id.nombreEdit);
    }
}