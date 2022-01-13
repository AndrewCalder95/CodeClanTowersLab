import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom;
    Guest guest1;
    Guest guest2;
    ArrayList<Guest> guests = new ArrayList<>();

    @Before
    public void before(){
        guest1 = new Guest("Bob");
        guest2 = new Guest("Rob");
        guests.add(guest1);
        guests.add(guest2);
        conferenceRoom = new ConferenceRoom( 2, guests, "Main Hall" );
    }

    @Test
    public void testHasName(){
        assertEquals("Main Hall", conferenceRoom.getName());
    }
}
