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
| **managementUnitIds** | <!----><!---->**List&lt;String&gt;**<!----> | The management unit ids are used to filter the view |  [optional] |
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
| **answered** | <!----><!---->**Boolean**<!----> | Indicates filtering for answered interactions |  [optional] |
| **messageTypes** | <!---->[**List&lt;MessageTypesEnum&gt;**](#MessageTypesEnum)<!----> | The message media types used to filter the view |  [optional] |
| **divisionIds** | <!----><!---->**List&lt;String&gt;**<!----> | The divison Ids used to filter the view |  [optional] |
| **surveyFormIds** | <!----><!---->**List&lt;String&gt;**<!----> | The survey form ids used to filter the view |  [optional] |
| **surveyTotalScore** | <!----><!---->[**NumericRange**](NumericRange.html)<!----> | The survey total score used to filter the view |  [optional] |
| **surveyNpsScore** | <!----><!---->[**NumericRange**](NumericRange.html)<!----> | The survey NPS score used to filter the view |  [optional] |
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
| **hasMedia** | <!----><!---->**Boolean**<!----> | Indicates filtering for presence of MMS media |  [optional] |
| **roleIds** | <!----><!---->**List&lt;String&gt;**<!----> | The role Ids used to filter the view |  [optional] |
| **reportsTos** | <!----><!---->**List&lt;String&gt;**<!----> | The report to user IDs used to filter the view |  [optional] |
| **locationIds** | <!----><!---->**List&lt;String&gt;**<!----> | The location Ids used to filter the view |  [optional] |
| **flowOutTypes** | <!----><!---->**List&lt;String&gt;**<!----> | A list of flow out types |  [optional] |
| **providerList** | <!----><!---->**List&lt;String&gt;**<!----> | A list of providers |  [optional] |
| **callbackNumberList** | <!----><!---->**List&lt;String&gt;**<!----> | A list of callback numbers or substrings of numbers (ex: [\&quot;317\&quot;, \&quot;13172222222\&quot;]) |  [optional] |
| **callbackInterval** | <!----><!---->**String**<!----> | An interval of time to filter for scheduled callbacks. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  [optional] |
| **usedRoutingTypes** | <!---->[**List&lt;UsedRoutingTypesEnum&gt;**](#UsedRoutingTypesEnum)<!----> | A list of routing types used |  [optional] |
| **requestedRoutingTypes** | <!---->[**List&lt;RequestedRoutingTypesEnum&gt;**](#RequestedRoutingTypesEnum)<!----> | A list of routing types requested |  [optional] |
| **hasAgentAssistId** | <!----><!---->**Boolean**<!----> | Indicates filtering for agent assist id |  [optional] |
| **transcripts** | <!----><!---->[**List&lt;Transcripts&gt;**](Transcripts.html)<!----> | A list of transcript contents requested |  [optional] |
| **transcriptLanguages** | <!----><!---->**List&lt;String&gt;**<!----> | A list of transcript languages requested |  [optional] |
| **participantPurposes** | <!---->[**List&lt;ParticipantPurposesEnum&gt;**](#ParticipantPurposesEnum)<!----> | A list of participant purpose requested |  [optional] |
| **showFirstQueue** | <!----><!---->**Boolean**<!----> | Indicates filtering for first queue data |  [optional] |
| **teamIds** | <!----><!---->**List&lt;String&gt;**<!----> | The team ids used to filter the view data |  [optional] |
| **filterUsersByTeamIds** | <!----><!---->**List&lt;String&gt;**<!----> | The team ids are used to fetch associated users for the view |  [optional] |
| **journeyActionMapIds** | <!----><!---->**List&lt;String&gt;**<!----> | The journey action map ids are used to fetch action maps for the associated view |  [optional] |
| **journeyOutcomeIds** | <!----><!---->**List&lt;String&gt;**<!----> | The journey outcome ids are used to fetch outcomes for the associated view |  [optional] |
| **journeySegmentIds** | <!----><!---->**List&lt;String&gt;**<!----> | The journey segment ids are used to fetch segments for the associated view |  [optional] |
| **journeyActionMapTypes** | <!---->[**List&lt;JourneyActionMapTypesEnum&gt;**](#JourneyActionMapTypesEnum)<!----> | The journey action map types are used to filter action map data for the associated view |  [optional] |
| **developmentRoleList** | <!---->[**List&lt;DevelopmentRoleListEnum&gt;**](#DevelopmentRoleListEnum)<!----> | The list of development roles used to filter agent development view |  [optional] |
| **developmentTypeList** | <!---->[**List&lt;DevelopmentTypeListEnum&gt;**](#DevelopmentTypeListEnum)<!----> | The list of development types used to filter agent development view |  [optional] |
| **developmentStatusList** | <!---->[**List&lt;DevelopmentStatusListEnum&gt;**](#DevelopmentStatusListEnum)<!----> | The list of development status used to filter agent development view |  [optional] |
| **developmentModuleIds** | <!----><!---->**List&lt;String&gt;**<!----> | The list of development moduleIds used to filter agent development view |  [optional] |
| **developmentActivityOverdue** | <!----><!---->**Boolean**<!----> | Indicates filtering for development activities |  [optional] |
| **customerSentimentScore** | <!----><!---->[**NumericRange**](NumericRange.html)<!----> | The customer sentiment score used to filter the view |  [optional] |
| **customerSentimentTrend** | <!----><!---->[**NumericRange**](NumericRange.html)<!----> | The customer sentiment trend used to filter the view |  [optional] |
| **flowTransferTargets** | <!----><!---->**List&lt;String&gt;**<!----> | The list of transfer targets used to filter flow data |  [optional] |
| **developmentName** | <!----><!---->**String**<!----> | Filter for development name |  [optional] |
| **topicIds** | <!----><!---->**List&lt;String&gt;**<!----> | Represents the topics detected in the transcript |  [optional] |
| **externalTags** | <!----><!---->**List&lt;String&gt;**<!----> | The list of external Tags used to filter conversation data |  [optional] |
| **isNotResponding** | <!----><!---->**Boolean**<!----> | Indicates filtering for not responding users |  [optional] |
| **isAuthenticated** | <!----><!---->**Boolean**<!----> | Indicates filtering for the authenticated chat |  [optional] |
| **botIds** | <!----><!---->**List&lt;String&gt;**<!----> | The list of bot IDs used to filter bot views |  [optional] |
| **botVersions** | <!----><!---->**List&lt;String&gt;**<!----> | The list of bot versions used to filter bot views |  [optional] |
| **botMessageTypes** | <!---->[**List&lt;BotMessageTypesEnum&gt;**](#BotMessageTypesEnum)<!----> | The list of bot message types used to filter bot views |  [optional] |
| **botProviderList** | <!---->[**List&lt;BotProviderListEnum&gt;**](#BotProviderListEnum)<!----> | The list of bot providers used to filter bot views |  [optional] |
| **botProductList** | <!---->[**List&lt;BotProductListEnum&gt;**](#BotProductListEnum)<!----> | The list of bot products used to filter bot views |  [optional] |
| **botRecognitionFailureReasonList** | <!---->[**List&lt;BotRecognitionFailureReasonListEnum&gt;**](#BotRecognitionFailureReasonListEnum)<!----> | The list of bot recognition failure reasons used to filter bot views |  [optional] |
| **botIntentList** | <!----><!---->**List&lt;String&gt;**<!----> | The list of bot intents used to filter bot views |  [optional] |
| **botFinalIntentList** | <!----><!---->**List&lt;String&gt;**<!----> | The list of bot final intents used to filter bot views |  [optional] |
| **botSlotList** | <!----><!---->**List&lt;String&gt;**<!----> | The list of bot slots used to filter bot views |  [optional] |
| **botResultList** | <!---->[**List&lt;BotResultListEnum&gt;**](#BotResultListEnum)<!----> | The list of bot results used to filter bot views |  [optional] |
| **blockedReasons** | <!---->[**List&lt;BlockedReasonsEnum&gt;**](#BlockedReasonsEnum)<!----> | The list of blocked reason used to filter action map constraints views |  [optional] |
| **isRecorded** | <!----><!---->**Boolean**<!----> | Indicates filtering for recorded |  [optional] |
| **hasEvaluation** | <!----><!---->**Boolean**<!----> | Indicates filtering for evaluation |  [optional] |
| **hasScoredEvaluation** | <!----><!---->**Boolean**<!----> | Indicates filtering for scored evaluation |  [optional] |
| **emailDeliveryStatusList** | <!---->[**List&lt;EmailDeliveryStatusListEnum&gt;**](#EmailDeliveryStatusListEnum)<!----> | The list of email delivery statuses used to filter views |  [optional] |
| **isAgentOwnedCallback** | <!----><!---->**Boolean**<!----> | Indicates filtering for agent owned callback interactions |  [optional] |
| **agentCallbackOwnerIds** | <!----><!---->**List&lt;String&gt;**<!----> | The list of callback owners used to filter interactions |  [optional] |
| **transcriptTopics** | <!----><!---->[**List&lt;TranscriptTopics&gt;**](TranscriptTopics.html)<!----> | The list of transcript topics requested in filter |  [optional] |
| **journeyFrequencyCapReasons** | <!----><!---->**List&lt;String&gt;**<!----> | The list of frequency cap reasons to filter offer constraints |  [optional] |
| **journeyBlockingActionMapIds** | <!----><!---->**List&lt;String&gt;**<!----> | The list of blocking action maps to filter offer constraints |  [optional] |
| **journeyActionTargetIds** | <!----><!---->**List&lt;String&gt;**<!----> | The list of action targets to filter offer constraints |  [optional] |
| **journeyBlockingScheduleGroupIds** | <!----><!---->**List&lt;String&gt;**<!----> | The list of blocking schedule groups to filter offer constraints |  [optional] |
| **journeyBlockingEmergencyScheduleGroupIds** | <!----><!---->**List&lt;String&gt;**<!----> | The list of emergency schedule groups to filter offer constraints |  [optional] |
| **journeyUrlEqualConditions** | <!----><!---->**List&lt;String&gt;**<!----> | The list of url equal conditions to filter offer constraints |  [optional] |
| **journeyUrlNotEqualConditions** | <!----><!---->**List&lt;String&gt;**<!----> | The list of url not equal conditions to filter offer constraints |  [optional] |
| **journeyUrlStartsWithConditions** | <!----><!---->**List&lt;String&gt;**<!----> | The list of url starts with conditions to filter offer constraints |  [optional] |
| **journeyUrlEndsWithConditions** | <!----><!---->**List&lt;String&gt;**<!----> | The list of url ends with conditions to filter offer constraints |  [optional] |
| **journeyUrlContainsAnyConditions** | <!----><!---->**List&lt;String&gt;**<!----> | The list of url contains any conditions to filter offer constraints |  [optional] |
| **journeyUrlNotContainsAnyConditions** | <!----><!---->**List&lt;String&gt;**<!----> | The list of url not contains any conditions to filter offer constraints |  [optional] |
| **journeyUrlContainsAllConditions** | <!----><!---->**List&lt;String&gt;**<!----> | The list of url contains all conditions to filter offer constraints |  [optional] |
| **journeyUrlNotContainsAllConditions** | <!----><!---->**List&lt;String&gt;**<!----> | The list of url not contains all conditions to filter offer constraints |  [optional] |
| **flowMilestoneIds** | <!----><!---->**List&lt;String&gt;**<!----> | The list of flow milestones to filter exports |  [optional] |
| **isAssessmentPassed** | <!----><!---->**Boolean**<!----> | Filter to indicate if Agent passed assessment or not |  [optional] |
| **conversationInitiators** | <!----><!---->**List&lt;String&gt;**<!----> | The list to filter based on Brands (Bot/User/Agent) or End User who initiated the first message in the conversation |  [optional] |
| **hasCustomerParticipated** | <!----><!---->**Boolean**<!----> | Indicates if the customer has participated in an initiated conversation |  [optional] |
| **isAcdInteraction** | <!----><!---->**Boolean**<!----> | Filter to indicate if interaction was ACD or non-ACD |  [optional] |
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
| WEBMESSAGING | &quot;webmessaging&quot; |
| OPEN | &quot;open&quot; |
| INSTAGRAM | &quot;instagram&quot; |
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
| BOT | &quot;bot&quot; |
| COMMONMODULE | &quot;commonmodule&quot; |
| DIGITALBOT | &quot;digitalbot&quot; |
| INBOUNDCALL | &quot;inboundcall&quot; |
| INBOUNDCHAT | &quot;inboundchat&quot; |
| INBOUNDEMAIL | &quot;inboundemail&quot; |
| INBOUNDSHORTMESSAGE | &quot;inboundshortmessage&quot; |
| INQUEUECALL | &quot;inqueuecall&quot; |
| INQUEUESHORTMESSAGE | &quot;inqueueshortmessage&quot; |
| INQUEUEEMAIL | &quot;inqueueemail&quot; |
| OUTBOUNDCALL | &quot;outboundcall&quot; |
| SECURECALL | &quot;securecall&quot; |
| SURVEYINVITE | &quot;surveyinvite&quot; |
| VOICEMAIL | &quot;voicemail&quot; |
| WORKFLOW | &quot;workflow&quot; |
| WORKITEM | &quot;workitem&quot; |
{: class="table table-striped"}


<a name="FlowEntryTypesEnum"></a>

## Enum: FlowEntryTypesEnum

| Name | Value |
| ---- | ----- |
| AGENT | &quot;agent&quot; |
| DIRECT | &quot;direct&quot; |
| DNIS | &quot;dnis&quot; |
| FLOW | &quot;flow&quot; |
| OUTBOUND | &quot;outbound&quot; |
{: class="table table-striped"}


<a name="UsedRoutingTypesEnum"></a>

## Enum: UsedRoutingTypesEnum

| Name | Value |
| ---- | ----- |
| BULLSEYE | &quot;Bullseye&quot; |
| CONDITIONAL | &quot;Conditional&quot; |
| LAST | &quot;Last&quot; |
| MANUAL | &quot;Manual&quot; |
| PREDICTIVE | &quot;Predictive&quot; |
| PREFERRED | &quot;Preferred&quot; |
| STANDARD | &quot;Standard&quot; |
{: class="table table-striped"}


<a name="RequestedRoutingTypesEnum"></a>

## Enum: RequestedRoutingTypesEnum

| Name | Value |
| ---- | ----- |
| BULLSEYE | &quot;Bullseye&quot; |
| CONDITIONAL | &quot;Conditional&quot; |
| LAST | &quot;Last&quot; |
| MANUAL | &quot;Manual&quot; |
| PREDICTIVE | &quot;Predictive&quot; |
| PREFERRED | &quot;Preferred&quot; |
| STANDARD | &quot;Standard&quot; |
{: class="table table-striped"}


<a name="ParticipantPurposesEnum"></a>

## Enum: ParticipantPurposesEnum

| Name | Value |
| ---- | ----- |
| INTERNAL | &quot;internal&quot; |
| EXTERNAL | &quot;external&quot; |
{: class="table table-striped"}


<a name="JourneyActionMapTypesEnum"></a>

## Enum: JourneyActionMapTypesEnum

| Name | Value |
| ---- | ----- |
| WEBCHAT | &quot;webchat&quot; |
| WEBMESSAGINGOFFER | &quot;webMessagingOffer&quot; |
| CONTENTOFFER | &quot;contentOffer&quot; |
| INTEGRATIONACTION | &quot;integrationAction&quot; |
| ARCHITECTFLOW | &quot;architectFlow&quot; |
| OPENACTION | &quot;openAction&quot; |
{: class="table table-striped"}


<a name="DevelopmentRoleListEnum"></a>

## Enum: DevelopmentRoleListEnum

| Name | Value |
| ---- | ----- |
| CREATOR | &quot;Creator&quot; |
| FACILITATOR | &quot;Facilitator&quot; |
| ATTENDEE | &quot;Attendee&quot; |
{: class="table table-striped"}


<a name="DevelopmentTypeListEnum"></a>

## Enum: DevelopmentTypeListEnum

| Name | Value |
| ---- | ----- |
| INFORMATIONAL | &quot;Informational&quot; |
| COACHING | &quot;Coaching&quot; |
| ASSESSMENT | &quot;Assessment&quot; |
| ASSESSEDCONTENT | &quot;AssessedContent&quot; |
{: class="table table-striped"}


<a name="DevelopmentStatusListEnum"></a>

## Enum: DevelopmentStatusListEnum

| Name | Value |
| ---- | ----- |
| PLANNED | &quot;Planned&quot; |
| SCHEDULED | &quot;Scheduled&quot; |
| INVALIDSCHEDULE | &quot;InvalidSchedule&quot; |
| INPROGRESS | &quot;InProgress&quot; |
| COMPLETED | &quot;Completed&quot; |
{: class="table table-striped"}


<a name="BotMessageTypesEnum"></a>

## Enum: BotMessageTypesEnum

| Name | Value |
| ---- | ----- |
| UNKNOWN | &quot;Unknown&quot; |
| PHONE | &quot;Phone&quot; |
| SMS | &quot;SMS&quot; |
| GENESYSCHATWIDGET | &quot;GenesysChatWidget&quot; |
| FACEBOOKMESSENGER | &quot;FacebookMessenger&quot; |
| WECHAT | &quot;WeChat&quot; |
| WHATSAPP | &quot;Whatsapp&quot; |
| APPLEBUSINESSCHAT | &quot;AppleBusinessChat&quot; |
| TELEGRAM | &quot;Telegram&quot; |
| SLACK | &quot;Slack&quot; |
| SIGNAL | &quot;Signal&quot; |
| LINE | &quot;Line&quot; |
| DISCORD | &quot;Discord&quot; |
| TWITTERDIRECTMESSAGE | &quot;TwitterDirectMessage&quot; |
| OTHER | &quot;Other&quot; |
{: class="table table-striped"}


<a name="BotProviderListEnum"></a>

## Enum: BotProviderListEnum

| Name | Value |
| ---- | ----- |
| UNKNOWN | &quot;Unknown&quot; |
| GENESYS | &quot;Genesys&quot; |
| AMAZON | &quot;Amazon&quot; |
| GOOGLE | &quot;Google&quot; |
| NUANCE | &quot;Nuance&quot; |
{: class="table table-striped"}


<a name="BotProductListEnum"></a>

## Enum: BotProductListEnum

| Name | Value |
| ---- | ----- |
| UNKNOWN | &quot;Unknown&quot; |
| GENESYSDIALOGENGINE | &quot;GenesysDialogEngine&quot; |
| AMAZONLEX | &quot;AmazonLex&quot; |
| GOOGLEDIALOGFLOW | &quot;GoogleDialogFlow&quot; |
| GOOGLEDIALOGFLOWRESELL | &quot;GoogleDialogFlowResell&quot; |
| GENESYSBOTFLOW | &quot;GenesysBotFlow&quot; |
| NUANCEDLG | &quot;NuanceDlg&quot; |
| GOOGLEDIALOGFLOWCX | &quot;GoogleDialogFlowCx&quot; |
| GENESYSBYOB | &quot;GenesysByob&quot; |
{: class="table table-striped"}


<a name="BotRecognitionFailureReasonListEnum"></a>

## Enum: BotRecognitionFailureReasonListEnum

| Name | Value |
| ---- | ----- |
| UNKNOWN | &quot;Unknown&quot; |
| NOINPUTCOLLECTION | &quot;NoInputCollection&quot; |
| NOINPUTCONFIRMATION | &quot;NoInputConfirmation&quot; |
| NOMATCHCOLLECTION | &quot;NoMatchCollection&quot; |
| NOMATCHCONFIRMATION | &quot;NoMatchConfirmation&quot; |
| MAXWRONGMATCH | &quot;MaxWrongMatch&quot; |
{: class="table table-striped"}


<a name="BotResultListEnum"></a>

## Enum: BotResultListEnum

| Name | Value |
| ---- | ----- |
| UNKNOWN | &quot;Unknown&quot; |
| EXITREQUESTEDBYUSER | &quot;ExitRequestedByUser&quot; |
| EXITREQUESTEDBYBOT | &quot;ExitRequestedByBot&quot; |
| EXITERROR | &quot;ExitError&quot; |
| EXITRECOGNITIONFAILURE | &quot;ExitRecognitionFailure&quot; |
| DISCONNECTREQUESTEDBYUSER | &quot;DisconnectRequestedByUser&quot; |
| DISCONNECTREQUESTEDBYBOT | &quot;DisconnectRequestedByBot&quot; |
| DISCONNECTSESSIONEXPIRED | &quot;DisconnectSessionExpired&quot; |
| DISCONNECTERROR | &quot;DisconnectError&quot; |
| DISCONNECTRECOGNITIONFAILURE | &quot;DisconnectRecognitionFailure&quot; |
{: class="table table-striped"}


<a name="BlockedReasonsEnum"></a>

## Enum: BlockedReasonsEnum

| Name | Value |
| ---- | ----- |
| PAGEURLCONDITIONSNOTMATCHING | &quot;PageUrlConditionsNotMatching&quot; |
| ALREADYEXISTINGOFFER | &quot;AlreadyExistingOffer&quot; |
| TRIGGERDATEINFUTURE | &quot;TriggerDateInFuture&quot; |
| MULTIPLESIMULTANEOUSOFFERS | &quot;MultipleSimultaneousOffers&quot; |
| FREQUENCYCAPPING | &quot;FrequencyCapping&quot; |
| OFFEREDOUTSIDESCHEDULE | &quot;OfferedOutsideSchedule&quot; |
| SERVICELEVELTHROTTLING | &quot;ServiceLevelThrottling&quot; |
| NOAVAILABLEAGENTS | &quot;NoAvailableAgents&quot; |
{: class="table table-striped"}


<a name="EmailDeliveryStatusListEnum"></a>

## Enum: EmailDeliveryStatusListEnum

| Name | Value |
| ---- | ----- |
| DELIVERYFAILED | &quot;DeliveryFailed&quot; |
| DELIVERYSUCCESS | &quot;DeliverySuccess&quot; |
| FAILED | &quot;Failed&quot; |
| QUEUED | &quot;Queued&quot; |
| READ | &quot;Read&quot; |
| RECEIVED | &quot;Received&quot; |
| SENT | &quot;Sent&quot; |
{: class="table table-striped"}



