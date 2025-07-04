# MediaParticipantRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **wrapup** | [**WrapupInput**](WrapupInput) | Wrap-up to assign to this participant. |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | The state to update to set for this participant's communications.  Possible values are: 'connected' and 'disconnected'. |  [optional] |
| **recording** | **Boolean** | True to enable recording of this participant, otherwise false to disable recording. |  [optional] |
| **muted** | **Boolean** | True to mute this conversation participant. |  [optional] |
| **confined** | **Boolean** | True to confine this conversation participant.  Should only be used for ad-hoc conferences |  [optional] |
| **held** | **Boolean** | True to hold this conversation participant. |  [optional] |
| **wrapupSkipped** | **Boolean** | True to skip wrap-up for this participant. |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALERTING | &quot;alerting&quot; | 
| DIALING | &quot;dialing&quot; | 
| CONTACTING | &quot;contacting&quot; | 
| OFFERING | &quot;offering&quot; | 
| CONNECTED | &quot;connected&quot; | 
| DISCONNECTED | &quot;disconnected&quot; | 
| TERMINATED | &quot;terminated&quot; | 
| CONVERTING | &quot;converting&quot; | 
| UPLOADING | &quot;uploading&quot; | 
| TRANSMITTING | &quot;transmitting&quot; | 
| PARKED | &quot;parked&quot; | 
| NONE | &quot;none&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
