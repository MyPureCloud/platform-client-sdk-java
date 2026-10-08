# UpdateAdherenceAdjustmentsBulkItem


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **reviewerNotes** | **String** | Notes provided by the reviewer for this adherence adjustment |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The new status for the adherence adjustment |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | Version metadata for the adherence adjustment |  |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| APPROVED | &quot;Approved&quot; | 
| DENIED | &quot;Denied&quot; | 
| PENDING | &quot;Pending&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:265.0.0_
