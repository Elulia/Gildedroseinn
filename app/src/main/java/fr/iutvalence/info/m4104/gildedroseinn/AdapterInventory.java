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


public class AdapterInventory extends BaseAdapter {

    private InventoryActivity inventoryActivity;
    private ArrayList<Item> items = new ArrayList<Item>();
    private LayoutInflater Inflater;

    public AdapterInventory(InventoryActivity inventoryActivity, ArrayList<Item> items) {
        super();
        this.inventoryActivity = inventoryActivity;
        this.items = items;
        this.Inflater = LayoutInflater.from(this.inventoryActivity);
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

        /*View v = this.Inflater.inflate(R.layout.item_layout,parent,false);
        Button itemdesc = (Button) v.findViewById(R.id.button);
        itemdesc.setText(((Item) this.getItem(position)).getName());
        itemdesc.setTag(items.get(position));*/



        View v = this.Inflater.inflate(R.layout.item_layout,parent,false);
        TextView nom = (TextView) v.findViewById(R.id.button);
        nom.setText(items.get(position).getName());

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