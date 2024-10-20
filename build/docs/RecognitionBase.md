# RecognitionBase


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **recipient** | [**UserReference**](UserReference) | The recipient of the recognition |  [optional] |
| **createdBy** | [**UserReference**](UserReference) | The creator of the recognition |  [optional] |
| **dateCreated** | [**Date**](Date) | The creation date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of recognition |  [optional] |
| **title** | **String** | The recognition title |  [optional] |
| **note** | **String** | The recognition note |  [optional] |
| **contextType** | [**ContextTypeEnum**](#Enum--ContextTypeEnum) | The context type (optional) |  [optional] |
| **contextId** | **String** | The context id (optional) |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| THANKYOU | &quot;ThankYou&quot; | 
| CONGRATULATIONS | &quot;Congratulations&quot; | 
| HIGHPERFORMANCE | &quot;HighPerformance&quot; | 
| COMPANYVALUES | &quot;CompanyValues&quot; | 


## Enum: ContextTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INTERACTION | &quot;Interaction&quot; | 
| INSIGHTS | &quot;Insights&quot; | 
| DEVELOPMENT | &quot;Development&quot; | 
| SCORECARD | &quot;Scorecard&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:212.0.0_
