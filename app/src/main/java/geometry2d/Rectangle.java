package geometry2d;

import figureExceptions.ErrorNeggativeException;
import figureExceptions.ErrorZeroException;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
public class Rectangle implements Figure {
    private double width;
    private double height;
    private static final Logger logger = Logger.getLogger(Rectangle.class.getName());
    static {
        try {
            FileHandler fh = new FileHandler("figures.log", true);
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);
            logger.setLevel(Level.INFO);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Rectangle(double width, double height) throws ErrorZeroException, ErrorNeggativeException {
        if (width == 0 || height == 0) {
            throw new ErrorZeroException("width or height zero - unacceptable! >:( )");
        }
        if (width < 0 || height < 0) {
            throw new ErrorNeggativeException("Width or height must be a positive :-) ");
        }
        this.width = width;
        this.height = height;
        
    }

    @Override
    public double area() {
        double area = width * height;
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = 2 * (width + height);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
