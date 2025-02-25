package org.tc.factory.abstractt.dnyamicnotification;


import org.tc.factory.abstractt.dnyamicnotification.types.NotificationType;
import org.tc.factory.abstractt.dnyamicnotification.types.PlatformType;

import java.util.Map;

public interface NotificationFactory {
    Notification create(NotificationType notificationType);

    // Add a method to identify the factory type (Mobile or Web)
    PlatformType getPlatformType();

    Map<NotificationType, Notification> getAllNotification();
}
