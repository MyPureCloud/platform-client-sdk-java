# TwitterDataIngestionRuleResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | ID of the data ingestion rule. |  [optional] |
| **name** | **String** | The name of the data ingestion rule. |  [optional] |
| **description** | **String** | A description of the data ingestion rule. |  [optional] |
| **searchTerms** | **String** | Search terms for X (formally Twitter). |  [optional] |
| **countries** | **List&lt;String&gt;** | ISO 3166-1 alpha-2 country codes where Data Ingestion Rules should apply. Defaults to worldwide. |  [optional] |
| **dateCreated** | [**Date**](Date) | Timestamp indicating when the data ingestion rule was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Timestamp indicating when the data ingestion rule was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the data ingestion rule. |  [optional] |
| **version** | **Integer** | The version number of the data ingestion rule. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;Active&quot; | 
| DELETED | &quot;Deleted&quot; | 
| ERROR | &quot;Error&quot; | 
| PAUSED | &quot;Paused&quot; | 
| PENDING | &quot;Pending&quot; | 
| SYSTEMPAUSED | &quot;SystemPaused&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:217.1.0_
