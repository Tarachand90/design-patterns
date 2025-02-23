package org.tc.factory.abstractt.dynamic.mobile;


import org.tc.factory.abstractt.dynamic.Notification;

public class MobileSMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Mobile SMS Notification: " + message);
    }
}
