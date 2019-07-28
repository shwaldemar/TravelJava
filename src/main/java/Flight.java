import java.util.ArrayList;

public class Flight {
    private String flightno;
    private String departureAirport;
    private String destinationAirport;
    private String departureTime;
    private Plane plane;
    private ArrayList<Passenger> passengers;

    public Flight(
            String flightno,
            String departureAirport,
            String destinationAirport,
            String departureTime,
            Plane plane)
    {
        this.flightno = flightno;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;
        this.plane = plane;
        this.passengers = new ArrayList<Passenger>();
    }

    // Class functions are below.

    public Plane getPlane(){
        return this.plane;
    }


    public int passengerCount() {
        return this.passengers.size();
    }

    public void bookPassenger(Passenger passenger) {
        if (passengerCount() < plane.getCapacity()) {
            this.passengers.add(passenger);
        }
    }

    public void removePassenger(Passenger passenger) {
        this.passengers.remove(passenger);
    }

    public int numberOfAvailableSeats() {

        return (plane.getCapacity() - passengerCount());
    }
}
