---
title: EstimateAvailableTimeOffRequest
---
## EstimateAvailableTimeOffRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fullDayDates** | <!----><!---->[**List&lt;EstimateAvailableFullDayTimeOffRequest&gt;**](EstimateAvailableFullDayTimeOffRequest.html)<!----> | Full day dates. partialDayDates must be empty if this field is populated |  [optional] |
| **partialDayDates** | <!----><!---->[**List&lt;EstimateAvailablePartialDayTimeOffRequest&gt;**](EstimateAvailablePartialDayTimeOffRequest.html)<!----> | Partial day dates. fullDayDates must be empty if this field is populated |  [optional] |
| **activityCodeId** | <!----><!---->**String**<!----> | The ID of the activity code associated with the time off request. Activity code must be of the TimeOff category |  |
| **paid** | <!----><!---->**Boolean**<!----> | Whether this estimate is for a paid time off request |  |
{: class="table table-striped"}



