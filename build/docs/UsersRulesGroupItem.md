# UsersRulesGroupItem


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The internal ID for this group |  [optional] |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | The operator for this group |  |
| **container** | [**ContainerEnum**](#Enum--ContainerEnum) | The container that the ids belong to |  |
| **values** | [**List&lt;UsersRulesValue&gt;**](UsersRulesValue) | The ids and contextIds to select for this group |  |


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AND | &quot;And&quot; | 
| NOT | &quot;Not&quot; | 


## Enum: ContainerEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACDSKILL | &quot;AcdSkill&quot; | 
| BUSINESSUNIT | &quot;BusinessUnit&quot; | 
| DIRECTORYGROUP | &quot;DirectoryGroup&quot; | 
| DIVISION | &quot;Division&quot; | 
| LANGUAGE | &quot;Language&quot; | 
| LOCATION | &quot;Location&quot; | 
| MANAGEMENTUNIT | &quot;ManagementUnit&quot; | 
| QUEUE | &quot;Queue&quot; | 
| REPORTSTO | &quot;ReportsTo&quot; | 
| STAFFINGGROUP | &quot;StaffingGroup&quot; | 
| TEAM | &quot;Team&quot; | 
| USER | &quot;User&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:239.0.0_
