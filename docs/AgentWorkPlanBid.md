# AgentWorkPlanBid


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The ID of the work plan bid |  |
| **name** | **String** |  |  [optional] |
| **bidWindowStartDate** | [**LocalDate**](LocalDate) | The date when agents can start participating in work plan bidding. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **bidWindowEndDate** | [**LocalDate**](LocalDate) | The inclusive end date of a bid window. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **effectiveDate** | [**LocalDate**](LocalDate) | The date when agents will be assigned to the new work plan. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The state of the bid |  |
| **workPlanFieldsVisibleToAgents** | [**List<WorkPlanFieldsVisibleToAgentsEnum>**](#Enum--WorkPlanFieldsVisibleToAgentsEnum) | The work plan fields visible to agents whenever work plan preferences are made |  |
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


## Enum: WorkPlanFieldsVisibleToAgentsEnum

| Name | Value |
| ---- | ----- |
| NAME | &quot;Name&quot; |
| PAIDHOURS | &quot;PaidHours&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:219.0.0_
