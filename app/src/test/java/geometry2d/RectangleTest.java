package geometry2d;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import figureExceptions.ErrorNeggativeException;
import figureExceptions.ErrorZeroException;
public class RectangleTest {

    @Test
    void testConstructorValidInputs() {
        assertDoesNotThrow(() -> {
            Rectangle rectangle = new Rectangle(5, 10);
            assertEquals(5, rectangle.area() / 10);
            assertEquals(10, rectangle.area() / 5);
        });
    }

    @Test
    void testConstructorZeroWidth() {
        Exception exception = assertThrows(ErrorZeroException.class, () -> {
            new Rectangle(0, 10);
        });
        assertEquals("width or height zero - unacceptable! >:( )", exception.getMessage());
    }

    @Test
    void testConstructorZeroHeight() {
        Exception exception = assertThrows(ErrorZeroException.class, () -> {
            new Rectangle(5, 0);
        });
        assertEquals("width or height zero - unacceptable! >:( )", exception.getMessage());
    }

    @Test
    void testConstructorNegativeWidth() {
        Exception exception = assertThrows(ErrorNeggativeException.class, () -> {
            new Rectangle(-5, 10);
        });
        assertEquals("Width or height must be a positive :-) ", exception.getMessage());
    }

    @Test
    void testConstructorNegativeHeight() {
        Exception exception = assertThrows(ErrorNeggativeException.class, () -> {
            new Rectangle(5, -10);
        });
        assertEquals("Width or height must be a positive :-) ", exception.getMessage());
    }

    @Test
    void testArea() throws ErrorZeroException, ErrorNeggativeException {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(50, rectangle.area());
    }

    @Test
    void testPerimeter() throws ErrorZeroException, ErrorNeggativeException {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(30, rectangle.perimeter());
    }

    @Test
    void testToString() throws ErrorZeroException, ErrorNeggativeException {
        Rectangle rectangle = new Rectangle(5, 10);
        String expected = "Rectangle{width=5.0, height=10.0, area=50.0, perimeter=30.0}";
        assertEquals(expected, rectangle.toString());
    }
}
