package package2;
import package1.Logger;
public class main extends Logger {
    public static void main(String [] args){
        main logger = new main();
        // invokes debug() from Logger class
        logger.debug("hello from main");
    }
}