---
title: AuditLogMessage
---
## AuditLogMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | Id of the audit message. |  [optional] |
| **user** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | User associated with this audit message. |  [optional] |
| **client** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | Client associated with this audit message. |  [optional] |
| **remoteIp** | <!----><!---->**List&lt;String&gt;**<!----> | List of IP addresses of systems that originated or handled the request. |  [optional] |
| **serviceName** | [**ServiceNameEnum**](#ServiceNameEnum)<!----> | Name of the service that logged this audit message. |  [optional] |
| **eventDate** | <!----><!---->[**Date**](Date.html)<!----> | Date and time of when the audit message was logged. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **message** | <!----><!---->[**MessageInfo**](MessageInfo.html)<!----> | Message describing the event being audited. |  [optional] |
| **action** | [**ActionEnum**](#ActionEnum)<!----> | Action that took place. |  [optional] |
| **entity** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | Entity that was impacted. |  [optional] |
| **entityType** | [**EntityTypeEnum**](#EntityTypeEnum)<!----> | Type of the entity that was impacted. |  [optional] |
| **propertyChanges** | <!----><!---->[**List&lt;PropertyChange&gt;**](PropertyChange.html)<!----> | List of properties that were changed and changes made to those properties. |  [optional] |
| **context** | <!----><!---->**Map&lt;String, String&gt;**<!----> | Additional context for this message. |  [optional] |
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
| QUALITY | &quot;Quality&quot; |
| LANGUAGEUNDERSTANDING | &quot;LanguageUnderstanding&quot; |
| TOPICSDEFINITIONS | &quot;TopicsDefinitions&quot; |
| PREDICTIVEENGAGEMENT | &quot;PredictiveEngagement&quot; |
| WORKFORCEMANAGEMENT | &quot;WorkforceManagement&quot; |
| TRIGGERS | &quot;Triggers&quot; |
| RESPONSEMANAGEMENT | &quot;ResponseManagement&quot; |
| GROUPS | &quot;Groups&quot; |
{: class="table table-striped"}


<a name="ActionEnum"></a>

## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CREATE | &quot;Create&quot; |
| VIEW | &quot;View&quot; |
| UPDATE | &quot;Update&quot; |
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
| VOICEMAILUSERPOLICY | &quot;VoicemailUserPolicy&quot; |
| WRAPUPCODE | &quot;WrapupCode&quot; |
| ACCESSTOKEN | &quot;AccessToken&quot; |
| OAUTHCLIENT | &quot;OAuthClient&quot; |
| OAUTHCLIENTAUTHORIZATION | &quot;OAuthClientAuthorization&quot; |
| AUTHORGANIZATION | &quot;AuthOrganization&quot; |
| AUTHUSER | &quot;AuthUser&quot; |
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
| TRIGGER | &quot;Trigger&quot; |
| RESPONSE | &quot;Response&quot; |
| DEPENDENCYTRACKINGBUILD | &quot;DependencyTrackingBuild&quot; |
| FLOW | &quot;Flow&quot; |
| PROMPT | &quot;Prompt&quot; |
| PROMPTRESOURCE | &quot;PromptResource&quot; |
| FLOWOUTCOME | &quot;FlowOutcome&quot; |
| FLOWMILESTONE | &quot;FlowMilestone&quot; |
| TEAM | &quot;Team&quot; |
{: class="table table-striped"}



