---
title: AuditQueryEntity
---
## AuditQueryEntity


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | [**NameEnum**](#NameEnum)<!----> | Name of the Entity |  [optional] |
| **actions** | <!---->[**List&lt;ActionsEnum&gt;**](#ActionsEnum)<!----> | List of Actions |  [optional] |
{: class="table table-striped"}


<a name="NameEnum"></a>

## Enum: NameEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ACCESSTOKEN | &quot;AccessToken&quot; |
| ATTEMPTLIMITS | &quot;AttemptLimits&quot; |
| AUTHORGANIZATION | &quot;AuthOrganization&quot; |
| AUTHUSER | &quot;AuthUser&quot; |
| BULKACTIONS | &quot;BulkActions&quot; |
| CALLABLETIMESET | &quot;CallableTimeSet&quot; |
| CALLANALYSISRESPONSESET | &quot;CallAnalysisResponseSet&quot; |
| CAMPAIGN | &quot;Campaign&quot; |
| CAMPAIGNRULE | &quot;CampaignRule&quot; |
| CAMPAIGNSCHEDULE | &quot;CampaignSchedule&quot; |
| CHANGEREQUEST | &quot;ChangeRequest&quot; |
| CLICKSTREAMSETTINGS | &quot;ClickstreamSettings&quot; |
| CONTACTLIST | &quot;ContactList&quot; |
| CONTACTLISTFILTER | &quot;ContactListFilter&quot; |
| DEPENDENCYTRACKINGBUILD | &quot;DependencyTrackingBuild&quot; |
| DID | &quot;DID&quot; |
| DIDPOOL | &quot;DIDPool&quot; |
| DNCLIST | &quot;DNCList&quot; |
| DOCUMENT | &quot;Document&quot; |
| EDGE | &quot;Edge&quot; |
| EDGEGROUP | &quot;EdgeGroup&quot; |
| EMERGENCYGROUP | &quot;EmergencyGroup&quot; |
| EVENTTYPE | &quot;EventType&quot; |
| EXTENSION | &quot;Extension&quot; |
| EXTENSIONPOOL | &quot;ExtensionPool&quot; |
| FEEDBACK | &quot;Feedback&quot; |
| FLOW | &quot;Flow&quot; |
| FLOWMILESTONE | &quot;FlowMilestone&quot; |
| FLOWOUTCOME | &quot;FlowOutcome&quot; |
| INTEGRATION | &quot;Integration&quot; |
| IVR | &quot;IVR&quot; |
| LINE | &quot;Line&quot; |
| LINEBASE | &quot;LineBase&quot; |
| MAXORGROUTINGUTILIZATIONCAPACITY | &quot;MaxOrgRoutingUtilizationCapacity&quot; |
| MESSAGINGCAMPAIGN | &quot;MessagingCampaign&quot; |
| NUMBERPLAN | &quot;NumberPlan&quot; |
| OAUTHCLIENT | &quot;OAuthClient&quot; |
| OAUTHCLIENTAUTHORIZATION | &quot;OAuthClientAuthorization&quot; |
| ORGANIZATIONAUTHORIZATIONTRUST | &quot;OrganizationAuthorizationTrust&quot; |
| ORGANIZATIONAUTHORIZATIONUSERTRUST | &quot;OrganizationAuthorizationUserTrust&quot; |
| ORGANIZATIONSETTINGS | &quot;OrganizationSettings&quot; |
| OUTBOUNDROUTE | &quot;OutboundRoute&quot; |
| OUTCOME | &quot;Outcome&quot; |
| PHONE | &quot;Phone&quot; |
| PHONEBASE | &quot;PhoneBase&quot; |
| PREDICTOR | &quot;Predictor&quot; |
| PROGRAM | &quot;Program&quot; |
| PROMPT | &quot;Prompt&quot; |
| PROMPTRESOURCE | &quot;PromptResource&quot; |
| QUEUE | &quot;Queue&quot; |
| RECORDING | &quot;Recording&quot; |
| RESPONSE | &quot;Response&quot; |
| ROLE | &quot;Role&quot; |
| ROUTINGTRANSCRIPTIONSETTINGS | &quot;RoutingTranscriptionSettings&quot; |
| RULESET | &quot;RuleSet&quot; |
| SCHEDULE | &quot;Schedule&quot; |
| SCHEDULEGROUP | &quot;ScheduleGroup&quot; |
| SEGMENT | &quot;Segment&quot; |
| SENTIMENTFEEDBACK | &quot;SentimentFeedback&quot; |
| SEQUENCE | &quot;Sequence&quot; |
| SEQUENCESCHEDULE | &quot;SequenceSchedule&quot; |
| SESSIONTYPE | &quot;SessionType&quot; |
| SITE | &quot;Site&quot; |
| SPEECHTEXTANALYTICSSETTINGS | &quot;SpeechTextAnalyticsSettings&quot; |
| TEAM | &quot;Team&quot; |
| TOPIC | &quot;Topic&quot; |
| TRANSCRIPTIONSETTINGS | &quot;TranscriptionSettings&quot; |
| TRIGGER | &quot;Trigger&quot; |
| TRUNK | &quot;Trunk&quot; |
| TRUNKBASE | &quot;TrunkBase&quot; |
| USERPRESENCE | &quot;UserPresence&quot; |
| VOICEMAILPOLICY | &quot;VoicemailPolicy&quot; |
| VOICEMAILUSERPOLICY | &quot;VoicemailUserPolicy&quot; |
| WORKPLAN | &quot;WorkPlan&quot; |
| WRAPUPCODE | &quot;WrapupCode&quot; |
| WRAPUPCODEMAPPING | &quot;WrapUpCodeMapping&quot; |
{: class="table table-striped"}


<a name="ActionsEnum"></a>

## Enum: ActionsEnum

| Name | Value |
| ---- | ----- |
| CREATE | &quot;Create&quot; |
| VIEW | &quot;View&quot; |
| UPDATE | &quot;Update&quot; |
| DELETE | &quot;Delete&quot; |
| DELETEALL | &quot;DeleteAll&quot; |
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
| OPEN | &quot;Open&quot; |
| APPROVED | &quot;Approved&quot; |
| REJECTED | &quot;Rejected&quot; |
| ROLLBACK | &quot;Rollback&quot; |
| IMPLEMENTINGCHANGE | &quot;ImplementingChange&quot; |
| CHANGEIMPLEMENTED | &quot;ChangeImplemented&quot; |
| IMPLEMENTINGROLLBACK | &quot;ImplementingRollback&quot; |
| ROLLBACKIMPLEMENTED | &quot;RollbackImplemented&quot; |
{: class="table table-striped"}



