---
title: ContentCardAction
---
## ContentCardAction


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Describes the type of action. |  [optional] |
| **text** | <!----><!---->**String**<!----> | The response text from the button click. |  [optional] |
| **payload** | <!----><!---->**String**<!----> | Text to be returned as the payload from a ButtonResponse when a button is clicked. The payload and text are a combination which will have to be unique across each card and carousel in order to determine which button was clicked in that card or carousel. |  [optional] |
| **url** | <!----><!---->**String**<!----> | A URL of a web page to direct the user to. |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| LINK | &quot;Link&quot; | 
| POSTBACK | &quot;Postback&quot; | 
{: class="table table-striped"}



