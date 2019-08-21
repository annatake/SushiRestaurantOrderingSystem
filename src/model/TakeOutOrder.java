package model;

import model.exceptions.RestaurantClosedException;

import java.util.ArrayList;
import java.util.Calendar;

public class TakeOutOrder {
    // Represents a takeout order
    // keeps track of items that customer orders in a list
    // has customers name
    // has reference to sushi restaurant
    // handles user input

    private ArrayList<Food> orders;
    private String customerName;
    private SushiRestaurant restaurant;


    // EFFECTS: constructs a takeout order with an empty list of items
    //          if restaurant is not closed based on given currentTime
    public TakeOutOrder(SushiRestaurant restaurant, Calendar currentTime) throws RestaurantClosedException {
        if (restaurant.isRestaurantOpen(currentTime)) {
            orders = new ArrayList<>();
            this.restaurant = restaurant;
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

    public void registerName(String name) {
        customerName = name;
    }

    // EFFECTS: returns name of customer who ordered the take out
    public String getName() {
        return customerName;
    }

    //EFFECTS: returns the name of the restaurant
    public String getRestaurantName() {
        return restaurant.getName();
    }


}
