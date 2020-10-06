package com.josrangel.calendario;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NotasActivity extends AppCompatActivity {
Button mbtnagregar,mbtnNotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);
        mbtnagregar = findViewById(R.id.btnAgregaNota);
        mbtnNotas = findViewById(R.id.btnNotas);


        mbtnagregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NotasActivity.this,"Se agrego nueva nota  ",Toast.LENGTH_SHORT).show();


            }
        });

        mbtnNotas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NotasActivity.this," No se agrego la nota correctamente",Toast.LENGTH_SHORT).show();

                AlertDialog.Builder alerta = new AlertDialog.Builder(NotasActivity.this);
                alerta.setTitle("Error");
                alerta.setMessage("Es un error");
                alerta.setIcon(R.drawable.ic_baseline_priority_high_24);
                alerta.show();
            }
        });
    }
}