package com.example.wma_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout_test);
        Intent intent2 = getIntent();
        int temp = intent2.getIntExtra("data_change", -1);
        Log.d("activity_2", Integer.toString(temp));
    }
}