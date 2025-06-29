# WebEventResponseSession


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **durationInSeconds** | **Integer** | Indicates how long the customer has been on the site within this session. |  |
| **eventCount** | **Integer** | The count of all events recorded during this session. |  |
| **pageviewCount** | **Integer** | The count of all pageviews performed during this session. |  |
| **referrer** | [**Referrer**](Referrer) | The referrer of the first event in the web session. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
| **createdDate** | [**Date**](Date) | Date of the session's first event, that is when the session starts. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
