package com.example.menusandpickers;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PopupMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu);

        Button btnShowPopup = findViewById(R.id.btnShowPopup);
        btnShowPopup.setOnClickListener(v -> {
            PopupMenu popupMenu = new PopupMenu(PopupMenuActivity.this, btnShowPopup);
            popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(item -> {
                int id = item.getItemId(); // Get the menu item ID

                // Replace switch-case with if-else
                if (id == R.id.popup_option1) {
                    Toast.makeText(PopupMenuActivity.this, "Popup Option 1 Selected", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (id == R.id.popup_option2) {
                    Toast.makeText(PopupMenuActivity.this, "Popup Option 2 Selected", Toast.LENGTH_SHORT).show();
                    return true;
                } else {
                    return false;
                }
            });
            popupMenu.show();
        });
    }
}
