---
title: EstimateAvailableTimeOffResponse
---
## EstimateAvailableTimeOffResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fullDayDates** | <!----><!---->[**List&lt;EstimateAvailableFullDayTimeOffResponse&gt;**](EstimateAvailableFullDayTimeOffResponse.html)<!----> | Full day dates. partialDayDates must be empty if this field is populated |  [optional] |
| **partialDayDates** | <!----><!---->[**List&lt;EstimateAvailablePartialDayTimeOffResponse&gt;**](EstimateAvailablePartialDayTimeOffResponse.html)<!----> | Partial day dates. fullDayDates must be empty if this field is populated |  [optional] |
| **user** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The user to whom the time off request belongs |  |
| **activityCodeId** | <!----><!---->**String**<!----> | The ID of the activity code associated with the time off request. Activity code must be of the TimeOff category |  |
| **paid** | <!----><!---->**Boolean**<!----> | Whether this estimate is for a paid time off request |  |
{: class="table table-striped"}



