package org.tc.factory.methods.dynamic;

import org.tc.factory.simple.EmailNotification;
import org.tc.factory.simple.Notification;

public class EmailNotificationFactory implements NotificationFactory {

    static {
        NotificationFactoryRegistry.registerFactory(NotificationType.EMAIL, new EmailNotificationFactory());
    }

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
