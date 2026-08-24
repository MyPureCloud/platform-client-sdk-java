# AgenticVirtualAgent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **dateCreated** | [**Date**](Date) | The date and time the virtual agent was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The date and time the virtual agent was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the virtual agent. |  [optional] |
| **latestSavedVersion** | [**AgenticVersionAddressableEntity**](AgenticVersionAddressableEntity) | The latest saved version of the virtual agent. |  [optional] |
| **latestProductionReadyVersion** | [**AgenticVersionAddressableEntity**](AgenticVersionAddressableEntity) | The latest production ready version of the virtual agent. |  [optional] |
| **imageUri** | **String** | The URI of the image for the virtual agent. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DRAFT | &quot;Draft&quot; | 
| PUBLISHED | &quot;Published&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:260.1.0_
