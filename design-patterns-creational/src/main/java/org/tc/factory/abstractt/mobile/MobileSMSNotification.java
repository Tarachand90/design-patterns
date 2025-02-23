package org.tc.factory.abstractt.mobile;

import org.tc.factory.abstractt.Notification;

public class MobileSMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Mobile SMS Notification: " + message);
    }
}
