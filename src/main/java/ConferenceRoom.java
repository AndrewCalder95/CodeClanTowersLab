import java.util.ArrayList;

public class ConferenceRoom extends AbstractRoom {

    private String name;
    private ArrayList<Guest> guests;

    public ConferenceRoom(int capacity, ArrayList<Guest> guests, String name) {
        super(capacity, guests);
        this.name = name;
        this.guests = guests;
    }

    public String getName() {
        return name;
    }

    @Override
    public void addSingleGuest(Guest guest) {
        guests.add(guest);
    }

    @Override
    public void removeSingleGuest(Guest guest) {
        guests.remove(guest);
    }
}
