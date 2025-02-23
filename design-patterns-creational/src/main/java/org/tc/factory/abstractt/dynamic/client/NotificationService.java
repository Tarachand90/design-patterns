package org.tc.factory.abstractt.dynamic.client;


import org.tc.factory.abstractt.dynamic.Notification;
import org.tc.factory.abstractt.dynamic.NotificationFactory;
import org.tc.factory.abstractt.dynamic.provider.NotificationFactoryRegistry;

public class NotificationService {
    private NotificationFactory factory;

    public NotificationService(String factoryType) {

        this.factory = NotificationFactoryRegistry.getFactory(factoryType);
    }

    public void sendEmailNotification(String message) {
        Notification notification = factory.createEmailNotification();
        notification.send(message);
    }

    public void sendSMSNotification(String message) {
        Notification notification = factory.createSMSNotification();
        notification.send(message);
    }

    public void sendPushNotification(String message) {
        Notification notification = factory.createPushNotification();
        notification.send(message);
    }
}
