# AiScoring


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **failureType** | [**FailureTypeEnum**](#Enum--FailureTypeEnum) | The type of error that occurred while processing AI scores. It is null where there is no error. |  [optional] |
| **pending** | **Boolean** | Indicates whether AI scoring is currently processing the evaluation. |  [optional] |
| **dateLastChanged** | [**Date**](Date) | The date when the AI scores were last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |


## Enum: FailureTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| QUOTAREACHED | &quot;QuotaReached&quot; | 
| PARSINGERROR | &quot;ParsingError&quot; | 
| SERVICEERROR | &quot;ServiceError&quot; | 
| INVALIDREQUEST | &quot;InvalidRequest&quot; | 
| DUPLICATEFORMSAMEAGENT | &quot;DuplicateFormSameAgent&quot; | 
| UNAUTHORIZED | &quot;Unauthorized&quot; | 
| DUPLICATEAUTOMATEDFORMWITHCOPIEDSCORE | &quot;DuplicateAutomatedFormWithCopiedScore&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:235.0.0_
