# CallForwarding


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **user** | [**User**](User) |  |  [optional] |
| **enabled** | **Boolean** | Whether or not CallForwarding is enabled |  [optional] |
| **phoneNumber** | **String** | This property is deprecated. Please use the calls property |  [optional] |
| **calls** | [**List&lt;CallRoute&gt;**](CallRoute) | An ordered list of CallRoutes to be executed when CallForwarding is enabled |  [optional] |
| **voicemail** | [**VoicemailEnum**](#Enum--VoicemailEnum) | The type of voicemail to use with the callForwarding configuration |  [optional] |
| **modifiedDate** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: VoicemailEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PURECLOUD | &quot;PURECLOUD&quot; | 
| LASTCALL | &quot;LASTCALL&quot; | 
| NONE | &quot;NONE&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
