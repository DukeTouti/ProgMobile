package com.example.tp3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Button btnOk = findViewById(R.id.btnOk);
        btnOk.setOnClickListener(v -> {
            Intent intent = new Intent(this, NewsActivity.class);
            startActivity(intent);
            finish();
        });
    }
}