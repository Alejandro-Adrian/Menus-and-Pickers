package com.example.menusandpickers;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class DialogsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogs);

        Button btnShowDialog = findViewById(R.id.btnShowDialog);
        btnShowDialog.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(DialogsActivity.this);
            builder.setTitle("Sample Dialog")
                    .setMessage("Hello and welcome, I hope you have a good day!!! -adrian")
                    .setPositiveButton("Good day", (dialog, which) -> dialog.dismiss())
                    .setNegativeButton("Bad day", (dialog, which) -> dialog.dismiss())
                    .show();
        });
    }
}
