# UserSearchRulePart


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **operation** | [**OperationEnum**](#Enum--OperationEnum) | The operation for this part |  |
| **selector** | [**SelectorEnum**](#Enum--SelectorEnum) | The type of item being selected by this part |  |
| **ids** | **List&lt;String&gt;** | The ids for the selector; the results of these are ORed together |  |


## Enum: OperationEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INCLUDE | &quot;Include&quot; | 
| EXCLUDE | &quot;Exclude&quot; | 


## Enum: SelectorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACDSKILL | &quot;AcdSkill&quot; | 
| USER | &quot;User&quot; | 
| GROUP | &quot;Group&quot; | 
| QUEUE | &quot;Queue&quot; | 
| DIVISION | &quot;Division&quot; | 
| MANAGEMENTUNIT | &quot;ManagementUnit&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
