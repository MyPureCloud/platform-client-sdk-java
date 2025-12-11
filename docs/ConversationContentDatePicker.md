# ConversationContentDatePicker


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | Optional unique identifier to help map component replies to form messages where multiple DatePickers can be present. |  [optional] |
| **title** | **String** | Text to show in the title. |  [optional] |
| **subtitle** | **String** | Text to show in the description. |  [optional] |
| **imageUrl** | **String** | URL of an image |  [optional] |
| **dateMinimum** | [**Date**](Date) | The minimum Date Enabled in the datepicker calendar, format: ISO 8601. |  [optional] |
| **dateMaximum** | [**Date**](Date) | The maximum Date Enabled in the datepicker calendar, format: ISO 8601. |  [optional] |
| **location** | [**ConversationContentLocation**](ConversationContentLocation) | Location of the event. |  [optional] |
| **availableTimes** | [**List&lt;ConversationContentDatePickerAvailableTime&gt;**](ConversationContentDatePickerAvailableTime) | An array of available times objects. |  [optional] |
| **dateDisplayFormat** | [**DateDisplayFormatEnum**](#Enum--DateDisplayFormatEnum) | The format the date should be presented to the end user. |  [optional] |


## Enum: DateDisplayFormatEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DAYMONTHYEAR | &quot;dayMonthYear&quot; | 
| MONTHDAYYEAR | &quot;monthDayYear&quot; | 
| YEARMONTHDAY | &quot;yearMonthDay&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:240.0.0_
