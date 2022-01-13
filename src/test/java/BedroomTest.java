import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest   {

    Bedroom bedroom;
    Guest guest1;
    Guest guest2;
    ArrayList<Guest> guests = new ArrayList<>();

    @Before
    public void before(){
        guest1 = new Guest("Bob");
        guest2 = new Guest("Rob");
        guests.add(guest1);
        guests.add(guest2);
        bedroom = new Bedroom(2, guests, 201, RoomType.SINGLE, 45);
    }

    @Test
    public void testGetRoomNumber() {
        assertEquals(201, bedroom.getRoomNumber());
    }

    @Test
    public void testGetRoomType() {
        assertEquals(RoomType.SINGLE, bedroom.getRoomType());
    }

    @Test
    public void testGetCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void testHasGuests(){
        assertEquals(guests, bedroom.getGuests());
    }
}
