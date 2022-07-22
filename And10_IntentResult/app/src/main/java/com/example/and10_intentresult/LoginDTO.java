package com.example.and10_intentresult;

import java.io.Serializable;

public class LoginDTO implements Serializable {

    //직렬화 하는 이유?
    //데이터를 빨리 찾기 위해

    private int id;
    private String pw;

    public LoginDTO(int id, String pw) {
        this.id = id;
        this.pw = pw;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

}//class
