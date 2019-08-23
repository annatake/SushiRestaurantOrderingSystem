package model;

public class Sushi extends Food {
    protected boolean brownRice;

    // sushi is always with white rice as default
    public Sushi(double price, String name, String code) {
        super(price, name, code);
        brownRice = false;
    }

    // MODIFIES: this
    // EFFECTS: sets brownRice to true when customer chooses brown rice option
    //          and adds $1.00 extra charge to price
    public void setBrownRice(boolean brownRice) {
        this.brownRice = brownRice;
        setPrice(price + 1.00);
    }

    // EFFECTS: returns brownRice
    public boolean isBrownRice() {
        return brownRice;
    }


}
