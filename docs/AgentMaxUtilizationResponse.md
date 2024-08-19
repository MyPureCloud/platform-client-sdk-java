# AgentMaxUtilizationResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **utilization** | [**Map&lt;String, MediaUtilization&gt;**](MediaUtilization) | Map of media type to utilization settings. |  [optional] |
| **labelUtilizations** | [**Map&lt;String, LabelUtilizationResponse&gt;**](LabelUtilizationResponse) | Map of label ids to utilization settings. |  [optional] |
| **level** | [**LevelEnum**](#Enum--LevelEnum) |  |  [optional] |
{: class="table table-striped"}


## Enum: LevelEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AGENT | &quot;Agent&quot; | 
| ORGANIZATION | &quot;Organization&quot; | 
{: class="table table-striped"}



