# UpdateAdherenceAdjustmentAdminRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **reasonCodeId** | **String** | The ID of the reason code for this adherence adjustment |  [optional] |
| **startDate** | [**Date**](Date) | The start timestamp of the adherence adjustment in ISO-8601 format |  [optional] |
| **lengthMinutes** | **Integer** | The length of the adherence adjustment in minutes |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | Version metadata for the adherence adjustment |  |
| **reviewerNotes** | **String** | Notes provided by the reviewer for this adherence adjustment |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The new status for the adherence adjustment |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| APPROVED | &quot;Approved&quot; | 
| DENIED | &quot;Denied&quot; | 
| PENDING | &quot;Pending&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:264.0.0_
