import java.util.logging.*;

class HelloWorld {
    public static void main(String[] args) {
        private static final Logger logger = Logger.getLogger(HelloWorld.class.getName())
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.INFO);
        logger.addHandler(consoleHandler);
        logger.info("Hello World .");
    }
}