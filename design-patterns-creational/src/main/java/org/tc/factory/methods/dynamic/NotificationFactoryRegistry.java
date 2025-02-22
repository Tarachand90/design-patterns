package org.tc.factory.methods.dynamic;

import java.util.HashMap;
import java.util.Map;

public class NotificationFactoryRegistry {

    private static final Map<NotificationType, NotificationFactory> factoryMap = new HashMap<>();

    public static void registerFactory(NotificationType type, NotificationFactory factory) {
        factoryMap.put(type, factory);
    }

    public static NotificationFactory getFactory(NotificationType type) {
        if(!factoryMap.containsKey(type)) {
            throw new IllegalArgumentException("Unknown Notification Type");
        }

        return factoryMap.get(type);
    }
}
