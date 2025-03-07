# CallConversation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **participants** | [**List&lt;CallMediaParticipant&gt;**](CallMediaParticipant) | The list of participants involved in the conversation. |  [optional] |
| **otherMediaUris** | **List&lt;String&gt;** | The list of other media channels involved in the conversation. |  [optional] |
| **recentTransfers** | [**List&lt;TransferResponse&gt;**](TransferResponse) | The list of the most recent 20 transfer commands applied to this conversation. |  [optional] |
| **utilizationLabelId** | **String** | An optional label that categorizes the conversation.  Max-utilization settings can be configured at a per-label level |  [optional] |
| **recordingState** | [**RecordingStateEnum**](#Enum--RecordingStateEnum) |  |  [optional] |
| **maxParticipants** | **Integer** | If this is a conference conversation, then this field indicates the maximum number of participants allowed to participant in the conference. |  [optional] |
| **securePause** | **Boolean** | True when the recording of this conversation is in secure pause status. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: RecordingStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NONE | &quot;none&quot; | 
| ACTIVE | &quot;active&quot; | 
| PAUSED | &quot;paused&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:221.0.0_
