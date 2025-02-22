package org.tc.factory;

public class PushNotification {
    public void send(String message) {
        System.out.println("Sending Push Notification: " + message);
        // Real-world: Call Firebase Cloud Messaging (FCM) or APNs for iOS
    }
}
