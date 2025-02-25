package org.tc.logging;

public class LoggerFactory {

    public static Logger getLogger() {
        // Read logging setting from system properties (default: false)
        boolean isLoggingEnabled =
                Boolean.parseBoolean(System.getProperty("logging.enabled", "false"));

        return isLoggingEnabled ? new ConsoleLogger() : new NullLogger();

    }
}
