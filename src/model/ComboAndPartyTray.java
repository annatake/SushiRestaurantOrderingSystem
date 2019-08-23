package model;


public class ComboAndPartyTray extends Sushi {
    private Sushi[] items;

    // EFFECTS: creates sushi combo or party tray with list of rolls contained in combo/tray
    //          has white rice as default
    //          Assume that more than a Combo/Party Tray has at least three rolls
    public ComboAndPartyTray(double price, String name, String code, Sushi ...items) {
        super(price, name, code);
        this.items = items;
        setBrownRice(false);
    }

    // MODIFIES: this
    // EFFECTS: sets brownRice to true when customer orders brown rice
    //          and adds $1.00 * numberOfRolls to price
    @Override
    public void setBrownRice(boolean brownRice) {
        if (brownRice) {
            this.brownRice = brownRice;
            int numOfRolls = items.length;
            setPrice(price + 1.00 * numOfRolls);
        }
    }
}
