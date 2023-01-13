---
title: WfmHistoricalAdherenceBulkUserDayMetrics
---
## WfmHistoricalAdherenceBulkUserDayMetrics


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dayStartOffsetSeconds** | <!----><!---->**Integer**<!----> | Start of day offset in seconds relative to query start time |  [optional] |
| **adherenceScheduleSeconds** | <!----><!---->**Integer**<!----> | Duration of schedule in seconds included for adherence percentage calculation |  [optional] |
| **conformanceScheduleSeconds** | <!----><!---->**Integer**<!----> | Total scheduled duration in seconds for OnQueue activities |  [optional] |
| **conformanceActualSeconds** | <!----><!---->**Integer**<!----> | Total actually worked duration in seconds for OnQueue activities |  [optional] |
| **exceptionCount** | <!----><!---->**Integer**<!----> | Total number of adherence exceptions for this user |  [optional] |
| **exceptionDurationSeconds** | <!----><!---->**Integer**<!----> | Total duration in seconds of adherence exceptions for this user |  [optional] |
| **impactSeconds** | <!----><!---->**Integer**<!----> | The impact duration in seconds of current adherence state for this user |  [optional] |
| **scheduleLengthSeconds** | <!----><!---->**Integer**<!----> | Total duration in seconds for all scheduled activities |  [optional] |
| **actualLengthSeconds** | <!----><!---->**Integer**<!----> | Total duration in seconds for all actually worked activities |  [optional] |
| **adherencePercentage** | <!----><!---->**Double**<!----> | Total adherence percentage for this user, in the scale of 0 - 100 |  [optional] |
| **conformancePercentage** | <!----><!---->**Double**<!----> | Total conformance percentage for this user, in the scale of 0 - 100. Conformance percentage can be greater than 100 when the actual on queue time is greater than the scheduled on queue time for the same period. |  [optional] |
{: class="table table-striped"}



