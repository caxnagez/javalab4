package geometry3d;
import figureExceptions.ErrorNeggativeException;
import figureExceptions.ErrorZeroException;
import geometry2d.Figure;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;
import java.util.logging.LogRecord;
public class Cylinder {
    private Figure base;
    private double height;
    private static final Logger logger = Logger.getLogger(Cylinder.class.getName());
    static {
        try {
            FileHandler fh = new FileHandler("cylinder.log", true);
            fh.setFormatter(new SimpleFormatter() {
                @Override
                public String format(LogRecord record) {
                    return record.getLevel() + " " + record.getMillis() + " " + record.getMessage() + "\n";
                }
            });
            logger.addHandler(fh);
            logger.setLevel(Level.FINEST);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Cylinder (double height, Figure base) throws ErrorZeroException, ErrorNeggativeException {
          if (height == 0) {
            throw new ErrorZeroException("Height zero - unacceptable! >:c ");
        }
        if (height < 0) {
            throw new ErrorNeggativeException("Height must be a positive :) ");
        }
        this.height = height;
        this.base = base;
    }
    public double volume() {
        return base.area() * height;
    }
}
// по тз только объем - ВОПРОСЫ?