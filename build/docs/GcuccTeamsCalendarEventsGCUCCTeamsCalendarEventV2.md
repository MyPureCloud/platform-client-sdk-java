# GcuccTeamsCalendarEventsGCUCCTeamsCalendarEventV2


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **externalUserId** | **String** |  |  [optional] |
| **genesysUserId** | **String** |  |  [optional] |
| **trigger** | [**TriggerEnum**](#Enum--TriggerEnum) |  |  [optional] |
| **eventType** | [**EventTypeEnum**](#Enum--EventTypeEnum) |  |  [optional] |
| **eventTime** | [**Date**](Date) |  |  [optional] |
| **responseStatus** | [**ResponseStatusEnum**](#Enum--ResponseStatusEnum) |  |  [optional] |
| **meetingId** | **String** |  |  [optional] |


## Enum: TriggerEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| EVENTSTART | &quot;EventStart&quot; | 
| EVENTEND | &quot;EventEnd&quot; | 


## Enum: EventTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| CALENDAR | &quot;Calendar&quot; | 
| INSTANTMEETING | &quot;InstantMeeting&quot; | 


## Enum: ResponseStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;unknown&quot; | 
| NONE | &quot;none&quot; | 
| ORGANIZER | &quot;organizer&quot; | 
| TENTATIVELYACCEPTED | &quot;tentativelyAccepted&quot; | 
| ACCEPTED | &quot;accepted&quot; | 
| DECLINED | &quot;declined&quot; | 
| NOTRESPONDED | &quot;notResponded&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
