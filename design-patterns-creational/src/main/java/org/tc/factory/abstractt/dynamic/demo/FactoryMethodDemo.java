package org.tc.factory.abstractt.dynamic.demo;

import org.tc.factory.abstractt.dynamic.client.NotificationService;
import org.tc.factory.abstractt.dynamic.types.FactoryType;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        // Dynamically load Mobile Factory
        NotificationService mobileService = new NotificationService(FactoryType.MOBILE);

        mobileService.sendEmailNotification("Welcome to Mobile!");
        mobileService.sendSMSNotification("Your Mobile OTP is 123456");
        mobileService.sendPushNotification("New Mobile Alert!");

        System.out.println("================================");

        // Dynamically load Web Factory
        NotificationService webService = new NotificationService(FactoryType.WEB);

        webService.sendEmailNotification("Welcome to Web!");
        webService.sendSMSNotification("Your Web OTP is 654321");
        webService.sendPushNotification("New Web Alert!");
    }
}
