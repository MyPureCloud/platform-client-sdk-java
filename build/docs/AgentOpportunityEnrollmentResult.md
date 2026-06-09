# AgentOpportunityEnrollmentResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The current status of the enrollment |  |
| **schedule** | [**BuScheduleReference**](BuScheduleReference) | The schedule on which the enrollment was added when this enrollment was approved |  [optional] |
| **systemMessageCode** | [**SystemMessageCodeEnum**](#Enum--SystemMessageCodeEnum) | The system-generated message code about enrollment processing results or failures |  [optional] |
| **reviewNote** | **String** | Supervisor's note explaining the agent's enrollment status change |  [optional] |
| **denialCode** | [**DenialCodeEnum**](#Enum--DenialCodeEnum) | The denial code |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | The metadata for the enrollment |  |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| APPROVED | &quot;Approved&quot; | 
| DENIED | &quot;Denied&quot; | 
| WITHDRAWN | &quot;Withdrawn&quot; | 
| PROCESSING | &quot;Processing&quot; | 


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


## Enum: DenialCodeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MANUALLYDENIED | &quot;ManuallyDenied&quot; | 
| AUTOMATICALLYCLOSED | &quot;AutomaticallyClosed&quot; | 
| MANUALLYCLOSED | &quot;ManuallyClosed&quot; | 
| CAPACITYFULL | &quot;CapacityFull&quot; | 
| SCHEDULECONFLICT | &quot;ScheduleConflict&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:255.0.0_
