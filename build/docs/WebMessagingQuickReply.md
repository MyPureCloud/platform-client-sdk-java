---
title: WebMessagingQuickReply
---
## WebMessagingQuickReply


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **text** | <!----><!---->**String**<!----> | Text to show inside the quick reply. This is also used as the response text after clicking on the quick reply. |  |
| **payload** | <!----><!---->**String**<!----> | Content of the payload included in the quick reply response. Could be an ID identifying the quick reply response. |  |
| **image** | <!----><!---->**String**<!----> | URL of an image associated with the quick reply. |  [optional] |
| **action** | [**ActionEnum**](#ActionEnum)<!----> | Specifies the type of action that is triggered upon clicking the quick reply. |  [optional] |
{: class="table table-striped"}


<a name="ActionEnum"></a>

## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MESSAGE | &quot;Message&quot; | 
{: class="table table-striped"}



