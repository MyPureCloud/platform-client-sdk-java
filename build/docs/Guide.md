# Guide


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the guide. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the guide. |  [optional] |
| **source** | [**SourceEnum**](#Enum--SourceEnum) | Indicates how the guide content was generated. |  [optional] |
| **dateCreated** | [**Date**](Date) | The date and time the guide was created.. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The date and time the guide was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
| **latestSavedVersion** | [**GuideVersionRef**](GuideVersionRef) | The latest saved version of the guide. |  [optional] |
| **latestProductionReadyVersion** | [**GuideVersionRef**](GuideVersionRef) | The latest production ready version of the guide. |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PUBLISHED | &quot;Published&quot; | 
| DRAFT | &quot;Draft&quot; | 


## Enum: SourceEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MANUAL | &quot;Manual&quot; | 
| PROMPT | &quot;Prompt&quot; | 
| DOCUMENT | &quot;Document&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.1.0_
