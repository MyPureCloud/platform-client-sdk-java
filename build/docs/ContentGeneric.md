---
title: ContentGeneric
---
## ContentGeneric


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | An ID assigned to this rich message content. Each instance inside the content array has a unique ID. |  [optional] |
| **title** | <!----><!---->**String**<!----> | Text to show in the title row |  [optional] |
| **description** | <!----><!---->**String**<!----> | Text to show in the description row. This is immediately below the title |  [optional] |
| **image** | <!----><!---->**String**<!----> | Path or URI to an image file |  [optional] |
| **video** | <!----><!---->**String**<!----> | Path or URI to a video file |  [optional] |
| **actions** | <!----><!---->[**ContentActions**](ContentActions.html)<!----> | User actions available on the content. All actions are optional and all actions are executed simultaneously. |  [optional] |
| **components** | <!----><!---->[**List&lt;ButtonComponent&gt;**](ButtonComponent.html)<!----> | An array of component objects |  [optional] |
{: class="table table-striped"}



