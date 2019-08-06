package model;


public class ComboAndPartyTray extends Sushi {
    private Sushi[] items;

    // EFFECTS: creates sushi combo or party tray with list of rolls contained in combo/tray
    //          has white rice as default
    public ComboAndPartyTray(double price, String name, Sushi ...items) {
        super(price, name);
        this.items = items;
        setBrownRice(false);
    }

    // MODIFIES: this
    // EFFECTS: sets brownRice to true when customer orders brown rice
    //          and adds $1.00 * numberOfRolls to price
    // TODO: write tests for this method
    @Override
    public void setBrownRice(boolean brownRice) {
        int numOfRolls = items.length;
        this.brownRice = brownRice;
        setPrice(price + 1.00 * numOfRolls);
    }
}
