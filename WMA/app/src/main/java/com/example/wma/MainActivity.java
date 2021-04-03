package com.example.wma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView iv_page1, iv_page2, iv_page3;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_page1 = (ImageView)findViewById(R.id.iv_page1);
        iv_page2 = (ImageView)findViewById(R.id.iv_page2);
        iv_page3 = (ImageView)findViewById(R.id.iv_page3);

        iv_page1.setOnClickListener(onClickListener);
        iv_page2.setOnClickListener(onClickListener);
        iv_page3.setOnClickListener(onClickListener);


    }
    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d("main_activity","Button clicked");
            switch (v.getId()) {
                case R.id.iv_page1 :
                    Mystart_activity(Location_Selection.class);
                    Log.d("main_activity","Location GUI Req");
                    break;
                case R.id.iv_page2 :
                    Mystart_activity(List_GUI.class);
                    Log.d("main_activity","List GUI Req");
                    break;
                case R.id.iv_page3 :
//                    Mystart_activity(List_GUI.class);
//                    Log.d("main_activity","List GUI Req");
                    break;
            }
        }
    };

    void Mystart_activity(Class c) {
        Intent intent = new Intent(this,c);
        startActivity(intent);
    }

}