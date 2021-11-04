package com.example.androiddoan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThucDon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thuc_don);
    }

    public void clickBac(View view) {
        Intent intent = new Intent(ThucDon.this, MonAn.class);
        startActivity(intent);
    }

    public void clickTrung(View view) {
    }

    public void clickTay(View view) {
    }

    public void clickNam(View view) {
    }
}