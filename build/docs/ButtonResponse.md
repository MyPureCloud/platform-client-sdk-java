---
title: ButtonResponse
---
## ButtonResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Button response type that captures Button and QuickReply type responses |  [optional] |
| **text** | <!----><!---->**String**<!----> | Text to show inside the Button reply. This is also used as the response text after clicking on the Button. |  [optional] |
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



