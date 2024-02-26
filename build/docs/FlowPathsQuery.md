---
title: FlowPathsQuery
---
## FlowPathsQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **category** | [**CategoryEnum**](#CategoryEnum)<!----> | Category (use case) of the paths within a given domain. |  |
| **flows** | <!----><!---->[**List&lt;FlowPathsFlowFilter&gt;**](FlowPathsFlowFilter.html)<!----> | List of flows to query the paths result. |  |
{: class="table table-striped"}


<a name="CategoryEnum"></a>

## Enum: CategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALL | &quot;All&quot; | 
| ABANDONED | &quot;Abandoned&quot; | 
| AGENTESCALATION | &quot;AgentEscalation&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| DISCONNECT | &quot;Disconnect&quot; | 
| ERROR | &quot;Error&quot; | 
| RECOGNITIONFAILURE | &quot;RecognitionFailure&quot; | 
| TRANSFER | &quot;Transfer&quot; | 
{: class="table table-striped"}



