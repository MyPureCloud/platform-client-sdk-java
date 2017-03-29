package com.mypurecloud.sdk.v2.extensions.notifications;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChannelMetadataNotification {
    private String message;

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }
}
