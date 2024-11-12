# PhoneEstablishedEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventId** | **String** | A unique (V4 UUID) eventId for this event |  |
| **eventDateTime** | [**Date**](Date) | A Date Time representing the time this event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **conversationId** | **String** | A unique Id (V4 UUID) identifying this conversation |  |
| **communicationId** | **String** | A unique Id (V4 UUID) identifying this communication |  |
| **phoneNumber** | **String** | The phone number for this phone. |  [optional] |
| **ani** | **String** | The automatic number identification if it is available for this conversation. |  [optional] |
| **dnis** | **String** | The dialed number identification if it is available for this conversation. |  [optional] |
| **initialConfiguration** | [**InitialConfiguration**](InitialConfiguration) | Metadata about this communication. |  |
| **sourceConfiguration** | [**SourceConfiguration**](SourceConfiguration) | Metadata about the source of this communication's interaction. |  |




_com.mypurecloud.sdk.v2:platform-client-v2:214.0.0_
