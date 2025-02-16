# MemberGroup


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **division** | [**WritableDivision**](WritableDivision) | The division to which this entity belongs. |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The group type |  [optional] |
| **memberCount** | **Integer** | The number of members in this group |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TEAM | &quot;TEAM&quot; | 
| GROUP | &quot;GROUP&quot; | 
| SKILLGROUP | &quot;SKILLGROUP&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:220.0.0_
