package model.exceptions;

public class RestaurantClosedException extends Exception {

    public RestaurantClosedException() {
        super();
    }

    public RestaurantClosedException(String msg) {
        super(msg);
    }
}
