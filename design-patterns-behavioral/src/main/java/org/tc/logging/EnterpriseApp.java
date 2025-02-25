package org.tc.logging;

public class EnterpriseApp {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger();

        logger.log("Application started");
        logger.log("Performing business logic");
        logger.log("Application shutting down");
    }
}
