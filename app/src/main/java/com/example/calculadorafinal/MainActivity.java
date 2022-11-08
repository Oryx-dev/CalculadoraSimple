package com.example.calculadorafinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import java.lang.reflect.Array;


public class MainActivity extends AppCompatActivity {

    private TextView pantalla;
    public float num1,num2,numPantalla;
    public String operador,resultado;
    public boolean isResta,isSuma,isOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pantalla = findViewById(R.id.textView);
    }

   public void boton(View v){
        isOn = false;
        isSuma = false;
        isResta = false;
        Button b = (Button)v;
        pantalla.setText(pantalla.getText() + b.getText().toString());
    }

    public void punto(View v){
        Button b = (Button)v;
        if((pantalla.getText()).toString().contains(".") || pantalla.getText() == ""){

        }else{
            pantalla.setText(pantalla.getText() + b.getText().toString());
        }
    }

    public void suma(View v){
        try{
            if(!isOn) {
                isOn = true;
                numPantalla = Float.parseFloat(pantalla.getText().toString());
                num1 = (num1 + numPantalla);
                operador = "+";
                pantalla.setText("");
            }else{

            }
        }catch(Exception NumberFormatException){

        }


    }
    public void resta(View v){
        try{
            if(!isOn){
                isOn = true;
                numPantalla = Float.parseFloat(pantalla.getText().toString());
                num1 = (num1 + numPantalla);
                operador = "-";
                pantalla.setText("");
            }else{

            }
        }catch(Exception NumberFormatException){

        }


    }
    public void multiplicacion(View v){
        try{
            if(!isOn){
                isOn=true;
                numPantalla = Float.parseFloat(pantalla.getText().toString());
                num1 = (num1 + numPantalla);
                operador = "x";
                pantalla.setText("");
            }else{

            }

        }catch(Exception NumberFormatException){

        }


    }
    public void division(View v){
        try{
            if(!isOn){
                isOn=true;
                numPantalla = Float.parseFloat(pantalla.getText().toString());
                num1 = (num1 + numPantalla);
                operador = "/";
                pantalla.setText("");
            }else{

            }

        }catch(Exception NumberFormatException){

        }



    }

    public void limpiar(View v){
        pantalla.setText("");
    }

    public void borrar(View v) {
        if ((pantalla.getText() == "") || (((pantalla.getText()).toString()).length() <= 0)) {

        }else{
            pantalla.setText(((pantalla.getText()).toString()).substring(0, ((pantalla.getText()).toString()).length() - 1));
        }
    }




    public void resultado(View v){

       try{
           num2 =  Float.parseFloat(pantalla.getText().toString());
            switch(operador) {
                case "+":
                    resultado = Float.toString(num1 + num2);
                    pantalla.setText((resultado));
                    num1 = 0;
                    break;
                case "-":
                    resultado = Float.toString(num1 - num2);
                    pantalla.setText((resultado));
                    num1 = 0;
                    break;
                case "x":
                    resultado = Float.toString(num1 * num2);
                    pantalla.setText((resultado));
                    num1 = 0;
                    break;
                case "/":
                    resultado = Float.toString(num1 / num2);
                    pantalla.setText((resultado));
                    num1 = 0;
                    break;
            }
       }catch(Exception NumberFormatException){

    }








    }




}