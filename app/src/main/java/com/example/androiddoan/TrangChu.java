package com.example.androiddoan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.androiddoan.Api.Model.NguoiDungModel;

public class TrangChu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setTitleToolbar();
        getDataIntent();

        Bundle bundleReceive = getIntent().getExtras();
        if(bundleReceive !=null)
        {
            NguoiDungModel user = (NguoiDungModel) bundleReceive.get("Object User");
            if( user != null)
            {

            }
        }
    }
    private void getDataIntent()
    {
        String strPhoneNumber= getIntent().getStringExtra("phone number");


    }

    private void setTitleToolbar(){
        if(getSupportActionBar() != null)
        {
            getSupportActionBar().setTitle("Trang Chu");
        }
    }
}