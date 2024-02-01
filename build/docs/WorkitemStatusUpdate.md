---
title: WorkitemStatusUpdate
---
## WorkitemStatusUpdate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | <!----><!---->**String**<!----> | The name of the Status. Valid length between 3 and 256 characters. |  [optional] |
| **destinationStatusIds** | <!----><!---->**List&lt;String&gt;**<!----> | A list of destination Statuses where a Workitem with this Status can transition to. If the list is empty Workitems with this Status can transition to all other Statuses defined on the Worktype. A Status can have a maximum of 24 destinations. |  [optional] |
| **description** | <!----><!---->**String**<!----> | The description of the Status. Maximum length of 4096 characters. |  [optional] |
| **defaultDestinationStatusId** | <!----><!---->**String**<!----> | Default destination status to which this Status will transition to if auto status transition enabled. |  [optional] |
| **statusTransitionDelaySeconds** | <!----><!---->**Integer**<!----> | Delay in seconds for auto status transition. Required if defaultDestinationStatusId is provided. |  [optional] |
| **statusTransitionTime** | <!----><!---->**String**<!----> | Time is represented as an ISO-8601 string without a timezone. For example: HH:mm:ss.SSS |  [optional] |
{: class="table table-striped"}



