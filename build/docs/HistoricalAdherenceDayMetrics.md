---
title: HistoricalAdherenceDayMetrics
---
## HistoricalAdherenceDayMetrics


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dayStartOffsetSecs** | <!----><!---->**Integer**<!----> | Start of day offset in seconds relative to query start time |  [optional] |
| **adherenceScheduleSecs** | <!----><!---->**Integer**<!----> | Duration of schedule in seconds included for adherence percentage calculation |  [optional] |
| **conformanceScheduleSecs** | <!----><!---->**Integer**<!----> | Total scheduled duration in seconds for OnQueue activities |  [optional] |
| **conformanceActualSecs** | <!----><!---->**Integer**<!----> | Total actually worked duration in seconds for OnQueue activities |  [optional] |
| **exceptionCount** | <!----><!---->**Integer**<!----> | Total number of adherence exceptions for this user |  [optional] |
| **exceptionDurationSecs** | <!----><!---->**Integer**<!----> | Total duration in seconds of adherence exceptions for this user |  [optional] |
| **impactSeconds** | <!----><!---->**Integer**<!----> | The impact duration in seconds of current adherence state for this user |  [optional] |
| **scheduleLengthSecs** | <!----><!---->**Integer**<!----> | Total duration in seconds for all scheduled activities |  [optional] |
| **actualLengthSecs** | <!----><!---->**Integer**<!----> | Total duration in seconds for all actually worked activities |  [optional] |
| **adherencePercentage** | <!----><!---->**Double**<!----> | Total adherence percentage for this user, in the scale of 0 - 100 |  [optional] |
| **conformancePercentage** | <!----><!---->**Double**<!----> | Total conformance percentage for this user, in the scale of 0 - 100. Conformance percentage can be greater than 100 when the actual on queue time is greater than the scheduled on queue time for the same period. |  [optional] |
{: class="table table-striped"}



