package org.tc.factory.abstractt.provider;

import org.tc.factory.abstractt.NotificationFactory;

import java.util.ServiceLoader;

public class NotificationFactoryProvider {

    private static final ServiceLoader<NotificationFactory> LOADER =
            ServiceLoader.load(NotificationFactory.class);

    public static NotificationFactory getFactory(String type) {
        for(NotificationFactory factory : LOADER) {
            if(factory.getClass().getSimpleName().toLowerCase().contains(type.toLowerCase())) {
                return factory;
            }
        }
        throw new IllegalArgumentException("No matching factory found for type: " + type);
    }
}
