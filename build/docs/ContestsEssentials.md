# ContestsEssentials


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **title** | **String** | The Contest title |  |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The Contest status |  [optional] |
| **dateStart** | [**LocalDate**](LocalDate) | Start date of the contest. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **dateEnd** | [**LocalDate**](LocalDate) | End date of the contest. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **profile** | [**ContestProfile**](ContestProfile) | The performance profile |  [optional] |
| **participantCount** | **Integer** | The Number of participants in the contest |  [optional] |
| **dateAnnounced** | [**Date**](Date) | The Contest's Announcement datetime. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **dateFinalized** | [**Date**](Date) | The Contest's finalize datetime, returned when a contest is complete. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateCancelled** | [**Date**](Date) | The Contest's cancelled datetime, returned when a contest is complete. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The Contest's last modified datetime. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateScoresModified** | [**Date**](Date) | The datetime the contest scores were last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **metrics** | [**List&lt;ContestMetrics&gt;**](ContestMetrics) | The Contest's Metrics |  |
| **requestingParticipantContestInfo** | [**ContestRequesingParticipantDailyInfo**](ContestRequesingParticipantDailyInfo) | The Most Recent Contest Info for the requesting participant |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:233.0.0_
