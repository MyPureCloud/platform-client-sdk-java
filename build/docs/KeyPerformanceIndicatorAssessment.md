# KeyPerformanceIndicatorAssessment


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **kpi** | **String** | Name of the key performance indicator assessed. |  [optional] |
| **assessmentResult** | [**AssessmentResultEnum**](#Enum--AssessmentResultEnum) | The overall result of the assessment for a key performance indicator. |  [optional] |
| **checks** | [**List&lt;Check&gt;**](Check) | Set of checks executed as part of an assessment. |  [optional] |


## Enum: AssessmentResultEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| NOTSUPPORTED | &quot;NotSupported&quot; | 
| HIGH | &quot;High&quot; | 
| LOW | &quot;Low&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:220.0.0_
