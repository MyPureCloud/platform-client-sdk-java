# ActivityPlanJobResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the job |  |
| **exceptions** | [**List&lt;ActivityPlanJobException&gt;**](ActivityPlanJobException) | The list of exceptions that occurred while running this activity plan job. These are exceptions that affect individual occurrences but didn't prevent the job from completing |  |
| **error** | [**ErrorBody**](ErrorBody) | Error details if status == 'Error'. These are errors that caused the job to fail to complete |  [optional] |
| **activityPlan** | [**ActivityPlanStructureWithOccurrenceSessionsUsersReference**](ActivityPlanStructureWithOccurrenceSessionsUsersReference) | The activity plan associated with this job |  |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of the job |  |
| **occurrence** | [**ActivityPlanOccurrenceReference**](ActivityPlanOccurrenceReference) | The occurrence associated with this job if type == 'DeleteOccurrence' |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| ERROR | &quot;Error&quot; | 


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RUNPLAN | &quot;RunPlan&quot; | 
| DELETEACTIVITYPLAN | &quot;DeleteActivityPlan&quot; | 
| DELETEOCCURRENCE | &quot;DeleteOccurrence&quot; | 
| DELETEOCCURRENCES | &quot;DeleteOccurrences&quot; | 
| DELETESESSIONS | &quot;DeleteSessions&quot; | 
| DELETESESSIONUSERS | &quot;DeleteSessionUsers&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:253.2.0_
