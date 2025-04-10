# AudioUpdatedEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventId** | **String** | A unique (V4 UUID) eventId for this event |  |
| **eventDateTime** | [**Date**](Date) | A Date Time representing the time this event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **conversationId** | **String** | A unique Id (V4 UUID) identifying this conversation |  |
| **communicationId** | **String** | A unique Id (V4 UUID) identifying this communication |  |
| **audioState** | [**AudioState**](AudioState) | The updated audioState for the target communication. |  |




_com.mypurecloud.sdk.v2:platform-client-v2:223.1.0_
