# ContactsBulkOperationJob


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique job identifier. |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | The job state. |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The job type. |  [optional] |
| **totalRecords** | **Long** | Total records that will be impacted by the bulk operation. |  [optional] |
| **completedRecords** | **Long** | Amount of records that have been impacted by the bulk operation. |  [optional] |
| **percentComplete** | **Integer** | Percentage of records that have been impacted by the bulk operation. |  [optional] |
| **failureReason** | [**ErrorInfo**](ErrorInfo) | Information on failure reason. |  [optional] |
| **downloadURI** | **String** | URI to download the original backup contacts. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| FAILED | &quot;Failed&quot; | 


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BULKDELETE | &quot;BulkDelete&quot; | 
| BULKEDIT | &quot;BulkEdit&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:216.0.0_
