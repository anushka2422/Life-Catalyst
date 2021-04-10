package com.example.lifecatalyst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.SurfaceView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView textView4, textView5, textView7, textView9;
    SurfaceView surfaceView, surfaceView2;
    Button button2, button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent = getIntent();
        textView9 = findViewById(R.id.textView9);
        textView9.setText("Further liks");
    }
}