---
title: LocaleHealth
---
## LocaleHealth


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **overallScore** | <!----><!---->**Float**<!----> | Overall health score for the intent. |  [optional] |
| **issueCount** | <!----><!---->**Long**<!----> | Number of issues found in the intent. |  [optional] |
| **staticValidationResults** | <!---->[**List&lt;StaticValidationResultsEnum&gt;**](#StaticValidationResultsEnum)<!----> | Validation results for the intent. |  [optional] |
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



