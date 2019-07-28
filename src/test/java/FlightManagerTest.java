import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager1, flightManager2;
    private Flight flight1, flight2;
    private Plane plane1, plane2;
    private Passenger passenger1, passenger2, passenger3;

    @Before
    public void before() {
        plane1 = new Plane(PlaneType.AIRBUS333);

        flight1 = new Flight(
                "a1",
                "EDI",
                "LON",
                "9am/Wed/28/08/2019",
                plane1);

        passenger1 = new Passenger("Simon1", 2);
        passenger2 = new Passenger("Simon2", 2);
        passenger3 = new Passenger("Simon2", 2);

        flightManager1 = new FlightManager(flight1);

        plane2 = new Plane(PlaneType.AIRBUSA340);
        flight2 = new Flight(
                "a2",
                "LON",
                "EDI",
                "10am/Wed/28/08/2019",
                plane2);

        flightManager2 = new FlightManager(flight2);
    }

    @Test
    public void canReturnBaggageWeightReservedForEachPassenger1() {
        Plane plane = flight1.getPlane();
        assertEquals(20, flightManager1.passengerBaggageAllowance());
    }

    @Test
    public void canReturnBaggageWeightReservedForEachPassenger2() {
        Plane plane = flight2.getPlane();
        assertEquals(20, flightManager2.passengerBaggageAllowance());
    }

    @Test
    public void canReturnNumberOfBookings() {
        Plane plane = flight2.getPlane();
        flight2.bookPassenger(passenger1);
        flight2.bookPassenger(passenger2);
        flight2.bookPassenger(passenger3);
        assertEquals(3, flight2.passengerCount());
    }

    @Test
    public void canReturnWeightBookedByPassengers1() {
        Plane plane = flight1.getPlane();
        flight1.bookPassenger(passenger1);
        flight1.bookPassenger(passenger2);
        flight1.bookPassenger(passenger3);
        assertEquals(60, flightManager1.passengerLuggageWeight());
    }

    @Test
    public void canReturnWeightBookedByPassengers2() {
        Plane plane = flight2.getPlane();
        flight2.bookPassenger(passenger1);
        flight2.bookPassenger(passenger2);
        assertEquals(40, flightManager2.passengerLuggageWeight());
    }

    @Test
    public void canGetRemainingLuggageWeight() {
        Plane plane = flight1.getPlane();
        flight1.bookPassenger(passenger1);
        flight1.bookPassenger(passenger2);
        flight1.bookPassenger(passenger3);
        assertEquals(540, flightManager1.remainingLuggageWeight());
    }

}
