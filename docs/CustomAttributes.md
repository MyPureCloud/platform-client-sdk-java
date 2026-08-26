# CustomAttributes


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The id of the Custom Attributes record. |  [optional] |
| **name** | **String** |  |  [optional] |
| **conversationId** | **String** | The id of the conversation. |  [optional] |
| **divisions** | **List&lt;String&gt;** | The list of division ids that the record is visible in. If [], the record is visible to all divisions (Unassigned Division). |  [optional] |
| **schema** | [**ConversationDataSchema**](ConversationDataSchema) | The schema that dictates which attributes can be included. |  [optional] |
| **customAttributes** | **Map&lt;String, Object&gt;** | The map of attribute values. |  [optional] |
| **customAttributesTimestamps** | **Map&lt;String, String&gt;** | The map of timestamps for when each attribute was last updated. |  [optional] |
| **version** | **Integer** | The latest version of the Custom Attributes record. |  [optional] |
| **dateCreated** | [**Date**](Date) | The date the record was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The date the record was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:261.0.0_
