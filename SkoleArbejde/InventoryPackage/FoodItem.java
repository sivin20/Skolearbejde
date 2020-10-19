package InventoryPackage;

import java.util.Date;

public class FoodItem extends Item {

    private Date expires;

    FoodItem (String name, Double price, Date expires) {
        super(name, price);
        this.expires = expires;
    }

    public Date getExpires () {
        return expires;
    }
    //den overrider Javas egen toString metode
    @Override
    public String toString () {
        return "\n" + "Name: "+getName()+"\n"
                +"Price: "+getPrice()+"\n"
                + "Expires: "+getExpires();
    }

    public static void main(String[] args) {
        FoodItem[] items = new FoodItem[10];

        for (int i = 0; i < items.length; i++) {
            items[0] = new FoodItem("Tomato", 50d,new Date(2020-1900, 9, 7));
            items[1] = new FoodItem("Orange",25d,new Date(2020-1900,9,7));
            items[i] = new FoodItem("Watermelon",27d,new Date(2020-1900,9,7));
        }
        //iterer igennem
        for (FoodItem item: items)
            System.out.println(item.toString());
    }
}
