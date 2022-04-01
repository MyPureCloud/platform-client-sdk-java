---
title: BuUpdateAgentScheduleUploadSchema
---
## BuUpdateAgentScheduleUploadSchema


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userId** | <!----><!---->**String**<!----> | The ID of the user to whom this agent schedule applies |  |
| **workPlanId** | <!----><!---->[**ValueWrapperString**](ValueWrapperString.html)<!----> | The ID of the work plan for this user.  Mutually exclusive with workPlanIdsPerWeek |  [optional] |
| **workPlanIdsPerWeek** | <!----><!---->[**ListWrapperString**](ListWrapperString.html)<!----> | The IDs of the work plans per week for this user.  Mutually exclusive with workPlanId |  [optional] |
| **shifts** | <!----><!---->[**List&lt;BuAgentScheduleShift&gt;**](BuAgentScheduleShift.html)<!----> | The shift definitions for this agent schedule |  [optional] |
| **fullDayTimeOffMarkers** | <!----><!---->[**List&lt;BuFullDayTimeOffMarker&gt;**](BuFullDayTimeOffMarker.html)<!----> | Any full day time off markers that apply to this agent schedule |  [optional] |
| **metadata** | <!----><!---->[**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.html)<!----> | Version metadata for this agent schedule. Required if updating or deleting an existing agent schedule, otherwise should be omitted |  [optional] |
| **delete** | <!----><!---->**Boolean**<!----> | Whether to delete this agent&#39;s schedule. Defaults to false if not set |  [optional] |
{: class="table table-striped"}



