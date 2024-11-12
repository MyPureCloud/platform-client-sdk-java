# CreateAdminTimeOffRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of this time off request |  |
| **users** | [**List&lt;UserReference&gt;**](UserReference) | A set of IDs for users to associate with this time off request |  |
| **activityCodeId** | **String** | The ID of the activity code associated with this time off request. Activity code must be of the TimeOff category |  |
| **notes** | **String** | Notes about the time off request |  [optional] |
| **fullDayManagementUnitDates** | **List&lt;String&gt;** | A set of dates in yyyy-MM-dd format.  Should be interpreted in the management unit's configured time zone. |  [optional] |
| **partialDayStartDateTimes** | [**List&lt;Date&gt;**](Date) | A set of start date-times in ISO-8601 format for partial day requests. |  [optional] |
| **dailyDurationMinutes** | **Integer** | The daily duration of this time off request in minutes |  |
| **durationMinutes** | **List&lt;Integer&gt;** | Daily durations for each day of this time off request in minutes |  [optional] |
| **payableMinutes** | **List&lt;Integer&gt;** | Payable minutes for each day of this time off request |  [optional] |
| **paid** | **Boolean** | Whether this is a paid time off request |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;PENDING&quot; | 
| APPROVED | &quot;APPROVED&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:214.0.0_
