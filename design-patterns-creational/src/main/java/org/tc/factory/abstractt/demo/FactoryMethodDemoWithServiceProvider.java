package org.tc.factory.abstractt.demo;

import org.tc.factory.abstractt.NotificationFactory;
import org.tc.factory.abstractt.client.NotificationService;
import org.tc.factory.abstractt.provider.NotificationFactoryProvider;

public class FactoryMethodDemoWithServiceProvider {
    public static void main(String[] args) {
        // Load Mobile Notification Factory dynamically
        NotificationFactory factory = NotificationFactoryProvider.getFactory("mobile");
        NotificationService mobileService = new NotificationService(factory);
        System.out.println("=== Sending Notifications using Mobile Factory ===");
        mobileService.sendEmailNotification("Welcome to Mobile!");
        mobileService.sendSMSNotification("Your Mobile OTP is 123456");
        mobileService.sendPushNotification("New Mobile Alert!");

        System.out.println("\n================================\n");

        // Load Web Notification Factory dynamically
        NotificationFactory webFactory = NotificationFactoryProvider.getFactory("web");
        NotificationService webService = new NotificationService(webFactory);

        System.out.println("=== Sending Notifications using Web Factory ===");
        webService.sendEmailNotification("Welcome to Web!");
        webService.sendSMSNotification("Your Web OTP is 654321");
        webService.sendPushNotification("New Web Alert!");

    }
}
