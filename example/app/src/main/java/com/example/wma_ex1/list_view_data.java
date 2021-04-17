package com.example.wma_ex1;

public class list_view_data {

    private  String item_name;
    private  int item_count;
    private  int last_date;

    public list_view_data(String item_name, int item_count, int last_date) {
        this.item_name = item_name;
        this.item_count = item_count;
        this.last_date = last_date;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getItem_count() {
        return item_count;
    }

    public void setItem_count(int item_count) {
        this.item_count = item_count;
    }

    public int getLast_date() {
        return last_date;
    }

    public void setLast_date(int last_date) {
        this.last_date = last_date;
    }



}
