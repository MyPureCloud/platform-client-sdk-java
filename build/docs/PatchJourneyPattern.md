---
title: PatchJourneyPattern
---
## PatchJourneyPattern


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **criteria** | <!----><!---->[**List&lt;PatchCriteria&gt;**](PatchCriteria.html)<!----> | A list of one or more criteria to satisfy. |  [optional] |
| **count** | <!----><!---->**Integer**<!----> | The number of times the pattern must match. |  [optional] |
| **streamType** | [**StreamTypeEnum**](#StreamTypeEnum)<!----> | The stream type for which this pattern can be matched on. |  [optional] |
| **sessionType** | <!----><!---->**String**<!----> | The session type for which this pattern can be matched on. |  [optional] |
| **eventName** | <!----><!---->**String**<!----> | The name of the event for which this pattern can be matched on. |  [optional] |
{: class="table table-striped"}


<a name="StreamTypeEnum"></a>

## Enum: StreamTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| WEB | &quot;Web&quot; | 
| CUSTOM | &quot;Custom&quot; | 
| CONVERSATION | &quot;Conversation&quot; | 
| APP | &quot;App&quot; | 
{: class="table table-striped"}



