# ActivityPlanJobException


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **exceptionType** | [**ExceptionTypeEnum**](#Enum--ExceptionTypeEnum) | The type of error |  |
| **occurrences** | [**List&lt;ActivityPlanOccurrenceReference&gt;**](ActivityPlanOccurrenceReference) | The occurrences in which this error occurred |  |


## Enum: ExceptionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNSCHEDULEDATTENDEES | &quot;UnscheduledAttendees&quot; | 
| SESSIONSNOTDELETED | &quot;SessionsNotDeleted&quot; | 
| INVALIDUSERIDS | &quot;InvalidUserIds&quot; | 
| INVALIDFACILITATORID | &quot;InvalidFacilitatorId&quot; | 
| RULEERROR | &quot;RuleError&quot; | 
| INVALIDOCCURRENCE | &quot;InvalidOccurrence&quot; | 
| NOSCHEDULEFOUND | &quot;NoScheduleFound&quot; | 
| SESSIONUSERSNOTREMOVED | &quot;SessionUsersNotRemoved&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:262.0.0_
