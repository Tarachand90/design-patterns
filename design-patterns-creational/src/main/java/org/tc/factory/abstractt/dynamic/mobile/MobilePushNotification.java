package org.tc.factory.abstractt.dynamic.mobile;


import org.tc.factory.abstractt.dynamic.Notification;

public class MobilePushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Mobile Push Notification: " + message);
    }
}
