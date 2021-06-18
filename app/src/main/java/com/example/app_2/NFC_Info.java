package com.example.app_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

public class NFC_Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nfc_info);
    }
    public void Back_NFC_Dectector (View V){
        Intent newIntent = new Intent(this, MainActivity.class);
        startActivity(newIntent);
    }
}