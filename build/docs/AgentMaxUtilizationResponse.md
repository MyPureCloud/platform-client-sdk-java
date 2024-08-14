---
title: AgentMaxUtilizationResponse
---
## AgentMaxUtilizationResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **utilization** | <!----><!---->[**Map&lt;String, MediaUtilization&gt;**](MediaUtilization.html)<!----> | Map of media type to utilization settings. |  [optional] |
| **labelUtilizations** | <!----><!---->[**Map&lt;String, LabelUtilizationResponse&gt;**](LabelUtilizationResponse.html)<!----> | Map of label ids to utilization settings. |  [optional] |
| **level** | [**LevelEnum**](#LevelEnum)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="LevelEnum"></a>

## Enum: LevelEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AGENT | &quot;Agent&quot; | 
| ORGANIZATION | &quot;Organization&quot; | 
{: class="table table-striped"}



