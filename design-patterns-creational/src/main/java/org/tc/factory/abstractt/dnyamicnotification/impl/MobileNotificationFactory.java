package org.tc.factory.abstractt.dnyamicnotification.impl;


import org.tc.factory.abstractt.dnyamicnotification.Notification;
import org.tc.factory.abstractt.dnyamicnotification.NotificationFactory;
import org.tc.factory.abstractt.dnyamicnotification.types.NotificationType;
import org.tc.factory.abstractt.dnyamicnotification.types.PlatformType;


import java.util.Map;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

public class MobileNotificationFactory implements NotificationFactory {

    private static final Map<NotificationType, Notification> notificationCache = new ConcurrentHashMap<>();


    static {
        // Preload notifications dynamically
        ServiceLoader<Notification> loader = ServiceLoader.load(Notification.class);

        for(Notification notification : loader) {
            if(notification.getPlatform() == PlatformType.MOBILE) {
                //Enums in Java are singleton-like constants, meaning each value exists only once in memory.
                // S0 == compares memory references, which is faster and null-safe.
                notificationCache.put(notification.getType(), notification);
            }
        }
    }

    @Override
    public Map<NotificationType, Notification> getAllNotification() {
        return notificationCache;
    }

    @Override
    public Notification create(NotificationType notificationType) {
        Notification notification = notificationCache.get(notificationType);

        if(notification == null) {
            throw new IllegalArgumentException("Unknown Mobile Notification Type: " + notificationType);
        }

        return notification;
    }

    @Override
    public PlatformType getPlatformType() {
        return PlatformType.MOBILE;
    }
}
