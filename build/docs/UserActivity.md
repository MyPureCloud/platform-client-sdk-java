# UserActivity


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The ID of the user |  |
| **routingStatus** | [**UserActivityRoutingStatus**](UserActivityRoutingStatus) | The current routing status of the user |  [optional] |
| **presence** | [**UserActivityAdherencePresence**](UserActivityAdherencePresence) | The current system presence of the user |  [optional] |
| **outOfOffice** | [**UserActivityOutOfOffice**](UserActivityOutOfOffice) | The current out of office state of the user |  [optional] |
| **activeQueueIds** | **List&lt;String&gt;** | The IDs of the queues for which the user is active |  |
| **dateActiveQueuesChanged** | [**Date**](Date) | The date the activeQueueIds list was last modified. For reference only - subject to eventual consistency. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:263.0.0_
