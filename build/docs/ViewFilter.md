---
title: ViewFilter
---
## ViewFilter


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **mediaTypes** | **List&lt;String&gt;** | The media types are used to filter the view |  [optional] |
| **queueIds** | **List&lt;String&gt;** | The queue ids are used to filter the view |  [optional] |
| **skillIds** | **List&lt;String&gt;** | The skill ids are used to filter the view |  [optional] |
| **skillGroups** | **List&lt;String&gt;** | The skill groups used to filter the view |  [optional] |
| **languageIds** | **List&lt;String&gt;** | The language ids are used to filter the view |  [optional] |
| **languageGroups** | **List&lt;String&gt;** | The language groups used to filter the view |  [optional] |
| **directions** | **List&lt;String&gt;** | The directions are used to filter the view |  [optional] |
| **wrapUpCodes** | **List&lt;String&gt;** | The wrap up codes are used to filter the view |  [optional] |
| **dnisList** | **List&lt;String&gt;** | The dnis list is used to filter the view |  [optional] |
| **filterQueuesByUserIds** | **List&lt;String&gt;** | The user ids are used to fetch associated queues for the view |  [optional] |
| **filterUsersByQueueIds** | **List&lt;String&gt;** | The queue ids are used to fetch associated users for the view |  [optional] |
| **userIds** | **List&lt;String&gt;** | The user ids are used to filter the view |  [optional] |
| **addressTos** | **List&lt;String&gt;** | The address To values are used to filter the view |  [optional] |
| **addressFroms** | **List&lt;String&gt;** | The address from values are used to filter the view |  [optional] |
| **outboundCampaignIds** | **List&lt;String&gt;** | The outbound campaign ids are used to filter the view |  [optional] |
| **outboundContactListIds** | **List&lt;String&gt;** | The outbound contact list ids are used to filter the view |  [optional] |
| **contactIds** | **List&lt;String&gt;** | The contact ids are used to filter the view |  [optional] |
| **aniList** | **List&lt;String&gt;** | The ani list ids are used to filter the view |  [optional] |
| **durationsMilliseconds** | [**List&lt;NumericRange&gt;**](NumericRange.html) | The durations in milliseconds used to filter the view |  [optional] |
| **evaluationScore** | [**NumericRange**](NumericRange.html) | The evaluationScore is used to filter the view |  [optional] |
| **evaluationCriticalScore** | [**NumericRange**](NumericRange.html) | The evaluationCriticalScore is used to filter the view |  [optional] |
| **evaluationFormIds** | **List&lt;String&gt;** | The evaluation form ids are used to filter the view |  [optional] |
| **evaluatedAgentIds** | **List&lt;String&gt;** | The evaluated agent ids are used to filter the view |  [optional] |
| **evaluatorIds** | **List&lt;String&gt;** | The evaluator ids are used to filter the view |  [optional] |
| **transferred** | **Boolean** | Indicates filtering for transfers |  [optional] |
| **abandoned** | **Boolean** | Indicates filtering for abandons |  [optional] |
| **messageTypes** | **List&lt;String&gt;** | The message media types used to filter the view |  [optional] |
| **divisionIds** | **List&lt;String&gt;** | The divison Ids used to filter the view |  [optional] |
| **surveyFormIds** | **List&lt;String&gt;** | The survey form ids used to filter the view |  [optional] |
| **surveyTotalScore** | [**NumericRange**](NumericRange.html) | The survey total score used to filter the view |  [optional] |
| **surveyNpsScore** | [**NumericRange**](NumericRange.html) | The survey NPS score used to filter the view |  [optional] |
| **showSecondaryStatus** | **Boolean** | Indicates if the Secondary Status should be shown |  [optional] |
| **agentDurationSortOrder** | [**AgentDurationSortOrderEnum**](#AgentDurationSortOrderEnum) | Provides the agent duration sort order |  [optional] |
| **waitingDurationSortOrder** | [**WaitingDurationSortOrderEnum**](#WaitingDurationSortOrderEnum) | Provides the waiting duration sort order |  [optional] |
| **interactingDurationSortOrder** | [**InteractingDurationSortOrderEnum**](#InteractingDurationSortOrderEnum) | Provides the interacting duration sort order |  [optional] |
| **agentName** | **String** | Displays the Agent name as provided by the user |  [optional] |
| **skillsList** | **List&lt;String&gt;** | The list of skill strings as free form text |  [optional] |
| **languageList** | **List&lt;String&gt;** | The list of language strings as free form text |  [optional] |
| **mos** | [**NumericRange**](NumericRange.html) | The desired range for mos values |  [optional] |
| **surveyQuestionGroupScore** | [**NumericRange**](NumericRange.html) | The survey question group score used to filter the view |  [optional] |
| **surveyPromoterScore** | [**NumericRange**](NumericRange.html) | The survey promoter score used to filter the view |  [optional] |
{: class="table table-striped"}


<a name="AgentDurationSortOrderEnum"></a>

## Enum: AgentDurationSortOrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ASCENDING | &quot;ascending&quot; |
| DESCENDING | &quot;descending&quot; |
{: class="table table-striped"}


<a name="WaitingDurationSortOrderEnum"></a>

## Enum: WaitingDurationSortOrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ASCENDING | &quot;ascending&quot; |
| DESCENDING | &quot;descending&quot; |
{: class="table table-striped"}


<a name="InteractingDurationSortOrderEnum"></a>

## Enum: InteractingDurationSortOrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ASCENDING | &quot;ascending&quot; |
| DESCENDING | &quot;descending&quot; |
{: class="table table-striped"}



