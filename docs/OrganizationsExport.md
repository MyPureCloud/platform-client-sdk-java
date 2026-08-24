# OrganizationsExport


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **divisionIds** | **List&lt;String&gt;** | Division IDs of entities |  [optional] |
| **createdBy** | [**DomainEntityRef**](DomainEntityRef) | The user that created this request |  [optional] |
| **dateCreated** | [**Date**](Date) | When the request was submitted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateCompletion** | [**Date**](Date) | When the request reached a terminal state. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the request |  [optional] |
| **downloadUrl** | **String** | The location where the results of the request can be retrieved |  [optional] |
| **resultRowCount** | **Integer** | Number of rows returned by the export query |  [optional] |
| **queryConditions** | [**OrganizationsExportQueryConditions**](OrganizationsExportQueryConditions) | Query conditions to apply on export |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RUNNING | &quot;RUNNING&quot; | 
| SUCCEEDED | &quot;SUCCEEDED&quot; | 
| FAILED | &quot;FAILED&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:260.1.0_
