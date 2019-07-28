public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public int passengerBaggageAllowance() {
        Plane plane = flight.getPlane();
        return ((plane.getTotalWeight() / 2) / plane.getCapacity());
    }

    public int passengerLuggageWeight() {
        Plane plane = flight.getPlane();
        return (passengerBaggageAllowance() * flight.passengerCount());
    }

    public int remainingLuggageWeight() {
        Plane plane = flight.getPlane();
        return ((plane.getTotalWeight()/2) - passengerLuggageWeight());
    }



}
