package org.tc.factory.simple;

public class NotificationFactory {

    public static Notification createNotification(NotificationType type) {
        switch (type) {
            case SMS:
                return new SMSNotification();
            case EMAIL:
                return new EmailNotification();
            case PUSH:
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Type is unknown");
        }
    }
}
