---
title: ScheduleActivity
---
## ScheduleActivity


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dateStart** | <!----><!---->[**Date**](Date.html)<!----> | The start date/time of this activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **lengthMinutes** | <!----><!---->**Integer**<!----> | The length of this activity in minutes |  [optional] |
| **description** | <!----><!---->**String**<!----> | The description of this activity |  [optional] |
| **activityCodeId** | <!----><!---->**String**<!----> | The ID of the activity code associated with this activity |  [optional] |
| **paid** | <!----><!---->**Boolean**<!----> | Whether this activity is paid |  [optional] |
| **timeOffRequestId** | <!----><!---->**String**<!----> | The ID of the time off request associated with this activity, if applicable |  [optional] |
| **externalActivityId** | <!----><!---->**String**<!----> | The ID of the external activity associated with this activity, if applicable |  [optional] |
| **externalActivityType** | [**ExternalActivityTypeEnum**](#ExternalActivityTypeEnum)<!----> | The type of the external activity associated with this activity, if applicable |  [optional] |
{: class="table table-striped"}


<a name="ExternalActivityTypeEnum"></a>

## Enum: ExternalActivityTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COACHING | &quot;Coaching&quot; | 
{: class="table table-striped"}



