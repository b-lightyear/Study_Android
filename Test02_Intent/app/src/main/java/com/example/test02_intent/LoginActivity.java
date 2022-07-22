package com.example.test02_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Intent intent = getIntent();
        TextView login_id, login_pw;

        login_id = findViewById(R.id.login_id);
        login_pw = findViewById(R.id.login_pw);

        LoginDTO dto = (LoginDTO) intent.getSerializableExtra("dto");
        login_id.setText(String.valueOf(dto.getId()));
        login_pw.setText(dto.getPw());

    }
}