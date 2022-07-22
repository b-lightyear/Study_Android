package com.example.test02_intent;

import android.widget.EditText;

import java.io.Serializable;

public class LoginDTO implements Serializable {
    private int id;
    private String pw;

   /* public LoginDTO(EditText id, EditText pw) {
        this.id = id;
        this.pw = pw;
    }*/

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
}
