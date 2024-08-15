# MoveAgentResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **user** | [**UserReference**](UserReference) | The user associated with the move |  [optional] |
| **result** | [**ResultEnum**](#Enum--ResultEnum) | The result of the move |  [optional] |
{: class="table table-striped"}


## Enum: ResultEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALREADYMOVED | &quot;AlreadyMoved&quot; | 
| DESTINATIONBUSINESSUNITAGENTLIMITEXCEEDED | &quot;DestinationBusinessUnitAgentLimitExceeded&quot; | 
| DESTINATIONMANAGEMENTUNITAGENTLIMITEXCEEDED | &quot;DestinationManagementUnitAgentLimitExceeded&quot; | 
| DESTINATIONMANAGEMENTUNITDOESNOTEXIST | &quot;DestinationManagementUnitDoesNotExist&quot; | 
| MOVESUCCESSFUL | &quot;MoveSuccessful&quot; | 
| MOVINGTODIFFERENTMANAGEMENTUNIT | &quot;MovingToDifferentManagementUnit&quot; | 
| NOTHINGTODO | &quot;NothingToDo&quot; | 
| SOURCEMANAGEMENTUNITNOTAUTHORIZED | &quot;SourceManagementUnitNotAuthorized&quot; | 
{: class="table table-striped"}



