package org.tc.factory.methods;

import org.tc.factory.simple.Notification;
import org.tc.factory.simple.PushNotification;
import org.tc.factory.simple.SMSNotification;

public class PushNotificationFactory implements NotificationFactory {

    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
