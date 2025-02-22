package org.tc.factory.methods.dynamic;

import org.tc.factory.simple.Notification;
import org.tc.factory.simple.SMSNotification;

public class SMSNotificationFactory implements NotificationFactory {

    static {
        NotificationFactoryRegistry.registerFactory(NotificationType.SMS, new SMSNotificationFactory());
    }
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
