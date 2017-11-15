package com.example.dm2.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void noImplementado(View v){
        Toast.makeText(MainActivity.this,"Actividad sin implementar por el momento",Toast.LENGTH_SHORT).show();
    }
    public void noImplementadoEn(View v){
        Toast.makeText(MainActivity.this,"Activity not implemented at the moment",Toast.LENGTH_SHORT).show();
    }

    public void actividad1(View v){
        Intent Ejer1 = new Intent(MainActivity.this, Actividad1.class);
        startActivity(Ejer1);
    }
    public void actividad2(View v){
        Intent Ejer2 = new Intent(MainActivity.this, Actividad2.class);
        startActivity(Ejer2);
    }

    public void cerrar(View v){
        finish();
    }
}
