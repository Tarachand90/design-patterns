package org.tc.factory.abstractt.dynamic.provider;

import org.tc.factory.abstractt.dynamic.NotificationFactory;

import java.util.Map;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

public class NotificationFactoryRegistry {

    private static final Map<String, NotificationFactory> factoryMap =
            new ConcurrentHashMap<>();
    private static volatile NotificationFactoryRegistry instance;

    // Static block ensures registry is populated before any call to getFactory()
    static {
        getInstance();  // Triggers initialization
    }

    private NotificationFactoryRegistry() {
        // Load factories dynamically
        ServiceLoader<NotificationFactory> loader =
                ServiceLoader.load(NotificationFactory.class);

        for(NotificationFactory factory : loader) {
            factoryMap.put(factory.getFactoryType(), factory);
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

    public static NotificationFactory getFactory(String factoryType) {
        if(!factoryMap.containsKey(factoryType)) {
            throw new IllegalArgumentException("Unknown Factory Type: " + factoryType);
        }

        return factoryMap.get(factoryType);
    }
}
