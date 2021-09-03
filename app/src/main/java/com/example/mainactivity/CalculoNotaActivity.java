package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculoNotaActivity extends AppCompatActivity {
private TextView tituloCalc;
private EditText notaEdit1,notaEdit2,notaEdit3,notaEdit4,notaEdit5;
private Button calcBtn;
private ConstraintLayout bgCalc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_nota);
        bgCalc = findViewById(R.id.bgCalc);
        tituloCalc = findViewById(R.id.tituloCalc);
        notaEdit1 = findViewById(R.id.notaEdit1);
        notaEdit2 = findViewById(R.id.notaEdit2);
        notaEdit3 = findViewById(R.id.notaEdit3);
        notaEdit4 = findViewById(R.id.notaEdit4);
        notaEdit5 = findViewById(R.id.notaEdit5);
        calcBtn = findViewById(R.id.calcBtn);
        calcBtn.setOnClickListener(
                (v) ->{
                    Intent i = new Intent(this,ResultsActivity.class);
                    startActivity(i);
                }
        );
    }
    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sp = getSharedPreferences("colorcitos",MODE_PRIVATE);
        String color = sp.getString("color","#FFFFFF");
        bgCalc.setBackgroundColor(Color.parseColor(color));
    }
}