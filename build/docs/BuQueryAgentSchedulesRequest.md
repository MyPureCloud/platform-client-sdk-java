# BuQueryAgentSchedulesRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **managementUnitId** | **String** | The ID of the management unit to query |  |
| **userIds** | **List&lt;String&gt;** | The IDs of the users to query.  Omit to query all user schedules in the management unit. Note: If teamIds is also specified, only schedules for users in the requested teams will be returned |  [optional] |
| **teamIds** | **List&lt;String&gt;** | The teamIds to request. If null or not set, results will be queried for requested users if applicable or otherwise all users in the management unit |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
