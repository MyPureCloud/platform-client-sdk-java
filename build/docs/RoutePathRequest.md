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
| **sourcePlanningGroup** | <!----><!---->[**SourcePlanningGroupRequest**](SourcePlanningGroupRequest.html)<!----> | The planning group from which to copy route paths |  [optional] |
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



