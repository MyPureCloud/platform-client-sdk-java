# CoachingNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the appointment for this notification. |  [optional] |
| **markedAsRead** | **Boolean** | Indicates if notification is read or unread |  [optional] |
| **actionType** | [**ActionTypeEnum**](#Enum--ActionTypeEnum) | Action causing the notification. |  [optional] |
| **relationship** | [**RelationshipEnum**](#Enum--RelationshipEnum) | The relationship of this user to this notification's appointment |  [optional] |
| **dateStart** | [**Date**](Date) | The start time of the appointment relating to this notification. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **lengthInMinutes** | **Integer** | The duration of the appointment on this notification |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the appointment for this notification |  [optional] |
| **user** | [**UserReference**](UserReference) | The user of this notification |  [optional] |
| **appointment** | [**CoachingAppointmentResponse**](CoachingAppointmentResponse) | The appointment |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: ActionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CREATE | &quot;Create&quot; | 
| UPDATE | &quot;Update&quot; | 
| DELETE | &quot;Delete&quot; | 
| STATUSCHANGE | &quot;StatusChange&quot; | 


## Enum: RelationshipEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ATTENDEE | &quot;Attendee&quot; | 
| CREATOR | &quot;Creator&quot; | 
| FACILITATOR | &quot;Facilitator&quot; | 


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SCHEDULED | &quot;Scheduled&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| INVALIDSCHEDULE | &quot;InvalidSchedule&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:237.0.0_
