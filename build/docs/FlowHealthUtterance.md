---
title: FlowHealthUtterance
---
## FlowHealthUtterance


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **text** | <!----><!---->**String**<!----> | Utterance Text. |  [optional] |
| **issueCount** | <!----><!---->**Long**<!----> | Number of issues found for this utterance. |  [optional] |
| **language** | [**LanguageEnum**](#LanguageEnum)<!----> | Language provided for this utterance's health. |  [optional] |
| **staticValidationResults** | <!---->[**List&lt;StaticValidationResultsEnum&gt;**](#StaticValidationResultsEnum)<!----> | Validation results for the utterance. |  [optional] |
| **outlierInfo** | <!----><!---->[**OutlierInfo**](OutlierInfo.html)<!----> | Details about this utterance being an outlier or not. |  [optional] |
| **confusionInfo** | <!----><!---->[**ConfusionDetails**](ConfusionDetails.html)<!----> | Confusion details with other utterances. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="LanguageEnum"></a>

## Enum: LanguageEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EN_US | &quot;en-us&quot; | 
| EN_GB | &quot;en-gb&quot; | 
| EN_AU | &quot;en-au&quot; | 
| EN_ZA | &quot;en-za&quot; | 
| EN_NZ | &quot;en-nz&quot; | 
| EN_IE | &quot;en-ie&quot; | 
| FR_CA | &quot;fr-ca&quot; | 
| FR_FR | &quot;fr-fr&quot; | 
| ES_US | &quot;es-us&quot; | 
| ES_ES | &quot;es-es&quot; | 
| ES_MX | &quot;es-mx&quot; | 
| DE_DE | &quot;de-de&quot; | 
| IT_IT | &quot;it-it&quot; | 
| PT_BR | &quot;pt-br&quot; | 
| PT_PT | &quot;pt-pt&quot; | 
| NL_NL | &quot;nl-nl&quot; | 
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



