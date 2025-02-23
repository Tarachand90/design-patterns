package org.tc.factory.abstractt.demo;

import org.tc.factory.abstractt.NotificationFactory;
import org.tc.factory.abstractt.client.NotificationService;
import org.tc.factory.abstractt.impl.MobileNotificationFactory;
import org.tc.factory.abstractt.impl.WebNotificationFactory;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        // Using Mobile Factory
        NotificationFactory mobileFactory = new MobileNotificationFactory();
        NotificationService mobileService = new NotificationService(mobileFactory);

        mobileService.sendEmailNotification("Welcome to Mobile!");
        mobileService.sendSMSNotification("Your Mobile OTP is 123456");
        mobileService.sendPushNotification("New Mobile Alert!");

        System.out.println("================================");

        // Using Web Factory
        NotificationFactory webFactory = new WebNotificationFactory();
        NotificationService webService = new NotificationService(webFactory);

        webService.sendEmailNotification("Welcome to Web!");
        webService.sendSMSNotification("Your Web OTP is 654321");
        webService.sendPushNotification("New Web Alert!");
    }
}
