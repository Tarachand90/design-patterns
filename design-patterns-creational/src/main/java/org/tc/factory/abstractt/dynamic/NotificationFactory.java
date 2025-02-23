package org.tc.factory.abstractt.dynamic;

public interface NotificationFactory {
    Notification createEmailNotification();
    Notification createSMSNotification();
    Notification createPushNotification();

    // Add a method to identify the factory type (Mobile or Web)
    String getFactoryType();
}
