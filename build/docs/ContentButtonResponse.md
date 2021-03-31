---
title: ContentButtonResponse
---
## ContentButtonResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | An ID assigned to the button response. Each object inside the content array has a unique ID. |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Button response type that captures Button and QuickReply type responses |  [optional] |
| **text** | <!----><!---->**String**<!----> | Text to show inside the Button reply. This is also used as the response text after clicking on the Button. |  |
| **payload** | <!----><!---->**String**<!----> | Content of the textback payload after clicking a button |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| BUTTON | &quot;Button&quot; |
| QUICKREPLY | &quot;QuickReply&quot; |
{: class="table table-striped"}



