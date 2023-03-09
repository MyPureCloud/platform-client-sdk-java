---
title: LearningSlot
---
## LearningSlot


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dateStart** | <!----><!---->[**Date**](Date.html)<!----> | Start date and time of scheduled Learning activity slot. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **lengthInMinutes** | <!----><!---->**Integer**<!----> | Length of Learning activity slot in minutes |  [optional] |
| **staffingDifference** | <!----><!---->**Double**<!----> | Difference between scheduled and forecast headcount for this slot after scheduling the Learning activity |  [optional] |
| **differenceRating** | [**DifferenceRatingEnum**](#DifferenceRatingEnum)<!----> | Rating based on the staffing difference for scheduled slot |  [optional] |
{: class="table table-striped"}


<a name="DifferenceRatingEnum"></a>

## Enum: DifferenceRatingEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| POOR | &quot;Poor&quot; | 
| NEUTRAL | &quot;Neutral&quot; | 
| GOOD | &quot;Good&quot; | 
{: class="table table-striped"}



