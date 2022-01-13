import org.junit.Before;

public class AbstractRoomTest  {

    AbstractRoom abstractRoom;
    Guest guest1;
    Guest guest2;

    @Before
    public void before(){
        guest1 = new Guest("Bob");
        guest2 = new Guest("Rob");

        }

}