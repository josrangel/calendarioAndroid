package com.josrangel.calendario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormNuevaNota extends AppCompatActivity {

    Intent i;
    EditText texto;
    Button btnDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_nueva_nota);

        i = getIntent();
        texto = findViewById(R.id.cuerpoNota);
        btnDone = findViewById(R.id.btnDone);

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("TextoNota",texto.getText().toString());
                setResult(1,i);
                finish();
            }
        });

    }
}