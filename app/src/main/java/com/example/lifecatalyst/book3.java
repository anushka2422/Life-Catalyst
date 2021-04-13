package com.example.lifecatalyst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class book3 extends AppCompatActivity {
    PDFView bk3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book3);
        bk3 = findViewById(R.id.bk3);
        bk3.fromAsset("sapiens.pdf").load();
    }
}