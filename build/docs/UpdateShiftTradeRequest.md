---
title: UpdateShiftTradeRequest
---
## UpdateShiftTradeRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **receivingUserId** | **String** | Update the ID of the receiving user to direct the request at a specific user, or set to null to open up a trade to be matched by any user |  [optional] |
| **expiration** | [**Date**](Date.html) | Update the expiration time for this shift trade. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **acceptableIntervals** | [**List&lt;ShiftTradeResponseAcceptableIntervals&gt;**](ShiftTradeResponseAcceptableIntervals.html) |  |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.html) | Version metadata |  |
{: class="table table-striped"}



