# ExternalOrganizationIdentifier


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **division** | [**WritableStarrableDivision**](WritableStarrableDivision) | The division to which this entity belongs. |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of this identifier |  |
| **value** | **String** | The string value of the identifier. Will vary in syntax by type. |  |
| **dateCreated** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **externalSource** | [**ExternalSource**](ExternalSource) | The External Source ID of the identifier |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EXTERNALID | &quot;ExternalId&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:240.0.0_
