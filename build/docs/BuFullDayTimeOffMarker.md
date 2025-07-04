# BuFullDayTimeOffMarker


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **businessUnitDate** | [**LocalDate**](LocalDate) | The date of the time off marker, interpreted in the business unit's time zone. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **lengthMinutes** | **Integer** | The length of the time off marker in minutes |  [optional] |
| **description** | **String** | The description of the time off marker |  [optional] |
| **activityCodeId** | **String** | The ID of the activity code associated with the time off marker |  [optional] |
| **paid** | **Boolean** | Whether the time off marker is paid |  [optional] |
| **payableMinutes** | **Integer** | Payable minutes for the time off marker |  [optional] |
| **timeOffRequestId** | **String** | The ID of the time off request |  [optional] |
| **timeOffRequestSyncVersion** | **Integer** | The sync version of the full day time off request for which the scheduled activity is associated |  [optional] |
| **delete** | **Boolean** | Set to 'true' to delete this time off marker. Will always be null on responses, only has an effect on schedule update |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
