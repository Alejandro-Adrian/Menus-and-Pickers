package com.example.menusandpickers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Buttons
        Button btnAppBar = findViewById(R.id.btnAppBar);
        Button btnContextualMenu = findViewById(R.id.btnContextualMenu);
        Button btnPopupMenu = findViewById(R.id.btnPopupMenu);
        Button btnDialogs = findViewById(R.id.btnDialogs);
        Button btnPickers = findViewById(R.id.btnPickers);

        // Button Listeners to navigate to respective activities
        btnAppBar.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, AppBarActivity.class)));
        btnContextualMenu.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ContextualMenuActivity.class)));
        btnPopupMenu.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, PopupMenuActivity.class)));
        btnDialogs.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, DialogsActivity.class)));
        btnPickers.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, PickersActivity.class)));
    }
}
