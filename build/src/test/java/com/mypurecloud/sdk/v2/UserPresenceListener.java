package com.mypurecloud.sdk.v2;

import com.mypurecloud.sdk.v2.extensions.notifications.NotificationEvent;
import com.mypurecloud.sdk.v2.extensions.notifications.NotificationListener;
import com.mypurecloud.sdk.v2.model.PresenceEventUserPresence;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.time.LocalDateTime;

public class UserPresenceListener implements NotificationListener<PresenceEventUserPresence> {
    private String topic;

    private volatile String systemPresence = "";
    private volatile String presenceId = "";

    private volatile String expectedPresenceId;
    private volatile CountDownLatch presenceLatch;

    public String getTopic() {
        return topic;
    }

    public String getSystemPresence() {
        return systemPresence;
    }

    public String getPresenceId() {
        return presenceId;
    }

    /**
     * Call this BEFORE triggering the API Update Presence operation.
     */
    public void expectPresence(String expectedPresenceId) {
        this.presenceLatch = new CountDownLatch(1);
        this.expectedPresenceId = expectedPresenceId;
    }

    /**
     * Wait until the expected presence is received, or timeout occurs.
     */
    public boolean awaitPresence(long timeout, TimeUnit unit)
            throws InterruptedException {
        CountDownLatch latch = this.presenceLatch;

        if (latch == null) {
            throw new IllegalStateException(
                    "expectPresence() must be called before awaitPresence()");
        }

        return latch.await(timeout, unit);
    }

    public Class<PresenceEventUserPresence> getEventBodyClass() {
        return PresenceEventUserPresence.class;
    }

    @Override
    public void onEvent(NotificationEvent<?> event) {
        PresenceEventUserPresence notification = (PresenceEventUserPresence)event.getEventBody();
        this.systemPresence = notification.getPresenceDefinition().getSystemPresence();
        this.presenceId = notification.getPresenceDefinition().getId();

        LocalDateTime currentDT = LocalDateTime.now();
        System.out.println("system presence [" + currentDT + "] -> " + this.systemPresence + " (" + this.presenceId + ")");

        CountDownLatch latch = this.presenceLatch;
        String expected = this.expectedPresenceId;

        if (latch != null && expected != null &&
                expected.equals(this.presenceId)) {
            latch.countDown();
        }
    }

    public UserPresenceListener(String userId) {
        this.topic = "v2.users." + userId + ".presence";
    }
}
