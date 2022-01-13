import java.util.ArrayList;

public class DiningRoom {

    private String name;
    private int capacity;
    ArrayList<Guest>diners = new ArrayList<>();

    public DiningRoom(String name, ArrayList<Guest> diners) {
        this.name = name;
        this.capacity = 12;
        this.diners = diners;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getDiners() {
        return diners;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setDiners(ArrayList<Guest> diners) {
        this.diners = diners;
    }
}
