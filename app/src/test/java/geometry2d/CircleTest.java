package geometry2d;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import figureExceptions.ErrorNeggativeException;
import figureExceptions.ErrorZeroException;

public class CircleTest {

    @Test
    void testCircleConstructorPositiveRadius() {
        assertDoesNotThrow(() -> new Circle(5));
    }

    @Test
    void testCircleConstructorZeroRadius() {
        Exception exception = assertThrows(ErrorZeroException.class, () -> new Circle(0));
        assertEquals("Radius zero - unacceptable! >:c ", exception.getMessage());
    }

    @Test
    void testCircleConstructorNegativeRadius() {
        Exception exception = assertThrows(ErrorNeggativeException.class, () -> new Circle(-1));
        assertEquals("Radius must be a positive :) ", exception.getMessage());
    }

    @Test
    void testAreaWithPositiveRadius() {
        Circle circle = assertDoesNotThrow(() -> new Circle(3));
        assertEquals(Math.PI * 9, circle.area(), 0.0001, "Area calculation is incorrect.");
    }

    @Test
    void testPerimeterWithPositiveRadius() {
        Circle circle = assertDoesNotThrow(() -> new Circle(4));
        assertEquals(2 * Math.PI * 4, circle.perimeter(), 0.0001, "Perimeter calculation is incorrect.");
    }

    @Test
    void testToString() {
        Circle circle = assertDoesNotThrow(() -> new Circle(2));
        String expected = "Circle{r=2.0, area=" + Math.PI * 4 + ", perimeter=" + 2 * Math.PI * 2 + '}';
        assertEquals(expected, circle.toString(), "toString method does not match expected format.");
    }
}

