# JourneySegment


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The ID of the segment. |  |
| **isActive** | **Boolean** | Whether or not the segment is active. |  |
| **displayName** | **String** | The display name of the segment. |  |
| **version** | **Integer** | The version of the segment. |  |
| **description** | **String** | A description of the segment. |  [optional] |
| **color** | **String** | The hexadecimal color value of the segment. |  |
| **scope** | [**ScopeEnum**](#Enum--ScopeEnum) | The target entity that a segment applies to. |  |
| **shouldDisplayToAgent** | **Boolean** | Whether or not the segment should be displayed to agent/supervisor users. |  |
| **context** | [**Context**](Context) | The context of the segment. |  |
| **journey** | [**Journey**](Journey) | The pattern of rules defining the segment. |  |
| **externalSegment** | [**ExternalSegment**](ExternalSegment) | Details of an entity corresponding to this segment in an external system. |  [optional] |
| **assignmentExpirationDays** | **Integer** | Time, in days, from when the segment is assigned until it is automatically unassigned. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
| **createdDate** | [**Date**](Date) | Timestamp indicating when the segment was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **modifiedDate** | [**Date**](Date) | Timestamp indicating when the segment was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |


## Enum: ScopeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SESSION | &quot;Session&quot; | 
| CUSTOMER | &quot;Customer&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
