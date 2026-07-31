# AgentEffectiveBid


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The ID of the schedule bid |  |
| **name** | **String** |  |  [optional] |
| **effectiveDate** | [**LocalDate**](LocalDate) | The effective date of the bid relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **endDate** | [**LocalDate**](LocalDate) | The end date of the bid, relative to the business unit time zone in yyyy-MM-dd format. Null denotes an active schedule bid. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **downloadUrl** | **String** | The download URL to fetch the list of schedule sets and the agents assigned to them |  |
| **downloadTemplate** | [**AgentAssignedScheduleSetList**](AgentAssignedScheduleSetList) | This field will always be null. Effective schedule sets are returned through the download URL. The schema is included here for documentation purposes |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:259.0.0_
