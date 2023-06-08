---
title: WorkitemStatusCreate
---
## WorkitemStatusCreate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | <!----><!---->**String**<!----> | The name of the Status. Valid length between 3 and 256 characters. |  |
| **category** | [**CategoryEnum**](#CategoryEnum)<!----> | The Category of the Status. |  |
| **destinationStatusIds** | <!----><!---->**List&lt;String&gt;**<!----> | A list of destination Statuses where a Workitem with this Status can transition to. If the list is empty Workitems with this Status can transition to all other Statuses defined on the Worktype. A Status can have a maximum of 24 destinations. |  [optional] |
| **description** | <!----><!---->**String**<!----> | The description of the Status. Maximum length of 4096 characters. |  [optional] |
| **defaultDestinationStatusId** | <!----><!---->**String**<!----> | Default destination status to which this Status will transition to if auto status transition enabled. |  [optional] |
| **statusTransitionDelaySeconds** | <!----><!---->**Integer**<!----> | Delay in seconds for auto status transition. Required if defaultDestinationStatusId is provided. |  [optional] |
| **statusTransitionTime** | <!----><!---->[**LocalTime**](LocalTime.html)<!----> | Time in HH:MM:SS format at which auto status transition will occur after statusTransitionDelaySeconds delay. To set Time, the statusTransitionDelaySeconds must be equal to or greater than 86400 i.e. a day |  [optional] |
{: class="table table-striped"}


<a name="CategoryEnum"></a>

## Enum: CategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OPEN | &quot;Open&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| WAITING | &quot;Waiting&quot; | 
| CLOSED | &quot;Closed&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}



