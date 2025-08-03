# WfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **requestId** | **String** |  |  [optional] |
| **dateImportStarted** | [**Date**](Date) |  |  [optional] |
| **dateImportEnded** | [**Date**](Date) |  |  [optional] |
| **dateCreated** | [**Date**](Date) |  |  [optional] |
| **dateModified** | [**Date**](Date) |  |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **error** | **String** |  |  [optional] |
| **active** | **Boolean** |  |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) |  |  [optional] |
| **fileName** | **String** |  |  [optional] |
| **fileSize** | **Long** |  |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INITIATED | &quot;Initiated&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| PENDING | &quot;Pending&quot; | 
| SUCCESS | &quot;Success&quot; | 
| FAILED | &quot;Failed&quot; | 
| CANCELLED | &quot;Cancelled&quot; | 
| PURGED | &quot;Purged&quot; | 
| PURGEPENDING | &quot;PurgePending&quot; | 


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CSV | &quot;Csv&quot; | 
| JSON | &quot;Json&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.0.0_
