package geometry3d;

import geometry2d.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import figureExceptions.ErrorNeggativeException;
import figureExceptions.ErrorZeroException;

public class CylinderTest {

    @Test
    public void testVolume() throws ErrorZeroException, ErrorNeggativeException {
        Circle circle = new Circle(5);
        Cylinder cylinder = new Cylinder(10, circle);
        assertEquals(785.3981633974483, cylinder.volume(), 0.0000000001);
    }

    @Test
    public void testNegativeHeight() throws ErrorZeroException, ErrorNeggativeException {
        Circle circle = new Circle(5);
        Exception exception = assertThrows(ErrorNeggativeException.class, () -> {
            Cylinder cylinder = new Cylinder(-30, circle);
        });
        assertEquals("Height must be a positive :) ", exception.getMessage());
    }

    @Test
    public void testZeroHeight() throws ErrorZeroException, ErrorNeggativeException {
        Circle circle = new Circle(5);
        Exception exception = assertThrows(ErrorZeroException.class, () -> {
            Cylinder cylinder = new Cylinder(0, circle);
        });
        assertEquals("Height zero - unacceptable! >:c ", exception.getMessage());
    }
}