# AttendanceStatus


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dateWorkday** | [**LocalDate**](LocalDate) | the workday date of this attendance status. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **attendanceStatusType** | [**AttendanceStatusTypeEnum**](#Enum--AttendanceStatusTypeEnum) | the attendance status |  [optional] |
| **hasEvaluation** | [**HasEvaluationEnum**](#Enum--HasEvaluationEnum) | the quality evaluation score status |  [optional] |


## Enum: AttendanceStatusTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| HASDATA | &quot;HasData&quot; | 
| SCHEDULED | &quot;Scheduled&quot; | 
| ABSENT | &quot;Absent&quot; | 
| PRESENT | &quot;Present&quot; | 
| NOSCHEDULE | &quot;NoSchedule&quot; | 


## Enum: HasEvaluationEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| HASQUALITYEVALUATION | &quot;HasQualityEvaluation&quot; | 
| NOQUALITYEVALUATION | &quot;NoQualityEvaluation&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
