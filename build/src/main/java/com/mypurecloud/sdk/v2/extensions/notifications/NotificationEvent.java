package com.mypurecloud.sdk.v2.extensions.notifications;


public class NotificationEvent<T> {
    private String topicName;
    private String version;
    private T eventBody;
    private Metadata metadata;

    public String getTopicName() {
        return topicName;
    }

    public String getVersion() {
        return version;
    }

    public T getEventBody() {
        return eventBody;
    }

    public Metadata getMetadata() {
        return metadata;
    }
}
