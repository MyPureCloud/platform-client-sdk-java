---
title: UpdateWorkPlanRotationAgentRequest
---
## UpdateWorkPlanRotationAgentRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userId** | <!----><!---->**String**<!----> | The ID of an agent in this work plan rotation |  |
| **dateRange** | <!----><!---->[**DateRangeWithOptionalEnd**](DateRangeWithOptionalEnd.html)<!----> | The date range to which this agent is effective in the work plan rotation |  [optional] |
| **position** | <!----><!---->**Integer**<!----> | Start position of the work plan in the pattern for this agent in the work plan rotation. Position value starts from 0 |  [optional] |
| **delete** | <!----><!---->**Boolean**<!----> | If marked true for this agent when updating, then this agent will be removed from this work plan rotation |  [optional] |
{: class="table table-striped"}



