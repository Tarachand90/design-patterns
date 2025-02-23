package org.tc.factory.abstractt.dynamic;

import org.tc.factory.abstractt.dynamic.types.FactoryType;

public interface NotificationFactory {
    Notification createEmailNotification();
    Notification createSMSNotification();
    Notification createPushNotification();

    // Add a method to identify the factory type (Mobile or Web)
    FactoryType getFactoryType();
}
