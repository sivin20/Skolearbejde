package InventoryPackage;

import java.util.ArrayList;
import java.util.Date;

    class Inventory {
    private ArrayList<Item> items;

    Inventory (ArrayList<Item> items) {
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

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Item i1 = new Item("Chocolate", 20d);
        Item i2 = new FoodItem("Milk",9.95,new Date(12*1000*60*60*24));
        Item i3 = new Item("Haribo",14.95);
        Item i4 = new NonFoodItem("Charger",39.95, new String[]{"plastic","electricity", "software n' stuff"});

        Item[] items = new Item[]{i1,i2,i3,i4};

        for(Item item: items) {
            inventory.addItem(item);
        }

        printStatus(inventory);

    }
}

