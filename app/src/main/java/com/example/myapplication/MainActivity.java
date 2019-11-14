package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onRestart() { 	super.onRestart(); 
    Log.e("RRRRRR","");}
    @Override
    protected void onPause(){
        super.onPause();
        Log.e("RRRRRR","");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.e("RRRRRR","");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("RRRRRR","");
    }
}

