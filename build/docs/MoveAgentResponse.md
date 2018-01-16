---
title: MoveAgentResponse
---
## MoveAgentResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **user** | [**UserReference**](UserReference.html) | The user associated with the move |  [optional] |
| **result** | [**ResultEnum**](#ResultEnum) | The result of the move |  [optional] |
{: class="table table-striped"}


<a name="ResultEnum"></a>

## Enum: ResultEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| MOVESUCCESSFUL | &quot;MoveSuccessful&quot; |
| NOTHINGTODO | &quot;NothingToDo&quot; |
| ALREADYMOVED | &quot;AlreadyMoved&quot; |
| DESTINATIONMANAGEMENTUNITDOESNOTEXIST | &quot;DestinationManagementUnitDoesNotExist&quot; |
| DESTINATIONMANAGEMENTUNITAGENTLIMITEXCEEDED | &quot;DestinationManagementUnitAgentLimitExceeded&quot; |
| MOVINGTODIFFERENTMANAGEMENTUNIT | &quot;MovingToDifferentManagementUnit&quot; |
{: class="table table-striped"}


