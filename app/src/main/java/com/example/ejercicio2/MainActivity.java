package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtNombre, txtApellido, txtEdad, txtCorreo;

    Button Enviar;

    String[] datos = new String[4];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = findViewById(R.id.txtNombre);
        txtApellido = findViewById(R.id.txtApellido);
        txtCorreo = findViewById(R.id.txtCorreo);
        txtEdad = findViewById(R.id.txtEdad);

        Enviar = findViewById(R.id.btnEnviar);

        Enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos[0]=txtNombre.getText().toString();
                datos[1]=txtApellido.getText().toString();
                datos[2]=txtEdad.getText().toString();
                datos[3]=txtCorreo.getText().toString();

                Bundle enviaDatos = new Bundle();
                enviaDatos.putStringArray("Datos", datos);

                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtras(enviaDatos);
                startActivity(intent);
            }
        });
    }
    }