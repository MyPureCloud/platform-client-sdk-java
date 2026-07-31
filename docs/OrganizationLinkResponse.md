# OrganizationLinkResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **sourceOrganizationId** | **String** | Organization Id for the login organization. |  [optional] |
| **targetOrganizationId** | **String** | Organization Id for the linking organization. |  [optional] |
| **sourceRegion** | **String** | Region where context organization is hosted, ie. us-east-1 |  [optional] |
| **targetRegion** | **String** | Region where linking organization is hosted, ie. us-east-2 |  [optional] |
| **targetName** | **String** | Name for the linking organization. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Status of the linking. |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| APPROVED | &quot;Approved&quot; | 
| PENDING | &quot;Pending&quot; | 
| APPROVALPENDING | &quot;ApprovalPending&quot; | 
| REJECTED | &quot;Rejected&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:259.0.0_
