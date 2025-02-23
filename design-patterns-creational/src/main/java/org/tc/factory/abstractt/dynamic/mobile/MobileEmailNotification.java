package org.tc.factory.abstractt.dynamic.mobile;


import org.tc.factory.abstractt.dynamic.Notification;

public class MobileEmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Mobile Email Notification: " + message);
    }
}
