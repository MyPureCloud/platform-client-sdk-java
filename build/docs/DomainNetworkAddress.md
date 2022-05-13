---
title: DomainNetworkAddress
---
## DomainNetworkAddress


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of address. |  [optional] |
| **address** | <!----><!---->**String**<!----> | An IPv4 or IPv6 IP address. When specifying an address of type \"ip\", use CIDR format for the subnet mask. |  [optional] |
| **persistent** | <!----><!---->**Boolean**<!----> | True if this address will persist on Edge restart.  Addresses assigned by DHCP will be returned as false. |  [optional] |
| **family** | [**FamilyEnum**](#FamilyEnum)<!----> | The address family for this address. |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| IP | &quot;ip&quot; | 
| DNS | &quot;dns&quot; | 
| GATEWAY | &quot;gateway&quot; | 
| TDM | &quot;tdm&quot; | 
{: class="table table-striped"}


<a name="FamilyEnum"></a>

## Enum: FamilyEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | -1 | 
| NUMBER_2 | 2 | 
| NUMBER_23 | 23 | 
{: class="table table-striped"}



