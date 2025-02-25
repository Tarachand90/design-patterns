package org.tc.factory.abstractt.dnyamicnotification;

import org.tc.factory.abstractt.dnyamicnotification.types.NotificationType;
import org.tc.factory.abstractt.dnyamicnotification.types.PlatformType;

public interface Notification {
    void send(String message);

    NotificationType getType(); // email, sms, push, whatsapp
    PlatformType getPlatform(); // mobile or web

}
