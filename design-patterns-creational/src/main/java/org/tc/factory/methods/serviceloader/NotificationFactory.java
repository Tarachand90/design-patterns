package org.tc.factory.methods.serviceloader;

import org.tc.factory.simple.Notification;


public interface NotificationFactory {

    public Notification createNotification();

    public NotificationType getNotificationType();
}

