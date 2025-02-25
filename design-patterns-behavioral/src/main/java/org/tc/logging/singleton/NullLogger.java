package org.tc.logging.singleton;

public class NullLogger implements Logger {

    private static class Holder {
        // Single instance
        private static final NullLogger INSTANCE = new NullLogger();
    }

    private NullLogger() {
        if (Holder.INSTANCE != null) {
            throw new RuntimeException("Reflection attack detected! Singleton already exists.");
        }
    }

    // Public method to get the single instance
    public static NullLogger getInstance() {
        return Holder.INSTANCE;
    }

    @Override
    public void log(String message) {
        // Do nothing (Null Object)
    }
}
