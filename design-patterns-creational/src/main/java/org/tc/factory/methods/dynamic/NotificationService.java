package org.tc.factory.methods.dynamic;

import org.tc.factory.simple.Notification;

public class NotificationService {


    public void sendNotification(NotificationType type, String message) {
        NotificationFactory factory = NotificationFactoryRegistry.getFactory(type);
        Notification notification = factory.createNotification();
        notification.send(message);
    }
}
