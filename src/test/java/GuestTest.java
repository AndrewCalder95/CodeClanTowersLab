import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        this.guest = new Guest("Bob");
    }

    @Test
    public void testHasName(){
        assertEquals("Bob", guest.getName());
    }

    @Test
    public void testCanSetName(){
        guest.setName("Rob");
        assertEquals("Rob", guest.getName());
    }


}
