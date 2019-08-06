package model;

public class RiceDish extends Food{
    private boolean brownRice;

    // rice dishes are always with white rice as default
    public RiceDish(double price, String name) {
        super(price, name);
        brownRice = false;
    }

    // MODIFIES: this
    // EFFECTS: sets brownRice to true when customer chooses brown rice option
    //          and adds $2.00 extra charge to the price
    public void setBrownRice(boolean brownRice) {
        this.brownRice = brownRice;
        setPrice(price + 2.00);
    }

    // EFFECTS: returns brownRice
    public boolean isBrownRice() {
        return brownRice;
    }


}
