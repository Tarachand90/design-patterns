package org.tc.factory.without;

public class SMSNotification {

    public void send(String message) {
        System.out.println("Sending SMS: " + message);
        // Real-world: Integrate with Twilio or another SMS API
    }
}
