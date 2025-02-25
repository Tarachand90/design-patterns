package org.tc.factory.abstractt.dnyamicnotification.provider;


import org.tc.factory.abstractt.dnyamicnotification.NotificationFactory;
import org.tc.factory.abstractt.dnyamicnotification.types.PlatformType;

import java.util.Map;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

public class NotificationFactoryRegistry {

    private static class Holder {
        private static final NotificationFactoryRegistry INSTANCE = new NotificationFactoryRegistry();
    }


    private static final Map<PlatformType, NotificationFactory> factoryMap =
            new ConcurrentHashMap<>();


    private NotificationFactoryRegistry() {

        if(Holder.INSTANCE != null) {
            throw new IllegalStateException("Cannot create multiple instances of Singleton");
        }
        // Load factories dynamically
        ServiceLoader<NotificationFactory> loader =
                ServiceLoader.load(NotificationFactory.class);

        for(NotificationFactory factory : loader) {
            factoryMap.put(factory.getPlatformType(), factory);
        }
    }

    public static NotificationFactoryRegistry getInstance() {

        return Holder.INSTANCE;
    }

    public static NotificationFactory getFactory(PlatformType factoryType) {
        NotificationFactory factory = factoryMap.get(factoryType);
        if(factory == null) {
            throw new IllegalArgumentException("Unknown Factory Type: " + factoryType);
        }

        return factoryMap.get(factoryType);
    }
}
