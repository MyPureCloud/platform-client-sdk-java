package com.mypurecloud.sdk.v2.extensions.notifications;


public class NotificationEvent<T> {
    private String topicName;
    private String version;
    private String eventBodyRaw;
    private T eventBody;
    private Metadata metadata;

    public String getTopicName() {
        return topicName;
    }

    public String getVersion() {
        return version;
    }

    public String getEventBodyRaw() {
        return eventBodyRaw;
    }

    protected void setEventBodyRaw(String eventBodyRaw) {
        this.eventBodyRaw = eventBodyRaw;
    }

    public T getEventBody() {
        return eventBody;
    }

    public Metadata getMetadata() {
        return metadata;
    }
}
