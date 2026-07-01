# BulkUpdateShiftTradeListJobRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **managementUnitIds** | **List&lt;String&gt;** | The IDs of the management units from which to update shift trades |  |
| **weekDates** | [**List&lt;LocalDate&gt;**](LocalDate) | The start week dates in which the shift trades being updated occur in the business unit time zone (yyyy-MM-dd format) |  |
| **entities** | [**List&lt;BulkUpdateShiftTradeStateRequestItem&gt;**](BulkUpdateShiftTradeStateRequestItem) | The shift trades that are being updated |  |




_com.mypurecloud.sdk.v2:platform-client-v2:257.0.0_
