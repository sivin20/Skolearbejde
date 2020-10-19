package InventoryPackage;

public class Item {

    private String name;
    private double price;

    //Lav en constructoer, så man kan kalde på en super i subclasses.
    Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n" + "name: " + getName() + "\n" + "price: " + getPrice();
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}
