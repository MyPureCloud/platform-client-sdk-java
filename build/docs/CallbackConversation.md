---
title: CallbackConversation
---
## CallbackConversation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **participants** | <!----><!---->[**List&lt;CallbackMediaParticipant&gt;**](CallbackMediaParticipant.html)<!----> | The list of participants involved in the conversation. |  [optional] |
| **otherMediaUris** | <!----><!---->**List&lt;String&gt;**<!----> | The list of other media channels involved in the conversation. |  [optional] |
| **recentTransfers** | <!----><!---->[**List&lt;TransferResponse&gt;**](TransferResponse.html)<!----> | The list of the most recent 20 transfer commands applied to this conversation. |  [optional] |
| **utilizationLabelId** | <!----><!---->**String**<!----> | An optional label that categorizes the conversation.  Max-utilization settings can be configured at a per-label level |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



