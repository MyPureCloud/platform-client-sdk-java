# ContestsResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **division** | [**WritableDivision**](WritableDivision) | The division for this performance profile associate to |  [optional] |
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
| **version** | **Integer** | The Contest Version |  [optional] |
| **createdBy** | [**UserReference**](UserReference) | The creator of the contest |  [optional] |
| **profile** | [**ContestProfile**](ContestProfile) | The performance profile |  [optional] |
| **participants** | [**List&lt;UserReference&gt;**](UserReference) | The Contest's participants |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The Contest status |  [optional] |
| **participantCount** | **Integer** | The Number of participants in the contest |  [optional] |
| **dateFinalized** | [**Date**](Date) | The Contest's finalize datetime, returned when a contest is complete. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateCancelled** | [**Date**](Date) | The Contest's cancelled datetime, returned when a contest is complete. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The Contest's last modified datetime. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateScoresModified** | [**Date**](Date) | The datetime the contest scores were last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **winners** | [**List&lt;ContestWinners&gt;**](ContestWinners) | The Contest Winners |  [optional] |
| **disqualifiedAgents** | [**List&lt;ContestDisqualifiedAgents&gt;**](ContestDisqualifiedAgents) | The Contest's disqualified agents, returned when a contest is complete |  [optional] |
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


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UPCOMING | &quot;Upcoming&quot; | 
| ONGOING | &quot;Ongoing&quot; | 
| PENDING | &quot;Pending&quot; | 
| RECENTLYCOMPLETED | &quot;RecentlyCompleted&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| CANCELLED | &quot;Cancelled&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:227.0.0_
