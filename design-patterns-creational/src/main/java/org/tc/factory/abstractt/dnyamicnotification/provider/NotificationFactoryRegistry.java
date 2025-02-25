package org.tc.factory.abstractt.dnyamicnotification.provider;


import org.tc.factory.abstractt.dnyamicnotification.NotificationFactory;
import org.tc.factory.abstractt.dnyamicnotification.types.PlatformType;

import java.util.Map;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

public class NotificationFactoryRegistry {

    private static final Map<PlatformType, NotificationFactory> factoryMap =
            new ConcurrentHashMap<>();
    private static volatile NotificationFactoryRegistry instance;


    private NotificationFactoryRegistry() {
        // Load factories dynamically
        ServiceLoader<NotificationFactory> loader =
                ServiceLoader.load(NotificationFactory.class);

        for(NotificationFactory factory : loader) {
            factoryMap.put(factory.getPlatformType(), factory);
        }
    }

    public static NotificationFactoryRegistry getInstance() {
        if (instance == null) {
            synchronized (NotificationFactoryRegistry.class) {
                if(instance == null) {
                    instance = new NotificationFactoryRegistry();
                }
            }
        }
        return instance;
    }

    public static NotificationFactory getFactory(PlatformType factoryType) {
        NotificationFactory factory = factoryMap.get(factoryType);
        if(factory == null) {
            throw new IllegalArgumentException("Unknown Factory Type: " + factoryType);
        }

        return factoryMap.get(factoryType);
    }
}
