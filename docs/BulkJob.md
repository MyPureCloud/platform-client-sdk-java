# BulkJob


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | The bulk job state. |  [optional] |
| **action** | [**ActionEnum**](#Enum--ActionEnum) | The bulk job action. This determines what the bulk job does, for example, terminate workitems. |  [optional] |
| **totalCount** | **Integer** | Total count of items to be processed in the bulk job. |  [optional] |
| **successfulCount** | **Integer** | Count of successfully processed items in the bulk job. |  [optional] |
| **failedCount** | **Integer** | Count of failed processed items in the bulk job. |  [optional] |
| **dateStarted** | [**Date**](Date) | The bulk job start date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateFinished** | [**Date**](Date) | The bulk job finished date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The bulk job modification date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| IDLE | &quot;Idle&quot; | 
| QUEUED | &quot;Queued&quot; | 
| RUNNING | &quot;Running&quot; | 
| SUCCEEDED | &quot;Succeeded&quot; | 
| FAILED | &quot;Failed&quot; | 
| CANCELLED | &quot;Cancelled&quot; | 
| TERMINATED | &quot;Terminated&quot; | 


## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TERMINATEWORKITEMS | &quot;TerminateWorkitems&quot; | 
| ADDWORKITEMS | &quot;AddWorkitems&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:224.0.0_
