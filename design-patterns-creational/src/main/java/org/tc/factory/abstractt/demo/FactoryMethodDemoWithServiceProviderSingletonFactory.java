package org.tc.factory.abstractt.demo;

import org.tc.factory.abstractt.NotificationFactory;
import org.tc.factory.abstractt.provider.NotificationFactoryProviderSingleton;

public class FactoryMethodDemoWithServiceProviderSingletonFactory {
    public static void main(String[] args) {
        // Load Mobile Factory - Singleton ensures only one instance
        NotificationFactory mobileFactory1 = NotificationFactoryProviderSingleton.getFactory("mobile");
        NotificationFactory mobileFactory2 = NotificationFactoryProviderSingleton.getFactory("mobile");

        // Both references should be the same
        System.out.println(mobileFactory1 == mobileFactory2); // true

        // Load Web Factory
        NotificationFactory webFactory1 = NotificationFactoryProviderSingleton.getFactory("web");
        NotificationFactory webFactory2 = NotificationFactoryProviderSingleton.getFactory("web");

        // Both references should be the same
        System.out.println(webFactory1 == webFactory2); // true
    }
}
