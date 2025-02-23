package org.tc.factory.abstractt.dynamic.demo;

import org.tc.factory.abstractt.dynamic.client.NotificationService;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        // Dynamically load Mobile Factory
        NotificationService mobileService = new NotificationService("mobile");

        mobileService.sendEmailNotification("Welcome to Mobile!");
        mobileService.sendSMSNotification("Your Mobile OTP is 123456");
        mobileService.sendPushNotification("New Mobile Alert!");

        System.out.println("================================");

        // Dynamically load Web Factory
        NotificationService webService = new NotificationService("web");

        webService.sendEmailNotification("Welcome to Web!");
        webService.sendSMSNotification("Your Web OTP is 654321");
        webService.sendPushNotification("New Web Alert!");
    }
}
