package com.mypurecloud.sdk.v2;

import com.mypurecloud.sdk.v2.extensions.notifications.NotificationEvent;
import com.mypurecloud.sdk.v2.extensions.notifications.NotificationListener;
import com.mypurecloud.sdk.v2.model.PresenceEventUserPresence;

public class UserPresenceListener implements NotificationListener<PresenceEventUserPresence> {
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



    public Class<PresenceEventUserPresence> getEventBodyClass() {
        return PresenceEventUserPresence.class;
    }

    @Override
    public void onEvent(NotificationEvent<?> event) {
        PresenceEventUserPresence notification = (PresenceEventUserPresence)event.getEventBody();
        systemPresence = notification.getPresenceDefinition().getSystemPresence();
        presenceId = notification.getPresenceDefinition().getId();

        System.out.println("system presence -> " + ((PresenceEventUserPresence)event.getEventBody()).getPresenceDefinition().getSystemPresence());
    }

    public UserPresenceListener(String userId) {
        this.topic = "v2.users." + userId + ".presence";
    }
}
