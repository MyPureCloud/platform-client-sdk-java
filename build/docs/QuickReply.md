---
title: QuickReply
---
## QuickReply


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **text** | <!----><!---->**String**<!----> | Text to show inside the quick reply. This is also used as the response text after clicking on the quick reply. |  [optional] |
| **payload** | <!----><!---->**String**<!----> | Content of the textback payload after clicking a quick reply |  [optional] |
| **url** | <!----><!---->**String**<!----> | The location of the image file associated with quick reply |  [optional] |
| **action** | [**ActionEnum**](#ActionEnum)<!----> | Specifies the type of action that is triggered upon clicking the quick reply. Currently, the only supported action is \"Message\" which sends a message using the quick reply text. |  [optional] |
| **isSelected** | <!----><!---->**Boolean**<!----> | Indicates if the quick reply option is selected by end customer |  [optional] |
{: class="table table-striped"}


<a name="ActionEnum"></a>

## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MESSAGE | &quot;Message&quot; | 
{: class="table table-striped"}



