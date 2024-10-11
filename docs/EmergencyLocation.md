# EmergencyLocation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **address** | [**LocationAddress**](LocationAddress) | Emergency address |  |
| **did** | **String** | Phone number in E164 format |  |
| **source** | [**SourceEnum**](#Enum--SourceEnum) | source |  |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: SourceEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ADMIN | &quot;Admin&quot; | 
| USER | &quot;User&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:211.0.0_
