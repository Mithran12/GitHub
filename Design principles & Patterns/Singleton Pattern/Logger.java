public class Logger {

    private static Logger instance = new Logger(); // Eager initialization

    private Logger() {
        System.out.println("Logger instance created.");
    }

    public static Logger getInstance() {
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
