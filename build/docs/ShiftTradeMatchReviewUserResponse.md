---
title: ShiftTradeMatchReviewUserResponse
---
## ShiftTradeMatchReviewUserResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **weeklyMinimumPaidMinutes** | <!----><!---->**Integer**<!----> | The minimum weekly paid minutes for this user per the work plan tied to the agent schedule |  [optional] |
| **weeklyMaximumPaidMinutes** | <!----><!---->**Integer**<!----> | The maximum weekly paid minutes for this user per the work plan tied to the agent schedule |  [optional] |
| **preTradeSchedulePaidMinutes** | <!----><!---->**Integer**<!----> | The paid minutes on the week schedule for this user prior to the shift trade |  [optional] |
| **postTradeSchedulePaidMinutes** | <!----><!---->**Integer**<!----> | The paid minutes on the week schedule for this user if the shift trade is approved |  [optional] |
| **postTradeNewShift** | <!----><!---->[**ShiftTradePreviewResponse**](ShiftTradePreviewResponse.html)<!----> | Preview of what the shift will look like for the opposite side of this trade after the match is approved |  [optional] |
{: class="table table-striped"}



