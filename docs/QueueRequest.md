# QueueRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The queue name |  |
| **division** | [**WritableDivision**](WritableDivision) | The division to which this entity belongs. |  [optional] |
| **description** | **String** | The queue description. |  [optional] |
| **dateCreated** | [**Date**](Date) | The date the queue was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The date of the last modification to the queue. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedBy** | **String** | The ID of the user that last modified the queue. |  [optional] |
| **createdBy** | **String** | The ID of the user that created the queue. |  [optional] |
| **memberCount** | **Integer** | The total number of members in the queue. |  [optional] |
| **userMemberCount** | **Integer** | The number of user members (i.e., non-group members) in the queue. |  [optional] |
| **joinedMemberCount** | **Integer** | The number of joined members in the queue. |  [optional] |
| **mediaSettings** | [**QueueMediaSettings**](QueueMediaSettings) | The media settings for the queue. |  [optional] |
| **routingRules** | [**List&lt;RoutingRule&gt;**](RoutingRule) | The routing rules for the queue, used for Preferred Agent Routing. |  [optional] |
| **conditionalGroupRouting** | [**ConditionalGroupRouting**](ConditionalGroupRouting) | The Conditional Group Routing settings for the queue. |  [optional] |
| **bullseye** | [**Bullseye**](Bullseye) | The bullseye settings for the queue. |  [optional] |
| **scoringMethod** | [**ScoringMethodEnum**](#Enum--ScoringMethodEnum) | The Scoring Method for the queue |  [optional] |
| **acwSettings** | [**AcwSettings**](AcwSettings) | The ACW settings for the queue. |  [optional] |
| **skillEvaluationMethod** | [**SkillEvaluationMethodEnum**](#Enum--SkillEvaluationMethodEnum) | The skill evaluation method to use when routing conversations. |  [optional] |
| **memberGroups** | [**List&lt;MemberGroup&gt;**](MemberGroup) | The groups of agents associated with the queue, if any.  Queue membership will update to match group membership changes. |  [optional] |
| **queueFlow** | [**DomainEntityRef**](DomainEntityRef) | The in-queue flow to use for call conversations waiting in queue. |  [optional] |
| **emailInQueueFlow** | [**DomainEntityRef**](DomainEntityRef) | The in-queue flow to use for email conversations waiting in queue. |  [optional] |
| **messageInQueueFlow** | [**DomainEntityRef**](DomainEntityRef) | The in-queue flow to use for message conversations waiting in queue. |  [optional] |
| **whisperPrompt** | [**DomainEntityRef**](DomainEntityRef) | The prompt used for whisper on the queue, if configured. |  [optional] |
| **onHoldPrompt** | [**DomainEntityRef**](DomainEntityRef) | The audio to be played when calls on this queue are on hold. If not configured, the default on-hold music will play. |  [optional] |
| **autoAnswerOnly** | **Boolean** | Specifies whether the configured whisper should play for all ACD calls, or only for those which are auto-answered. |  [optional] |
| **cannedResponseLibraries** | [**CannedResponseLibraries**](CannedResponseLibraries) | Canned response library IDs and mode with which they are associated with the queue |  [optional] |
| **enableTranscription** | **Boolean** | Indicates whether voice transcription is enabled for this queue. |  [optional] |
| **enableAudioMonitoring** | **Boolean** | Indicates whether audio monitoring is enabled for this queue. |  [optional] |
| **enableManualAssignment** | **Boolean** | Indicates whether manual assignment is enabled for this queue. |  [optional] |
| **agentOwnedRouting** | [**AgentOwnedRouting**](AgentOwnedRouting) | The Agent Owned Routing settings for the queue |  [optional] |
| **directRouting** | [**DirectRouting**](DirectRouting) | The Direct Routing settings for the queue |  [optional] |
| **callingPartyName** | **String** | The name to use for caller identification for outbound calls from this queue. |  [optional] |
| **callingPartyNumber** | **String** | The phone number to use for caller identification for outbound calls from this queue. |  [optional] |
| **defaultScripts** | [**Map&lt;String, Script&gt;**](Script) | The default script Ids for the communication types. |  [optional] |
| **outboundMessagingAddresses** | [**QueueMessagingAddresses**](QueueMessagingAddresses) | The messaging addresses for the queue. |  [optional] |
| **outboundEmailAddress** | [**QueueEmailAddress**](QueueEmailAddress) | The default email address to use for outbound email from this queue. |  [optional] |
| **peerId** | **String** | The ID of an associated external queue. |  [optional] |
| **suppressInQueueCallRecording** | **Boolean** | Indicates whether recording in-queue calls is suppressed for this queue. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: ScoringMethodEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TIMESTAMPANDPRIORITY | &quot;TimestampAndPriority&quot; | 
| PRIORITYONLY | &quot;PriorityOnly&quot; | 


## Enum: SkillEvaluationMethodEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NONE | &quot;NONE&quot; | 
| BEST | &quot;BEST&quot; | 
| ALL | &quot;ALL&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:218.0.0_
