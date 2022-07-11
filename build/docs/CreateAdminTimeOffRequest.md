---
title: CreateAdminTimeOffRequest
---
## CreateAdminTimeOffRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The status of this time off request |  |
| **users** | <!----><!---->[**List&lt;UserReference&gt;**](UserReference.html)<!----> | A set of IDs for users to associate with this time off request |  |
| **activityCodeId** | <!----><!---->**String**<!----> | The ID of the activity code associated with this time off request. Activity code must be of the TimeOff category |  |
| **notes** | <!----><!---->**String**<!----> | Notes about the time off request |  [optional] |
| **fullDayManagementUnitDates** | <!----><!---->**List&lt;String&gt;**<!----> | A set of dates in yyyy-MM-dd format.  Should be interpreted in the management unit's configured time zone. |  [optional] |
| **partialDayStartDateTimes** | <!----><!---->[**List&lt;Date&gt;**](Date.html)<!----> | A set of start date-times in ISO-8601 format for partial day requests. |  [optional] |
| **dailyDurationMinutes** | <!----><!---->**Integer**<!----> | The daily duration of this time off request in minutes |  |
| **paid** | <!----><!---->**Boolean**<!----> | Whether this is a paid time off request |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;PENDING&quot; | 
| APPROVED | &quot;APPROVED&quot; | 
{: class="table table-striped"}



