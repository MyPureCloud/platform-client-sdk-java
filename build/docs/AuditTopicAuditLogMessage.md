---
title: AuditTopicAuditLogMessage
---
## AuditTopicAuditLogMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **userId** | <!----><!---->**String**<!----> |  |  [optional] |
| **userHomeOrgId** | <!----><!---->**String**<!----> |  |  [optional] |
| **username** | <!----><!---->[**AuditTopicDomainEntityRef**](AuditTopicDomainEntityRef.html)<!----> |  |  [optional] |
| **userDisplay** | <!----><!---->**String**<!----> |  |  [optional] |
| **clientId** | <!----><!---->[**AuditTopicAddressableEntityRef**](AuditTopicAddressableEntityRef.html)<!----> |  |  [optional] |
| **remoteIp** | <!----><!---->**List&lt;String&gt;**<!----> |  |  [optional] |
| **serviceName** | [**ServiceNameEnum**](#ServiceNameEnum)<!----> |  |  [optional] |
| **eventTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **message** | <!----><!---->[**AuditTopicMessageInfo**](AuditTopicMessageInfo.html)<!----> |  |  [optional] |
| **action** | [**ActionEnum**](#ActionEnum)<!----> |  |  [optional] |
| **entityType** | [**EntityTypeEnum**](#EntityTypeEnum)<!----> |  |  [optional] |
| **entity** | <!----><!---->[**AuditTopicDomainEntityRef**](AuditTopicDomainEntityRef.html)<!----> |  |  [optional] |
| **propertyChanges** | <!----><!---->[**List&lt;AuditTopicPropertyChange&gt;**](AuditTopicPropertyChange.html)<!----> |  |  [optional] |
| **context** | <!----><!---->**Map&lt;String, String&gt;**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="ServiceNameEnum"></a>

## Enum: ServiceNameEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ARCHITECT | &quot;Architect&quot; |
| CONTACTCENTER | &quot;ContactCenter&quot; |
| CONTENTMANAGEMENT | &quot;ContentManagement&quot; |
| PEOPLEPERMISSIONS | &quot;PeoplePermissions&quot; |
| PRESENCE | &quot;Presence&quot; |
| QUALITY | &quot;Quality&quot; |
| LANGUAGEUNDERSTANDING | &quot;LanguageUnderstanding&quot; |
| TOPICSDEFINITIONS | &quot;TopicsDefinitions&quot; |
| PREDICTIVEENGAGEMENT | &quot;PredictiveEngagement&quot; |
| WORKFORCEMANAGEMENT | &quot;WorkforceManagement&quot; |
| TRIGGERS | &quot;Triggers&quot; |
| RESPONSEMANAGEMENT | &quot;ResponseManagement&quot; |
| GROUPS | &quot;Groups&quot; |
| TELEPHONY | &quot;Telephony&quot; |
| OUTBOUND | &quot;Outbound&quot; |
| SPEECHANDTEXTANALYTICS | &quot;SpeechAndTextAnalytics&quot; |
| ROUTING | &quot;Routing&quot; |
{: class="table table-striped"}


<a name="ActionEnum"></a>

## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CREATE | &quot;Create&quot; |
| VIEW | &quot;View&quot; |
| UPDATE | &quot;Update&quot; |
| MOVE | &quot;Move&quot; |
| DELETE | &quot;Delete&quot; |
| DOWNLOAD | &quot;Download&quot; |
| UPLOAD | &quot;Upload&quot; |
| MEMBERADD | &quot;MemberAdd&quot; |
| MEMBERUPDATE | &quot;MemberUpdate&quot; |
| MEMBERREMOVE | &quot;MemberRemove&quot; |
| READ | &quot;Read&quot; |
| APPLYPROTECTION | &quot;ApplyProtection&quot; |
| REVOKEPROTECTION | &quot;RevokeProtection&quot; |
| UPDATERETENTION | &quot;UpdateRetention&quot; |
| READALL | &quot;ReadAll&quot; |
| EXECUTE | &quot;Execute&quot; |
| PUBLISH | &quot;Publish&quot; |
| UNPUBLISH | &quot;Unpublish&quot; |
| ACTIVATE | &quot;Activate&quot; |
| CHECKIN | &quot;Checkin&quot; |
| CHECKOUT | &quot;Checkout&quot; |
| DEACTIVATE | &quot;Deactivate&quot; |
| DEBUG | &quot;Debug&quot; |
| SAVE | &quot;Save&quot; |
| REVERT | &quot;Revert&quot; |
| TRANSCODE | &quot;Transcode&quot; |
| ENABLE | &quot;Enable&quot; |
| DISABLE | &quot;Disable&quot; |
| AUTHORIZE | &quot;Authorize&quot; |
| DEAUTHORIZE | &quot;Deauthorize&quot; |
| AUTHENTICATE | &quot;Authenticate&quot; |
| CHANGEPASSWORD | &quot;ChangePassword&quot; |
| REVOKE | &quot;Revoke&quot; |
| EXPORT | &quot;Export&quot; |
| APPEND | &quot;Append&quot; |
| RECYCLE | &quot;Recycle&quot; |
{: class="table table-striped"}


<a name="EntityTypeEnum"></a>

## Enum: EntityTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| DOCUMENT | &quot;Document&quot; |
| QUEUE | &quot;Queue&quot; |
| RECORDING | &quot;Recording&quot; |
| ROLE | &quot;Role&quot; |
| VOICEMAILPOLICY | &quot;VoicemailPolicy&quot; |
| VOICEMAILUSERPOLICY | &quot;VoicemailUserPolicy&quot; |
| USERPRESENCE | &quot;UserPresence&quot; |
| WRAPUPCODE | &quot;WrapupCode&quot; |
| MAXORGROUTINGUTILIZATIONCAPACITY | &quot;MaxOrgRoutingUtilizationCapacity&quot; |
| ACCESSTOKEN | &quot;AccessToken&quot; |
| OAUTHCLIENT | &quot;OAuthClient&quot; |
| OAUTHCLIENTAUTHORIZATION | &quot;OAuthClientAuthorization&quot; |
| AUTHORGANIZATION | &quot;AuthOrganization&quot; |
| AUTHUSER | &quot;AuthUser&quot; |
| ORGANIZATIONAUTHORIZATIONTRUST | &quot;OrganizationAuthorizationTrust&quot; |
| ORGANIZATIONAUTHORIZATIONUSERTRUST | &quot;OrganizationAuthorizationUserTrust&quot; |
| BULKACTIONS | &quot;BulkActions&quot; |
| FEEDBACK | &quot;Feedback&quot; |
| TOPIC | &quot;Topic&quot; |
| PROGRAM | &quot;Program&quot; |
| SEGMENT | &quot;Segment&quot; |
| OUTCOME | &quot;Outcome&quot; |
| SESSIONTYPE | &quot;SessionType&quot; |
| EVENTTYPE | &quot;EventType&quot; |
| CLICKSTREAMSETTINGS | &quot;ClickstreamSettings&quot; |
| SCHEDULE | &quot;Schedule&quot; |
| SCHEDULEGROUP | &quot;ScheduleGroup&quot; |
| EMERGENCYGROUP | &quot;EmergencyGroup&quot; |
| IVR | &quot;IVR&quot; |
| TRIGGER | &quot;Trigger&quot; |
| RESPONSE | &quot;Response&quot; |
| DEPENDENCYTRACKINGBUILD | &quot;DependencyTrackingBuild&quot; |
| FLOW | &quot;Flow&quot; |
| PROMPT | &quot;Prompt&quot; |
| PROMPTRESOURCE | &quot;PromptResource&quot; |
| FLOWOUTCOME | &quot;FlowOutcome&quot; |
| FLOWMILESTONE | &quot;FlowMilestone&quot; |
| TEAM | &quot;Team&quot; |
| EDGE | &quot;Edge&quot; |
| EDGEGROUP | &quot;EdgeGroup&quot; |
| TRUNK | &quot;Trunk&quot; |
| TRUNKBASE | &quot;TrunkBase&quot; |
| DID | &quot;DID&quot; |
| DIDPOOL | &quot;DIDPool&quot; |
| EXTENSION | &quot;Extension&quot; |
| EXTENSIONPOOL | &quot;ExtensionPool&quot; |
| PHONE | &quot;Phone&quot; |
| PHONEBASE | &quot;PhoneBase&quot; |
| LINE | &quot;Line&quot; |
| LINEBASE | &quot;LineBase&quot; |
| OUTBOUNDROUTE | &quot;OutboundRoute&quot; |
| NUMBERPLAN | &quot;NumberPlan&quot; |
| SITE | &quot;Site&quot; |
| ATTEMPTLIMITS | &quot;AttemptLimits&quot; |
| CALLABLETIMESET | &quot;CallableTimeSet&quot; |
| CAMPAIGN | &quot;Campaign&quot; |
| CAMPAIGNRULE | &quot;CampaignRule&quot; |
| SEQUENCE | &quot;Sequence&quot; |
| CONTACTLIST | &quot;ContactList&quot; |
| CONTACTLISTFILTER | &quot;ContactListFilter&quot; |
| DNCLIST | &quot;DNCList&quot; |
| CALLANALYSISRESPONSESET | &quot;CallAnalysisResponseSet&quot; |
| RULESET | &quot;RuleSet&quot; |
| CAMPAIGNSCHEDULE | &quot;CampaignSchedule&quot; |
| SEQUENCESCHEDULE | &quot;SequenceSchedule&quot; |
| ORGANIZATIONSETTINGS | &quot;OrganizationSettings&quot; |
| WRAPUPCODEMAPPING | &quot;WrapUpCodeMapping&quot; |
| MESSAGINGCAMPAIGN | &quot;MessagingCampaign&quot; |
| TRANSCRIPTIONSETTINGS | &quot;TranscriptionSettings&quot; |
| ROUTINGTRANSCRIPTIONSETTINGS | &quot;RoutingTranscriptionSettings&quot; |
| SPEECHTEXTANALYTICSSETTINGS | &quot;SpeechTextAnalyticsSettings&quot; |
| PREDICTOR | &quot;Predictor&quot; |
| WORKPLAN | &quot;WorkPlan&quot; |
| WORKSPACE | &quot;Workspace&quot; |
{: class="table table-striped"}



