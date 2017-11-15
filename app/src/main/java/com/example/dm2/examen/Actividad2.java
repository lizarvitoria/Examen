package com.example.dm2.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class Actividad2 extends AppCompatActivity {
    private Spinner cmbOpciones;
    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        cmbOpciones =(Spinner) findViewById(R.id.CmbOpciones);
        layout = (LinearLayout)findViewById(R.id.layout1);
        final String[] datos = new String[] {"Bizkaia","Araba",
                "Gipuzkoa","Nafarroa", "Lapurdi", "Behe-Nafarroa", "Zuberoa"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, datos);
        adaptador.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        cmbOpciones.setAdapter(adaptador);
        cmbOpciones.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener(){
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView,
                                               View view, int i, long l) {
                       if(cmbOpciones.getSelectedItemPosition()==1)
                            layout.setVisibility(View.INVISIBLE);
                        else
                            layout.setVisibility(View.VISIBLE);
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });
    }
}
