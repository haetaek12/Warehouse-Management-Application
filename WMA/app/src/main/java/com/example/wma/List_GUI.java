package com.example.wma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class List_GUI extends AppCompatActivity {

    TextView tv_listgui_title;
    String bldg_sel;
    int bt_clicked;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__g_u_i);
        tv_listgui_title = (TextView)findViewById(R.id.tv_listgui_title);

        Intent intent = getIntent();
        bldg_sel = intent.getStringExtra("bldg_sel");
        bt_clicked = intent.getIntExtra("bt_clicked",-1);
        if(bldg_sel.equals("")  || bt_clicked == -1) {
            Toast.makeText(this, "bt ID unavailable", Toast.LENGTH_SHORT).show();
            finish();
        }

        tv_listgui_title.setText(bldg_sel + " - " + Integer.toString(bt_clicked));

    }



}