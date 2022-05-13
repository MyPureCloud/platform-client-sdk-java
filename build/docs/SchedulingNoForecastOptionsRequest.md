---
title: SchedulingNoForecastOptionsRequest
---
## SchedulingNoForecastOptionsRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **shiftLength** | [**ShiftLengthEnum**](#ShiftLengthEnum)<!----> | The shift length option to apply if no forecast is supplied |  [optional] |
| **shiftStart** | [**ShiftStartEnum**](#ShiftStartEnum)<!----> | The shift start option to apply if no forecast is supplied |  [optional] |
{: class="table table-striped"}


<a name="ShiftLengthEnum"></a>

## Enum: ShiftLengthEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SHORTEST | &quot;Shortest&quot; | 
| MEDIAN | &quot;Median&quot; | 
| LONGEST | &quot;Longest&quot; | 
| RANDOM | &quot;Random&quot; | 
{: class="table table-striped"}


<a name="ShiftStartEnum"></a>

## Enum: ShiftStartEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EARLIEST | &quot;Earliest&quot; | 
| MEDIAN | &quot;Median&quot; | 
| LATEST | &quot;Latest&quot; | 
| RANDOM | &quot;Random&quot; | 
{: class="table table-striped"}



