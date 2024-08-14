---
title: UpdateAlternativeShiftBuSettingsRequest
---
## UpdateAlternativeShiftBuSettingsRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enabledGranularities** | <!----><!---->[**ListWrapperAlternativeShiftBuSettingsGranularity**](ListWrapperAlternativeShiftBuSettingsGranularity.html)<!----> | The granularity at which alternative shifts is allowed. An empty list as the wrapped value will indicate alternative shifts is disabled |  [optional] |
| **minMinutesBeforeStartTime** | <!----><!---->**Integer**<!----> | The minimum number of minutes before the start of a shift that an alternative shift can be automatically approved |  [optional] |
| **retainedActivityCategories** | <!----><!---->[**ListWrapperAlternativeShiftBuSettingsActivityCategory**](ListWrapperAlternativeShiftBuSettingsActivityCategory.html)<!----> | Categories of activities that are required to remain at the same time slot for the alternative shifts offered. An empty list indicates no retained activities |  [optional] |
| **metadata** | <!----><!---->[**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.html)<!----> | Version metadata for this business unit's alternative shift settings |  |
{: class="table table-striped"}



