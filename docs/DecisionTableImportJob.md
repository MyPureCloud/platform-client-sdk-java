# DecisionTableImportJob


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **tableVersion** | **Integer** | The table version to be replaced by this import |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Current status of the import job |  |
| **uploadUrl** | **String** | Pre-signed URL to upload the import file (PUT) |  [optional] |
| **uploadHeaders** | **Map&lt;String, String&gt;** | Headers required when uploading file with data to be imported to uploadUrl |  [optional] |
| **importMode** | [**ImportModeEnum**](#Enum--ImportModeEnum) | Whether rows are appended to existing rows or rows are replaced |  |
| **fileName** | **String** | Original file name supplied when the job was created, including the file extension |  [optional] |
| **createdBy** | [**AddressableEntityRef**](AddressableEntityRef) | The user who created the job |  [optional] |
| **dateCreated** | [**Date**](Date) | When the job was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | When the job was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateCompleted** | [**Date**](Date) | When processing finished, successfully or not. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateExpires** | [**Date**](Date) | When upload credentials expire. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **rowMetrics** | [**DecisionTableImportRowMetrics**](DecisionTableImportRowMetrics) | Row-level metrics populated incrementally during import processing |  [optional] |
| **error** | [**DecisionTableImportJobError**](DecisionTableImportJobError) | Present when the import job could not be successfully finished |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UPLOADING | &quot;Uploading&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| FAILED | &quot;Failed&quot; | 
| CANCELLED | &quot;Cancelled&quot; | 


## Enum: ImportModeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| APPEND | &quot;Append&quot; | 
| REPLACE | &quot;Replace&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:255.1.0_
