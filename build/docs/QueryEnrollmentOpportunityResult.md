# QueryEnrollmentOpportunityResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the opportunity |  |
| **activityCodeId** | **String** | The ID of the activity code associated with the opportunity |  |
| **startDate** | [**Date**](Date) | The start date and time of the opportunity in ISO-8601 format |  |
| **endDate** | [**Date**](Date) | The end date and time of the opportunity in ISO-8601 format |  |
| **deadlineDate** | [**Date**](Date) | The deadline date and time for enrollment in the opportunity in ISO-8601 format |  |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The current status of the opportunity |  |
| **capacity** | **Integer** | The maximum capacity (enrollment slots) for this opportunity |  |
| **enrollmentCounts** | [**PendingAndApprovedOpportunityEnrollmentCounts**](PendingAndApprovedOpportunityEnrollmentCounts) | The counts for enrollment statuses |  |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DRAFT | &quot;Draft&quot; | 
| PUBLISHED | &quot;Published&quot; | 
| OPEN | &quot;Open&quot; | 
| PENDING | &quot;Pending&quot; | 
| CLOSED | &quot;Closed&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:257.1.0_
