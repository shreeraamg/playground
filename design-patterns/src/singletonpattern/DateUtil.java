package singletonpattern;

public class DateUtil {

    private static volatile DateUtil instance;

    // Private Constructor so no other classes can initiate
    private DateUtil() {
    }

    // Lazy Initialization
    public static DateUtil getInstance() {
        if (instance == null) {
            // Thread safe
            synchronized (DateUtil.class) {
                if (instance == null) {
                    instance = new DateUtil();
                }
            }
        }

        return instance;
    }

}
