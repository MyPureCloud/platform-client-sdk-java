# MergeInfo


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of a merge operation being taken against a cluster |  [optional] |
| **error** | [**MergeError**](MergeError) | Error details about a failed merge. Only present if the status of the merge is ManualFailed or AutoFailed |  [optional] |
| **dateMerged** | [**Date**](Date) | The date the merge was attempted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AUTOQUEUED | &quot;AutoQueued&quot; | 
| AUTOSUCCEEDED | &quot;AutoSucceeded&quot; | 
| AUTOFAILED | &quot;AutoFailed&quot; | 
| MANUALQUEUED | &quot;ManualQueued&quot; | 
| MANUALSUCCEEDED | &quot;ManualSucceeded&quot; | 
| MANUALFAILED | &quot;ManualFailed&quot; | 
| NOTMERGED | &quot;NotMerged&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:261.0.0_
