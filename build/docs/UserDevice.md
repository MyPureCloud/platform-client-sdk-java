# UserDevice


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **deviceToken** | **String** | device token sent by mobile clients. |  |
| **notificationId** | **String** | notification id of the device. |  |
| **make** | **String** | make of the device. |  |
| **model** | **String** | Device model |  |
| **acceptNotifications** | **Boolean** | if the device accepts notifications |  |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | type of the device; ios or android |  |
| **sessionHash** | **String** |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ANDROID | &quot;android&quot; | 
| IOS | &quot;ios&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:209.0.1_
