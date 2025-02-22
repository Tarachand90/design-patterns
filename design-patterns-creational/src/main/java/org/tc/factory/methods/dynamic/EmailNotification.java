package org.tc.factory.methods.dynamic;

import org.tc.factory.simple.Notification;

public class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
        // Real-world: Call an Email API like SendGrid or SMTP
    }
}
