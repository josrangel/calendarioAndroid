package com.josrangel.calendario;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NotasActivity extends AppCompatActivity {
Button mbtnagregar,mbtnNotas, dialogBtn, mTareasBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);
        mbtnagregar = findViewById(R.id.btnAgregaNota);
        mbtnNotas = findViewById(R.id.btnNotas);
        dialogBtn = findViewById(R.id.dialogBtn);
        mTareasBtn = findViewById(R.id.tareasBtn);

        dialogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),FormNuevaNota.class);
                startActivityForResult(i, 1);
            }
        });

        mTareasBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),TareasActivity.class);
                startActivityForResult(i, 1);
            }
        });


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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        AlertDialog.Builder alerta = new AlertDialog.Builder(NotasActivity.this);
        alerta.setTitle("Se agrego correctamente tu nota");
        alerta.setMessage(""+data.getStringExtra("TextoNota"));
        alerta.setIcon(R.drawable.ic_okaslokas);
        alerta.show();
    }
}