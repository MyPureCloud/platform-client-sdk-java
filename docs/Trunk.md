# Trunk


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the entity. |  |
| **division** | [**Division**](Division) | The division to which this entity belongs. |  [optional] |
| **description** | **String** | The resource's description. |  [optional] |
| **version** | **Integer** | The current version of the resource. |  [optional] |
| **dateCreated** | [**Date**](Date) | The date the resource was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The date of the last modification to the resource. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedBy** | **String** | The ID of the user that last modified the resource. |  [optional] |
| **createdBy** | **String** | The ID of the user that created the resource. |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | Indicates if the resource is active, inactive, or deleted. |  [optional] |
| **modifiedByApp** | **String** | The application that last modified the resource. |  [optional] |
| **createdByApp** | **String** | The application that created the resource. |  [optional] |
| **trunkType** | [**TrunkTypeEnum**](#Enum--TrunkTypeEnum) | The type of this trunk. |  [optional] |
| **edge** | [**DomainEntityRef**](DomainEntityRef) | The Edge using this trunk. |  [optional] |
| **trunkBase** | [**DomainEntityRef**](DomainEntityRef) | The trunk base configuration used on this trunk. |  [optional] |
| **trunkMetabase** | [**DomainEntityRef**](DomainEntityRef) | The metabase used to create this trunk. |  [optional] |
| **edgeGroup** | [**DomainEntityRef**](DomainEntityRef) | The edge group associated with this trunk. |  [optional] |
| **inService** | **Boolean** | True if this trunk is in-service.  This comes from the trunk_enabled property of the referenced trunk base. |  [optional] |
| **enabled** | **Boolean** | True if the Edge used by this trunk is in-service |  [optional] |
| **logicalInterface** | [**DomainEntityRef**](DomainEntityRef) | The Logical Interface on the Edge to which the trunk is assigned. |  [optional] |
| **connectedStatus** | [**TrunkConnectedStatus**](TrunkConnectedStatus) | The connected status of the trunk |  [optional] |
| **optionsStatus** | [**List&lt;TrunkMetricsOptions&gt;**](TrunkMetricsOptions) | The trunk optionsStatus |  [optional] |
| **registersStatus** | [**List&lt;TrunkMetricsRegisters&gt;**](TrunkMetricsRegisters) | The trunk registersStatus |  [optional] |
| **ipStatus** | [**TrunkMetricsNetworkTypeIp**](TrunkMetricsNetworkTypeIp) | The trunk ipStatus |  [optional] |
| **optionsEnabledStatus** | [**OptionsEnabledStatusEnum**](#Enum--OptionsEnabledStatusEnum) | Returns Enabled when the trunk base supports the availability interval and it has a value greater than 0. |  [optional] |
| **registersEnabledStatus** | [**RegistersEnabledStatusEnum**](#Enum--RegistersEnabledStatusEnum) | Returns Enabled when the trunk base supports the registration interval and it has a value greater than 0. |  [optional] |
| **family** | **Integer** | The IP Network Family of the trunk |  [optional] |
| **proxyAddressList** | **List&lt;String&gt;** | The list of proxy addresses (ports if provided) for the trunk |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;active&quot; | 
| INACTIVE | &quot;inactive&quot; | 
| DELETED | &quot;deleted&quot; | 


## Enum: TrunkTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EXTERNAL | &quot;EXTERNAL&quot; | 
| PHONE | &quot;PHONE&quot; | 
| EDGE | &quot;EDGE&quot; | 


## Enum: OptionsEnabledStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ENABLED | &quot;ENABLED&quot; | 
| DISABLED | &quot;DISABLED&quot; | 
| NOT_SUPPORTED | &quot;NOT_SUPPORTED&quot; | 


## Enum: RegistersEnabledStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ENABLED | &quot;ENABLED&quot; | 
| DISABLED | &quot;DISABLED&quot; | 
| NOT_SUPPORTED | &quot;NOT_SUPPORTED&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:237.0.0_
