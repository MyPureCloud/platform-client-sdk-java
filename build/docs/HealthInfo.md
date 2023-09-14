---
title: HealthInfo
---
## HealthInfo


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | Status of health computation for this intent. |  [optional] |
| **errorInfo** | <!----><!---->[**FlowHealthErrorInfo**](FlowHealthErrorInfo.html)<!----> | Error details for the intent, if any. |  [optional] |
| **overallScore** | <!----><!---->**Float**<!----> | Overall health score for the intent ranged between 0 and 100 as 100 is the perfect health score. |  [optional] |
| **issueCount** | <!----><!---->**Long**<!----> | Number of issues found in the intent. |  [optional] |
| **staticValidationResults** | <!---->[**List&lt;StaticValidationResultsEnum&gt;**](#StaticValidationResultsEnum)<!----> | Validation results for the intent. |  [optional] |
| **utterances** | <!----><!---->[**List&lt;FlowHealthIntentUtterance&gt;**](FlowHealthIntentUtterance.html)<!----> | Utterances for this intent. |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| ERROR | &quot;Error&quot; | 
{: class="table table-striped"}


<a name="StaticValidationResultsEnum"></a>

## Enum: StaticValidationResultsEnum

| Name | Value |
| ---- | ----- |
| TOOFEWUTTERANCES | &quot;TooFewUtterances&quot; |
| TOOMANYUTTERANCES | &quot;TooManyUtterances&quot; |
| UTTERANCETOOSHORT | &quot;UtteranceTooShort&quot; |
| UTTERANCETOOLONG | &quot;UtteranceTooLong&quot; |
{: class="table table-striped"}



