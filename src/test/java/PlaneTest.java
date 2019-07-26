import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    private Plane plane;

    @Before
    public void setUp() {
        plane = new Plane(PlaneType.AIRBUS333);
    }

    @Test
    public void canGetCapacity() {
        plane = new Plane(PlaneType.AIRBUS333);
        assertEquals(30, plane.getCapacity());
    }

    @Test
    public void canGetTotalWeight() {
        plane = new Plane(PlaneType.AIRBUS333);
        assertEquals(1200, plane.getTotalWeight());
    }

}
