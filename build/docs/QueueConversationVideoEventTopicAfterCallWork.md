---
title: QueueConversationVideoEventTopicAfterCallWork
---
## QueueConversationVideoEventTopicAfterCallWork


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#StateEnum)<!----> | The communication's after-call work state. |  [optional] |
| **startTime** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp when this communication started after-call work in the cloud clock. |  [optional] |
| **endTime** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp when this communication ended after-call work in the cloud clock. |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;unknown&quot; | 
| SKIPPED | &quot;skipped&quot; | 
| PENDING | &quot;pending&quot; | 
| COMPLETE | &quot;complete&quot; | 
| NOTAPPLICABLE | &quot;notApplicable&quot; | 
{: class="table table-striped"}



