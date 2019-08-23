package model;

public abstract class Food {

    protected double price;
    public int amount;
    public String name;
    public String itemCode;

    // REQUIRES: price > 0.00
    public Food(double price, String name, String code) {
        this.price = price;
        this.name = name;
        itemCode = code;
        amount = 1;
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

    // EFFECTS: sets the amount to i
    public void setAmount(int i) {
        amount = i;
    }

    // EFFECTS: returns the name of the food item
    public String getName() {
        return name;
    }

    //EFFECTS: returns the item code
    public String getCode() {
        return itemCode;
    }

    // EFFECTS: returns the amount of item
    public int getAmount() {
        return amount;
    }
}
