package model;

public class BentoBox extends Food {
    private boolean brownRice;

    public BentoBox(double price, String name, String code) {
        super(price, name, code);
        brownRice = false;
    }

    // MODIFIES: this
    // EFFECTS: sets brownRice to true when customer orders brown rice
    //          and adds $1.00 to the price (brown rice is applied to rolls or rice)
    public void setBrownRice(boolean brownRice) {
        this.brownRice = brownRice;
        setPrice(price + 1.00);
    }

    // EFFECTS: returns true if customer ordered brown rice
    public boolean isBrownRice() {
        return brownRice;
    }

}
