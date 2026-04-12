# CustomAttributesPatchRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | Unique identifier for the Custom Attributes record. IDs are created by users. |  |
| **divisions** | **List&lt;String&gt;** | The list of division ids. Use [] if divisions aren't used (Unassigned Division). Omitting or setting to [] clears existing values on update. |  [optional] |
| **version** | **Integer** | The latest version of the Custom Attributes record. Optional for concurrency check. |  [optional] |
| **customAttributes** | **Map&lt;String, Object&gt;** | The map of attribute values. |  |




_com.mypurecloud.sdk.v2:platform-client-v2:252.0.0_
