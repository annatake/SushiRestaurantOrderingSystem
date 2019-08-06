package model;

public abstract class Food {

    protected double price;
    public String name;

    // REQUIRES: price > 0.00
    public Food(double price, String name) {
        this.price = price;
        this.name = name;
    }

    // EFFECTS: returns price of food item in $
    public double getPrice() {
        return price;
    }

    // REQUIRES: price > 0.00
    // MODIFIES: this
    // EFFECTS: sets price to given amount
    //          for changing price of food item (eg. extra charges)
    public void setPrice(double price) {
        this.price = price;
    }
}
