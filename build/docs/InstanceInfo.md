---
title: InstanceInfo
---
## InstanceInfo


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | Id of the ec2 instance. |  [optional] |
| **state** | [**StateEnum**](#StateEnum) | State of the instance in AWS |  [optional] |
| **edge** | [**Edge**](Edge.html) | Edge object that the instance is associated with. |  [optional] |
| **assignedPhoneCount** | **Integer** | Number of phones assigned to the edge. |  [optional] |
| **ami** | **String** | The image id of the instance. |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| REBOOTING | &quot;rebooting&quot; |
| PENDING | &quot;pending&quot; |
| RUNNING | &quot;running&quot; |
| TERMINATED | &quot;terminated&quot; |
| STOPPING | &quot;stopping&quot; |
| STOPPED | &quot;stopped&quot; |
{: class="table table-striped"}


