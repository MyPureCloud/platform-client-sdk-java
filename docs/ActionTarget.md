# ActionTarget


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **userData** | [**List&lt;KeyValue&gt;**](KeyValue) | Additional user data associated with the target in key/value format. |  [optional] |
| **supportedMediaTypes** | [**List<SupportedMediaTypesEnum>**](#Enum--SupportedMediaTypesEnum) | Supported media types of the target. |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | Indicates the state of the target. |  [optional] |
| **description** | **String** | Description of the target. |  [optional] |
| **serviceLevel** | [**ServiceLevel**](ServiceLevel) | Service Level of the action target. Chat offers for the target will be throttled with the aim of achieving this service level. |  [optional] |
| **shortAbandonThreshold** | **Integer** | Indicates the non-default short abandon threshold |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
| **createdDate** | [**Date**](Date) | The date the target was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedDate** | [**Date**](Date) | The date the target was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |


## Enum: SupportedMediaTypesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CALLBACK | &quot;callback&quot; |
| CALL | &quot;call&quot; |
| EMAIL | &quot;email&quot; |
| GENERIC | &quot;generic&quot; |
| MESSAGING | &quot;messaging&quot; |
| SOCIAL | &quot;social&quot; |
| WEBCHAT | &quot;webchat&quot; |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;active&quot; | 
| INACTIVE | &quot;inactive&quot; | 
| DELETED | &quot;deleted&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.1.0_
