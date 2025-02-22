package org.tc.factory.methods;

import org.tc.factory.simple.EmailNotification;
import org.tc.factory.simple.Notification;

public class EmailNotificationFactory implements NotificationFactory {

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
