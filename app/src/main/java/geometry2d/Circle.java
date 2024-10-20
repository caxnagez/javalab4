package geometry2d;
import figureExceptions.*;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
public class Circle implements Figure {
    private double r;
    
    private static final Logger logger = Logger.getLogger(Circle.class.getName());
    static {
        try {
            FileHandler fh = new FileHandler("figures.log", true);
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);
            logger.setLevel(Level.SEVERE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Circle(double r) throws ErrorZeroException, ErrorNeggativeException
    {
        if (r == 0) {
            throw new ErrorZeroException("Radius zero - unacceptable! >:c ");
        }
        if (r < 0) {
            throw new ErrorNeggativeException("Radius must be a positive :) ");
        }
        this.r = r;
    }
    @Override
    public double area() {
        double area = Math.PI * r * r;
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = 2 * Math.PI * r;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
