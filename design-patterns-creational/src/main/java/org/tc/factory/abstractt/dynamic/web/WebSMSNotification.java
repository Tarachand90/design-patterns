package org.tc.factory.abstractt.dynamic.web;


import org.tc.factory.abstractt.dynamic.Notification;

public class WebSMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Web SMS Notification: " + message);
    }
}
