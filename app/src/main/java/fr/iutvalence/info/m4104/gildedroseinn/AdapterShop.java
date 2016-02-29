package fr.iutvalence.info.m4104.gildedroseinn;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


public class AdapterShop extends BaseAdapter {

    private ShopActivity shopActivity;
    private ArrayList<Item> items;

    public AdapterShop(ShopActivity shopActivity, ArrayList items) {
        super();
        this.shopActivity = shopActivity;
        this.items = items;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getCount() {
        return this.items.size();
    }

    @Override
    public Object getItem(int position) {
        return this.items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater li = LayoutInflater.from(this.shopActivity);
        View v = li.inflate(R.layout.item_layout, parent, false);
        Button bouton = (Button) v.findViewById(R.id.button);
        bouton.setText(items.get(position).getName());
        bouton.setTag(items.get(position));

        return v;
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }



}