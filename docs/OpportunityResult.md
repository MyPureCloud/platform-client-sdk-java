# OpportunityResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  |
| **startDate** | [**Date**](Date) | The start date and time of the opportunity in ISO-8601 format |  |
| **endDate** | [**Date**](Date) | The end date and time of the opportunity in ISO-8601 format |  |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The current status of the opportunity |  |
| **openDate** | [**Date**](Date) | The date and time when the opportunity opens for enrollment in ISO-8601 format. If not provided or in the past, it will be automatically updated to the current time when the opportunity is published |  [optional] |
| **deadlineDate** | [**Date**](Date) | The deadline date and time for enrollment in the opportunity in ISO-8601 format |  |
| **name** | **String** | The name of the opportunity |  |
| **description** | **String** | Additional details describing the purpose or context of this opportunity |  [optional] |
| **activityCodeId** | **String** | The ID of the activity code associated with the opportunity |  |
| **approvalType** | [**ApprovalTypeEnum**](#Enum--ApprovalTypeEnum) | The approval type for enrollments |  |
| **agentCount** | **Integer** | The total number of agents invited to this opportunity |  |
| **capacity** | **Integer** | The maximum capacity (enrollment slots) for this opportunity |  |
| **enrollmentProcessingCount** | **Integer** | The number of enrollments currently being processed |  |
| **enrollmentCounts** | [**OpportunityEnrollmentCounts**](OpportunityEnrollmentCounts) | The counts for enrollment statuses |  |
| **publishedDate** | [**Date**](Date) | The date and time when the opportunity was published in ISO-8601 format |  [optional] |
| **closedDate** | [**Date**](Date) | The date and time when the opportunity was closed in ISO-8601 format |  [optional] |
| **systemMessageCode** | [**SystemMessageCodeEnum**](#Enum--SystemMessageCodeEnum) | The system-generated message code about opportunity processing issues or validation failures |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | The metadata for the opportunity |  |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DRAFT | &quot;Draft&quot; | 
| PUBLISHED | &quot;Published&quot; | 
| OPEN | &quot;Open&quot; | 
| PENDING | &quot;Pending&quot; | 
| CLOSED | &quot;Closed&quot; | 


## Enum: ApprovalTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AUTOMATIC | &quot;Automatic&quot; | 
| MANUAL | &quot;Manual&quot; | 


## Enum: SystemMessageCodeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVITYCHANGED | &quot;ActivityChanged&quot; | 
| AGENTENROLLMENTSHOURLYLIMITEXCEEDED | &quot;AgentEnrollmentsHourlyLimitExceeded&quot; | 
| BATCHLIMITEXCEEDED | &quot;BatchLimitExceeded&quot; | 
| BUSINESSUNITENROLLMENTSHOURLYLIMITEXCEEDED | &quot;BusinessUnitEnrollmentsHourlyLimitExceeded&quot; | 
| BUSINESSUNITNOTFOUND | &quot;BusinessUnitNotFound&quot; | 
| BUSINESSUNITOPPORTUNITYHOURLYLIMITEXCEEDED | &quot;BusinessUnitOpportunityHourlyLimitExceeded&quot; | 
| CAPACITYFULL | &quot;CapacityFull&quot; | 
| CONFLICT | &quot;Conflict&quot; | 
| DATEMUSTBEINFUTURE | &quot;DateMustBeInFuture&quot; | 
| DEADLINEMUSTBEAFTEROPENTIME | &quot;DeadlineMustBeAfterOpenTime&quot; | 
| DEADLINEMUSTBEBEFOREOREQUALTOSTARTTIME | &quot;DeadlineMustBeBeforeOrEqualToStartTime&quot; | 
| ENDTIMEMUSTBEAFTERSTARTTIME | &quot;EndTimeMustBeAfterStartTime&quot; | 
| ENROLLMENTNOTFOUND | &quot;EnrollmentNotFound&quot; | 
| INTERNALERROR | &quot;InternalError&quot; | 
| INTERNALERRORAUTOAPPROVAL | &quot;InternalErrorAutoApproval&quot; | 
| INTERNALERRORDENIAL | &quot;InternalErrorDenial&quot; | 
| INTERNALERRORSCHEDULEUPDATE | &quot;InternalErrorScheduleUpdate&quot; | 
| INVALIDOPPORTUNITYLENGTH | &quot;InvalidOpportunityLength&quot; | 
| INVALIDOPPORTUNITYSTATUS | &quot;InvalidOpportunityStatus&quot; | 
| INVALIDREQUEST | &quot;InvalidRequest&quot; | 
| INVALIDSTATUSTRANSITION | &quot;InvalidStatusTransition&quot; | 
| INVALIDTIME | &quot;InvalidTime&quot; | 
| NOINVITATIONSFORPUBLISH | &quot;NoInvitationsForPublish&quot; | 
| OPENTIMEMUSTBEBEFORESTARTTIME | &quot;OpenTimeMustBeBeforeStartTime&quot; | 
| OPPORTUNITYCLOSED | &quot;OpportunityClosed&quot; | 
| OPPORTUNITYNOTFOUND | &quot;OpportunityNotFound&quot; | 
| OPPORTUNITYNOTOPEN | &quot;OpportunityNotOpen&quot; | 
| SCHEDULECONFLICT | &quot;ScheduleConflict&quot; | 
| SCHEDULENOTFOUND | &quot;ScheduleNotFound&quot; | 
| SERVICEUNAVAILABLE | &quot;ServiceUnavailable&quot; | 
| STARTTIMEMUSTBEWITHINONEYEAR | &quot;StartTimeMustBeWithinOneYear&quot; | 
| STATUSNOTDRAFT | &quot;StatusNotDraft&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:259.0.0_
