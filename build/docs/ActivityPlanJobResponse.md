# ActivityPlanJobResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **activityPlan** | [**ActivityPlanReference**](ActivityPlanReference) | The activity plan associated with this job |  |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the job |  |
| **exceptions** | [**List&lt;ActivityPlanJobException&gt;**](ActivityPlanJobException) | The list of exceptions that occurred while running this activity plan job. These are exceptions that affect individual occurrences but didn't prevent the job from completing |  |
| **error** | [**ErrorBody**](ErrorBody) | Error details if status == 'Error'. These are errors that caused the job to fail to complete |  [optional] |
| **occurrence** | [**ActivityPlanOccurrenceReference**](ActivityPlanOccurrenceReference) | The occurrence associated with this job if type == 'DeleteOccurrence' |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of the job |  |
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
| DELETEOCCURRENCE | &quot;DeleteOccurrence&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
