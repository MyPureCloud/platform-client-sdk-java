---
title: AgentTimeOffRequestPatch
---
## AgentTimeOffRequestPatch


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **markedAsRead** | <!----><!---->**Boolean**<!----> | Whether this request has been read by the agent |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The status of this time off request. Can only be canceled if the requested date has not already passed |  [optional] |
| **notes** | <!----><!---->**String**<!----> | Notes about the time off request. Can only be edited while the request is still pending |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CANCELED | &quot;CANCELED&quot; | 
{: class="table table-striped"}



