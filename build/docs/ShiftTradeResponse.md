---
title: ShiftTradeResponse
---
## ShiftTradeResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The ID of this shift trade |  [optional] |
| **weekDate** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | The start week date of the associated schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **schedule** | <!----><!---->[**BuScheduleReferenceForMuRoute**](BuScheduleReferenceForMuRoute.html)<!----> | A reference to the associated schedule |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | The state of this shift trade |  [optional] |
| **initiatingUser** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The user who initiated this trade |  [optional] |
| **initiatingShiftId** | <!----><!---->**String**<!----> | The ID of the shift offered for trade by the initiating user |  [optional] |
| **initiatingShiftStart** | <!----><!---->[**Date**](Date.html)<!----> | The start date/time of the shift being offered for trade. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **initiatingShiftEnd** | <!----><!---->[**Date**](Date.html)<!----> | The end date/time of the shift being offered for trade. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **receivingUser** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The user matching the trade, or if the state is not Matched, the user to whom the trade request was sent |  [optional] |
| **receivingShiftId** | <!----><!---->**String**<!----> | The ID of the shift being exchanged for the initiating shift, null if the receiving user is picking up a shift |  [optional] |
| **receivingShiftStart** | <!----><!---->[**Date**](Date.html)<!----> | The start date/time of the receiving shift. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **receivingShiftEnd** | <!----><!---->[**Date**](Date.html)<!----> | The end date/time of the receiving shift. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **expiration** | <!----><!---->[**Date**](Date.html)<!----> | When this shift trade offer will expire if not matched or approved. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **oneSided** | <!----><!---->**Boolean**<!----> | Whether this is a one-sided shift trade (e.g. the initiating user is not asking for a shift in return) |  [optional] |
| **acceptableIntervals** | <!----><!---->**List&lt;String&gt;**<!----> |  |  [optional] |
| **reviewedBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The user who reviewed this shift trade |  [optional] |
| **reviewedDate** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp when this shift trade was reviewed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **metadata** | <!----><!---->[**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.html)<!----> | Version data for this trade |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNMATCHED | &quot;Unmatched&quot; | 
| MATCHED | &quot;Matched&quot; | 
| APPROVED | &quot;Approved&quot; | 
| DENIED | &quot;Denied&quot; | 
| EXPIRED | &quot;Expired&quot; | 
| CANCELED | &quot;Canceled&quot; | 
{: class="table table-striped"}



