package com.josrangel.calendario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContactoActivity extends AppCompatActivity {

    Button btnPasar;
    Intent intento;
    String fecha;
    TextView txtFechaMuestra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
        btnPasar = findViewById(R.id.btnPasar);
        intento = getIntent();
        fecha = intento.getStringExtra(MainActivity.EXTRA_LLAVE);
        txtFechaMuestra = findViewById(R.id.txtFechaMuestra);
        txtFechaMuestra.setText(fecha);
        btnPasar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactoActivity.this,NotasActivity.class);
                startActivity(intent);
            }
        });
    }
}