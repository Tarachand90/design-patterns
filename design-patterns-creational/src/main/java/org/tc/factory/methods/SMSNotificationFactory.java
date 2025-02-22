package org.tc.factory.methods;

import org.tc.factory.simple.EmailNotification;
import org.tc.factory.simple.Notification;
import org.tc.factory.simple.SMSNotification;

public class SMSNotificationFactory implements NotificationFactory {

    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
