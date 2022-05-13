---
title: RoutePathRequest
---
## RoutePathRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queueId** | <!----><!---->**String**<!----> | The ID of the queue to associate with the route path |  |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum)<!----> | The media type of the given queue to associate with the route path |  |
| **languageId** | <!----><!---->**String**<!----> | The ID of the language to associate with the route path |  [optional] |
| **skillIds** | <!----><!---->**List&lt;String&gt;**<!----> | The set of skill IDs to associate with the route path |  [optional] |
| **sourcePlanningGroup** | <!----><!---->[**SourcePlanningGroupRequest**](SourcePlanningGroupRequest.html)<!----> | The planning group from which to take route paths. This property is only needed if a route path already exists in another planning group.Note that taking a route path from another planning group will modify the other planning group |  [optional] |
{: class="table table-striped"}


<a name="MediaTypeEnum"></a>

## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| VOICE | &quot;Voice&quot; | 
| CHAT | &quot;Chat&quot; | 
| EMAIL | &quot;Email&quot; | 
| CALLBACK | &quot;Callback&quot; | 
| MESSAGE | &quot;Message&quot; | 
{: class="table table-striped"}



