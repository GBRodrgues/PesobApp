package com.example.pesobapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private ImageButton btnFogo, btnInf;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Starting");

        //iniciando a intent
        Intent fogo = new Intent(this, TelaFogo.class);
        btnFogo = (ImageButton) findViewById(R.id.fogoBtn);
        btnFogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(fogo);
            }
        });

        btnInf = (ImageButton) findViewById(R.id.infoBtn);
        Intent inf = new Intent(this, InfoBrigada.class);
        btnInf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(inf);
            }
        });


    }


}