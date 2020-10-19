package InventoryPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class NonFoodItem extends Item {
    private ArrayList<String> materials;

    NonFoodItem (String name, Double price, ArrayList<String> materials) {
        super(name, price);
        this.materials = materials;
    }

    NonFoodItem (String name, double price, String[] materials) {
        super(name, price);
        this.materials = new ArrayList<String>(Arrays.asList(materials));
    }
    @Override
    public String toString () {
        String m = "[";
        for (int i=0 ; i<materials.size() ; i++) {
            m += (i==0 ? "" : ",")+materials.get(i);
        }
        m += "]";
        return "\n" + "InventoryPackage.NonFoodItem name='"+getName() +"\n"
                + "price: "+getPrice() + "\n"
                + "materials: "+ m +"'";
    }

    public static void main(String[] args) {
        NonFoodItem[] items = new NonFoodItem[10];

        for (int i = 0; i < items.length; i++) {
            //mats sætter ting ind på pladserne i materials[]
            String[] matsIphone = {"battery", "CPU", "Screen"};
            String[] matsPC = {"CPU", "GPU","SSD","AMD Ryzen7", "AMD Radeon","battery"};
            items[0] = new NonFoodItem("Iphone", 3500d,matsIphone);
            items[i] = new NonFoodItem("Lenovo YOGA Slim 7", 8000d,matsPC);

        }
        for(NonFoodItem item: items) {
            System.out.println(item.toString());
        }
    }
}
