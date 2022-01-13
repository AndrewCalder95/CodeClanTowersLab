import java.util.ArrayList;

public abstract class AbstractRoom {
    private int capacity;
    private ArrayList<Guest> guests;

    public AbstractRoom(int capacity, ArrayList<Guest> guests){
        this.capacity = capacity;
        this.guests = guests;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public abstract void addSingleGuest(Guest guest);

    public abstract void removeSingleGuest(Guest guest);
}
