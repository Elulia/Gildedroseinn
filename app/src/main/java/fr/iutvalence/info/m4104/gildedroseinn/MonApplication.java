package fr.iutvalence.info.m4104.gildedroseinn;

import android.app.Application;

import java.util.ArrayList;

public class MonApplication extends Application {

    private ArrayList<Item> shopList;
    private ArrayList<Item> inventoryList;

    public void onCreate() {
        super.onCreate();

        this.shopList = new ArrayList<Item>();
        this.shopList.add(new Item("+5 Dexterity Vest", 10, 20));
        this.shopList.add(new Item("Aged Brie", 2, 0));
        this.shopList.add(new Item("Elixir of the Mongoose", 5, 7));
        this.shopList.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        this.shopList.add(new Item("Sulfuras, Hand of Ragnaros", -1, 80));
        this.shopList.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        this.shopList.add(new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49));
        this.shopList.add(new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49));
        this.shopList.add(new Item("Conjured Mana Cake", 3, 6));

        this.inventoryList = new ArrayList<Item>();
        this.inventoryList.add(new Item("+5 Dexterity Vest", 10, 20));
        this.inventoryList.add(new Item("Aged Brie", 2, 0));

        initSingletons();
    }

    protected void initSingletons() {
        MySingleton.initInstance();
    }


    public void achat (Item item) {
        this.inventoryList.add(item);
        this.shopList.remove(item);
    }

    public void utilisation (Item item) {
        this.inventoryList.remove(item);
    }

    public ArrayList<Item> getInventoryList () {
        return this.inventoryList;
    }

    public void utiliser (Item item) {
        this.inventoryList.remove(item);
    }

    public ArrayList<Item> getShopList () {
        return this.shopList;
    }
}
