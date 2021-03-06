package com.kejiang.canyin.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.kejiang.canyin.fragment.R;

/**
 * Created by chenqun on 2017/7/26.
 */

public class OrderFinishAdapter  extends BaseAdapter{
Context context;

    public OrderFinishAdapter(Context context) {
        this.context=context;
    }

    @Override
    public int getCount() {
        return 8;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(context).inflate(R.layout.item_fg_orderfinish, null);
        return convertView;
    }
}
