---
title: ArchitectFlowOutcomeNotificationArchitectOperation
---
## ArchitectFlowOutcomeNotificationArchitectOperation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **complete** | **Boolean** |  |  [optional] |
| **user** | [**ArchitectFlowOutcomeNotificationUser**](ArchitectFlowOutcomeNotificationUser.html) |  |  [optional] |
| **actionName** | [**ActionNameEnum**](#ActionNameEnum) |  |  [optional] |
| **actionStatus** | [**ActionStatusEnum**](#ActionStatusEnum) |  |  [optional] |
| **errorMessage** | **String** |  |  [optional] |
| **errorCode** | **String** |  |  [optional] |
| **errorMessageParams** | [**ArchitectFlowOutcomeNotificationErrorMessageParams**](ArchitectFlowOutcomeNotificationErrorMessageParams.html) |  |  [optional] |
| **errorDetails** | [**List&lt;ArchitectFlowOutcomeNotificationErrorDetail&gt;**](ArchitectFlowOutcomeNotificationErrorDetail.html) |  |  [optional] |
{: class="table table-striped"}


<a name="ActionNameEnum"></a>

## Enum: ActionNameEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CREATE | &quot;CREATE&quot; |
| CHECKIN | &quot;CHECKIN&quot; |
| DEBUG | &quot;DEBUG&quot; |
| DELETE | &quot;DELETE&quot; |
| HISTORY | &quot;HISTORY&quot; |
| PUBLISH | &quot;PUBLISH&quot; |
| STATE_CHANGE | &quot;STATE_CHANGE&quot; |
| UPDATE | &quot;UPDATE&quot; |
| VALIDATE | &quot;VALIDATE&quot; |
{: class="table table-striped"}


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



