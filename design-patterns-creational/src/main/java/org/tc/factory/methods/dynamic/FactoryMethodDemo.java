package org.tc.factory.methods.dynamic;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        NotificationFactoryInitializer.initialize();
        NotificationService service = new NotificationService();

        service.sendNotification(NotificationType.EMAIL, "Welcome to our platform!");


        service.sendNotification(NotificationType.SMS, "Your OTP is 123456");


        service.sendNotification(NotificationType.PUSH, "You have a new message!");
    }
}
