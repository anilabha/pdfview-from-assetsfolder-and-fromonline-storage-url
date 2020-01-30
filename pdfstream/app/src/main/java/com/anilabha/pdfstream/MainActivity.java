package com.anilabha.pdfstream;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import com.pdfview.PDFView;


public class MainActivity extends AppCompatActivity  {
PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pdfView=(PDFView)findViewById(R.id.activityMainPdfView);
        pdfView.fromAsset("a.pdf").show();

    }
}