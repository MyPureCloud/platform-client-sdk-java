# CreateShareResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **sharedEntityType** | [**SharedEntityTypeEnum**](#Enum--SharedEntityTypeEnum) |  |  [optional] |
| **sharedEntity** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **memberType** | [**MemberTypeEnum**](#Enum--MemberTypeEnum) |  |  [optional] |
| **member** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **sharedBy** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **workspace** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **succeeded** | [**List&lt;Share&gt;**](Share) |  |  [optional] |
| **failed** | [**List&lt;Share&gt;**](Share) |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:229.1.0_
