# SearchUnmatchedShiftTradeListJobRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **managementUnitIds** | **List&lt;String&gt;** | The IDs of management units from which to query shift trades |  |
| **weekDates** | [**List&lt;LocalDate&gt;**](LocalDate) | The start week dates in which to query shift trades in the business unit time zone (yyyy-MM-dd format) |  |
| **receivingSchedule** | [**ReceivingScheduleLookup**](ReceivingScheduleLookup) | Associated schedule information for the receiving user |  |
| **receivingShiftIds** | **List&lt;String&gt;** | The IDs of shifts that the receiving user would potentially be willing to trade. If empty, only returns one-sided trades |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:261.0.0_
