# ProcessScheduleUpdateUploadRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **uploadKey** | **String** | The uploadKey provided by the request to get an upload URL |  |
| **teamIds** | **List&lt;String&gt;** | The list of teams to which the users being modified belong. Only required if the requesting user has conditional permission to wfm:schedule:edit |  [optional] |
| **managementUnitIdsForAddedTeamUsers** | **List&lt;String&gt;** | The set of muIds to which agents belong if agents are being newly added to the schedule, if the requesting user has conditional permission to wfm:schedule:edit |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
