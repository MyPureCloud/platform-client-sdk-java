---
title: AdherenceSettings
---
## AdherenceSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **severeAlertThresholdMinutes** | <!----><!---->**Integer**<!----> | The threshold in minutes where an alert will be triggered when an agent is considered severely out of adherence |  [optional] |
| **adherenceTargetPercent** | <!----><!---->**Integer**<!----> | Target adherence percentage |  [optional] |
| **adherenceExceptionThresholdSeconds** | <!----><!---->**Integer**<!----> | The threshold in seconds for which agents should not be penalized for being momentarily out of adherence |  [optional] |
| **nonOnQueueActivitiesEquivalent** | <!----><!---->**Boolean**<!----> | Whether to treat all non-on-queue activities as equivalent for adherence purposes |  [optional] |
| **trackOnQueueActivity** | <!----><!---->**Boolean**<!----> | Whether to track on-queue activities |  [optional] |
| **ignoredActivityCategories** | <!----><!---->[**IgnoredActivityCategories**](IgnoredActivityCategories.html)<!----> | Activity categories that should be ignored for adherence purposes |  [optional] |
{: class="table table-striped"}



