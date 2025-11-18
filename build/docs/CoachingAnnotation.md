# CoachingAnnotation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **createdBy** | [**UserReference**](UserReference) | The user who created the annotation. |  [optional] |
| **dateCreated** | [**Date**](Date) | The date/time the annotation was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedBy** | [**UserReference**](UserReference) | The last user to modify the annotation. |  [optional] |
| **dateModified** | [**Date**](Date) | The date/time the annotation was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **text** | **String** | The text of the annotation. |  |
| **isDeleted** | **Boolean** | Flag indicating whether the annotation is deleted. |  [optional] |
| **accessType** | [**AccessTypeEnum**](#Enum--AccessTypeEnum) | Determines the permissions required to view this item. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: AccessTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PUBLIC | &quot;Public&quot; | 
| PRIVATE | &quot;Private&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:237.0.0_
