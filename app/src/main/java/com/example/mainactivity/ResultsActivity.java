package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {
private TextView tituloResult,texticoResult,resultNota;
private Button calcBtnPlus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        tituloResult = findViewById(R.id.tituloResult);
        texticoResult = findViewById(R.id.texticoResult);
        resultNota = findViewById(R.id.resultNota);
        calcBtnPlus = findViewById(R.id.calcBtnPlus);
    }
}