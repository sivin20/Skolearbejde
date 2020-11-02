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



    }
}
