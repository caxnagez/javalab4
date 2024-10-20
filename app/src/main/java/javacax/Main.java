package javacax;

import geometry2d.*;
import geometry3d.*;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import figureExceptions.ErrorNeggativeException;
import figureExceptions.ErrorZeroException;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;
import java.util.logging.LogRecord;
public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    static {
        try {
            FileHandler fh = new FileHandler("console.log", true);
            fh.setFormatter(new SimpleFormatter() {
                @Override
                public String format(LogRecord record) {
                    return record.getLevel() + " " + record.getMillis() + " " + record.getMessage() + "\n";
                }
            });
            logger.addHandler(fh);
            logger.setLevel(Level.FINE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws ErrorZeroException, ErrorNeggativeException {
        logger.fine("Main method started");

        geometry2d.Circle circle = new geometry2d.Circle(5);
        geometry2d.Rectangle rectangle = new geometry2d.Rectangle(4,6);
        geometry3d.Cylinder cylinder = new geometry3d.Cylinder(10,circle);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(cylinder);
    }
}