package org.tc.factory.abstractt.dnyamicnotification.mobile;


import org.tc.factory.abstractt.dnyamicnotification.Notification;
import org.tc.factory.abstractt.dnyamicnotification.types.NotificationType;
import org.tc.factory.abstractt.dnyamicnotification.types.PlatformType;

public class MobilePushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Mobile Push Notification: " + message);
    }

    @Override
    public NotificationType getType() {
        return NotificationType.PUSH;
    }

    @Override
    public PlatformType getPlatform() {
        return PlatformType.MOBILE;
    }
}
