package com.example.dm2.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Actividad1 extends AppCompatActivity {
    private RadioGroup grupo1;
    private RadioButton btn1, btn2, btn3;
    private Button empezar, evaluar;
    private EditText txt;
    private int aciertos, total=0, num1, num2;
    private boolean seguir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);
        grupo1 = (RadioGroup)findViewById(R.id.GrbGrupo1);
        btn1 = (RadioButton)findViewById(R.id.RbOpcion1);
        btn2 = (RadioButton)findViewById(R.id.RbOpcion2);
        btn3 = (RadioButton)findViewById(R.id.RbOpcion3);
        empezar = (Button)findViewById(R.id.btnEmpezar);
        evaluar = (Button)findViewById(R.id.btnEvaluar);
        txt = (EditText)findViewById(R.id.lbltexto);
    }

    public void empezar(View v){
        if(btn1.isChecked()||btn2.isChecked()||btn3.isChecked()){
            empezar.setVisibility(View.INVISIBLE);
            evaluar.setVisibility(View.VISIBLE);
            if(btn1.isChecked()){
                num1=(int)(Math.random()*99)+1;
                num2=(int)(Math.random()*99)+1;
                txt.setText(num1+" + "+num2+" =");
                total++;
            }
            if(btn2.isChecked()){
                num1=(int)(Math.random()*99)+1;
                num2=(int)(Math.random()*99)+1;
                txt.setText(num1+" - "+num2+" =");
                total++;
            }
            if(btn3.isChecked()){
                num1=(int)(Math.random()*99)+1;
                num2=(int)(Math.random()*99)+1;
                txt.setText(num1+" * "+num2+" =");
                total++;
            }
        }else{
            Toast.makeText(Actividad1.this,"Debe seleccionar una opcion, para empezar con los calculos",Toast.LENGTH_SHORT).show();
        }
    }

    public void evaluar(View v){
        if(total==9){
            if(btn1.isChecked()) {
                if ((num1 + num2) == Integer.parseInt(txt.getText().toString().substring(txt.getText().toString().indexOf("="), txt.length())))
                    aciertos++;
            }
            if(btn2.isChecked()) {
                if ((num1 + num2) == Integer.parseInt(txt.getText().toString().substring(txt.getText().toString().indexOf("="), txt.length())))
                    aciertos++;
            }
            if(btn1.isChecked()) {
                if ((num1 + num2) == Integer.parseInt(txt.getText().toString().substring(txt.getText().toString().indexOf("="), txt.length())))
                    aciertos++;
            }
            txt.setText("");
            btn1.setSelected(false);
            btn2.setSelected(false);
            btn3.setSelected(false);
            evaluar.setVisibility(View.INVISIBLE);
            empezar.setVisibility(View.VISIBLE);
            Toast.makeText(Actividad1.this,"Has tenido un "+(aciertos*100/10)+"% de aciertos",Toast.LENGTH_SHORT).show();
            total=0;
            aciertos=0;
        }else{
            if(btn1.isChecked()){
                if((num1+num2)==Integer.parseInt(txt.getText().toString().substring(txt.getText().toString().indexOf("="), txt.length())))
                    aciertos++;
                num1=(int)(Math.random()*99)+1;
                num2=(int)(Math.random()*99)+1;
                txt.setText(num1+" + "+num2+" =");
                total++;
            }
            if(btn2.isChecked()){
                if((num1-num2)==Integer.parseInt(txt.getText().toString().substring(txt.getText().toString().indexOf("="), txt.length())))
                    aciertos++;
                num1=(int)(Math.random()*99)+1;
                num2=(int)(Math.random()*99)+1;
                txt.setText(num1+" - "+num2+" =");
                total++;
            }
            if(btn3.isChecked()){
                if((num1*num2)==Integer.parseInt(txt.getText().toString().substring(txt.getText().toString().indexOf("="), txt.length())))
                    aciertos++;
                num1=(int)(Math.random()*99)+1;
                num2=(int)(Math.random()*99)+1;
                txt.setText(num1+" * "+num2+" =");
                total++;
            }
        }
    }

    public void salir(View v){
        finish();
    }
}
