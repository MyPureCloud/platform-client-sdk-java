# MatchShiftTradeJobRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **weekDate** | [**LocalDate**](LocalDate) | The start week date of the initiating shift in the business unit time zone (yyyy-MM-dd format). Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **receivingSchedule** | [**ReceivingScheduleLookup**](ReceivingScheduleLookup) | Associated schedule information for the receiving user |  |
| **receivingShiftId** | **String** | The ID of the shift the receiving user is giving up in trade, if applicable |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | Version metadata for the shift trade |  |




_com.mypurecloud.sdk.v2:platform-client-v2:251.0.0_
