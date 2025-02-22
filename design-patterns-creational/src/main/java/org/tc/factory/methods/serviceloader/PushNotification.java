package org.tc.factory.methods.serviceloader;

import org.tc.factory.simple.Notification;

public class PushNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending Push Notification: " + message);
        // Real-world: Call Firebase Cloud Messaging (FCM) or APNs for iOS
    }
}
