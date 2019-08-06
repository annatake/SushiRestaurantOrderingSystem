package test;

import model.SushiRestaurant;
import ui.TakeOutOrder;
import model.exceptions.RestaurantClosedException;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.fail;


public class TestTakeOutOrder {
    private TakeOutOrder testTakeOutOrder;

    // tests whether order can be made when it should be
    @Test
    public void testConstructorTakeOutOrderOpen() {
        Calendar time = Calendar.getInstance();
        time.set(Calendar.HOUR_OF_DAY, SushiRestaurant.OPENING_TIME);
        try {
            testTakeOutOrder = new TakeOutOrder("Anna", time);
        } catch (RestaurantClosedException e) {
            fail("RestaurantClosedException should not have been thrown");
        }
    }

    // tests whether order will not be made when it shouldn't be
    @Test
    public void testConstructorTakeOutOrderNotOpen() {
        Calendar time = Calendar.getInstance();
        time.set(Calendar.HOUR_OF_DAY, SushiRestaurant.CLOSING_TIME);
        try {
            testTakeOutOrder = new TakeOutOrder("Anna", time);
            fail("Failed to throw RestaurantClosedException");
        } catch (RestaurantClosedException e) {
            // expected
        }
    }
}
