package org.tc.factory.abstractt.dynamic.client;


import org.tc.factory.abstractt.dynamic.Notification;
import org.tc.factory.abstractt.dynamic.NotificationFactory;
import org.tc.factory.abstractt.dynamic.provider.NotificationFactoryRegistry;
import org.tc.factory.abstractt.dynamic.types.FactoryType;

public class NotificationService {
    private NotificationFactory factory;

    public NotificationService(FactoryType factoryType) {

        this.factory = NotificationFactoryRegistry.getInstance().getFactory(factoryType);
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
