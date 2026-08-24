# AgentScheduleBid


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The ID of the schedule bid |  |
| **name** | **String** |  |  [optional] |
| **bidWindowStartDate** | [**LocalDate**](LocalDate) | The bid start date when agents can start participating in schedule bidding relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **bidWindowEndDate** | [**LocalDate**](LocalDate) | The bid end date relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **effectiveDate** | [**LocalDate**](LocalDate) | The date when schedule sets would be effective for schedule generation relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The state of the bid |  |
| **bidType** | [**BidTypeEnum**](#Enum--BidTypeEnum) | The type of the bid |  |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DRAFT | &quot;Draft&quot; | 
| LOCKED | &quot;Locked&quot; | 
| OPTIMIZED | &quot;Optimized&quot; | 
| SCHEDULED | &quot;Scheduled&quot; | 
| OPEN | &quot;Open&quot; | 
| CLOSED | &quot;Closed&quot; | 
| PROCESSED | &quot;Processed&quot; | 
| PUBLISHED | &quot;Published&quot; | 


## Enum: BidTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| WORKPLANBID | &quot;WorkPlanBid&quot; | 
| SCHEDULEBID | &quot;ScheduleBid&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:260.1.0_
