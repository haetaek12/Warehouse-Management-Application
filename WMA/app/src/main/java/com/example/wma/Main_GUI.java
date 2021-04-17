package com.example.wma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Main_GUI extends AppCompatActivity {

    TextView tv_main_gui;
    String [] location_name = {"B01 자재 창고", "B02 자재 창고", "301 자재 창고", "401 자재 창고", "402 자재 창고"};
    RelativeLayout[] rl_ids = new RelativeLayout[location_name.length];

    ImageView imageView_301_01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__g_u_i);
        tv_main_gui = (TextView)findViewById(R.id.tv_main_gui);
        rl_ids[0] = (RelativeLayout)findViewById(R.id.id_b01);
        rl_ids[1] = (RelativeLayout)findViewById(R.id.id_b02);
        rl_ids[2] = (RelativeLayout)findViewById(R.id.id_301);
        rl_ids[3] = (RelativeLayout)findViewById(R.id.id_401);
        rl_ids[4] = (RelativeLayout)findViewById(R.id.id_402);
        imageView_301_01 = (ImageView)findViewById(R.id.imageView_301_01);

        imageView_301_01.setOnClickListener(onClickListener);



        Intent intent2 = getIntent();
        int location_id2 = intent2.getIntExtra("location_info", -1);
        if(location_id2 != -1) {
            tv_main_gui.setText(location_name[location_id2]);
            for (int i=0;i<location_name.length;i++) {
                if(i==location_id2) {
                    rl_ids[i].setVisibility(View.VISIBLE);
                } else {
                    rl_ids[i].setVisibility(View.GONE);
                }
            }
        } else {
            Toast.makeText(this, "Unvalid ID handled", Toast.LENGTH_LONG).show();
            finish();
        }


    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.imageView_301_01 :
                        Mystart_activity(List_GUI.class,"301",1 );
                    break;
            }
        }
    };

    void Mystart_activity(Class c, String bldg_sel, int bt_clicked) { //301, 1
        Intent intent = new Intent(this,c);
        intent.putExtra("bldg_sel", bldg_sel);
        intent.putExtra("bt_clicked",bt_clicked);
        startActivity(intent);
    }


}