---
title: ViewFilter
---
## ViewFilter


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **mediaTypes** | <!---->[**List&lt;MediaTypesEnum&gt;**](#MediaTypesEnum)<!----> | The media types are used to filter the view |  [optional] |
| **queueIds** | <!----><!---->**List&lt;String&gt;**<!----> | The queue ids are used to filter the view |  [optional] |
| **skillIds** | <!----><!---->**List&lt;String&gt;**<!----> | The skill ids are used to filter the view |  [optional] |
| **skillGroups** | <!----><!---->**List&lt;String&gt;**<!----> | The skill groups used to filter the view |  [optional] |
| **languageIds** | <!----><!---->**List&lt;String&gt;**<!----> | The language ids are used to filter the view |  [optional] |
| **languageGroups** | <!----><!---->**List&lt;String&gt;**<!----> | The language groups used to filter the view |  [optional] |
| **directions** | <!---->[**List&lt;DirectionsEnum&gt;**](#DirectionsEnum)<!----> | The directions are used to filter the view |  [optional] |
| **originatingDirections** | <!---->[**List&lt;OriginatingDirectionsEnum&gt;**](#OriginatingDirectionsEnum)<!----> | The list of orginating directions used to filter the view |  [optional] |
| **wrapUpCodes** | <!----><!---->**List&lt;String&gt;**<!----> | The wrap up codes are used to filter the view |  [optional] |
| **dnisList** | <!----><!---->**List&lt;String&gt;**<!----> | The dnis list is used to filter the view |  [optional] |
| **sessionDnisList** | <!----><!---->**List&lt;String&gt;**<!----> | The list of session dnis used to filter the view |  [optional] |
| **filterQueuesByUserIds** | <!----><!---->**List&lt;String&gt;**<!----> | The user ids are used to fetch associated queues for the view |  [optional] |
| **filterUsersByQueueIds** | <!----><!---->**List&lt;String&gt;**<!----> | The queue ids are used to fetch associated users for the view |  [optional] |
| **userIds** | <!----><!---->**List&lt;String&gt;**<!----> | The user ids are used to filter the view |  [optional] |
| **addressTos** | <!----><!---->**List&lt;String&gt;**<!----> | The address To values are used to filter the view |  [optional] |
| **addressFroms** | <!----><!---->**List&lt;String&gt;**<!----> | The address from values are used to filter the view |  [optional] |
| **outboundCampaignIds** | <!----><!---->**List&lt;String&gt;**<!----> | The outbound campaign ids are used to filter the view |  [optional] |
| **outboundContactListIds** | <!----><!---->**List&lt;String&gt;**<!----> | The outbound contact list ids are used to filter the view |  [optional] |
| **contactIds** | <!----><!---->**List&lt;String&gt;**<!----> | The contact ids are used to filter the view |  [optional] |
| **externalContactIds** | <!----><!---->**List&lt;String&gt;**<!----> | The external contact ids are used to filter the view |  [optional] |
| **externalOrgIds** | <!----><!---->**List&lt;String&gt;**<!----> | The external org ids are used to filter the view |  [optional] |
| **aniList** | <!----><!---->**List&lt;String&gt;**<!----> | The ani list ids are used to filter the view |  [optional] |
| **durationsMilliseconds** | <!----><!---->[**List&lt;NumericRange&gt;**](NumericRange.html)<!----> | The durations in milliseconds used to filter the view |  [optional] |
| **acdDurationsMilliseconds** | <!----><!---->[**List&lt;NumericRange&gt;**](NumericRange.html)<!----> | The acd durations in milliseconds used to filter the view |  [optional] |
| **talkDurationsMilliseconds** | <!----><!---->[**List&lt;NumericRange&gt;**](NumericRange.html)<!----> | The talk durations in milliseconds used to filter the view |  [optional] |
| **acwDurationsMilliseconds** | <!----><!---->[**List&lt;NumericRange&gt;**](NumericRange.html)<!----> | The acw durations in milliseconds used to filter the view |  [optional] |
| **handleDurationsMilliseconds** | <!----><!---->[**List&lt;NumericRange&gt;**](NumericRange.html)<!----> | The handle durations in milliseconds used to filter the view |  [optional] |
| **holdDurationsMilliseconds** | <!----><!---->[**List&lt;NumericRange&gt;**](NumericRange.html)<!----> | The hold durations in milliseconds used to filter the view |  [optional] |
| **abandonDurationsMilliseconds** | <!----><!---->[**List&lt;NumericRange&gt;**](NumericRange.html)<!----> | The abandon durations in milliseconds used to filter the view |  [optional] |
| **evaluationScore** | <!----><!---->[**NumericRange**](NumericRange.html)<!----> | The evaluationScore is used to filter the view |  [optional] |
| **evaluationCriticalScore** | <!----><!---->[**NumericRange**](NumericRange.html)<!----> | The evaluationCriticalScore is used to filter the view |  [optional] |
| **evaluationFormIds** | <!----><!---->**List&lt;String&gt;**<!----> | The evaluation form ids are used to filter the view |  [optional] |
| **evaluatedAgentIds** | <!----><!---->**List&lt;String&gt;**<!----> | The evaluated agent ids are used to filter the view |  [optional] |
| **evaluatorIds** | <!----><!---->**List&lt;String&gt;**<!----> | The evaluator ids are used to filter the view |  [optional] |
| **transferred** | <!----><!---->**Boolean**<!----> | Indicates filtering for transfers |  [optional] |
| **abandoned** | <!----><!---->**Boolean**<!----> | Indicates filtering for abandons |  [optional] |
| **messageTypes** | <!---->[**List&lt;MessageTypesEnum&gt;**](#MessageTypesEnum)<!----> | The message media types used to filter the view |  [optional] |
| **divisionIds** | <!----><!---->**List&lt;String&gt;**<!----> | The divison Ids used to filter the view |  [optional] |
| **surveyFormIds** | <!----><!---->**List&lt;String&gt;**<!----> | The survey form ids used to filter the view |  [optional] |
| **surveyTotalScore** | <!----><!---->[**NumericRange**](NumericRange.html)<!----> | The survey total score used to filter the view |  [optional] |
| **surveyNpsScore** | <!----><!---->[**NumericRange**](NumericRange.html)<!----> | The survey NPS score used to filter the view |  [optional] |
| **showSecondaryStatus** | <!----><!---->**Boolean**<!----> | Indicates if the Secondary Status should be shown |  [optional] |
| **agentDurationSortOrder** | [**AgentDurationSortOrderEnum**](#AgentDurationSortOrderEnum)<!----> | Provides the agent duration sort order |  [optional] |
| **waitingDurationSortOrder** | [**WaitingDurationSortOrderEnum**](#WaitingDurationSortOrderEnum)<!----> | Provides the waiting duration sort order |  [optional] |
| **interactingDurationSortOrder** | [**InteractingDurationSortOrderEnum**](#InteractingDurationSortOrderEnum)<!----> | Provides the interacting duration sort order |  [optional] |
| **agentName** | <!----><!---->**String**<!----> | Displays the Agent name as provided by the user |  [optional] |
| **skillsList** | <!----><!---->**List&lt;String&gt;**<!----> | The list of skill strings as free form text |  [optional] |
| **languageList** | <!----><!---->**List&lt;String&gt;**<!----> | The list of language strings as free form text |  [optional] |
| **mos** | <!----><!---->[**NumericRange**](NumericRange.html)<!----> | The desired range for mos values |  [optional] |
| **surveyQuestionGroupScore** | <!----><!---->[**NumericRange**](NumericRange.html)<!----> | The survey question group score used to filter the view |  [optional] |
| **surveyPromoterScore** | <!----><!---->[**NumericRange**](NumericRange.html)<!----> | The survey promoter score used to filter the view |  [optional] |
| **surveyFormContextIds** | <!----><!---->**List&lt;String&gt;**<!----> | The list of survey form context ids used to filter the view |  [optional] |
| **conversationIds** | <!----><!---->**List&lt;String&gt;**<!----> | The list of conversation ids used to filter the view |  [optional] |
| **sipCallIds** | <!----><!---->**List&lt;String&gt;**<!----> | The list of SIP call ids used to filter the view |  [optional] |
| **isEnded** | <!----><!---->**Boolean**<!----> | Indicates filtering for ended |  [optional] |
| **isSurveyed** | <!----><!---->**Boolean**<!----> | Indicates filtering for survey |  [optional] |
| **surveyScores** | <!----><!---->[**List&lt;NumericRange&gt;**](NumericRange.html)<!----> | The list of survey score ranges used to filter the view |  [optional] |
| **promoterScores** | <!----><!---->[**List&lt;NumericRange&gt;**](NumericRange.html)<!----> | The list of promoter score ranges used to filter the view |  [optional] |
| **isCampaign** | <!----><!---->**Boolean**<!----> | Indicates filtering for campaign |  [optional] |
| **surveyStatuses** | <!----><!---->**List&lt;String&gt;**<!----> | The list of survey statuses used to filter the view |  [optional] |
| **conversationProperties** | <!----><!---->[**ConversationProperties**](ConversationProperties.html)<!----> | A grouping of conversation level filters |  [optional] |
| **isBlindTransferred** | <!----><!---->**Boolean**<!----> | Indicates filtering for blind transferred |  [optional] |
| **isConsulted** | <!----><!---->**Boolean**<!----> | Indicates filtering for consulted |  [optional] |
| **isConsultTransferred** | <!----><!---->**Boolean**<!----> | Indicates filtering for consult transferred |  [optional] |
| **remoteParticipants** | <!----><!---->**List&lt;String&gt;**<!----> | The list of remote participants used to filter the view |  [optional] |
| **statusList** | <!----><!---->**List&lt;String&gt;**<!----> | A list of status for the configuration view |  [optional] |
| **flowIds** | <!----><!---->**List&lt;String&gt;**<!----> | The list of flow Ids |  [optional] |
| **flowOutcomeIds** | <!----><!---->**List&lt;String&gt;**<!----> | A list of outcome ids of the flow |  [optional] |
| **flowOutcomeValues** | <!---->[**List&lt;FlowOutcomeValuesEnum&gt;**](#FlowOutcomeValuesEnum)<!----> | A list of outcome values of the flow |  [optional] |
| **flowDestinationTypes** | <!---->[**List&lt;FlowDestinationTypesEnum&gt;**](#FlowDestinationTypesEnum)<!----> | The list of destination types of the flow |  [optional] |
| **flowDisconnectReasons** | <!---->[**List&lt;FlowDisconnectReasonsEnum&gt;**](#FlowDisconnectReasonsEnum)<!----> | The list of reasons for the flow to disconnect |  [optional] |
| **flowTypes** | <!---->[**List&lt;FlowTypesEnum&gt;**](#FlowTypesEnum)<!----> | A list of types of the flow |  [optional] |
| **flowEntryTypes** | <!---->[**List&lt;FlowEntryTypesEnum&gt;**](#FlowEntryTypesEnum)<!----> | A list of types of the flow entry |  [optional] |
| **flowEntryReasons** | <!----><!---->**List&lt;String&gt;**<!----> | A list of reasons of flow entry |  [optional] |
| **flowVersions** | <!----><!---->**List&lt;String&gt;**<!----> | A list of versions of a flow |  [optional] |
| **groupIds** | <!----><!---->**List&lt;String&gt;**<!----> | A list of directory group ids |  [optional] |
| **hasJourneyCustomerId** | <!----><!---->**Boolean**<!----> | Indicates filtering for journey customer id |  [optional] |
| **hasJourneyActionMapId** | <!----><!---->**Boolean**<!----> | Indicates filtering for Journey action map id |  [optional] |
| **hasJourneyVisitId** | <!----><!---->**Boolean**<!----> | Indicates filtering for Journey visit id |  [optional] |
| **oauthClientIds** | <!----><!---->**List&lt;String&gt;**<!----> | A list of OAuth client IDs |  [optional] |
| **apiOperations** | <!----><!---->**List&lt;String&gt;**<!----> | A list of API operations (ex: [\&quot;GET /api/v2/users/{userId}/queues\&quot;]) |  [optional] |
{: class="table table-striped"}


<a name="MediaTypesEnum"></a>

## Enum: MediaTypesEnum

| Name | Value |
| ---- | ----- |
| VOICE | &quot;voice&quot; |
| CHAT | &quot;chat&quot; |
| EMAIL | &quot;email&quot; |
| CALLBACK | &quot;callback&quot; |
| COBROWSE | &quot;cobrowse&quot; |
| VIDEO | &quot;video&quot; |
| SCREENSHARE | &quot;screenshare&quot; |
| MESSAGE | &quot;message&quot; |
{: class="table table-striped"}


<a name="DirectionsEnum"></a>

## Enum: DirectionsEnum

| Name | Value |
| ---- | ----- |
| INBOUND | &quot;inbound&quot; |
| OUTBOUND | &quot;outbound&quot; |
{: class="table table-striped"}


<a name="OriginatingDirectionsEnum"></a>

## Enum: OriginatingDirectionsEnum

| Name | Value |
| ---- | ----- |
| INBOUND | &quot;inbound&quot; |
| OUTBOUND | &quot;outbound&quot; |
{: class="table table-striped"}


<a name="MessageTypesEnum"></a>

## Enum: MessageTypesEnum

| Name | Value |
| ---- | ----- |
| SMS | &quot;sms&quot; |
| TWITTER | &quot;twitter&quot; |
| LINE | &quot;line&quot; |
| FACEBOOK | &quot;facebook&quot; |
| WHATSAPP | &quot;whatsapp&quot; |
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


<a name="FlowOutcomeValuesEnum"></a>

## Enum: FlowOutcomeValuesEnum

| Name | Value |
| ---- | ----- |
| SUCCESS | &quot;SUCCESS&quot; |
| FAILURE | &quot;FAILURE&quot; |
{: class="table table-striped"}


<a name="FlowDestinationTypesEnum"></a>

## Enum: FlowDestinationTypesEnum

| Name | Value |
| ---- | ----- |
| ACD | &quot;ACD&quot; |
| USER | &quot;USER&quot; |
| GROUP | &quot;GROUP&quot; |
| NUMBER | &quot;NUMBER&quot; |
| FLOW | &quot;FLOW&quot; |
| SECURE_FLOW | &quot;SECURE_FLOW&quot; |
| ACD_VOICEMAIL | &quot;ACD_VOICEMAIL&quot; |
| USER_VOICEMAIL | &quot;USER_VOICEMAIL&quot; |
| GROUP_VOICEMAIL | &quot;GROUP_VOICEMAIL&quot; |
| RETURN_TO_AGENT | &quot;RETURN_TO_AGENT&quot; |
{: class="table table-striped"}


<a name="FlowDisconnectReasonsEnum"></a>

## Enum: FlowDisconnectReasonsEnum

| Name | Value |
| ---- | ----- |
| FLOW_DISCONNECT | &quot;FLOW_DISCONNECT&quot; |
| FLOW_ERROR_DISCONNECT | &quot;FLOW_ERROR_DISCONNECT&quot; |
| DISCONNECT | &quot;DISCONNECT&quot; |
{: class="table table-striped"}


<a name="FlowTypesEnum"></a>

## Enum: FlowTypesEnum

| Name | Value |
| ---- | ----- |
| COMMONMODULE | &quot;commonmodule&quot; |
| INBOUNDCALL | &quot;inboundcall&quot; |
| INBOUNDCHAT | &quot;inboundchat&quot; |
| INBOUNDEMAIL | &quot;inboundemail&quot; |
| INBOUNDSHORTMESSAGE | &quot;inboundshortmessage&quot; |
| INQUEUECALL | &quot;inqueuecall&quot; |
| OUTBOUNDCALL | &quot;outboundcall&quot; |
| SECURECALL | &quot;securecall&quot; |
| SURVEYINVITE | &quot;surveyinvite&quot; |
| WORKFLOW | &quot;workflow&quot; |
{: class="table table-striped"}


<a name="FlowEntryTypesEnum"></a>

## Enum: FlowEntryTypesEnum

| Name | Value |
| ---- | ----- |
| DNIS | &quot;dnis&quot; |
| DIRECT | &quot;direct&quot; |
| FLOW | &quot;flow&quot; |
| AGENT | &quot;agent&quot; |
| OUTBOUND | &quot;outbound&quot; |
{: class="table table-striped"}



