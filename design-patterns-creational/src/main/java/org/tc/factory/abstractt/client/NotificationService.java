package org.tc.factory.abstractt.client;

import org.tc.factory.abstractt.Notification;
import org.tc.factory.abstractt.NotificationFactory;

public class NotificationService {
    private NotificationFactory factory;

    public NotificationService(NotificationFactory factory) {
        this.factory = factory;
    }

    public void sendEmailNotification(String message) {
        Notification notification = factory.createEmailNotification();
        notification.send(message);
    }

    public void sendSMSNotification(String message) {
        Notification notification = factory.createSMSNotification();
        notification.send(message);
    }

    public void sendPushNotification(String message) {
        Notification notification = factory.createPushNotification();
        notification.send(message);
    }
}
