package com.gustavo.reserva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Actividad2 extends AppCompatActivity {

    String nombre = "", fecha = "", hora = "", apellido = "", numero = "", edad;
    int personas = 0;
    TextView muestraDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad2);

        muestraDatos = (TextView) findViewById(R.id.muestraDatos);

        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();

        nombre = recibe.getString("nombre");
        apellido = recibe.getString("apellidos");
        numero = recibe.getString("numero");
        personas = recibe.getInt("personas");
        fecha = recibe.getString("fecha");
        hora = recibe.getString("hora");
        edad = recibe.getString("edad");

        muestraDatos.setText("Reservacion a nombre de:\n" + nombre + " " + apellido + "\n\n"
                + "Edad: " + edad + " años" + "\n\n" +
                + personas + " personas\n\n"
                + "Teléfono Celular: " + numero + "\n\n" +
                "Fecha: " + fecha + "\nHora: " + hora + "\n");

    }

    public void hacerOtraReserva(View v) {
        Intent envia = new Intent(this, MainActivity.class);
        finish();
        startActivity(envia);
    }
}
