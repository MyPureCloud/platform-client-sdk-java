# Recipient


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **flow** | [**Flow**](Flow) | An automate flow object which defines the set of actions to be taken, when a message is received by this recipient. |  [optional] |
| **dateCreated** | [**Date**](Date) | Date this recipient was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Date this recipient was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | [**User**](User) | User that created this recipient |  [optional] |
| **modifiedBy** | [**User**](User) | User that modified this recipient |  [optional] |
| **messengerType** | [**MessengerTypeEnum**](#Enum--MessengerTypeEnum) | The messenger type for this recipient |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: MessengerTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SMS | &quot;sms&quot; | 
| FACEBOOK | &quot;facebook&quot; | 
| TWITTER | &quot;twitter&quot; | 
| WHATSAPP | &quot;whatsapp&quot; | 
| WEBMESSAGING | &quot;webmessaging&quot; | 
| INSTAGRAM | &quot;instagram&quot; | 
| OPEN | &quot;open&quot; | 
| APPLE | &quot;apple&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.0.0_
