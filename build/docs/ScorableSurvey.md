# ScorableSurvey


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **surveyForm** | [**SurveyForm**](SurveyForm) | Survey form used for this survey. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **answers** | [**SurveyScoringSet**](SurveyScoringSet) |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| SENT | &quot;Sent&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| FINISHED | &quot;Finished&quot; | 
| OPTOUT | &quot;OptOut&quot; | 
| ERROR | &quot;Error&quot; | 
| EXPIRED | &quot;Expired&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:222.1.0_
