package org.tc.factory.methods.dynamic;

import org.reflections.Reflections;

import java.util.Set;

public class NotificationFactoryInitializer {

    public static void initialize() {
        Reflections reflections = new Reflections("org.tc.factory.methods.dynamic");
        Set<Class<? extends NotificationFactory>> factoryClasses =
                reflections.getSubTypesOf(NotificationFactory.class);
        for (Class<? extends NotificationFactory> factoryClass : factoryClasses) {
            try {
                Class.forName(factoryClass.getName());  // Forces class loading
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Factory class not found: " + factoryClass.getName(), e);
            }
        }
    }
}
