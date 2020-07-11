---
title: ListItemComponent
---
## ListItemComponent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | An ID assigned to this component |  [optional] |
| **rmid** | <!----><!---->**String**<!----> | An ID of the rich message instance |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of component to render |  [optional] |
| **image** | <!----><!---->**String**<!----> | Path or URI to an image file |  [optional] |
| **title** | <!----><!---->**String**<!----> | The main headline of the list item |  [optional] |
| **description** | <!----><!---->**String**<!----> | Text to show in the description row |  [optional] |
| **actions** | <!----><!---->[**ContentActions**](ContentActions.html)<!----> | User actions available on the content. All actions are optional and all actions are executed simultaneously. |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| LISTITEM | &quot;ListItem&quot; |
| LISTITEMBIG | &quot;ListItemBig&quot; |
{: class="table table-striped"}



