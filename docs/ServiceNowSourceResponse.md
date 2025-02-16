# ServiceNowSourceResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | Name of the source. |  [optional] |
| **dateCreated** | [**Date**](Date) | Source creation date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Source last modification date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The source type. |  [optional] |
| **integration** | [**KnowledgeIntegrationReference**](KnowledgeIntegrationReference) | The reference to the integration associated with the source. |  [optional] |
| **schedulePeriod** | **Integer** | The schedule period of the source in hours. |  [optional] |
| **lastSync** | [**SourceLastSync**](SourceLastSync) | Additional information about the last synchronization of the source. |  [optional] |
| **settings** | [**ServiceNowSettings**](ServiceNowSettings) | The settings of the source. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SALESFORCE | &quot;Salesforce&quot; | 
| SERVICENOW | &quot;ServiceNow&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:220.0.0_
