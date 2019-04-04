package com.fudd.dagger2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
