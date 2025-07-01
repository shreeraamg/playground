package singletonpattern;

public class Main {

    public static void main(String[] args) {
        DateUtil dateUtil1 = DateUtil.getInstance();
        DateUtil dateUtil2 = DateUtil.getInstance();

        System.out.println(dateUtil1 == dateUtil2);

        Logger logger = Logger.getInstance();

        logger.log("Welcome to Singleton Design Pattern");
        logger.log(dateUtil1.toString());
        logger.log(dateUtil2.toString());
    }

}
