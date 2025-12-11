# GuideSessionTurnResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **response** | [**GuideSessionTurnResponseData**](GuideSessionTurnResponseData) | The response content for this turn. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the turn. |  [optional] |
| **result** | [**ResultEnum**](#Enum--ResultEnum) | The result of the turn. |  [optional] |
| **outputVariables** | [**List&lt;GuideSessionVariable&gt;**](GuideSessionVariable) | The output variables for this turn. |  [optional] |
| **invocationId** | **String** | Invocation ID for this turn. |  [optional] |
| **invocations** | [**List&lt;GuideSessionTurnInvocationResponse&gt;**](GuideSessionTurnInvocationResponse) | The invocations for this turn. |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| IN_PROGRESS | &quot;IN_PROGRESS&quot; | 
| COMPLETED | &quot;COMPLETED&quot; | 
| ERROR | &quot;ERROR&quot; | 


## Enum: ResultEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SUCCESSFUL_COLLECTION | &quot;SUCCESSFUL_COLLECTION&quot; | 
| CONFIRMATION_REQUIRED | &quot;CONFIRMATION_REQUIRED&quot; | 
| ESCALATION_TRIGGERED | &quot;ESCALATION_TRIGGERED&quot; | 
| CLIENT_ACTION_REQUIRED | &quot;CLIENT_ACTION_REQUIRED&quot; | 
| NO_MATCH | &quot;NO_MATCH&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:240.0.0_
