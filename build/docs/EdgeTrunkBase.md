# EdgeTrunkBase


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
| **trunkMetabase** | [**DomainEntityRef**](DomainEntityRef) | The meta-base this trunk is based on. |  |
| **properties** | **Map&lt;String, Object&gt;** |  |  [optional] |
| **trunkType** | [**TrunkTypeEnum**](#Enum--TrunkTypeEnum) | The type of this trunk base. |  |
| **site** | [**DomainEntityRef**](DomainEntityRef) | Used to determine the media regions for inbound and outbound calls through a trunk. Also determines the dial plan to use for calls that came in on a trunk and have to be sent out on it as well. |  [optional] |
| **inboundSite** | [**DomainEntityRef**](DomainEntityRef) | Allows a customer to set the site to which inbound calls will be routed |  [optional] |
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




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
