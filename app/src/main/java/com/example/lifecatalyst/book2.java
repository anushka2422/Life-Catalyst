package com.example.lifecatalyst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class book2 extends AppCompatActivity {
    PDFView bk2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book2);
        bk2 = findViewById(R.id.bk2);
        bk2.fromAsset("ikigai-the-japanese-secret.pdf").load();
    }
}