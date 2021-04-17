package com.example.wma_ex1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class list_view_adapter  extends BaseAdapter {

    Context mContext = null;
    LayoutInflater mLayoutInflater = null;
    ArrayList<list_view_data> sample;

    public list_view_adapter(Context context, ArrayList<list_view_data> data) {
        mContext = context;
        sample = data;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return sample.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public list_view_data getItem(int position) {
        return sample.get(position);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View view = mLayoutInflater.inflate(R.layout.list_view_test, null);

        TextView  tv_item_name = (TextView) view.findViewById(R.id.tv_item_name);
        TextView tv_item_count = (TextView) view.findViewById(R.id.tv_item_count);
        TextView tv_last_date = (TextView) view.findViewById(R.id.tv_last_date);
        Button bt_item_change = (Button) view.findViewById(R.id.bt_item_change);

        tv_item_name.setText(sample.get(position).getItem_name());
        tv_item_count.setText(Integer.toString(sample.get(position).getItem_count()));
        tv_last_date.setText(Integer.toString(sample.get(position).getLast_date()));

        return view;
    }
}
