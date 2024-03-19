---
title: Range
---
## Range


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Range type (NoEnd: without an end date. EndDate: with an end date. Numbered: with a specific number of occurrences) |  |
| **end** | <!----><!---->**String**<!----> | The end date time of the last occurrence of the range as an ISO-8601 string in UTC time, e.g: 2023-12-21T16:30:25.000Z, Required to set for EndDate range type. |  [optional] |
| **numberOfOccurrences** | <!----><!---->**Integer**<!----> | The number of times the schedule will be repeated, e.g: 2. Required to set for Numbered range type. |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NOEND | &quot;NoEnd&quot; | 
| ENDDATE | &quot;EndDate&quot; | 
| NUMBERED | &quot;Numbered&quot; | 
{: class="table table-striped"}



