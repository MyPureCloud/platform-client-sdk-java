---
title: BuManagementUnitScheduleSummary
---
## BuManagementUnitScheduleSummary


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **managementUnit** | <!----><!---->[**ManagementUnitReference**](ManagementUnitReference.html)<!----> | The management unit to which this summary applies |  [optional] |
| **agentCount** | <!----><!---->**Integer**<!----> | The number of agents from this management unit that are in the schedule |  [optional] |
| **startDate** | <!----><!---->[**Date**](Date.html)<!----> | The start of the schedule change in the management unit. Only populated in schedule update notifications. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **endDate** | <!----><!---->[**Date**](Date.html)<!----> | The end of the schedule change in the management unit. Only populated in schedule update notifications. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **agents** | <!----><!---->[**List&lt;UserReference&gt;**](UserReference.html)<!----> | The agents in the management unit who are part of this schedule, or in schedule change notifications, the agents that were changed. Note this will come back as an empty list unless the appropriate expand query parameter is passed |  [optional] |
{: class="table table-striped"}



