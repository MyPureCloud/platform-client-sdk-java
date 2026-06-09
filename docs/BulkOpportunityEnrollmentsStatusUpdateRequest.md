# BulkOpportunityEnrollmentsStatusUpdateRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enrollmentIds** | **List&lt;String&gt;** | The IDs of the enrollments to update |  |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status to set for all enrollments specified in this request |  |
| **reviewNote** | **String** | Supervisor's note explaining the agent's enrollment status change |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| APPROVED | &quot;Approved&quot; | 
| DENIED | &quot;Denied&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:255.0.0_
