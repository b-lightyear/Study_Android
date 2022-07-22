package com.example.and10_intentresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Intent intent = getIntent(); //getIntent : 이전 액티비티에서 Intent로 새로운 창을 띄울 때 사용한 Intent를 가져옴
        String test = intent.getStringExtra("test");
        int num = intent.getIntExtra("num", -1);
        int num1 = intent.getIntExtra("num1", -1);
        //int 타입은 참조형 데이터타입이 아니기 때문에 null인 상태가 될 수가 없다.

        Log.d("메인 액티비티에서 가져온 값 : ", test);
        Log.d("메인 액티비티에서 가져온 값 : ", num+"");
        Log.d("메인 액티비티에서 가져온 값 : ", num1+"");

        LoginDTO dto = (LoginDTO) intent.getSerializableExtra("dto"); //데이터타입이 ser~~~라서 dto 타입으로 변환필요
        Log.d("메인 액티비티에서 가져온 id : ", dto.getId()+"");
        Log.d("메인 액티비티에서 가져온 pw : ", dto.getPw());

        ArrayList<LoginDTO> list = (ArrayList<LoginDTO>) intent.getSerializableExtra("list"); //현재 dto 타입이 seri~~라서 똑같이 타입 변환 필요
        Log.d("메인 액티비티에서 가져온~~ : ", list.size()+"");

    }
}