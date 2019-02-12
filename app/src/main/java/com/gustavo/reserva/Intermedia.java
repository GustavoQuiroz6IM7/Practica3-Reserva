package com.gustavo.reserva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Intermedia extends AppCompatActivity {

    String nombre = "", fecha = "", hora = "", apellido = "", numero = "", edad;
    int personas = 0;
    TextView muestraDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermedia);

        muestraDatos = (TextView) findViewById(R.id.muestraDatos2);

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

    public void Aceptar(View v) {
        Intent envia = new Intent(this, Actividad2.class);
        Bundle datos = new Bundle();
        datos.putString("nombre", nombre);
        datos.putString("apellidos", apellido);
        datos.putString("numero", numero);
        datos.putString("edad", edad);
        datos.putInt("personas", personas);
        datos.putString("fecha", fecha);
        datos.putString("hora", hora);
        envia.putExtras(datos);
        finish();
        startActivity(envia);
    }
}
