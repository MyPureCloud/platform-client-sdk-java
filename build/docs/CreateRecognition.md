# CreateRecognition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **recipientId** | **String** | The recipient of the recognition |  |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of the recognition |  |
| **title** | **String** | The title of the recognition. Max length of 100 characters (optional) |  [optional] |
| **note** | **String** | The note of the recognition. Max length of 800 characters (optional) |  [optional] |
| **contextType** | [**ContextTypeEnum**](#Enum--ContextTypeEnum) | The context type (optional) |  [optional] |
| **contextId** | **String** | The context id (optional) |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:237.0.0_
