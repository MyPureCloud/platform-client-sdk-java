---
title: CreateAgentTimeOffRequest
---
## CreateAgentTimeOffRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **activityCodeId** | <!----><!---->**String**<!----> | The ID of the activity code associated with this time off request. Activity code must be of the TimeOff category |  |
| **notes** | <!----><!---->**String**<!----> | Notes about the time off request |  [optional] |
| **fullDayManagementUnitDates** | <!----><!---->**List&lt;String&gt;**<!----> | A set of dates in yyyy-MM-dd format.  Should be interpreted in the management unit's configured time zone. |  [optional] |
| **partialDayStartDateTimes** | <!----><!---->[**List&lt;Date&gt;**](Date.html)<!----> | A set of start date-times in ISO-8601 format for partial day requests. |  [optional] |
| **dailyDurationMinutes** | <!----><!---->**Integer**<!----> | The daily duration of this time off request in minutes |  |
{: class="table table-striped"}



