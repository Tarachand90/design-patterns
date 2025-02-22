package org.tc.factory.methods.serviceloader;

import org.tc.factory.simple.Notification;
import org.tc.factory.simple.SMSNotification;

public class SMSNotificationFactory implements NotificationFactory {

    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }

    @Override
    public NotificationType getNotificationType() {
        return NotificationType.SMS;
    }
}
