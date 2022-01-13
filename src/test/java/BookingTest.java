import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BookingTest {
    Booking booking1;
    Bedroom bedroom1;
    ArrayList<Guest> guests = new ArrayList<>();

    @Before
    public void before(){
        bedroom1 = new Bedroom(2, guests, 201, RoomType.SINGLE, 45 );
        booking1 = new Booking(bedroom1);
        booking1.setNightsBooked(4);
    }

    @Test
    public void testSetNightsBooked(){
        assertEquals(4, booking1.getNightsBooked());
    }
}