---
title: ContentList
---
## ContentList


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | An ID assigned to this rich message content. Each instance inside the content array has a unique ID. |  [optional] |
| **listType** | [**ListTypeEnum**](#ListTypeEnum)<!----> | The type of list this instance represents |  [optional] |
| **title** | <!----><!---->**String**<!----> | Text to show in the title row |  [optional] |
| **description** | <!----><!---->**String**<!----> | Text to show in the description row. This is immediately below the title |  [optional] |
| **submitLabel** | <!----><!---->**String**<!----> | Label for Submit button |  [optional] |
| **actions** | <!----><!---->[**ContentActions**](ContentActions.html)<!----> | User actions available on the content. All actions are optional and all actions are executed simultaneously. |  [optional] |
| **components** | <!----><!---->[**List&lt;ListItemComponent&gt;**](ListItemComponent.html)<!----> | An array of component objects |  [optional] |
{: class="table table-striped"}


<a name="ListTypeEnum"></a>

## Enum: ListTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| SELECTION | &quot;Selection&quot; |
| VERTICAL | &quot;Vertical&quot; |
{: class="table table-striped"}



