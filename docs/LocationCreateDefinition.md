# LocationCreateDefinition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the Location. Required for creates, not required for updates |  |
| **version** | **Integer** | Current version of the location |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | Current activity status of the location. |  [optional] |
| **path** | **List&lt;String&gt;** | A list of ancestor ids |  [optional] |
| **notes** | **String** | Notes for the location |  [optional] |
| **contactUser** | **String** | The user id of the location contact |  [optional] |
| **emergencyNumber** | [**LocationEmergencyNumber**](LocationEmergencyNumber) | Emergency number for the location |  [optional] |
| **address** | [**LocationAddress**](LocationAddress) | Address of the location |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;active&quot; | 
| DELETED | &quot;deleted&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:224.0.0_
