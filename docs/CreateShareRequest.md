# CreateShareRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **sharedEntityType** | [**SharedEntityTypeEnum**](#Enum--SharedEntityTypeEnum) | The share entity type |  |
| **sharedEntity** | [**SharedEntity**](SharedEntity) | The entity that will be shared |  |
| **memberType** | [**MemberTypeEnum**](#Enum--MemberTypeEnum) |  |  [optional] |
| **member** | [**SharedEntity**](SharedEntity) | The member that will have access to this share. Only required if a list of members is not provided. |  [optional] |
| **members** | [**List&lt;CreateShareRequestMember&gt;**](CreateShareRequestMember) |  |  [optional] |


## Enum: SharedEntityTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DOCUMENT | &quot;DOCUMENT&quot; | 


## Enum: MemberTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| USER | &quot;USER&quot; | 
| GROUP | &quot;GROUP&quot; | 
| PUBLIC | &quot;PUBLIC&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
