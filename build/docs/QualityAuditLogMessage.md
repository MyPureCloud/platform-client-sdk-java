---
title: QualityAuditLogMessage
---
## QualityAuditLogMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | Id of the audit message. |  [optional] |
| **userHomeOrgId** | <!----><!---->**String**<!----> | Home Organization Id associated with this audit message. |  [optional] |
| **userTrusteeOrgId** | <!----><!---->**String**<!----> | Trustee Organization Id if this audit message is from trustee access. |  [optional] |
| **user** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | User associated with this audit message. |  [optional] |
| **client** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | Client associated with this audit message. |  [optional] |
| **remoteIps** | <!----><!---->**List&lt;String&gt;**<!----> | List of IP addresses of systems that originated or handled the request. |  [optional] |
| **serviceName** | [**ServiceNameEnum**](#ServiceNameEnum)<!----> | Name of the service that logged this audit message. |  [optional] |
| **level** | [**LevelEnum**](#LevelEnum)<!----> | The level of this audit message. |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The status of the action of this audit message. |  [optional] |
| **eventDate** | <!----><!---->[**Date**](Date.html)<!----> | Date and time of when the audit message was logged. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **messageInfo** | <!----><!---->[**MessageInfo**](MessageInfo.html)<!----> | Message describing the event being audited. |  [optional] |
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
| RECORDINGSERVICE | &quot;RecordingService&quot; | 
| RECORDINGPLAYBACKSERVICE | &quot;RecordingPlaybackService&quot; | 
| QUALITYSERVICE | &quot;QualityService&quot; | 
{: class="table table-striped"}


<a name="LevelEnum"></a>

## Enum: LevelEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| USER | &quot;User&quot; | 
| SYSTEM | &quot;System&quot; | 
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SUCCESS | &quot;Success&quot; | 
| FAILURE | &quot;Failure&quot; | 
| WARNING | &quot;Warning&quot; | 
{: class="table table-striped"}


<a name="ActionEnum"></a>

## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| READ | &quot;Read&quot; | 
| CREATE | &quot;Create&quot; | 
| UPDATE | &quot;Update&quot; | 
| DELETE | &quot;Delete&quot; | 
| ABANDON | &quot;Abandon&quot; | 
| ARCHIVE | &quot;Archive&quot; | 
| EXPORT | &quot;Export&quot; | 
| RESTOREREQUEST | &quot;RestoreRequest&quot; | 
| RESTORECOMPLETE | &quot;RestoreComplete&quot; | 
| APPLYPROTECTION | &quot;ApplyProtection&quot; | 
| REVOKEPROTECTION | &quot;RevokeProtection&quot; | 
| UPDATERETENTION | &quot;UpdateRetention&quot; | 
{: class="table table-striped"}


<a name="EntityTypeEnum"></a>

## Enum: EntityTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RECORDING | &quot;Recording&quot; | 
| EVALUATION | &quot;Evaluation&quot; | 
| CALIBRATION | &quot;Calibration&quot; | 
| ANNOTATION | &quot;Annotation&quot; | 
| SCREENRECORDING | &quot;ScreenRecording&quot; | 
| SURVEY | &quot;Survey&quot; | 
{: class="table table-striped"}



