public class Booking {

    Bedroom bedroom;
    private int nightsBooked;

    public Booking(Bedroom bedroom){
        this.bedroom = bedroom;
        this.nightsBooked = 0;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public int getNightsBooked() {
        return nightsBooked;
    }

    public void setBedroom(Bedroom bedroom) {
        this.bedroom = bedroom;
    }

    public void setNightsBooked(int nightsBooked) {
        this.nightsBooked = nightsBooked;
    }
}
