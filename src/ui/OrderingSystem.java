package ui;

import model.SushiRestaurant;
import model.TakeOutOrder;
import model.exceptions.RestaurantClosedException;

import java.util.Calendar;

public class OrderingSystem {
    public static void main(String[] args) {
        System.out.println("---------Creating the Sushi Restaurant---------");
        SushiRestaurant restaurant = new SushiRestaurant("Takeya Sushi");

        System.out.println("---------Initializing Menu---------");
        Menu menu = new Menu();
        Calendar time = Calendar.getInstance();

        TakeOutOrder order = null;
        try {
            order = new TakeOutOrder(restaurant, time);
        } catch (RestaurantClosedException e) {
            System.out.println("Sorry, we are currently closed. We are open from 11am to 9pm.");
            System.exit(0);
            // system should exit at this point
        }

        InputHandler input = new InputHandler(order, menu);
        System.out.println("Welcome to " + restaurant.getName() + "!");
        input.handleUserInput();

        // something like:
        // "Welcome to <insert restaurant name>"
        // check if restaurant is open:
        // --> if not open, print "Sorry, we are currently closed. We are open from 11am to 9pm."
        // --> if open, print list of menu categories
        // "Enter the corresponding number to browse our menu:
        //  1. Appetizers
        //  2. Sushi
        //  3. Combos and Party Trays
        //  4. Rice Dishes
        //  5. Noodle Dishes
        //  6. Bento Boxes  "
        //
        // count how many items are in the order list to determine how long the order will take

    }

}
