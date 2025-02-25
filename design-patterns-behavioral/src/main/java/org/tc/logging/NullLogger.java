package org.tc.logging;

public class NullLogger implements Logger{
    @Override
    public void log(String message) {
        // Do nothing (Null Object)
    }
}
