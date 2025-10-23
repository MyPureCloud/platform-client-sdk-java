# OperationResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **status** | **String** | Status of the operation. |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Type of the operation. |  [optional] |
| **createdBy** | [**UserReference**](UserReference) | The user who created the operation. |  [optional] |
| **dateCreated** | [**Date**](Date) | Operation creation date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Operation last modification date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **source** | [**KnowledgeOperationSource**](KnowledgeOperationSource) | Source of the operation. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| IMPORT | &quot;Import&quot; | 
| EXPORT | &quot;Export&quot; | 
| PARSE | &quot;Parse&quot; | 
| SYNC | &quot;Sync&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:235.0.0_
