package com.example.lifecatalyst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MainActivity8 extends AppCompatActivity {
     TextView textView45;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        Intent intent = getIntent();
        textView45 = findViewById(R.id.textView45);
        textView45.setMovementMethod(LinkMovementMethod.getInstance());
    }
}