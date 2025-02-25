package org.tc.factory.abstractt.dnyamicnotification.mobile;


import org.tc.factory.abstractt.dnyamicnotification.Notification;
import org.tc.factory.abstractt.dnyamicnotification.types.NotificationType;
import org.tc.factory.abstractt.dnyamicnotification.types.PlatformType;

public class MobileSMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Mobile SMS Notification: " + message);
    }

    @Override
    public NotificationType getType() {
        return NotificationType.SMS;
    }

    @Override
    public PlatformType getPlatform() {
        return PlatformType.MOBILE;
    }
}
