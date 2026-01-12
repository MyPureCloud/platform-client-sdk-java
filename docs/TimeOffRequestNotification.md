# TimeOffRequestNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **timeOffRequestId** | **String** | The ID of this time off request |  [optional] |
| **user** | [**UserReference**](UserReference) | The user associated with this time off request |  [optional] |
| **isFullDayRequest** | **Boolean** | Whether this is a full day request (false means partial day) |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of this time off request |  [optional] |
| **partialDayStartDateTimes** | [**List&lt;Date&gt;**](Date) | A set of start date-times in ISO-8601 format for partial day requests.  Will be not empty if isFullDayRequest == false |  [optional] |
| **fullDayManagementUnitDates** | **List&lt;String&gt;** | A set of dates in yyyy-MM-dd format.  Should be interpreted in the management unit's configured time zone.  Will be not empty if isFullDayRequest == true |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;PENDING&quot; | 
| APPROVED | &quot;APPROVED&quot; | 
| DENIED | &quot;DENIED&quot; | 
| CANCELED | &quot;CANCELED&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:243.0.0_
