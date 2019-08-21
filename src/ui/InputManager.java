package ui;

import model.TakeOutOrder;

import java.util.Scanner;

// Parses user input

public class InputManager {
    private static final String QUIT_COMMAND = "quit";

    private Scanner input;
    private boolean programRunning;
    private TakeOutOrder order;
    private Menu menu;

    public InputManager(TakeOutOrder order, Menu menu) {
        input = new Scanner(System.in);
        programRunning = true;
        this.order = order;
        this.menu = menu;
    }

    // EFFECTS: parses user input until user quits
    public void handleUserInput() {
        printInstructions();
        String str;

        while(programRunning){
            // TODO: finish this
        }
    }

    // EFFECTS: prints instructions to use the ordering system
    private void printInstructions() {
        System.out.println("\nEnter the corresponding number to browse our menu:\n");
        System.out.println("1. Appetizers");
        System.out.println("2. Sushi");
        System.out.println("3. Combos and Party Trays");
        System.out.println("4. Rice Dishes");
        System.out.println("5. Noodles");
        System.out.println("6. Bento Boxes");
        System.out.println("To cancel your order, enter " + QUIT_COMMAND + ".");
    }
}

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