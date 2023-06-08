---
title: WorkitemStatus
---
## WorkitemStatus


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **category** | [**CategoryEnum**](#CategoryEnum)<!----> | The Category of the Status. |  [optional] |
| **destinationStatuses** | <!----><!---->[**List&lt;WorkitemStatusReference&gt;**](WorkitemStatusReference.html)<!----> | The Statuses the Status can transition to. |  [optional] |
| **description** | <!----><!---->**String**<!----> | The description of the Status. |  [optional] |
| **defaultDestinationStatus** | <!----><!---->[**WorkitemStatusReference**](WorkitemStatusReference.html)<!----> | Default destination status to which this Status will transition to if auto status transition enabled. |  [optional] |
| **statusTransitionDelaySeconds** | <!----><!---->**Integer**<!----> | Delay in seconds for auto status transition |  [optional] |
| **statusTransitionTime** | <!----><!---->[**LocalTime**](LocalTime.html)<!----> | Time in HH:MM:SS format at which auto status transition will occur after statusTransitionDelaySeconds delay. To set Time, the statusTransitionDelaySeconds must be equal to or greater than 86400 i.e. a day |  [optional] |
| **worktype** | <!----><!---->[**WorktypeReference**](WorktypeReference.html)<!----> | The Worktype containing the Status. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
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



