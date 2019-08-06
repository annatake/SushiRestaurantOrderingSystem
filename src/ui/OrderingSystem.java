package ui;

import model.SushiRestaurant;

public class OrderingSystem {
    public static void main(String[] args) {
        System.out.println("---------Create the Sushi Restaurant---------");
        SushiRestaurant restaurant = new SushiRestaurant("Takeya Sushi");

        System.out.println("---------Initializing Menu---------");
        Menu menu = new Menu();

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
        //

    }
}
