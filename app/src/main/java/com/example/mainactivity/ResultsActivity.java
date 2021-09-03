package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {
private TextView tituloResult,texticoResult,resultNota;
private Button calcBtnPlus;
private ConstraintLayout bgResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        bgResult = findViewById(R.id.bgResult);
        tituloResult = findViewById(R.id.tituloResult);
        texticoResult = findViewById(R.id.texticoResult);
        resultNota = findViewById(R.id.resultNota);
        calcBtnPlus = findViewById(R.id.calcBtnPlus);
        calcBtnPlus.setOnClickListener(
                (v) ->{
                    Intent i = new Intent(this,MainActivity.class);
                    startActivity(i);
                }
        );
    }
    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sp = getSharedPreferences("colorcitos",MODE_PRIVATE);
        String color = sp.getString("color","#FFFFFF");
        bgResult.setBackgroundColor(Color.parseColor(color));
    }
}