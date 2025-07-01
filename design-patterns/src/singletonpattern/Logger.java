package singletonpattern;

public class Logger implements Cloneable {

    private static final Logger logger;

    // Eager Initialization
    static {
        logger = new Logger();
    }

    private Logger() {
    }

    public void log(String message) {
        System.out.println(message);
    }

    public static Logger getInstance() {
        return logger;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
