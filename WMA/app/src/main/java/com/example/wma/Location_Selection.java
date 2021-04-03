package com.example.wma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Location_Selection extends AppCompatActivity {

    Button bt_b01, bt_b02, bt_301, bt_401, bt_402;
    int location_id = -1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location__selection);

        bt_b01 = (Button)findViewById(R.id.bt_b01);
        bt_b02 = (Button)findViewById(R.id.bt_b02);
        bt_301 = (Button)findViewById(R.id.bt_301);
        bt_401 = (Button)findViewById(R.id.bt_401);
        bt_402 = (Button)findViewById(R.id.bt_402);

        bt_b01.setOnClickListener(onClickListener);
        bt_b02.setOnClickListener(onClickListener);
        bt_301.setOnClickListener(onClickListener);
        bt_401.setOnClickListener(onClickListener);
        bt_402.setOnClickListener(onClickListener);

    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d("location_activity","Click button");

            switch (v.getId()) {
                case R.id.bt_b01 :
                    location_id = 0;

                    break;

                case R.id.bt_b02 :
                    location_id = 1;

                    break;

                case R.id.bt_301 :
                    location_id = 2;

                    break;

                case R.id.bt_401 :
                    location_id = 3;

                    break;

                case R.id.bt_402 :
                    location_id = 4;


                    break;

            }
            Mystart_activity(Main_GUI.class);
        }
    };

    void Mystart_activity(Class c) {
        Intent intent = new Intent(this,c);
        intent.putExtra("location_info",location_id);

        startActivity(intent);
    }

}