# DefaultGreetingList


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **owner** | [**GreetingOwner**](GreetingOwner) |  |  [optional] |
| **ownerType** | [**OwnerTypeEnum**](#Enum--OwnerTypeEnum) |  |  [optional] |
| **greetings** | [**Map&lt;String, Greeting&gt;**](Greeting) |  |  [optional] |
| **createdDate** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | **String** |  |  [optional] |
| **modifiedDate** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedBy** | **String** |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: OwnerTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| USER | &quot;USER&quot; | 
| ORGANIZATION | &quot;ORGANIZATION&quot; | 
| GROUP | &quot;GROUP&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
