# V2WfmOpportunityTopicOpportunityNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **businessUnitId** | **String** |  |  [optional] |
| **organizationId** | **String** |  |  [optional] |
| **opportunityStartDate** | **String** |  |  [optional] |
| **opportunityEndDate** | **String** |  |  [optional] |
| **openDate** | **String** |  |  [optional] |
| **approvalType** | [**ApprovalTypeEnum**](#Enum--ApprovalTypeEnum) |  |  [optional] |
| **lengthMinutes** | **Long** |  |  [optional] |
| **deadlineDate** | **String** |  |  [optional] |
| **activityCodeId** | **String** |  |  [optional] |
| **name** | **String** |  |  [optional] |
| **description** | **String** |  |  [optional] |
| **createdDate** | **String** |  |  [optional] |
| **publishedDate** | **String** |  |  [optional] |
| **closedDate** | **String** |  |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **eventType** | [**EventTypeEnum**](#Enum--EventTypeEnum) |  |  [optional] |
| **pendingCount** | **Long** |  |  [optional] |
| **withdrawnCount** | **Long** |  |  [optional] |
| **approvedCount** | **Long** |  |  [optional] |
| **deniedCount** | **Long** |  |  [optional] |
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
| DRAFT | &quot;Draft&quot; | 
| PUBLISHED | &quot;Published&quot; | 
| OPEN | &quot;Open&quot; | 
| PENDING | &quot;Pending&quot; | 
| CLOSED | &quot;Closed&quot; | 


## Enum: EventTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| PUBLISHED | &quot;Published&quot; | 
| CREATED | &quot;Created&quot; | 
| UPDATED | &quot;Updated&quot; | 
| OPENED | &quot;Opened&quot; | 
| CLOSED | &quot;Closed&quot; | 
| DEADLINEDATEPASSED | &quot;DeadlineDatePassed&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:258.0.0_
