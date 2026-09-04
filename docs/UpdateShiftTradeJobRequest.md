# UpdateShiftTradeJobRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **weekDate** | [**LocalDate**](LocalDate) | The start week date of this shift in the business unit time zone (yyyy-MM-dd format). Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **target** | [**ValueWrapperShiftTradeTargetRequestItem**](ValueWrapperShiftTradeTargetRequestItem) | Target of the shift trade, if applicable |  [optional] |
| **expirationDate** | [**ValueWrapperDate**](ValueWrapperDate) | When this shift trade will expire. Date time is represented as an ISO-8601 string |  [optional] |
| **acceptableIntervals** | [**ListWrapperRequiredDateRange**](ListWrapperRequiredDateRange) | Time frames when the initiating user is willing to accept a shift in exchange. Setting the enclosed list to empty will make this a one sided trade request. |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | Version metadata for the shift trade |  |




_com.mypurecloud.sdk.v2:platform-client-v2:262.0.0_
