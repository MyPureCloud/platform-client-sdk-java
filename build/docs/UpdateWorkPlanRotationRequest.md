---
title: UpdateWorkPlanRotationRequest
---
## UpdateWorkPlanRotationRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | <!----><!---->**String**<!----> | Name of this work plan rotation |  [optional] |
| **enabled** | <!----><!---->**Boolean**<!----> | Whether the work plan rotation is enabled for scheduling |  [optional] |
| **dateRange** | <!----><!---->[**DateRangeWithOptionalEnd**](DateRangeWithOptionalEnd.html)<!----> | The date range to which this work plan rotation applies |  [optional] |
| **agents** | <!----><!---->[**List&lt;UpdateWorkPlanRotationAgentRequest&gt;**](UpdateWorkPlanRotationAgentRequest.html)<!----> | Agents in this work plan rotation |  [optional] |
| **pattern** | <!----><!---->[**WorkPlanPatternRequest**](WorkPlanPatternRequest.html)<!----> | Pattern with list of work plan IDs that rotate on a weekly basis |  [optional] |
| **metadata** | <!----><!---->[**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.html)<!----> | Version metadata for this work plan rotation |  |
{: class="table table-striped"}



