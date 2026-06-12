# DecisionTableExportJob


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **tableVersion** | **Integer** | The version of the decision table that was exported. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Current status of the export job. |  [optional] |
| **createdBy** | [**AddressableEntityRef**](AddressableEntityRef) | The user who created the export job. |  [optional] |
| **dateCreated** | [**Date**](Date) | Date when this export job was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Date when this export job was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **fileName** | **String** | Name of the exported file. |  [optional] |
| **download** | [**AddressableEntityRef**](AddressableEntityRef) | Reference to the download resource for obtaining the exported file. |  [optional] |
| **dateDownloadExpires** | [**Date**](Date) | Date when the download link expires. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **exportType** | [**ExportTypeEnum**](#Enum--ExportTypeEnum) | The type of export that was performed. |  [optional] |
| **totalRows** | **Integer** | Total number of rows to export (set when row loading begins). |  [optional] |
| **rowsExported** | **Integer** | The number of rows exported. |  [optional] |
| **format** | [**FormatEnum**](#Enum--FormatEnum) | The format of the exported file. |  [optional] |
| **error** | [**DecisionTableExportJobError**](DecisionTableExportJobError) | Error details if the export job failed. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| FAILED | &quot;Failed&quot; | 


## Enum: ExportTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TEMPLATE | &quot;Template&quot; | 
| POPULATED | &quot;Populated&quot; | 


## Enum: FormatEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CSV | &quot;Csv&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:255.1.0_
