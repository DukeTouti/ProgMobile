package com.example.tp3_ex2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEnvoyer = findViewById(R.id.btnEnvoyer);

        btnEnvoyer.setOnClickListener(v -> {
            EditText editTxtZone = findViewById(R.id.editTextText);
            String textToGet = editTxtZone.getText().toString();
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra("Text", textToGet);
            startActivity(intent);
        });
    }
}