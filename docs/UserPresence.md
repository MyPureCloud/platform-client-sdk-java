# UserPresence


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **source** | **String** | Deprecated - The sourceID field should be used as a replacement. |  [optional] |
| **sourceId** | **String** | Represents the ID of a registered source |  [optional] |
| **primary** | **Boolean** | A boolean used to tell whether or not to set this presence source as the primary on a PATCH |  [optional] |
| **presenceDefinition** | [**PresenceDefinition**](PresenceDefinition) |  |  [optional] |
| **message** | **String** |  |  [optional] |
| **modifiedDate** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:214.0.0_
