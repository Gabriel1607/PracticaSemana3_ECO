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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button configBtn,continuarBtn;
private TextView textico;
private EditText nombreEdit;
private ConstraintLayout bg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences sp1 = getSharedPreferences("colorcitos",MODE_PRIVATE);
        configBtn = findViewById(R.id.configBtn);
        bg = findViewById(R.id.bg);
        continuarBtn = findViewById(R.id.continuarBtn);
        textico = findViewById(R.id.textico);
        nombreEdit = findViewById(R.id.nombreEdit);
        configBtn.setOnClickListener(
                (v) ->{
                    Intent i = new Intent(this,ConfigActivity.class);
                    startActivity(i);
                }
        );

        continuarBtn.setOnClickListener(
                (v) ->{
                    if(!nombreEdit.getText().toString().replaceAll("\\s","").isEmpty()){
                        sp1.edit().putString("nombre", nombreEdit.getText().toString().trim()).apply();
                        Intent i = new Intent(this, CalculoNotaActivity.class);
                        startActivity(i);
                    }else{
                        Toast.makeText(this, "Ingrese un nombre", Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sp = getSharedPreferences("colorcitos",MODE_PRIVATE);
        String color = sp.getString("color","#FFFFFF");
        bg.setBackgroundColor(Color.parseColor(color));
    }
}