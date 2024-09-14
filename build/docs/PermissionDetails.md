# PermissionDetails


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of permission requirement |  [optional] |
| **permissions** | **List&lt;String&gt;** | List of required permissions |  [optional] |
| **allowsCurrentUser** | **Boolean** | Whether the current user can subscribe, when division permissions are otherwise required |  [optional] |
| **enforced** | **Boolean** | Whether or not this permission requirement is enforced |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| REQUIRESCURRENTUSER | &quot;requiresCurrentUser&quot; | 
| REQUIRESPERMISSIONS | &quot;requiresPermissions&quot; | 
| REQUIRESDIVISIONPERMISSIONS | &quot;requiresDivisionPermissions&quot; | 
| REQUIRESANYDIVISIONPERMISSIONS | &quot;requiresAnyDivisionPermissions&quot; | 
| REQUIRESUSERBECONVERSATIONPARTICIPANT | &quot;requiresUserBeConversationParticipant&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:209.1.0_
