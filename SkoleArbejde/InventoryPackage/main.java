package InventoryPackage;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Item i1 = new FoodItem("Chocolate", 20d, new Date(2020-1900, 9, 7));
        Item i2 = new FoodItem("Milk",9.95,new Date(2020-1900, 9, 7));
        Item i3 = new FoodItem("Haribo",14.95, new Date(2020-1900, 9, 7));
        Item i4 = new NonFoodItem("Charger",39.95, new String[]{"plastic","electricity", "software n' stuff"});

        Item[] items = new Item[]{i1, i2, i3, i4};

        for(Item item: items) {
            inventory.addItem(item);
        }

        for (int i = 0; i < items.length; i++) {
            //mats sætter ting ind på pladserne i materials[]
            String[] matsIphone = {"battery", "CPU", "Screen"};
            String[] matsPC = {"CPU", "GPU","SSD","AMD Ryzen7", "AMD Radeon","battery"};
            items[0] = new NonFoodItem("Iphone", 3500d,matsIphone);
            items[2] = new NonFoodItem("Lenovo YOGA Slim 7", 8000d,matsPC);
        }

        for(Item item: items) {
            inventory.addItem(item);
        }

        for (int i = 0; i < items.length; i++) {
            items[0] = new FoodItem("Tomato", 50d,new Date(2020-1900, 9, 7));
            items[1] = new FoodItem("Orange",25d,new Date(2020-1900,12,7));
            items[2] = new FoodItem("Watermelon",27d,new Date(2020-1900,9,7));
        }

        for(Item item: items) {
            inventory.addItem(item);
        }

        inventory.printStatus(inventory);

        inventory.removeExpiresFoods();

        System.out.println("\n" + "new inventory" + "\n");

        inventory.printStatus(inventory);
    }
}
