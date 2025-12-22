# HistoricalImportStatus


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **requestId** | **String** | Request id of the historical import in the organization |  [optional] |
| **dateImportEnded** | [**Date**](Date) | The last day of the data you are importing. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateImportStarted** | [**Date**](Date) | The first day of the data you are importing. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Status of the historical import in the organization. |  [optional] |
| **error** | **String** | Error occured if the status of the import is failed |  [optional] |
| **dateCreated** | [**Date**](Date) | Date in which the historical import is initiated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Date in which the historical import is modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **active** | **Boolean** | Whether this historical import is active or not |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Whether this historical import is of type csv or json |  [optional] |
| **fileName** | **String** | Name of the file that you are importing. |  [optional] |
| **fileSize** | **Long** | Size of the file that you are importing. |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
