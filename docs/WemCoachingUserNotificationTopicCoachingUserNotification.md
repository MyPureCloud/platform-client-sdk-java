# WemCoachingUserNotificationTopicCoachingUserNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **name** | **String** |  |  [optional] |
| **markedAsRead** | **Boolean** |  |  [optional] |
| **actionType** | [**ActionTypeEnum**](#Enum--ActionTypeEnum) |  |  [optional] |
| **relationship** | [**RelationshipEnum**](#Enum--RelationshipEnum) |  |  [optional] |
| **appointment** | [**WemCoachingUserNotificationTopicCoachingAppointmentReference**](WemCoachingUserNotificationTopicCoachingAppointmentReference) |  |  [optional] |
| **dateStart** | [**Date**](Date) |  |  [optional] |
| **lengthInMinutes** | **Long** |  |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |


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
| FACILITATOR | &quot;Facilitator&quot; | 
| CREATOR | &quot;Creator&quot; | 


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SCHEDULED | &quot;Scheduled&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| INVALIDSCHEDULE | &quot;InvalidSchedule&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:224.0.0_
