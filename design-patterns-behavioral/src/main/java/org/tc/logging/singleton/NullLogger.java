package org.tc.logging.singleton;

public class NullLogger implements Logger {

    // Single instance
    private static final NullLogger INSTANCE = new NullLogger();

    // Private constructor to prevent instantiation
    private NullLogger() {
        if (INSTANCE != null) {
            throw new RuntimeException("Reflection attack detected! Singleton already exists.");
        }
    }

    // Public method to get the single instance
    public static NullLogger getInstance() {
        return INSTANCE;
    }

    @Override
    public void log(String message) {
        // Do nothing (Null Object)
    }
}
