package org.tc.factory.methods.serviceloader;

import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

public class NotificationFactoryRegistry {

    private static final Map<NotificationType, NotificationFactory> factoryMap = new HashMap<>();

    static {
        ServiceLoader<NotificationFactory> loader = ServiceLoader.load(NotificationFactory.class);

        for(NotificationFactory factory : loader) {
            factoryMap.put(factory.getNotificationType(), factory);
        }
    }

    public static NotificationFactory getFactory(NotificationType type) {
        if(!factoryMap.containsKey(type)) {
            throw new IllegalArgumentException("Unknown Notification Type");
        }

        return factoryMap.get(type);
    }
}
