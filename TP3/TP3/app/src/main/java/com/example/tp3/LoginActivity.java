package com.example.tp3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnLogin = findViewById(R.id.btnLogin);
        EditText editLogin = findViewById(R.id.editLogin);

        btnLogin.setOnClickListener(v -> {
            String login = editLogin.getText().toString();
            Intent intent = new Intent(this, NewsActivity.class);
            intent.putExtra("login", login);
            startActivity(intent);
            finish();
        });
    }
}