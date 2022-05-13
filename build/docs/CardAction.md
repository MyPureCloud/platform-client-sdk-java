---
title: CardAction
---
## CardAction


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Describes the type of action. |  [optional] |
| **text** | <!----><!---->**String**<!----> | The response text from the button click. |  [optional] |
| **payload** | <!----><!---->**String**<!----> | Content of the textback payload after clicking a button. |  [optional] |
| **url** | <!----><!---->**String**<!----> | The location of the image file associated with action. |  [optional] |
| **isSelected** | <!----><!---->**Boolean**<!----> | Indicates if the card option is selected by end customer. |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| LINK | &quot;Link&quot; | 
| POSTBACK | &quot;Postback&quot; | 
{: class="table table-striped"}



