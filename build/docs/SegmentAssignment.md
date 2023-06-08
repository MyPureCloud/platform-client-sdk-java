---
title: SegmentAssignment
---
## SegmentAssignment


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | Unique identifier for the segment assignment. |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | State of the segment assignment. |  [optional] |
| **dateAssigned** | <!----><!---->[**Date**](Date.html)<!----> | Date when the segment was assigned. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateUnassigned** | <!----><!---->[**Date**](Date.html)<!----> | Date when the segment was unassigned. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Date when the segment assignment was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **segment** | <!----><!---->[**SegmentAssignmentSegment**](SegmentAssignmentSegment.html)<!----> | The segment the assignment is for. |  [optional] |
| **customerId** | <!----><!---->**String**<!----> | ID of the customer to which the segment is assigned. |  [optional] |
| **customerIdType** | <!----><!---->**String**<!----> | Type of customer ID (e.g. cookie, email, phone). |  [optional] |
| **session** | <!----><!---->[**SegmentAssignmentSession**](SegmentAssignmentSession.html)<!----> | For session-scoped segments, the session for which the segment was assigned. |  [optional] |
| **externalContact** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | External contact of the customer to which the segment is assigned. |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASSIGNED | &quot;Assigned&quot; | 
| UNASSIGNED | &quot;Unassigned&quot; | 
{: class="table table-striped"}



