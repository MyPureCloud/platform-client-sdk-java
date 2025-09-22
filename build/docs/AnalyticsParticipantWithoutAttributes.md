# AnalyticsParticipantWithoutAttributes


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **externalContactId** | **String** | External contact identifier |  [optional] |
| **externalOrganizationId** | **String** | External organization identifier |  [optional] |
| **flaggedReason** | [**FlaggedReasonEnum**](#Enum--FlaggedReasonEnum) | Reason for which participant flagged conversation |  [optional] |
| **participantId** | **String** | Unique identifier for the participant |  [optional] |
| **participantName** | **String** | A human readable name identifying the participant |  [optional] |
| **purpose** | [**PurposeEnum**](#Enum--PurposeEnum) | The participant's purpose |  [optional] |
| **screenRecording** | **Boolean** | Flag determining if a screen recording was started or not |  [optional] |
| **teamId** | **String** | The team ID the user is a member of |  [optional] |
| **userId** | **String** | Unique identifier for the user |  [optional] |
| **sessions** | [**List&lt;AnalyticsSession&gt;**](AnalyticsSession) | List of sessions associated to this participant |  [optional] |


## Enum: FlaggedReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GENERAL | &quot;general&quot; | 


## Enum: PurposeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACD | &quot;acd&quot; | 
| AGENT | &quot;agent&quot; | 
| API | &quot;api&quot; | 
| BOTFLOW | &quot;botflow&quot; | 
| CAMPAIGN | &quot;campaign&quot; | 
| CUSTOMER | &quot;customer&quot; | 
| DIALER | &quot;dialer&quot; | 
| EXTERNAL | &quot;external&quot; | 
| FAX | &quot;fax&quot; | 
| GROUP | &quot;group&quot; | 
| INBOUND | &quot;inbound&quot; | 
| IVR | &quot;ivr&quot; | 
| MANUAL | &quot;manual&quot; | 
| OUTBOUND | &quot;outbound&quot; | 
| STATION | &quot;station&quot; | 
| USER | &quot;user&quot; | 
| VOICEMAIL | &quot;voicemail&quot; | 
| VOICESURVEYFLOW | &quot;voicesurveyflow&quot; | 
| WORKFLOW | &quot;workflow&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:231.0.0_
