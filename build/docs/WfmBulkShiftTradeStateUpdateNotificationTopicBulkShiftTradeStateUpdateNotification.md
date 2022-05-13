---
title: WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateNotification
---
## WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**StatusEnum**](#StatusEnum)<!----> |  |  [optional] |
| **operationId** | <!----><!---->**String**<!----> |  |  [optional] |
| **result** | <!----><!---->[**WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResultListing**](WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResultListing.html)<!----> |  |  [optional] |
| **weekDate** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| CANCELED | &quot;Canceled&quot; | 
| ERROR | &quot;Error&quot; | 
{: class="table table-striped"}



