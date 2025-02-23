package org.tc.factory.abstractt;

public interface NotificationFactory {
    Notification createEmailNotification();
    Notification createSMSNotification();
    Notification createPushNotification();
}
