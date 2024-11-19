package com.example.menusandpickers;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class PickersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickers);

        Button btnDatePicker = findViewById(R.id.btnDatePicker);
        Button btnTimePicker = findViewById(R.id.btnTimePicker);

        btnDatePicker.setOnClickListener(v -> {
            Calendar calendar = Calendar.getInstance();
            new DatePickerDialog(this, (view, year, month, dayOfMonth) ->
                    Toast.makeText(this, "Selected Date: " + dayOfMonth + "/" + (month + 1) + "/" + year, Toast.LENGTH_SHORT).show(),
                    calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)).show();
        });

        btnTimePicker.setOnClickListener(v -> {
            Calendar calendar = Calendar.getInstance();
            new TimePickerDialog(this, (view, hourOfDay, minute) ->
                    Toast.makeText(this, "Selected Time: " + hourOfDay + ":" + minute, Toast.LENGTH_SHORT).show(),
                    calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), true).show();
        });
    }
}
