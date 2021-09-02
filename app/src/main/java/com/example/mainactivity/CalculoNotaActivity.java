package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculoNotaActivity extends AppCompatActivity {
private TextView tituloCalc;
private EditText notaEdit1,notaEdit2,notaEdit3,notaEdit4,notaEdit5;
private Button calcBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_nota);
        tituloCalc = findViewById(R.id.tituloCalc);
        notaEdit1 = findViewById(R.id.notaEdit1);
        notaEdit2 = findViewById(R.id.notaEdit2);
        notaEdit3 = findViewById(R.id.notaEdit3);
        notaEdit4 = findViewById(R.id.notaEdit4);
        notaEdit5 = findViewById(R.id.notaEdit5);
        calcBtn = findViewById(R.id.calcBtn);

    }
}