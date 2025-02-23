package org.tc.factory.abstractt.dynamic.impl;


import org.tc.factory.abstractt.dynamic.Notification;
import org.tc.factory.abstractt.dynamic.NotificationFactory;
import org.tc.factory.abstractt.dynamic.types.FactoryType;
import org.tc.factory.abstractt.dynamic.web.WebEmailNotification;
import org.tc.factory.abstractt.dynamic.web.WebPushNotification;
import org.tc.factory.abstractt.dynamic.web.WebSMSNotification;

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

    @Override
    public FactoryType getFactoryType() {
        return FactoryType.WEB;
    }
}
