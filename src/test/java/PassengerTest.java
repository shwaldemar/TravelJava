import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Simon", 2);
    }

    @Test
    public void canGetPassengerName() {

        assertEquals("Simon", passenger.getPassengerName());
    }

    @Test
    public void canGetPassengerNoBags() {
        assertEquals(2, passenger.getPassengerNoBags());
    }
}
