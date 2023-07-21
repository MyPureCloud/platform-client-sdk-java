---
title: OutcomeQuantileCondition
---
## OutcomeQuantileCondition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **outcomeId** | <!----><!---->**String**<!----> | The outcome ID. |  |
| **maxQuantileThreshold** | <!----><!---->**Float**<!----> | This Outcome Quantile Condition is met when sessionMaxQuantile of the OutcomeScore is above this value, (unless fallbackQuantile is set). Range 0.00-1.00 |  |
| **fallbackQuantileThreshold** | <!----><!---->**Float**<!----> | (Optional) If set, this Condition is met when maxQuantileThreshold is met, AND the current quantile of the OutcomeScore is below this fallbackQuantileThreshold. Range 0.00-1.00 |  [optional] |
{: class="table table-striped"}



