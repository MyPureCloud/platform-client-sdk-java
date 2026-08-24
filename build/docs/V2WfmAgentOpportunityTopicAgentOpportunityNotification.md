# V2WfmAgentOpportunityTopicAgentOpportunityNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **businessUnitId** | **String** |  |  [optional] |
| **organizationId** | **String** |  |  [optional] |
| **agentIds** | **List&lt;String&gt;** |  |  [optional] |
| **opportunityStartDate** | **String** |  |  [optional] |
| **opportunityEndDate** | **String** |  |  [optional] |
| **openDate** | **String** |  |  [optional] |
| **approvalType** | [**ApprovalTypeEnum**](#Enum--ApprovalTypeEnum) |  |  [optional] |
| **lengthMinutes** | **Long** |  |  [optional] |
| **deadlineDate** | **String** |  |  [optional] |
| **activityCodeId** | **String** |  |  [optional] |
| **name** | **String** |  |  [optional] |
| **description** | **String** |  |  [optional] |
| **closedDate** | **String** |  |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **eventType** | [**EventTypeEnum**](#Enum--EventTypeEnum) |  |  [optional] |
| **denialCode** | [**DenialCodeEnum**](#Enum--DenialCodeEnum) |  |  [optional] |
| **reviewNote** | **String** |  |  [optional] |
| **remainingSpaces** | **Long** |  |  [optional] |


## Enum: ApprovalTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| AUTOMATIC | &quot;Automatic&quot; | 
| MANUAL | &quot;Manual&quot; | 


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| OPEN | &quot;Open&quot; | 
| PENDING | &quot;Pending&quot; | 
| CLOSED | &quot;Closed&quot; | 


## Enum: EventTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| OPENED | &quot;Opened&quot; | 
| SIGNEDUP | &quot;SignedUp&quot; | 
| APPROVEDAUTOMATICALLY | &quot;ApprovedAutomatically&quot; | 
| APPROVEDMANUALLY | &quot;ApprovedManually&quot; | 
| WITHDRAWN | &quot;Withdrawn&quot; | 
| DENIED | &quot;Denied&quot; | 


## Enum: DenialCodeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| MANUALLYDENIED | &quot;ManuallyDenied&quot; | 
| AUTOMATICALLYCLOSED | &quot;AutomaticallyClosed&quot; | 
| MANUALLYCLOSED | &quot;ManuallyClosed&quot; | 
| CAPACITYFULL | &quot;CapacityFull&quot; | 
| SCHEDULECONFLICT | &quot;ScheduleConflict&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:260.1.0_
