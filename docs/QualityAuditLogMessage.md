# QualityAuditLogMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | Id of the audit message. |  [optional] |
| **userHomeOrgId** | **String** | Home Organization Id associated with this audit message. |  [optional] |
| **userTrusteeOrgId** | **String** | Trustee Organization Id if this audit message is from trustee access. |  [optional] |
| **user** | [**DomainEntityRef**](DomainEntityRef) | User associated with this audit message. |  [optional] |
| **client** | [**AddressableEntityRef**](AddressableEntityRef) | Client associated with this audit message. |  [optional] |
| **remoteIps** | **List&lt;String&gt;** | List of IP addresses of systems that originated or handled the request. |  [optional] |
| **serviceName** | [**ServiceNameEnum**](#Enum--ServiceNameEnum) | Name of the service that logged this audit message. |  [optional] |
| **level** | [**LevelEnum**](#Enum--LevelEnum) | The level of this audit message. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the action of this audit message. |  [optional] |
| **eventDate** | [**Date**](Date) | Date and time of when the audit message was logged. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **messageInfo** | [**MessageInfo**](MessageInfo) | Message describing the event being audited. |  [optional] |
| **action** | [**ActionEnum**](#Enum--ActionEnum) | Action that took place. |  [optional] |
| **entity** | [**DomainEntityRef**](DomainEntityRef) | Entity that was impacted. |  [optional] |
| **entityType** | [**EntityTypeEnum**](#Enum--EntityTypeEnum) | Type of the entity that was impacted. |  [optional] |
| **propertyChanges** | [**List&lt;PropertyChange&gt;**](PropertyChange) | List of properties that were changed and changes made to those properties. |  [optional] |
| **context** | **Map&lt;String, String&gt;** | Additional context for this message. |  [optional] |


## Enum: ServiceNameEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RECORDINGSERVICE | &quot;RecordingService&quot; | 
| RECORDINGPLAYBACKSERVICE | &quot;RecordingPlaybackService&quot; | 
| QUALITYSERVICE | &quot;QualityService&quot; | 


## Enum: LevelEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| USER | &quot;User&quot; | 
| SYSTEM | &quot;System&quot; | 
| GENESYS_INTERNAL | &quot;GENESYS_INTERNAL&quot; | 


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SUCCESS | &quot;Success&quot; | 
| FAILURE | &quot;Failure&quot; | 
| WARNING | &quot;Warning&quot; | 


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
| DOWNLOAD | &quot;Download&quot; | 
| RESTOREREQUEST | &quot;RestoreRequest&quot; | 
| RESTORECOMPLETE | &quot;RestoreComplete&quot; | 
| APPLYPROTECTION | &quot;ApplyProtection&quot; | 
| REVOKEPROTECTION | &quot;RevokeProtection&quot; | 
| UPDATERETENTION | &quot;UpdateRetention&quot; | 


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




_com.mypurecloud.sdk.v2:platform-client-v2:226.0.0_
