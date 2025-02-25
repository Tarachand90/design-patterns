package org.tc.factory.abstractt.dnyamicnotification.demo;


import org.tc.factory.abstractt.dnyamicnotification.client.NotificationServiceImpl;
import org.tc.factory.abstractt.dnyamicnotification.types.NotificationType;
import org.tc.factory.abstractt.dnyamicnotification.types.PlatformType;

import java.util.HashMap;
import java.util.Map;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        // Dynamically load Mobile Factory
        NotificationServiceImpl mobileService = new NotificationServiceImpl(PlatformType.MOBILE);

        Map<NotificationType, String> mobileMessageMap = new HashMap<>();
        mobileMessageMap.put(NotificationType.EMAIL, "Welcome to Mobile!");
        mobileMessageMap.put(NotificationType.SMS, "Your Mobile OTP is 123456");
        mobileMessageMap.put(NotificationType.PUSH, "New Mobile Alert!");

        mobileService.sendNotification(mobileMessageMap);

        System.out.println("================================");

        NotificationServiceImpl webService = new NotificationServiceImpl(PlatformType.WEB);
        Map<NotificationType, String> webMessageMap = new HashMap<>();
        webMessageMap.put(NotificationType.EMAIL, "Welcome to Web!");
        webMessageMap.put(NotificationType.SMS, "Your Web OTP is 654321");
        webMessageMap.put(NotificationType.PUSH, "New Web Alert!");

        webService.sendNotification(webMessageMap);


    }
}
