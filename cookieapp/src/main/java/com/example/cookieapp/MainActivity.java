package com.example.cookieapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void eatCookie(View v){

        ImageView eatCookie = findViewById(R.id.beforecookie);
        eatCookie.setImageResource(R.drawable.after_cookie);


        TextView ateCookie = findViewById(R.id.status_text_view);

        ateCookie.setText(R.string.m_full);
    }
}
