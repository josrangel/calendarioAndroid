package com.josrangel.calendario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    CalendarView calendario;
    SimpleDateFormat sdf;
    String selectedDate;
    static String EXTRA_LLAVE="LLAVE_CALENDARIO";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calendario = findViewById(R.id.calendarView);
        calendario.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month,
                                            int dayOfMonth) {
                selectedDate = String.valueOf(dayOfMonth)+"/"+String.valueOf(month+1)+"/"+String.valueOf(year);
            }
        });
    }
    public void agregar(View v){


        Intent intent = new Intent(this, ContactoActivity.class);
        intent.putExtra(EXTRA_LLAVE,selectedDate);
        startActivity(intent);
    }

}