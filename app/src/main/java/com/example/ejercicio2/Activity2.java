package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView tvNombre,tvApellido,tvEdad,tvCorreo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tvNombre= findViewById(R.id.txtNom);
        Bundle recibirDatos = getIntent().getExtras();
        String [] info = recibirDatos.getStringArray("Datos");

        tvNombre.setText("Nombre: "+info[0]+ "\nApellido: "+info[1]+ "\nEdad: "+info[2]+ "\nCorreo: "+info[3]);
    }
}