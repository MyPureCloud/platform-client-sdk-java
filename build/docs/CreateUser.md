# CreateUser


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | User's full name |  |
| **department** | **String** |  |  [optional] |
| **email** | **String** | User's email and username |  |
| **addresses** | [**List&lt;Contact&gt;**](Contact) | Email addresses and phone numbers for this user |  [optional] |
| **title** | **String** |  |  [optional] |
| **password** | **String** | User's password |  [optional] |
| **divisionId** | **String** | The division to which this user will belong |  |
| **state** | [**StateEnum**](#Enum--StateEnum) | Optional initialized state of the user. If not specified, state will be Active if invites are sent, otherwise Inactive. |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;active&quot; | 
| INACTIVE | &quot;inactive&quot; | 
| DELETED | &quot;deleted&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:235.0.0_
