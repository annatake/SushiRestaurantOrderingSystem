package ui;

import com.sun.xml.internal.ws.util.StringUtils;
import model.*;

import java.text.DecimalFormat;
import java.util.Scanner;

// Parses user input

public class InputHandler {
    private static final String QUIT_COMMAND = "quit";
    private static final String CHECK_ORDER_COMMAND = "check";
    private static final String BACK_COMMAND = "back";
    private static final String PLACE_ORDER_COMMAND = "order";
    private static final double TAX_MULTIPLIER = 1.05;
    private static final int SHORT_WAIT_TIME = 15;
    private static final int NORMAL_WAIT_TIME = 20;
    private static final int LONG_WAIT_TIME = 30;

    private Scanner input;
    private boolean programRunning;
    private boolean orderConfirmed;
    private TakeOutOrder order;
    private Menu menu;
    // refactor later: see if we can instantiate TakeOutOrder in InputHandler rather than in OrderingSystem

    public InputHandler(TakeOutOrder order, Menu menu) {
        input = new Scanner(System.in);
        programRunning = true;
        orderConfirmed = false;
        this.order = order;
        this.menu = menu;
    }

    // EFFECTS: parses user input until user quits
    public void handleUserInput() {
        printMenu();
        String str;

        while(programRunning){
            str = getUserInputString();
            parseInput(str);
        }
    }

    // EFFECTS: prints instructions to use the ordering system
    private void printMenu() {
        System.out.println("\nEnter the corresponding number to browse our menu:\n");
        System.out.println("1. Appetizers");
        System.out.println("2. Sushi");
        System.out.println("3. Combos and Party Trays");
        System.out.println("4. Rice Dishes");
        System.out.println("5. Noodles");
        System.out.println("6. Bento Boxes");
        System.out.println("To check the items in your current order, enter " + CHECK_ORDER_COMMAND + ".");
        System.out.println("To place your order, enter " + PLACE_ORDER_COMMAND + ".");
        System.out.println("To cancel your order, enter " + QUIT_COMMAND + ".");
    }

    // EFFECTS: shows menu items depending on user input
    private void parseInput(String str) {
        if (str.length() > 0) {
            switch (str) {
                case "1":
                    printAppetizers();
                    printMenu();
                    break;
                case "2":
                    printSushi();
                    printMenu();
                    break;
                case "3":
                    printCombosAndTrays();
                    printMenu();
                    break;
                case "4":
                    printRiceDishes();
                    printMenu();
                    break;
                case "5":
                    printNoodles();
                    printMenu();
                    break;
                case "6":
                    printBentoBox();
                    printMenu();
                    break;
                case CHECK_ORDER_COMMAND:
                    printOrder();
                    printMenu();
                    break;
                case PLACE_ORDER_COMMAND:
                    placeOrder();
                    break;
                case QUIT_COMMAND:
                    programRunning = false;
                    //endProgram();
                    break;
                default:
                    System.out.println("Sorry, invalid input. Please try again.");
                    printMenu();
                    break;
            }
        }
    }

    // EFFECTS: parses the user's confirmation
    private void parseConfirmation() {
        String str = getUserInputString();
        if (str.length() > 0) {
            switch (str) {
                case "yes":
                    orderConfirmed = true;
                    break;
                case "no":
                    orderConfirmed = false;
                    break;
                default:
                    System.out.println("Sorry, invalid input. Please try again.");
                    confirmOrder();
                    break;
            }
        }

    }

    // EFFECTS: returns the user input
    private String getUserInputString() {
        String str = "";
        if (input.hasNext()) {
            str = input.nextLine();
            str = makePrettyString(str);
        }
        return str;
    }

    // EFFECTS: removes whitespaces and quotation marks around given string
    private String makePrettyString(String str) {
        str = str.toLowerCase();
        str = str.trim();
        str = str.replaceAll("\"|\'", "");

        return str;
    }

    /* ~~~ METHODS THAT PRINT MENU ITEMS ~~~ */

    // EFFECTS: prints out the list of appetizers
    private void printAppetizers() {
        System.out.println("\nAppetizers:\n");
        for (Appetizer a : menu.getAppiesList()) {
            System.out.println(a.getCode() + " " + a.getName() + ": $" + a.getPrice());
            // loops over list and prints out the name of item and its price
        }
        System.out.println("To add an item to your order, enter the item code.");
        System.out.println("Enter " + BACK_COMMAND + " to return to the main menu.");
        handleOrderInput();
    }

    // EFFECTS: prints out the list of appetizers
    private void printSushi() {
        System.out.println("\nSushi:\n");
        for (Sushi s: menu.getSushiList()) {
            System.out.println(s.getCode() + " " + s.getName() + ": $" + s.getPrice());
        }
        System.out.println("To add an item to your order, enter the item code.");
        System.out.println("Enter " + BACK_COMMAND + " to return to the main menu.");
        handleOrderInput();
    }

    // EFFECTS: prints out the list of combos and party trays
    private void printCombosAndTrays() {
        System.out.println("\nSushi Combos and Party Trays:\n");
        for (ComboAndPartyTray c: menu.getComboAndTrayList()) {
            System.out.println(c.getCode() + " " + c.getName() + ": $" + c.getPrice());
        }
        System.out.println("To add an item to your order, enter the item code.");
        System.out.println("Enter " + BACK_COMMAND + " to return to the main menu.");
        handleOrderInput();
    }

    // EFFECTS: prints out the list of rice dishes
    private void printRiceDishes() {
        System.out.println("\nRice Dishes:\n");
        for (RiceDish r: menu.getRiceDishList()) {
            System.out.println(r.getCode() + " " + r.getName() + ": $" + r.getPrice());
        }
        System.out.println("To add an item to your order, enter the item code.");
        System.out.println("Enter " + BACK_COMMAND + " to return to the main menu.");
        handleOrderInput();
    }

    // EFFECTS: prints out the list of noodle dishes
    private void printNoodles() {
        System.out.println("\nNoodles:\n");
        for (NoodleDish n: menu.getNoodleList()) {
            System.out.println(n.getCode() + " " + n.getName() + ": $" + n.getPrice());
        }
        System.out.println("To add an item to your order, enter the item code.");
        System.out.println("Enter " + BACK_COMMAND + " to return to the main menu.");
        handleOrderInput();
    }

    // EFFECTS: prints out the list of bento boxes
    private void printBentoBox() {
        System.out.println("\nBento Boxes:\n");
        for (BentoBox b: menu.getBentoBoxList()) {
            System.out.println(b.getCode() + " " + b.getName() + ": $" + b.getPrice());
        }
        System.out.println("To add an item to your order, enter the item code.");
        System.out.println("Enter " + BACK_COMMAND + " to return to the main menu.");
        handleOrderInput();
    }


    /* ~~~ METHODS THAT HANDLE ORDERING ~~~ */

    // EFFECTS: parses ordering input
    private void handleOrderInput() {
        String code = getUserInputString();

        if (code.length() > 0) {
            if (code.contains("a")) {
                for (Appetizer a : menu.getAppiesList()) {
                    if (code.equalsIgnoreCase(a.getCode())) {
                        System.out.println("How many " + a.getName() + " would you like?");
                        handleAddItemAmount(a);
                    }
                }
            } else if (code.contains("s")) {
                for (Sushi s: menu.getSushiList()) {
                    if (code.equalsIgnoreCase(s.getCode())) {
                        System.out.println("How many " + s.getName() + " would you like?");
                        handleAddItemAmount(s);
                    }
                }
            } else if (code.contains("c")) {
                for (ComboAndPartyTray c: menu.getComboAndTrayList()) {
                    if (code.equalsIgnoreCase(c.getCode())) {
                        System.out.println("How many " + c.getName() + " would you like?");
                        handleAddItemAmount(c);
                    }
                }
            } else if (code.contains("r")) {
                for (RiceDish r: menu.getRiceDishList()) {
                    if (code.equalsIgnoreCase(r.getCode())) {
                        System.out.println("How many " + r.getName() + " would you like?");
                        handleAddItemAmount(r);
                    }
                }
            } else if (code.contains("n")) {
                for (NoodleDish n: menu.getNoodleList()) {
                    if (code.equalsIgnoreCase(n.getCode())) {
                        System.out.println("How many " + n.getName() + " would you like?");
                        handleAddItemAmount(n);
                    }
                }
            } else if (code.contains("b")) {
                for (BentoBox b: menu.getBentoBoxList()) {
                    if (code.equalsIgnoreCase(b.getCode())) {
                        System.out.println("How many " + b.getName() + " would you like?");
                        handleAddItemAmount(b);
                    }
                }
            } else if (code.equalsIgnoreCase(BACK_COMMAND)) {
                printMenu();
            } else {
                System.out.println("Sorry, invalid input. Please try again");
                handleOrderInput();
            }
        }
    }

    // EFFECTS: handles how many items user wants of an item
    private void handleAddItemAmount(Food item) {
        String str = getUserInputString();

        if (str.length() > 0) {
            int i = Integer.parseInt(str);
            if (i > 0 && i <= 10) {
                item.setAmount(i);
                order.addItem(item);
                System.out.println("Added " + i + " " + item.getName() + " to your order.");
            } else {
                System.out.println("Sorry, invalid amount.");
                handleAddItemAmount(item); //could this loop forever??
            }
        } else {
            System.out.println("Sorry, invalid input");
            handleAddItemAmount(item);
        }
    }


    //EFFECTS: prints out a list of items in current order
    private void printOrder() {
        int itemCount = 0;
        for (Food item: order.getOrders()) {
            itemCount += item.getAmount();
        }

        System.out.println("You have " + itemCount + " item(s) in your current order:");
        for (Food f: order.getOrders()) {
            System.out.println(f.getAmount() + " " + f.getName());
        }
    }

    // EFFECTS: asks user if their order is correct before placing the order
    private void confirmOrder() {
        printOrder();
        System.out.println("To confirm your order, enter yes.");
        System.out.println("To continue your order, enter no.");

        parseConfirmation();
    }

    // EFFECTS: checks if order is empty, asks for name, prints out total amount,
    //          checks how many items are in the order to estimate how long it will take,
    //          then places the customers order
    // TODO: finish this method
    private void placeOrder() {
        if (order.getOrders().size() > 0) {
            confirmOrder();
            if (orderConfirmed) {
                enterName();
                printTotal();
                System.out.println("Thank you " + StringUtils.capitalize(order.getName()) +
                        ", your order has been sent to the kitchen.");
                System.out.println("Your order will take " + getWaitTime() + " minutes. \nSee you soon!");
                endProgram();
            } else {
                printMenu();
            }
        } else {
            System.out.println("Sorry, you currently have nothing in your order. " +
                    "\nPlease take a look at the menu.");
            printMenu();
        }

    }

    // EFFECTS: asks user to enter their name
    private void enterName() {
        System.out.println("Please enter your name:");
        String name = getUserInputString();
        order.registerName(name);
    }

    // EFFECTS: prints out the total of the bill plus tax
    //          TODO: figure out how to round the total
    private void printTotal() {
        double total = 0;

        for (Food f: order.getOrders()) {
            double itemPrice = f.getPrice() * f.getAmount();
            total += itemPrice;
        }

        total = total * TAX_MULTIPLIER;

        System.out.println("Your total is: $" + roundTotal(total));
    }

    // EFFECTS: calculates the wait time of the order
    //
    private int getWaitTime() {
        int itemCount = 0;
        for (Food item: order.getOrders()) {
            itemCount += item.getAmount();
        }

        if (itemCount <= 5) {
            return SHORT_WAIT_TIME;
        } else if (itemCount <= 10) {
            return NORMAL_WAIT_TIME;
        } else {
            return LONG_WAIT_TIME;
        }
    }

    // EFFECTS: program stops receiving user input
    private void endProgram() {
        System.out.println("-------- Closing Menu --------");
        programRunning = false;
        input.close();
    }

    // EFFECTS: rounds the total to 2 decimal places
    private String roundTotal(double total) {
        DecimalFormat df = new DecimalFormat("###.##");
        return df.format(total);
    }

}