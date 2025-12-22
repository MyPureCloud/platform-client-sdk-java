# UserPresenceEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventId** | **String** | A unique (V4 UUID) eventId for this event |  |
| **eventDateTime** | [**Date**](Date) | A Date Time representing the time this event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **userId** | **String** | The User ID of the user associated with this UserPresence |  |
| **sourceId** | **String** | The id (V4 UUID) of the presence source being updated |  |
| **presenceDefinitionId** | **String** | The id (UUID) of the presence definition that the user presence is associated with |  [optional] |
| **message** | **String** | The message associated with the presence |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
