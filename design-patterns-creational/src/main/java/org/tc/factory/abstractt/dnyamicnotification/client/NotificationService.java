package org.tc.factory.abstractt.dnyamicnotification.client;

import org.tc.factory.abstractt.dnyamicnotification.types.NotificationType;

import java.util.Map;

public interface NotificationService {

    void sendNotification(Map<NotificationType, String> messageMap);
}
