package com.example.lifecatalyst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView textView4, textView5, textView7, textView9;
    Button button2, button4, button14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent = getIntent();
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView7 = findViewById(R.id.textView7);
        textView9 = findViewById(R.id.textView9);
        //textView10 = findViewById(R.id.textView10);
        button2 = findViewById(R.id.button2);
        button4 = findViewById(R.id.button4);
        button14 = findViewById(R.id.button14);
       // button18 = findViewById(R.id.button18);
        textView5.setText("Bhagavad-gita_As_It_Is");
        textView7.setText("Sapiens");
        textView9.setText("ikigai-the-japanese-secret");
       // textView10.setText("Tools of Titans-Timothy Ferriss");
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity3.this,book1.class);
                startActivity(i);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity3.this,book2.class);
                startActivity(i);
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity3.this,book3.class);
                startActivity(i);
            }
        });

    }
}