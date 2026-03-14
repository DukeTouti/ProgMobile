package com.example.tp3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class NewsActivity extends AppCompatActivity {

    private String loginRecu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        loginRecu = getIntent().getStringExtra("login");

        TextView tvLoginAffiche = findViewById(R.id.tvLoginAffiche);
        tvLoginAffiche.setText("Connecte en tant que : " + loginRecu);

        Button btnDetails = findViewById(R.id.btnDetails);
        Button btnLogout = findViewById(R.id.btnLogout);

        btnDetails.setOnClickListener(v -> {
            Intent intent = new Intent(this, DetailsActivity.class);
            startActivity(intent);
        });

        btnLogout.setOnClickListener(v -> {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        });
    }
}