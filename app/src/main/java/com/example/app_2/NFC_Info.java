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
        Fragment fragment;
        //if(view == view.findViewById(R.id.button)){
        fragment = new ph_graph_fragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction(); //using transaction, replace fragment to fragment_1
        ft.replace(R.id.phFragment, fragment);
        ft.commit();    //whenever transaction begins, needs to be committed
        //}
        /*if (view == view.findViewById(R.id.button2)){
            fragment = new fragment_2();
            FragmentManager fm = getParentFragmentManager();
            FragmentTransaction ft = fm.beginTransaction(); //using transaction, replace fragment to fragment_1
            ft.replace(R.id.fragment_place, fragment);
            ft.commit();
        }*/

    }

    public void Back_NFC_Dectector (View V){
        Intent newIntent = new Intent(this, graph_trial2.class);
        startActivity(newIntent);
    }
}