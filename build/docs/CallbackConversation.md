# CallbackConversation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **participants** | [**List&lt;CallbackMediaParticipant&gt;**](CallbackMediaParticipant) | The list of participants involved in the conversation. |  [optional] |
| **otherMediaUris** | **List&lt;String&gt;** | The list of other media channels involved in the conversation. |  [optional] |
| **recentTransfers** | [**List&lt;TransferResponse&gt;**](TransferResponse) | The list of the most recent 20 transfer commands applied to this conversation. |  [optional] |
| **utilizationLabelId** | **String** | An optional label that categorizes the conversation.  Max-utilization settings can be configured at a per-label level |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:209.0.1_
