---
title: ContentList
---
## ContentList


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | A unique ID assigned to this rich message content. |  [optional] |
| **listType** | [**ListTypeEnum**](#ListTypeEnum)<!----> | The type of list this instance represents. |  [optional] |
| **title** | <!----><!---->**String**<!----> | Text to show in the title. |  [optional] |
| **description** | <!----><!---->**String**<!----> | Text to show in the description. |  [optional] |
| **submitLabel** | <!----><!---->**String**<!----> | Label for Submit button. |  [optional] |
| **actions** | <!----><!---->[**ContentActions**](ContentActions.html)<!----> | The list actions (Deprecated). |  [optional] |
| **components** | <!----><!---->[**List&lt;ListItemComponent&gt;**](ListItemComponent.html)<!----> | An array of component objects. |  [optional] |
{: class="table table-striped"}


<a name="ListTypeEnum"></a>

## Enum: ListTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SELECTION | &quot;Selection&quot; | 
| VERTICAL | &quot;Vertical&quot; | 
{: class="table table-striped"}



