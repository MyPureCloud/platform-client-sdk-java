# ContestsCreateRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **division** | [**WritableDivision**](WritableDivision) | The division for this performance profile associate to. Only set for DEFAULT profile. |  [optional] |
| **title** | **String** | The Contest title |  |
| **description** | **String** | The Contest description |  |
| **dateStart** | [**LocalDate**](LocalDate) | Start date of the contest. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **dateEnd** | [**LocalDate**](LocalDate) | End date of the contest. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **winningCriteria** | [**WinningCriteriaEnum**](#Enum--WinningCriteriaEnum) | The Contest winning criteria |  |
| **dateAnnounced** | [**Date**](Date) | The Contest's Announcement Datetime. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **announcementTimezone** | **String** | The Contest's Announcement Timezone. Valid values are strings of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London |  |
| **anonymization** | [**AnonymizationEnum**](#Enum--AnonymizationEnum) | The Contest anonymization |  |
| **metrics** | [**List&lt;ContestMetrics&gt;**](ContestMetrics) | The Contest's Metrics |  |
| **prizes** | [**List&lt;ContestPrizes&gt;**](ContestPrizes) | The Contest Prizes |  |
| **profileId** | **String** | The Contest profile |  |
| **participantIds** | **List&lt;String&gt;** | The Contest's participants |  |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: WinningCriteriaEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| HIGHESTOVERALLSCORE | &quot;HighestOverallScore&quot; | 
| HIGHESTOVERALLPERCENTOFGOAL | &quot;HighestOverallPercentOfGoal&quot; | 


## Enum: AnonymizationEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NOANONYMIZATION | &quot;NoAnonymization&quot; | 
| ALL | &quot;All&quot; | 
| ALLEXCEPTTOP | &quot;AllExceptTop&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:223.1.0_
