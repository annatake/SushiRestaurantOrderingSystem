package model;

public class NoodleDish extends Food {
    private boolean soupSeparate;
    private boolean extraNoodles;
    private static final double EXTRA_CHARGE_NOODLES = 3.00;

    public NoodleDish(double price, String name, String code) {
        super(price, name, code);
        soupSeparate = false;
        extraNoodles = false;
    }

    // EFFECTS: sets soupSeparate to true when customer asks for soup to be separated
    public void setSoupSeparate(boolean soupSeparate) {
        this.soupSeparate = soupSeparate;
    }

    // MODIFIES: this
    // EFFECTS: sets extraNoodles to true when customer asks for extra noodles
    //          adds $3.00 extra charge to price
    public void setExtraNoodles(boolean extraNoodles) {
        this.extraNoodles = extraNoodles;
        if (extraNoodles) {
            setPrice(getPrice() + EXTRA_CHARGE_NOODLES);
        }
    }

    // EFFECTS: returns true if soup is seperated from noodles
    public boolean isSoupSeperate() {
        return soupSeparate;
    }

    // EFFECTS: returns true if customer ordered extra noodles
    public boolean isExtraNoodles() {
        return extraNoodles;
    }



}
