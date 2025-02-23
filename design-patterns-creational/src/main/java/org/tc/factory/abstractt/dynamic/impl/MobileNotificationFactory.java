package org.tc.factory.abstractt.dynamic.impl;

import org.tc.factory.abstractt.dynamic.Notification;
import org.tc.factory.abstractt.dynamic.NotificationFactory;
import org.tc.factory.abstractt.dynamic.mobile.MobileEmailNotification;
import org.tc.factory.abstractt.dynamic.mobile.MobilePushNotification;
import org.tc.factory.abstractt.dynamic.mobile.MobileSMSNotification;

public class MobileNotificationFactory implements NotificationFactory {

    @Override
    public Notification createEmailNotification() {
        return new MobileEmailNotification();
    }

    @Override
    public Notification createSMSNotification() {
        return new MobileSMSNotification();
    }

    @Override
    public Notification createPushNotification() {
        return new MobilePushNotification();
    }

    @Override
    public String getFactoryType() {
        return "mobile";
    }
}
