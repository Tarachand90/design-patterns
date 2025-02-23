package org.tc.factory.abstractt.impl;

import org.tc.factory.abstractt.Notification;
import org.tc.factory.abstractt.NotificationFactory;
import org.tc.factory.abstractt.web.WebEmailNotification;
import org.tc.factory.abstractt.web.WebPushNotification;
import org.tc.factory.abstractt.web.WebSMSNotification;

public class WebNotificationFactory implements NotificationFactory {
    @Override
    public Notification createEmailNotification() {
        return new WebEmailNotification();
    }

    @Override
    public Notification createSMSNotification() {
        return new WebSMSNotification();
    }

    @Override
    public Notification createPushNotification() {
        return new WebPushNotification();
    }
}
