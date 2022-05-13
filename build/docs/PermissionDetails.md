---
title: PermissionDetails
---
## PermissionDetails


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of permission requirement |  [optional] |
| **permissions** | <!----><!---->**List&lt;String&gt;**<!----> | List of required permissions |  [optional] |
| **allowsCurrentUser** | <!----><!---->**Boolean**<!----> | Whether the current user can subscribe, when division permissions are otherwise required |  [optional] |
| **enforced** | <!----><!---->**Boolean**<!----> | Whether or not this permission requirement is enforced |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| REQUIRESCURRENTUSER | &quot;requiresCurrentUser&quot; | 
| REQUIRESPERMISSIONS | &quot;requiresPermissions&quot; | 
| REQUIRESDIVISIONPERMISSIONS | &quot;requiresDivisionPermissions&quot; | 
| REQUIRESANYDIVISIONPERMISSIONS | &quot;requiresAnyDivisionPermissions&quot; | 
| REQUIRESUSERBECONVERSATIONPARTICIPANT | &quot;requiresUserBeConversationParticipant&quot; | 
{: class="table table-striped"}



