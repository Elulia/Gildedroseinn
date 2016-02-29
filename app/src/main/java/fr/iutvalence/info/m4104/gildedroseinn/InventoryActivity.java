package fr.iutvalence.info.m4104.gildedroseinn;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class InventoryActivity extends Activity {

    protected MonApplication appli;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.appli = (MonApplication)getApplication();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inventory_layout);


        AdapterInventory adapter = new AdapterInventory(this, this.appli.getInventoryList());
        ListView mListView = (ListView) findViewById(R.id.listView);
        mListView.setAdapter(adapter);
    }

    public void buttonListener (View v) {
        Item item = (Item) v.getTag();
        Toast toast1= Toast.makeText(this, "Utilisation de : " + item.getName(), Toast.LENGTH_SHORT);
        toast1.setGravity(Gravity.CENTER, 0, 0);
        toast1.show();
        this.appli.utiliser(item);
    }
}
