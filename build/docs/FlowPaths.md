---
title: FlowPaths
---
## FlowPaths


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **category** | [**CategoryEnum**](#CategoryEnum)<!----> | Category (use case) of the paths within a given domain. |  |
| **elements** | <!----><!---->[**Map&lt;String, FlowPathsElement&gt;**](FlowPathsElement.html)<!----> | Unique element identifiers and their corresponding elements in the trie data structure representing the paths. |  |
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



