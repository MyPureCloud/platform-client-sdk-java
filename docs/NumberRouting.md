# NumberRouting


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **numberId** | **String** | Phone number Id that has a disaster recovery linking |  [optional] |
| **ownerOrganizationId** | **String** | Owner organization of numberId |  [optional] |
| **carrierCode** | **String** | Code that indicates which carrier manages the number ie. VERIZON |  [optional] |
| **pendingOrganizationId** | **String** | OrganizationId where the number will be routed to during a change routing event |  [optional] |
| **region** | **String** | The current region where the number is located |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The current status of the number routing |  [optional] |
| **activeOrganizationId** | **String** | The orgId where the number is currently routing to |  [optional] |
| **linkedOrganizationIds** | **List&lt;String&gt;** | List of linked organizations ids |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NORMAL | &quot;Normal&quot; | 
| REDIRECTED | &quot;Redirected&quot; | 
| PENDING | &quot;Pending&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:255.0.0_
