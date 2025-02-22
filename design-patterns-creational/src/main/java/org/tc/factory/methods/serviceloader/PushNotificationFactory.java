package org.tc.factory.methods.serviceloader;

import org.tc.factory.simple.Notification;
import org.tc.factory.simple.PushNotification;

public class PushNotificationFactory implements NotificationFactory {

    @Override
    public Notification createNotification() {
        return new PushNotification();
    }

    @Override
    public NotificationType getNotificationType() {
        return NotificationType.PUSH;
    }
}
