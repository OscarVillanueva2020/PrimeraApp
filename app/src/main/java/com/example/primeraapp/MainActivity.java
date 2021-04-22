package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText numero_uno;
    private EditText numero_dos;

    private TextView respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero_uno = findViewById(R.id.numero_uno);
        numero_dos = findViewById(R.id.numero_dos);

        respuesta = findViewById(R.id.respuesta);


    }

    public void sumar (View view){

        try {
            Integer respuestaNumero = Integer.parseInt(numero_uno.getText().toString()) +Integer.parseInt(numero_dos.getText().toString());
            respuesta.setText(respuestaNumero + "");
        }
        catch(Exception e){
            Toast.makeText(this, "Numeros no validos,ingrese numeros", Toast.LENGTH_SHORT).show();
        }

    }

    public void resta (View view){

        try {
            Integer respuestaNumero = Integer.parseInt(numero_uno.getText().toString()) - Integer.parseInt(numero_dos.getText().toString());
            respuesta.setText(respuestaNumero + "");
        }
        catch(Exception e){
            Toast.makeText(this, "por favor no sea tonto, ingrese 2 numeros", Toast.LENGTH_SHORT).show();
        }

    }

    public void multiplicar (View view){

        try {
            Integer respuestaNumero = Integer.parseInt(numero_uno.getText().toString()) * Integer.parseInt(numero_dos.getText().toString());
            respuesta.setText(respuestaNumero + "");
        }
        catch(Exception e){
            Toast.makeText(this, "por favor no sea tonto, ingrese 2 numeros", Toast.LENGTH_SHORT).show();
        }
    }

    public void dividir (View view){

        try {
            float respuestaNumero = Float.parseFloat(numero_uno.getText().toString()) / Float.parseFloat(numero_dos.getText().toString());
            respuesta.setText(respuestaNumero + "");
        }
        catch(Exception e){
            Toast.makeText(this, "por favor no sea tonto, ingrese 2 numeros", Toast.LENGTH_SHORT).show();
        }

    }


}