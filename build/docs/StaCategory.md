# StaCategory


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **description** | **String** | The description of the category |  [optional] |
| **interactionType** | [**InteractionTypeEnum**](#Enum--InteractionTypeEnum) | The type of interaction the category will apply to |  |
| **criteria** | [**Operand**](Operand) | A collection of conditions joined together by logical operation to provide more refined filtering of conversations |  |
| **createdBy** | [**AddressableEntityRef**](AddressableEntityRef) | The user who created the record |  [optional] |
| **dateCreated** | [**Date**](Date) | The creation date of the record. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedBy** | [**AddressableEntityRef**](AddressableEntityRef) | The user who last modified the record |  [optional] |
| **dateModified** | [**Date**](Date) | The last modified date of the record. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: InteractionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| VOICE | &quot;Voice&quot; | 
| DIGITAL | &quot;Digital&quot; | 
| ALL | &quot;All&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:217.1.0_
