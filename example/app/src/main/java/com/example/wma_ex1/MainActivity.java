package com.example.wma_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button bt_linlay_vis, bt_activity_change;
    LinearLayout ll_first;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_function_test);
        bt_linlay_vis = (Button)findViewById(R.id.bt_linlay_vis);
        ll_first = (LinearLayout)findViewById(R.id.ll_first);
        bt_linlay_vis.setOnClickListener(onClickListener);

        bt_activity_change = (Button)findViewById(R.id.bt_activity);
        bt_activity_change.setOnClickListener(onClickListener);

    }

    View.OnClickListener onClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.bt_linlay_vis :
                    Log.d("btn_function","Click Button");

                    if(ll_first.getVisibility()==View.VISIBLE) {
                        ll_first.setVisibility(View.INVISIBLE);
                        Log.d("btn_function","Set invisible");
                    }
                    else {
                        ll_first.setVisibility(View.VISIBLE);
                        Log.d("btn_function","Set visible");
                    }

                    break;
                case R.id.bt_activity :
                    Mystart_activity(MainActivity2.class);
                    break;

            }
        }
    };



    void Mystart_activity(Class c) {
        Intent intent = new Intent (this,c);
        intent.putExtra("data_change", 100);

        startActivity(intent);
    }


}