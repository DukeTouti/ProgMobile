package com.example.tp4;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mon_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int menuItemId = item.getItemId();

        if (menuItemId == R.id.menu_other) {
            Toast.makeText(this, "Other Menu Selectionné", Toast.LENGTH_SHORT).show();
        } else if (menuItemId == R.id.menu_profil) {
            Toast.makeText(this, "Profil Selectionné", Toast.LENGTH_SHORT).show();
        } else if (menuItemId == R.id.menu_settings) {
            Toast.makeText(this, "Settings Selectionné", Toast.LENGTH_SHORT).show();
        } else if (menuItemId == R.id.menu_accueil) {
            Toast.makeText(this, "Accueil Selectionné", Toast.LENGTH_SHORT).show();
        } else if (menuItemId == R.id.menu_aide) {
            Toast.makeText(this, "Aide Selectionné", Toast.LENGTH_SHORT).show();
        } else if (menuItemId == R.id.menu_apropos) {
            Toast.makeText(this, "A propos Selectionné", Toast.LENGTH_SHORT).show();
        } else {
            return super.onOptionsItemSelected(item);
        }

        return super.onOptionsItemSelected(item);
    }
}