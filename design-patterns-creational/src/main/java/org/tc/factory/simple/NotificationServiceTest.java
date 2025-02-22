package org.tc.factory.simple;

public class NotificationServiceTest {
    public static void main(String[] args) {

        Notification notification;

        notification = NotificationFactory.createNotification(NotificationType.PUSH);

        notification.send("Test data for push system");

        notification = NotificationFactory.createNotification(NotificationType.SMS);

        notification.send("Test data for SMS system");
    }
}
