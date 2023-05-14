---
title: QualityEvaluationScoreItem
---
## QualityEvaluationScoreItem


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **evaluationId** | <!----><!---->**String**<!----> | The id of evaluation |  [optional] |
| **conversationId** | <!----><!---->**String**<!----> | The id of conversation |  [optional] |
| **conversationDate** | <!----><!---->[**Date**](Date.html)<!----> | The date of conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **conversationEndDate** | <!----><!---->[**Date**](Date.html)<!----> | The end date of conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **formName** | <!----><!---->**String**<!----> | The name of form |  [optional] |
| **points** | <!----><!---->**Integer**<!----> | Gamification points earned for this metric |  [optional] |
| **evaluationScore** | <!----><!---->**Double**<!----> | The quality score of evaluation as a percentage |  [optional] |
| **maxPoints** | <!----><!---->**Integer**<!----> | The maximum Gamification points a user may earn for this metric |  [optional] |
| **mediaTypes** | <!---->[**List&lt;MediaTypesEnum&gt;**](#MediaTypesEnum)<!----> | A list of media types for the metric |  [optional] |
{: class="table table-striped"}


<a name="MediaTypesEnum"></a>

## Enum: MediaTypesEnum

| Name | Value |
| ---- | ----- |
| CALLBACK | &quot;callback&quot; |
| CHAT | &quot;chat&quot; |
| COBROWSE | &quot;cobrowse&quot; |
| EMAIL | &quot;email&quot; |
| MESSAGE | &quot;message&quot; |
| SCREENSHARE | &quot;screenshare&quot; |
| UNKNOWN | &quot;unknown&quot; |
| VIDEO | &quot;video&quot; |
| VOICE | &quot;voice&quot; |
{: class="table table-striped"}



