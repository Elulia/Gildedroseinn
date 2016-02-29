package fr.iutvalence.info.m4104.gildedroseinn;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.layout.simple_list_item_1;


public class ShopActivity extends Activity {

    private MonApplication appli;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {


        this.appli = (MonApplication)getApplication();
        super.onCreate(savedInstanceState);

        setContentView(R.layout.shop_layout);
        ListView mListView = (ListView) findViewById(R.id.listView);
        AdapterShop adapter = new AdapterShop(this, this.appli.getShopList());
        mListView.setAdapter(adapter);

    }

    public void buttonListener (View v) {

        Item item = (Item) v.getTag();
        Toast toast = Toast.makeText(this, "Achat de : " + item.getName(), Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
        this.appli.achat(item);
    }
}
