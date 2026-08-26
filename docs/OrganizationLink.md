# OrganizationLink


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **sourceOrganizationId** | **String** | Organization Id for the login organization. |  |
| **targetOrganizationId** | **String** | Organization Id for the linking organization. |  |
| **sourceRegion** | **String** | Region where context organization is hosted, ie. us-east-1 |  |
| **targetRegion** | **String** | Region where linking organization is hosted, ie. us-east-2 |  |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Status of the linking. |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| APPROVED | &quot;Approved&quot; | 
| PENDING | &quot;Pending&quot; | 
| APPROVALPENDING | &quot;ApprovalPending&quot; | 
| REJECTED | &quot;Rejected&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:261.0.0_
