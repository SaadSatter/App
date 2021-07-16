package com.example.app_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

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

    public void changeFragment(View view){
        //Moisture Fragment
        Fragment fragment2;
        fragment2 = new fragment_moisture_graph();
        FragmentManager fm2 = getSupportFragmentManager();
        FragmentTransaction ft2 = fm2.beginTransaction(); //using transaction, replace fragment to fragment_1
        ft2.replace(R.id.moistureFragment, fragment2);

        ft2.commit();    //whenever transaction begins, needs to be committed

        //Temperature Fragment
        Fragment fragment3;
        fragment3 = new temp_graph_fragment();
        FragmentManager fm3 = getSupportFragmentManager();
        FragmentTransaction ft3 = fm3.beginTransaction();
        ft3.replace(R.id.tempFragment, fragment3);
        ft3.commit();

        //pH Fragment
        Fragment fragment;
        //if(view == view.findViewById(R.id.button)){
        fragment = new ph_graph_fragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction(); //using transaction, replace fragment to fragment_1
        ft.replace(R.id.phFragment, fragment);
        ft.commit();    //whenever transaction begins, needs to be committed


    }

    public void Back_NFC_Dectector (View V){
        Intent newIntent = new Intent(this, MainActivity.class);
        startActivity(newIntent);
    }
}