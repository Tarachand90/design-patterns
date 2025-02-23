package org.tc.factory.abstractt.dynamic.web;


import org.tc.factory.abstractt.dynamic.Notification;

public class WebPushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Web Push Notification: " + message);
    }
}
