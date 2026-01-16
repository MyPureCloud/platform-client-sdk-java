# TimeOffSettingsResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **submissionRangeEnforced** | **Boolean** | Whether to enforce a submission range for agent time off requests |  [optional] |
| **submissionRangeType** | [**SubmissionRangeTypeEnum**](#Enum--SubmissionRangeTypeEnum) | The type of the submission range |  [optional] |
| **submissionEarliestDaysFromNow** | **Integer** | The earliest number of days from now for which an agent can submit a time off request.  Use negative numbers to indicate days in the past |  [optional] |
| **submissionLatestDaysFromNow** | **Integer** | The latest number of days from now for which an agent can submit a time off request |  [optional] |
| **submissionLatestDate** | [**LocalDate**](LocalDate) | The latest date for the time off request submission interpreted in the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |


## Enum: SubmissionRangeTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RELATIVE | &quot;Relative&quot; | 
| FIXEDEND | &quot;FixedEnd&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:244.0.0_
