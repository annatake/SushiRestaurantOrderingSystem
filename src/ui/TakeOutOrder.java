package ui;

import model.Food;
import model.SushiRestaurant;
import model.exceptions.RestaurantClosedException;

import java.util.ArrayList;
import java.util.Calendar;

public class TakeOutOrder {
    // Represents a takeout order
    // keeps track of items that customer orders in a list
    // has customers name
    // handles user input

    private ArrayList<Food> orders;
    private String name;


    // EFFECTS: constructs a takeout order with customers name and empty list of items
    //          if restaurant is not closed based on given currentTime
    public TakeOutOrder(String name, Calendar currentTime) throws RestaurantClosedException {
        if (checkRestaurantOpen(currentTime)) {
            orders = new ArrayList<>();
            this.name = name;
        } else {
            throw new RestaurantClosedException("The restaurant is closed.");
        }
    }

    // MODIFIES: orders
    // EFFECTS: adds food item to to-go order list
    public void addItem(Food item) {
        orders.add(item);
    }

    // MODIFIES: orders
    // EFFECTS: removes food item from to-go order list
    public void removeItem(Food item) {
        orders.remove(item);
    }

    // EFFECTS: returns name of customer who ordered the take out
    public String getName() {
        return name;
    }


    // EFFECTS: returns true if restaurant is open
    private boolean checkRestaurantOpen(Calendar time) {
        if (time.get(Calendar.HOUR_OF_DAY) < SushiRestaurant.OPENING_TIME ||
                time.get(Calendar.HOUR_OF_DAY) >= SushiRestaurant.CLOSING_TIME) {
            return false;
        } else {
            return true;
        }
    }
}
