package org.tc.factory.abstractt.impl;

import org.tc.factory.abstractt.Notification;
import org.tc.factory.abstractt.NotificationFactory;
import org.tc.factory.abstractt.mobile.MobileEmailNotification;
import org.tc.factory.abstractt.mobile.MobilePushNotification;
import org.tc.factory.abstractt.mobile.MobileSMSNotification;

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
}
