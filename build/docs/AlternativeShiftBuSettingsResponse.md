# AlternativeShiftBuSettingsResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enabledGranularities** | [**List<EnabledGranularitiesEnum>**](#Enum--EnabledGranularitiesEnum) | The granularity at which alternative shifts is allowed. An empty list means Alternative Shifts is disabled |  |
| **minMinutesBeforeStartTime** | **Integer** | The minimum number of minutes before the start of a shift that an alternative shift can be automatically approved |  |
| **retainedActivityCategories** | [**List<RetainedActivityCategoriesEnum>**](#Enum--RetainedActivityCategoriesEnum) | Categories of activities that are required to remain at the same time slot for the alternative shifts offered. An empty list represents no retained activities |  |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | Version metadata for this business unit's alternative shift settings |  |


## Enum: EnabledGranularitiesEnum

| Name | Value |
| ---- | ----- |
| DAILY | &quot;Daily&quot; |


## Enum: RetainedActivityCategoriesEnum

| Name | Value |
| ---- | ----- |
| BREAK | &quot;Break&quot; |
| MEAL | &quot;Meal&quot; |
| MEETING | &quot;Meeting&quot; |
| OFFQUEUEWORK | &quot;OffQueueWork&quot; |
| TIMEOFF | &quot;TimeOff&quot; |
| TRAINING | &quot;Training&quot; |
| UNAVAILABLE | &quot;Unavailable&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:209.1.0_
