# Operation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **complete** | **Boolean** |  |  [optional] |
| **user** | [**User**](User) |  |  [optional] |
| **client** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **errorMessage** | **String** |  |  [optional] |
| **errorCode** | **String** |  |  [optional] |
| **errorDetails** | [**List&lt;Detail&gt;**](Detail) |  |  [optional] |
| **errorMessageParams** | **Map&lt;String, String&gt;** |  |  [optional] |
| **actionName** | [**ActionNameEnum**](#Enum--ActionNameEnum) | Action name |  [optional] |
| **actionStatus** | [**ActionStatusEnum**](#Enum--ActionStatusEnum) | Action status |  [optional] |


## Enum: ActionNameEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CREATE | &quot;CREATE&quot; | 
| CHECKIN | &quot;CHECKIN&quot; | 
| CHECKOUT | &quot;CHECKOUT&quot; | 
| DEBUG | &quot;DEBUG&quot; | 
| DELETE | &quot;DELETE&quot; | 
| HISTORY | &quot;HISTORY&quot; | 
| PUBLISH | &quot;PUBLISH&quot; | 
| REVERT | &quot;REVERT&quot; | 
| SAVE | &quot;SAVE&quot; | 
| STATE_CHANGE | &quot;STATE_CHANGE&quot; | 
| UPDATE | &quot;UPDATE&quot; | 
| VALIDATE | &quot;VALIDATE&quot; | 


## Enum: ActionStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| LOCKED | &quot;LOCKED&quot; | 
| UNLOCKED | &quot;UNLOCKED&quot; | 
| STARTED | &quot;STARTED&quot; | 
| PENDING_GENERATION | &quot;PENDING_GENERATION&quot; | 
| PENDING_BACKEND_NOTIFICATION | &quot;PENDING_BACKEND_NOTIFICATION&quot; | 
| SUCCESS | &quot;SUCCESS&quot; | 
| FAILURE | &quot;FAILURE&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
