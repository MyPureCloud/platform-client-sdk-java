# DomainNetworkAddress


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of address. |  [optional] |
| **address** | **String** | An IPv4 or IPv6 IP address. When specifying an address of type \"ip\", use CIDR format for the subnet mask. |  [optional] |
| **persistent** | **Boolean** | True if this address will persist on Edge restart.  Addresses assigned by DHCP will be returned as false. |  [optional] |
| **family** | [**FamilyEnum**](#Enum--FamilyEnum) | The address family for this address. |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| IP | &quot;ip&quot; | 
| DNS | &quot;dns&quot; | 
| GATEWAY | &quot;gateway&quot; | 
| TDM | &quot;tdm&quot; | 


## Enum: FamilyEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | -1 | 
| NUMBER_2 | 2 | 
| NUMBER_23 | 23 | 




_com.mypurecloud.sdk.v2:platform-client-v2:211.0.0_
