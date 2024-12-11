# UpdateWorkPlanRotationRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | Name of this work plan rotation |  [optional] |
| **enabled** | **Boolean** | Whether the work plan rotation is enabled for scheduling |  [optional] |
| **dateRange** | [**DateRangeWithOptionalEnd**](DateRangeWithOptionalEnd) | The date range to which this work plan rotation applies |  [optional] |
| **agents** | [**List&lt;UpdateWorkPlanRotationAgentRequest&gt;**](UpdateWorkPlanRotationAgentRequest) | Agents in this work plan rotation |  [optional] |
| **pattern** | [**WorkPlanPatternRequest**](WorkPlanPatternRequest) | Pattern with list of work plan IDs that rotate on a weekly basis |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | Version metadata for this work plan rotation |  |




_com.mypurecloud.sdk.v2:platform-client-v2:216.0.0_
