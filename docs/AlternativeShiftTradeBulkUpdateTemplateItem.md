# AlternativeShiftTradeBulkUpdateTemplateItem


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **tradeId** | **String** | The ID of this alternative shift trade |  |
| **state** | [**StateEnum**](#Enum--StateEnum) | The current state of this alternative shift trade request |  |
| **failureReason** | [**FailureReasonEnum**](#Enum--FailureReasonEnum) | The reason the update failed, if applicable |  [optional] |
| **adminDateReviewed** | [**Date**](Date) | The timestamp of when the trade request was manually reviewed by an admin in ISO-8601 format |  [optional] |
| **adminReviewedBy** | [**UserReference**](UserReference) | The admin who manually reviewed this alternative shift trade after system denial |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | Version metadata for this alternative shift trade |  |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CANCELED | &quot;Canceled&quot; | 
| DENIED | &quot;Denied&quot; | 
| EXPIRED | &quot;Expired&quot; | 
| SUBMITTED | &quot;Submitted&quot; | 
| APPROVED | &quot;Approved&quot; | 


## Enum: FailureReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TRANSITIONNOTALLOWED | &quot;TransitionNotAllowed&quot; | 
| NOTAUTHORIZED | &quot;NotAuthorized&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:213.0.0_
