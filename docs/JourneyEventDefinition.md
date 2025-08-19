# JourneyEventDefinition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the event definition |  |
| **source** | [**SourceEnum**](#Enum--SourceEnum) | The source of the event definition |  |
| **description** | **String** | The description of this event definition |  |
| **jsonSchema** | [**JsonSchemaDocument**](JsonSchemaDocument) | The JSON schema of this event definition |  |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: SourceEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NATIVE | &quot;Native&quot; | 
| CUSTOM | &quot;Custom&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.1.0_
