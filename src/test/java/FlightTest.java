import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FlightTest {
    Flight flight;
    Plane plane;
    Passenger passenger;

    @Before
    public void before() {

        plane = new Plane(PlaneType.AIRBUS333);

        flight = new Flight(
                "a1",
                "EDI",
                "LON",
                "9am/Wed/28/08/2019",
                plane);

        passenger = new Passenger("Simon", 2);

    }

    @Test
    public void flightStartsEmpty() {
        assertEquals(0, flight.passengerCount());
    }

    @Test
    public void canAddPassenger() {
        flight.bookPassenger(passenger);
        assertEquals(1, flight.passengerCount());
    }

    @Test
    public void cannotAddMorePassengersThanPlaneCapacity() {
        int times = 0;
        while (times < 32) {
            flight.bookPassenger(passenger);
            times += 1;
        }

        assertEquals(30, flight.passengerCount());

    }

    @Test
    public void canReturnNumberOfAvailableSeats() {
        int times = 0;
        while (times < 29) {
            flight.bookPassenger(passenger);
            times += 1;
        }
        assertEquals(1, flight.numberOfAvailableSeats());
    }

    @Test
    public void canRemovePassenger() {
        flight.bookPassenger(passenger);
        assertEquals(1, flight.passengerCount());
        flight.removePassenger(passenger);
        assertEquals(0, flight.passengerCount());
    }


}
