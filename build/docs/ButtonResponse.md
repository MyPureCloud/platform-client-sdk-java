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
| **messageType** | [**MessageTypeEnum**](#MessageTypeEnum)<!----> | Button response message type that captures QuickReply , Cards and Carousel .This is used  as label for Card selection |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BUTTON | &quot;Button&quot; | 
| QUICKREPLY | &quot;QuickReply&quot; | 
{: class="table table-striped"}


<a name="MessageTypeEnum"></a>

## Enum: MessageTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| QUICKREPLY | &quot;QuickReply&quot; | 
| CARD | &quot;Card&quot; | 
| CAROUSEL | &quot;Carousel&quot; | 
{: class="table table-striped"}



