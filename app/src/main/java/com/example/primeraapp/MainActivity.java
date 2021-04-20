package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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
        int respuestaNumero = Integer.parseInt(numero_uno.getText().toString()) +Integer.parseInt(numero_dos.getText().toString());
        respuesta.setText(respuestaNumero + "");
    }

    public void resta (View view){
        int respuestaNumero = Integer.parseInt(numero_uno.getText().toString()) - Integer.parseInt(numero_dos.getText().toString());
        respuesta.setText(respuestaNumero + "");
    }

    public void multiplicar (View view){
        int respuestaNumero = Integer.parseInt(numero_uno.getText().toString()) * Integer.parseInt(numero_dos.getText().toString());
        respuesta.setText(respuestaNumero + "");
    }

    public void dividir (View view){
        float respuestaNumero = Float.parseFloat(numero_uno.getText().toString()) / Float.parseFloat(numero_dos.getText().toString());
        respuesta.setText(respuestaNumero + "");
    }
}