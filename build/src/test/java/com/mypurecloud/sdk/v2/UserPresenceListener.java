package com.mypurecloud.sdk.v2;

import com.mypurecloud.sdk.v2.extensions.notifications.NotificationEvent;
import com.mypurecloud.sdk.v2.extensions.notifications.NotificationListener;
import com.mypurecloud.sdk.v2.model.UserPresenceNotification;

public class UserPresenceListener implements NotificationListener<UserPresenceNotification> {
    private String topic;
    private String systemPresence = "";
    private String presenceId = "";

    public String getTopic() {
        return topic;
    }

    public String getSystemPresence() {
        return systemPresence;
    }

    public String getPresenceId() {
        return presenceId;
    }



    public Class<UserPresenceNotification> getEventBodyClass() {
        return UserPresenceNotification.class;
    }

    @Override
    public void onEvent(NotificationEvent<?> event) {
        UserPresenceNotification notification = (UserPresenceNotification)event.getEventBody();
        systemPresence = notification.getPresenceDefinition().getSystemPresence();
        presenceId = notification.getPresenceDefinition().getId();

        System.out.println("system presence -> " + ((UserPresenceNotification)event.getEventBody()).getPresenceDefinition().getSystemPresence());
    }

    public UserPresenceListener(String userId) {
        this.topic = "v2.users." + userId + ".presence";
    }
}
