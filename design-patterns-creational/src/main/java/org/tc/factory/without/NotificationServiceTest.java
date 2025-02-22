package org.tc.factory.without;

public class NotificationServiceTest {
    public static void main(String[] args) {
        NotificationService.sendNotification("push", "Test data for push system");

        NotificationService.sendNotification("sms", "Test data for SMS system");
    }
}
