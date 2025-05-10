# IntentFeedback


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the detected intent. |  [optional] |
| **probability** | **Double** | The probability of the detected intent. |  [optional] |
| **entities** | [**List&lt;DetectedNamedEntity&gt;**](DetectedNamedEntity) | The collection of named entities detected. |  [optional] |
| **assessment** | [**AssessmentEnum**](#Enum--AssessmentEnum) | The assessment on the detection for feedback text. |  [optional] |


## Enum: AssessmentEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INCORRECT | &quot;Incorrect&quot; | 
| CORRECT | &quot;Correct&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| DISABLED | &quot;Disabled&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:225.0.0_
