package org.tc.factory.without;

public class NotificationService {

    public static void sendNotification(String type, String message) {
        switch (type.toLowerCase()) {
            case "sms":
                SMSNotification smsNotification = new SMSNotification();
                smsNotification.send(message);
                break;
            case "email":
                EmailNotification emailNotification = new EmailNotification();
                emailNotification.send(message);
                break;
            case "push":
                PushNotification pushNotification = new PushNotification();
                pushNotification.send(message);
                break;
            default:
                throw new IllegalArgumentException("Type is unknown");
        }
    }
}
