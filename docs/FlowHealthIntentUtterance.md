# FlowHealthIntentUtterance


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **text** | **String** | Utterance Text. |  [optional] |
| **issueCount** | **Long** | Number of issues found for this utterance. |  [optional] |
| **staticValidationResults** | [**List<StaticValidationResultsEnum>**](#Enum--StaticValidationResultsEnum) | Validation results for this utterance. |  [optional] |
| **outlierInfo** | [**OutlierInfo**](OutlierInfo) | Details about this utterance being an outlier or not. |  [optional] |
| **confusionInfo** | [**ConfusionInfo**](ConfusionInfo) | Confusion details with other utterances. |  [optional] |
{: class="table table-striped"}


## Enum: StaticValidationResultsEnum

| Name | Value |
| ---- | ----- |
| TOOFEWUTTERANCES | &quot;TooFewUtterances&quot; |
| TOOMANYUTTERANCES | &quot;TooManyUtterances&quot; |
| UTTERANCETOOSHORT | &quot;UtteranceTooShort&quot; |
| UTTERANCETOOLONG | &quot;UtteranceTooLong&quot; |
{: class="table table-striped"}



