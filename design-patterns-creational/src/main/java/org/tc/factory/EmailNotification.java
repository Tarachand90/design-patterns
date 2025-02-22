package org.tc.factory;

public class EmailNotification {

    public void send(String message) {
        System.out.println("Sending Email: " + message);
        // Real-world: Call an Email API like SendGrid or SMTP
    }
}
