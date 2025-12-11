# SegmentAssignment


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dateAssigned** | [**Date**](Date) | Date when the segment was assigned. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **dateForUnassignment** | [**Date**](Date) | Date indicating when a segment is scheduled to be unassigned. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **segment** | [**SegmentAssignmentSegment**](SegmentAssignmentSegment) | The segment the assignment is for. |  |
| **session** | [**SegmentAssignmentSession**](SegmentAssignmentSession) | For session-scoped segments, the session for which the segment was assigned. |  [optional] |
| **externalContact** | [**AddressableEntityRef**](AddressableEntityRef) | External contact of the customer to which the segment is assigned. |  |




_com.mypurecloud.sdk.v2:platform-client-v2:240.0.0_
