package com.example.test02_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edit_id, edit_pw;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_id = findViewById(R.id.edit_id);
        edit_pw = findViewById(R.id.edit_pw);

        btn = findViewById(R.id.btn);

        Intent intent = new Intent(MainActivity.this, LoginActivity.class);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginDTO dto = new LoginDTO(Integer.parseInt(edit_id.getText()+""), edit_pw.getText()+"");
                intent.putExtra("dto", dto);

                startActivity(intent);
            }
        });

    }
}