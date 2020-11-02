package InventoryPackage;

import java.util.ArrayList;
import java.util.Date;

    class Inventory {
    private ArrayList<Item> items;

    Inventory(ArrayList<Item> items) {
        this.items = items;
    }

    Inventory() {
        this(new ArrayList<Item>());
    }

    public void addItem(Item item){
        if(!items.contains(item)) {
            items.add(item);
        }
    }
    public void removeItem(Item item) {
        items.remove(item);

    }
    public double getInventoryValue() {
        double total = 0.0;
        for(Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void removeExpiresFoods() {
        for(int i = 0; i < items.size(); i++)
        {
            Item item = items.get(i);
            try
            {
                boolean isExpired = item.isExpired();
                if(isExpired)
                {
                    items.remove(item);
                    i--;
                    // after item is removed, go back one index in ArrayList
                }
            }
            catch (UnsupportedOperationException ex)
            {
                System.out.println("Item is a non food item");
            }
        }
    }

    public void printInventory() {
        System.out.println("InventoryPackage.Inventory");
        for (Item item : items) {
            System.out.println(" - "+item);
        }
    }
    public static void printStatus (Inventory inventory) {
        inventory.printInventory();
        System.out.println("\n" + "Total: "+inventory.getInventoryValue());
        System.out.println("");
        }


}

