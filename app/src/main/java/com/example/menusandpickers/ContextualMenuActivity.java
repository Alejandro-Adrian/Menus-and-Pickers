package com.example.menusandpickers;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ContextualMenuActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contextual_menu);

        textView = findViewById(R.id.textView);
        // Register the TextView for the Context Menu
        registerForContextMenu(textView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.contextual_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId(); // Get the ID of the selected menu item

        // Replace switch-case with if-else
        if (id == R.id.context_option1) {
            Toast.makeText(this, "Context Option 1 Selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.context_option2) {
            Toast.makeText(this, "Context Option 2 Selected", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            return super.onContextItemSelected(item);
        }
    }
}
