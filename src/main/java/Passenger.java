public class Passenger {

    private String name;
    private int noBags;

    public Passenger(String name, int noBags) {
        this.name = name;
        this.noBags = noBags;
    }

    public String getPassengerName() {
        return this.name;
    }

    public int getPassengerNoBags() {
        return this.noBags;
    }

}
