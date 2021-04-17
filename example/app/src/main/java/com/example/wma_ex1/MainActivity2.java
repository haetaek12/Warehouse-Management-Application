package com.example.wma_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ArrayList<list_view_data> data_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        Intent intent2 = getIntent();
        int temp = intent2.getIntExtra("data_change", -1);
        Log.d("activity_2", Integer.toString(temp));

        data_list = new ArrayList<list_view_data>();
        data_list.add(new list_view_data("WRT-10865",50,20210417));
        data_list.add(new list_view_data("WRT-10864",50,20210417));
        data_list.add(new list_view_data("WRT-10863",50,20210417));
        data_list.add(new list_view_data("WRT-10862",50,20210417));
        data_list.add(new list_view_data("WRT-10861",50,20210417));
        data_list.add(new list_view_data("WRT-10860",50,20210417));
        data_list.add(new list_view_data("WRT-10866",50,20210417));
        data_list.add(new list_view_data("WRT-10867",50,20210417));
        data_list.add(new list_view_data("WRT-10868",50,20210417));









        ListView listView = (ListView)findViewById(R.id.lv_content);
        final list_view_adapter myAdapter = new list_view_adapter(this,data_list);

        listView.setAdapter(myAdapter);



    }
}