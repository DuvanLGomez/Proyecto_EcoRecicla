package com.example.proyectoecorecicla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pantallacategorias extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent pasarpa2= new Intent(getApplicationContext(),Pantallaregistro.class);
        Intent pasarpa3= new Intent(getApplicationContext(), Pantallaprincipal.class);
        setContentView(R.layout.activity_pantallacategorias);
        Button boton1 = findViewById(R.id.Registrarresic);
        Button boton2 = findViewById(R.id.Btnatrascatego);
boton2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        startActivity(pasarpa3);
    }
});
boton1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        startActivity(pasarpa2);
    }
});

    }



}