package org.tc.factory.abstractt.provider;

import org.tc.factory.abstractt.NotificationFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

public class NotificationFactoryProviderSingleton {

    private static volatile NotificationFactoryProviderSingleton instance;

    private static final ServiceLoader<NotificationFactory> LOADER =
            ServiceLoader.load(NotificationFactory.class);

    private static final Map<String, NotificationFactory> FACTORY_CACHE
            = new ConcurrentHashMap<>();

    private NotificationFactoryProviderSingleton(){}

    public static NotificationFactoryProviderSingleton getInstance() {
        if(instance == null) {
            synchronized (NotificationFactoryProviderSingleton.class) {
                if(instance == null) {
                    instance = new NotificationFactoryProviderSingleton();
                }
            }
        }
        return instance;
    }

    public static NotificationFactory getFactory(String type) {
        return FACTORY_CACHE.computeIfAbsent(type.toLowerCase(), key -> {
            for (NotificationFactory factory : LOADER) {
                if (factory.getClass().getSimpleName().toLowerCase().contains(key)) {
                    return factory;
                }
            }
            throw new IllegalArgumentException("No matching factory found for type: " + type);
        });
    }
}
