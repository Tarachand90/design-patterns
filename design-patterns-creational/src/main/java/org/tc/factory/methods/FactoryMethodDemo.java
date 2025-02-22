package org.tc.factory.methods;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        NotificationService emailService = new NotificationService(new EmailNotificationFactory());
        emailService.sendNotification("Welcome to our platform!");

        NotificationService smsService = new NotificationService(new SMSNotificationFactory());
        smsService.sendNotification("Your OTP is 123456");

        NotificationService pushService = new NotificationService(new PushNotificationFactory());
        pushService.sendNotification("You have a new message!");
    }
}
