# DomainNetworkRoute


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **prefix** | **String** | The IPv4 or IPv6 route prefix in CIDR notation. |  [optional] |
| **nexthop** | **String** | The IPv4 or IPv6 nexthop IP address. |  [optional] |
| **persistent** | **Boolean** | True if this route will persist on Edge restart.  Routes assigned by DHCP will be returned as false. |  [optional] |
| **metric** | **Integer** | The metric being used for route. Lower values will have a higher priority. |  [optional] |
| **family** | [**FamilyEnum**](#Enum--FamilyEnum) | The address family for this route. |  [optional] |


## Enum: FamilyEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | -1 | 
| NUMBER_2 | 2 | 
| NUMBER_23 | 23 | 




_com.mypurecloud.sdk.v2:platform-client-v2:218.0.0_
