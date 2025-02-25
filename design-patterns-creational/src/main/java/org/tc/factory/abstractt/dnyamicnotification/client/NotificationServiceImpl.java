package org.tc.factory.abstractt.dnyamicnotification.client;


import org.tc.factory.abstractt.dnyamicnotification.Notification;
import org.tc.factory.abstractt.dnyamicnotification.NotificationFactory;
import org.tc.factory.abstractt.dnyamicnotification.provider.NotificationFactoryRegistry;
import org.tc.factory.abstractt.dnyamicnotification.types.NotificationType;
import org.tc.factory.abstractt.dnyamicnotification.types.PlatformType;

import java.util.Map;

public class NotificationServiceImpl implements NotificationService{
    private NotificationFactory factory;
    private Map<NotificationType, Notification> notificationTypeNotificationMap;

    public NotificationServiceImpl(PlatformType factoryType) {
        this.factory = NotificationFactoryRegistry.getInstance().getFactory(factoryType);
        this.notificationTypeNotificationMap = factory.getAllNotification();
    }

    @Override
    public void sendNotification(Map<NotificationType, String> messageMap) {
        for(NotificationType notificationType : messageMap.keySet()) {
            Notification notification = notificationTypeNotificationMap.get(notificationType);
            notification.send(messageMap.get(notificationType));
        }
    }
}
