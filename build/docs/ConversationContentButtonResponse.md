---
title: ConversationContentButtonResponse
---
## ConversationContentButtonResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Describes the button that resulted in the Button Response. |  [optional] |
| **text** | <!----><!---->**String**<!----> | The response text from the button click. |  |
| **payload** | <!----><!---->**String**<!----> | The response payload associated with the clicked button. |  |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BUTTON | &quot;Button&quot; | 
| QUICKREPLY | &quot;QuickReply&quot; | 
{: class="table table-striped"}



