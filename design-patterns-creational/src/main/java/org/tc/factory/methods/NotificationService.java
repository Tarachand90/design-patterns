package org.tc.factory.methods;

import org.tc.factory.simple.Notification;

public class NotificationService {

    private final NotificationFactory notificationFactory;

    public NotificationService(final NotificationFactory notificationFactory) {
        this.notificationFactory = notificationFactory;
    }

    public void sendNotification(String message) {
        Notification notification = notificationFactory.createNotification();
        notification.send(message);
    }
}
