# Contact


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **address** | **String** | Email address or phone number for this contact type |  [optional] |
| **display** | **String** | Formatted version of the address property |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) |  |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) |  |  [optional] |
| **extension** | **String** | Use internal extension instead of address. Mutually exclusive with the address field. |  [optional] |
| **countryCode** | **String** |  |  [optional] |
| **integration** | **String** | Integration tag value if this number is associated with an external integration. |  [optional] |


## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PHONE | &quot;PHONE&quot; | 
| EMAIL | &quot;EMAIL&quot; | 
| SMS | &quot;SMS&quot; | 


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PRIMARY | &quot;PRIMARY&quot; | 
| WORK | &quot;WORK&quot; | 
| WORK2 | &quot;WORK2&quot; | 
| WORK3 | &quot;WORK3&quot; | 
| WORK4 | &quot;WORK4&quot; | 
| HOME | &quot;HOME&quot; | 
| MOBILE | &quot;MOBILE&quot; | 
| MAIN | &quot;MAIN&quot; | 
| OTHER | &quot;OTHER&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:230.0.0_
