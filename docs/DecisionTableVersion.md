# DecisionTableVersion


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **division** | [**Division**](Division) | The division to which this entity belongs. |  [optional] |
| **version** | **Integer** | The decision table version. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Current status of this decision table version |  [optional] |
| **description** | **String** | The decision table description. |  [optional] |
| **rowCount** | **Integer** | The number of rows in this decision table version. |  [optional] |
| **rowsUri** | **String** | The rows URI for this decision table version. |  [optional] |
| **dateCreated** | [**Date**](Date) | UTC date time indicating when this decision table version was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | UTC date time indicating when this decision table version was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **datePublished** | [**Date**](Date) | UTC date time indicating when this decision table version was published. Null if never published. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **columns** | [**DecisionTableColumns**](DecisionTableColumns) | The column definitions of this decision table version. |  [optional] |
| **contract** | [**DecisionTableContract**](DecisionTableContract) | The contract information for this decision table version. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DRAFT | &quot;Draft&quot; | 
| PUBLISHED | &quot;Published&quot; | 
| ERROR | &quot;Error&quot; | 
| PREPARING | &quot;Preparing&quot; | 
| SUPERSEDED | &quot;Superseded&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.0.0_
