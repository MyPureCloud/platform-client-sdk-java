# SourceSyncResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#Enum--StateEnum) | Sync state. |  [optional] |
| **error** | [**ErrorBody**](ErrorBody) | Sync error. |  [optional] |
| **dateCreated** | [**Date**](Date) | Synchronization creation date-time for this source. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Synchronization last modification date-time for this source. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **knowledgeBase** | [**AddressableEntityRef**](AddressableEntityRef) | Knowledge base to which this synchronization belongs. |  [optional] |
| **source** | [**AddressableEntityRef**](AddressableEntityRef) | Source to which this synchronization belongs. |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SUCCESS | &quot;Success&quot; | 
| FAILED | &quot;Failed&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:232.0.0_
