package model;

public class SushiRestaurant {
    public static final int OPENING_TIME = 11;
    public static final int CLOSING_TIME = 21;
    public static final int PEAK_TIME_START = 17;
    public static final int PEAK_TIME_END = 20;
    // represents the restaurant the customer is ordering from
    // has opening hours from 11am to 9pm
    // ignore last call
    // customer can only place order within those times
    // ignore rush hour for now:
    // [ also keeps track of peak time in boolean (5-8pm) which adds extra 10 minutes to order
    // assume restaurant is open everyday of the week ]


    private String name;
    //    private boolean isRushHour = false;
    //    private boolean isOpen;

    public SushiRestaurant(String name) {
        this.name = name;
    }

    // EFFECTS: returns name of restaurant
    public String getName() {
        return name;
    }

//    // EFFECTS: sets isRushHour to given boolean
//    public void setIsRushHour(Boolean isRushHour) {
//        this.isRushHour = isRushHour;
//    }
//
//    public boolean isRushHour() {
//        return isRushHour;
//    }
}
