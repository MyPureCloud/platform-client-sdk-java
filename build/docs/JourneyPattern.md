---
title: JourneyPattern
---
## JourneyPattern


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **criteria** | <!----><!---->[**List&lt;Criteria&gt;**](Criteria.html)<!----> | A list of one or more criteria to satisfy. |  |
| **count** | <!----><!---->**Integer**<!----> | The number of times the pattern must match. |  [optional] |
| **streamType** | [**StreamTypeEnum**](#StreamTypeEnum)<!----> | The stream type for which this pattern can be matched on. |  |
| **sessionType** | <!----><!---->**String**<!----> | The session type for which this pattern can be matched on. |  |
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
{: class="table table-striped"}



