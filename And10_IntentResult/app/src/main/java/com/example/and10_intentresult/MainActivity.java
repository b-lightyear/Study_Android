package com.example.and10_intentresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btn, btn_login;

    //안드로이드의 4대 컴포넌트 : (현) 액티비티
    //4가지의 컴포넌트간의 통신을 담당 : Intent(전달)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent login = new Intent(MainActivity.this, LoginActivity.class);

        btn = findViewById(R.id.btn);
        btn_login = findViewById(R.id.btn_login);

        //DTO생성
        LoginDTO dto = new LoginDTO(11, "admin");

        //LoginDTO타입을 요소로 가지는 ArrayList 생성
        ArrayList<LoginDTO> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(dto);
        }


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //현재 위치에서 이동할 위치를 파라매터로 넘겨준다 (현재위치, 이동할 위치)
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                startActivity(intent);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //직접 LoginActivity라는 액티비티를 만들고
                //메인 액티비티의 버튼을 클릭했을 때, 새로 띄워지게 처리

                login.putExtra("test", "넘길값"); //startActivity 하기 전에 선언
                login.putExtra("num",100);

                login.putExtra("dto", dto);
                login.putExtra("list", list);

                startActivity(login);
            }
        });
    }
}