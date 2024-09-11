# AppEventResponseSession


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | ID of the app session. |  |
| **durationInSeconds** | **Integer** | Indicates how long the customer has been in the app within this session. |  |
| **eventCount** | **Integer** | The count of all events recorded during this session. |  |
| **screenviewCount** | **Integer** | The count of all screen views recorded during this session. |  |
| **referrer** | [**Referrer**](Referrer) | The referrer of the first event in the app session. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
| **createdDate** | [**Date**](Date) | UTC timestamp of the session's first event, that is when the session starts. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |




_com.mypurecloud.sdk.v2:platform-client-v2:209.0.1_
