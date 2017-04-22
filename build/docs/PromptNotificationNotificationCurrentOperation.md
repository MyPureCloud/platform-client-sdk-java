---
title: PromptNotificationNotificationCurrentOperation
---
## PromptNotificationNotificationCurrentOperation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **complete** | **Boolean** |  |  [optional] |
| **user** | [**DependencyTrackingBuildNotificationNotificationUser**](DependencyTrackingBuildNotificationNotificationUser.html) |  |  [optional] |
| **actionName** | [**ActionNameEnum**](#ActionNameEnum) |  |  [optional] |
| **actionStatus** | [**ActionStatusEnum**](#ActionStatusEnum) |  |  [optional] |
| **errorMessage** | **String** |  |  [optional] |
| **errorCode** | **String** |  |  [optional] |
| **errorMessageParams** | [**PromptNotificationNotificationCurrentOperationErrorMessageParams**](PromptNotificationNotificationCurrentOperationErrorMessageParams.html) |  |  [optional] |
| **errorDetails** | [**List&lt;PromptNotificationNotificationCurrentOperationErrorDetails&gt;**](PromptNotificationNotificationCurrentOperationErrorDetails.html) |  |  [optional] |
{: class="table table-striped"}


<a name="ActionNameEnum"></a>

## Enum: ActionNameEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CHECKIN | &quot;CHECKIN&quot; |
| DEBUG | &quot;DEBUG&quot; |
| DELETE | &quot;DELETE&quot; |
| PUBLISH | &quot;PUBLISH&quot; |
| STATE_CHANGE | &quot;STATE_CHANGE&quot; |
| VALIDATE | &quot;VALIDATE&quot; |


<a name="ActionStatusEnum"></a>

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
{: class="table table-striped"}


