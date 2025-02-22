package org.tc.factory.methods.dynamic;

import org.tc.factory.simple.Notification;
import org.tc.factory.simple.PushNotification;

public class PushNotificationFactory implements NotificationFactory {

    static {
        NotificationFactoryRegistry.registerFactory(NotificationType.PUSH, new PushNotificationFactory());
    }
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
