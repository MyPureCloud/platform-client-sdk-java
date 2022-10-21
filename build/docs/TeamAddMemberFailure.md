---
title: TeamAddMemberFailure
---
## TeamAddMemberFailure


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **reason** | [**ReasonEnum**](#ReasonEnum)<!----> | Specific reason the member could not be added. |  [optional] |
{: class="table table-striped"}


<a name="ReasonEnum"></a>

## Enum: ReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| USERNOTFOUND | &quot;UserNotFound&quot; | 
| USERGROUPLIMITEXCEEDED | &quot;UserGroupLimitExceeded&quot; | 
| USERGROUPDIVISIONMISMATCH | &quot;UserGroupDivisionMismatch&quot; | 
{: class="table table-striped"}



