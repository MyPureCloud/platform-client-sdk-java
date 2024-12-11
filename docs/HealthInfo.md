# HealthInfo


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Status of health computation for this intent. |  [optional] |
| **errorInfo** | [**FlowHealthErrorInfo**](FlowHealthErrorInfo) | Error details for the intent, if any. |  [optional] |
| **overallScore** | **Float** | Overall health score for the intent ranged between 0 and 100 as 100 is the perfect health score. |  [optional] |
| **issueCount** | **Long** | Number of issues found in the intent. |  [optional] |
| **staticValidationResults** | [**List<StaticValidationResultsEnum>**](#Enum--StaticValidationResultsEnum) | Validation results for the intent. |  [optional] |
| **utterances** | [**List&lt;FlowHealthIntentUtterance&gt;**](FlowHealthIntentUtterance) | Utterances for this intent. |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| ERROR | &quot;Error&quot; | 


## Enum: StaticValidationResultsEnum

| Name | Value |
| ---- | ----- |
| TOOFEWUTTERANCES | &quot;TooFewUtterances&quot; |
| TOOMANYUTTERANCES | &quot;TooManyUtterances&quot; |
| UTTERANCETOOSHORT | &quot;UtteranceTooShort&quot; |
| UTTERANCETOOLONG | &quot;UtteranceTooLong&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:216.0.0_
