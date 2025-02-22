package org.tc.factory.methods.serviceloader;

import org.tc.factory.simple.EmailNotification;
import org.tc.factory.simple.Notification;

public class EmailNotificationFactory implements NotificationFactory {

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }

    @Override
    public NotificationType getNotificationType() {
        return NotificationType.EMAIL;
    }
}
