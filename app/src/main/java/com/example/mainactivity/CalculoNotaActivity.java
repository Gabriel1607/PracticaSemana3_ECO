package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
        notaEdit1.setInputType(InputType.TYPE_CLASS_NUMBER|InputType.TYPE_NUMBER_FLAG_DECIMAL);
        notaEdit2.setInputType(InputType.TYPE_CLASS_NUMBER|InputType.TYPE_NUMBER_FLAG_DECIMAL);
        notaEdit3.setInputType(InputType.TYPE_CLASS_NUMBER|InputType.TYPE_NUMBER_FLAG_DECIMAL);
        notaEdit4.setInputType(InputType.TYPE_CLASS_NUMBER|InputType.TYPE_NUMBER_FLAG_DECIMAL);
        notaEdit5.setInputType(InputType.TYPE_CLASS_NUMBER|InputType.TYPE_NUMBER_FLAG_DECIMAL);
        calcBtn = findViewById(R.id.calcBtn);
        calcBtn.setOnClickListener(
                (v) ->{
                    if(!notaEdit1.getText().toString().isEmpty()&&
                            !notaEdit2.getText().toString().isEmpty()&&
                            !notaEdit3.getText().toString().isEmpty()&&
                            !notaEdit4.getText().toString().isEmpty()&&
                            !notaEdit5.getText().toString().isEmpty()) {
                    double finalgrade = CalcularNota();
                        Toast.makeText(this,Double.toString(finalgrade), Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(this,ResultsActivity.class);
                        i.putExtra("nota",finalgrade);
                    startActivity(i);

                }else{
                        Toast.makeText(this, "Ingrese toda las notas", Toast.LENGTH_SHORT).show();
                    }

                }
        );
    }
    public double CalcularNota(){
        double proyecto1;
        double proyecto2;
        double quices;
        double parcial1;
        double parcial2;
        double notafinal;


        proyecto1 = Double.parseDouble(notaEdit1.getText().toString());
            proyecto2 = Double.parseDouble(notaEdit2.getText().toString());
            quices = Double.parseDouble(notaEdit3.getText().toString());
            parcial1 = Double.parseDouble(notaEdit4.getText().toString());
            parcial2 = Double.parseDouble(notaEdit5.getText().toString());

           notafinal = ((proyecto1 * 0.25) + (proyecto2 * 0.25) + (quices * 0.15) + (parcial1 * 0.15) + (parcial2 * 0.15));

        return notafinal;
    }
    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sp = getSharedPreferences("colorcitos",MODE_PRIVATE);
        String color = sp.getString("color","#FFFFFF");
        bgCalc.setBackgroundColor(Color.parseColor(color));
    }
}