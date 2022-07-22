package com.example.and09_layoutinflater;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_inflate; //레이아웃 인플레이션(자바 ↔ XML) 연결이 되고나서 초기화를 시킬 수 있다.
                        //디자인에 있는 위젯을 연결 findViewById

    //인터페이스 (자바에서 어떤 객에츼 사용방법을 정의해놓은 것. 설계도)
    //옵저버 패턴 (정의, 구현, 실행 세 개로 나눔)
    //정의, 구현, 실행 각각 구현해놓고 실행이되면 구현부를 실행한다.
    //정의는 대부분 자바로 구현이 되어있고(IOS도 똑같음. 어느정도 이상의 커스터카이징은 개인정보 침해나 해킹의 위험요소)
    //실행은 안드로이드가 해준다.

    //레이아웃 인플레이트(인플레이션 과정을 통한 화면 붙이기) 과정
    // ① 화면일 붙을 레이아웃을 액티비티 내부에 미리 만들어 놓는다. (무언가를 담을 통)
    // ② 화면에 붙일 레이아웃을 별도로 만든다 (①번 통에 넣을 내용물을 만든다)
    // ③ 자바코드를 이용해서 레이아웃 인플레이션 과정을 만든다.
    //프레그먼트라는 기능의 구조를 이해하기 위해서는 반드시 알아야 한다!!

    LinearLayout linear;
    RelativeLayout relative;

    Button btn_sub1, btn_sub2;
    ImageView imgv_sub1;
    TextView textv_sub2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_inflate = findViewById(R.id.btn_inflate);

        //LayoutInflater 기능을 이용해서 현재 자바코드에 있는 activity_main 안쪽에 다른 xml(레이아웃)을 붙이는 처리
        linear = findViewById(R.id.linear); //어디에 붙일지를 (null이 아니라) id를 찾아서 지정함
        relative = findViewById(R.id.relative);

        //첫 번째 방법
        LayoutInflater inflater = getLayoutInflater(); //레이아웃을 붙일 때 필요한 것
        //inflater.inflate(R.layout.main_sub1, linear, true); //ctrl+p 사용

        //두 번째 방법
        //inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE); //alt + enter 사용

        Log.d("버튼", "onCreate: ");

        btn_inflate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inflater.inflate(R.layout.main_sub1, linear, true); //ctrl+p 사용
                inflater.inflate(R.layout.main_sub2, relative, true);

            }
        });

    }
}