# SocialTopicResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | ID of the social topic. |  [optional] |
| **name** | **String** | The name of the social topic. |  [optional] |
| **description** | **String** | A description of the social topic. |  [optional] |
| **dateCreated** | [**Date**](Date) | Timestamp indicating when the social topic was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Timestamp indicating when the social topic was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **divisionId** | **String** | The ID of the division to which the social topic belongs to. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the social topic. |  [optional] |
| **dataIngestionRules** | [**DataIngestionRules**](DataIngestionRules) | The data ingestion rules that apply to the social topic. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;Active&quot; | 
| PENDING | &quot;Pending&quot; | 
| DELETED | &quot;Deleted&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:216.0.0_
