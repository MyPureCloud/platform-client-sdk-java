package com.mypurecloud.sdk.v2.extensions.notifications;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Metadata {
    @JsonProperty("CorrelationId")
    private String correlationId;

    public String getCorrelationId() {
        return correlationId;
    }
}
