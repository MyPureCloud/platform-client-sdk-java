# WorkitemStatus


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **category** | [**CategoryEnum**](#Enum--CategoryEnum) | The Category of the Status. |  [optional] |
| **destinationStatuses** | [**List&lt;WorkitemStatusReference&gt;**](WorkitemStatusReference) | The Statuses the Status can transition to. |  [optional] |
| **description** | **String** | The description of the Status. |  [optional] |
| **defaultDestinationStatus** | [**WorkitemStatusReference**](WorkitemStatusReference) | Default destination status to which this Status will transition to if auto status transition enabled. |  [optional] |
| **statusTransitionDelaySeconds** | **Integer** | Delay in seconds for auto status transition |  [optional] |
| **statusTransitionTime** | **String** | Time is represented as an ISO-8601 string without a timezone. For example: HH:mm:ss.SSS |  [optional] |
| **worktype** | [**WorktypeReference**](WorktypeReference) | The Worktype containing the Status. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


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




_com.mypurecloud.sdk.v2:platform-client-v2:207.0.0_
