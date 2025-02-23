package org.tc.factory.abstractt.dynamic.web;


import org.tc.factory.abstractt.dynamic.Notification;

public class WebEmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Web Email Notification: " + message);
    }
}
