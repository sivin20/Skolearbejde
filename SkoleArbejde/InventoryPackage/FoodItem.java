package InventoryPackage;

import java.util.Date;

public class FoodItem extends Item {

    private Date expires;

    FoodItem (String name, Double price, Date expires) {
        super(name, price);
        this.expires = expires;
    }

    public Date getExpires() {
        return expires;
    }
    //den overrider Javas egen toString metode
    @Override
    public String toString () {
        return "\n" + "Name: "+getName()+"\n"
                +"Price: "+getPrice()+"\n"
                + "Expires: "+getExpires();
    }

    @Override
    public boolean isExpired() {
        return expires.compareTo(new Date()) < 0;
    }
}
