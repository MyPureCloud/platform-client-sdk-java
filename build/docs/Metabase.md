# Metabase


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the entity. |  |
| **division** | [**Division**](Division) | The division to which this entity belongs. |  [optional] |
| **description** | **String** |  |  [optional] |
| **version** | **Integer** | The current version of the resource. |  [optional] |
| **dateCreated** | [**Date**](Date) | The date the resource was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The date of the last modification to the resource. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedBy** | **String** | The ID of the user that last modified the resource. |  [optional] |
| **createdBy** | **String** | The ID of the user that created the resource. |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | Indicates if the resource is active, inactive, or deleted. |  [optional] |
| **modifiedByApp** | **String** | The application that last modified the resource. |  [optional] |
| **createdByApp** | **String** | The application that created the resource. |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;active&quot; | 
| INACTIVE | &quot;inactive&quot; | 
| DELETED | &quot;deleted&quot; | 


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EXTERNAL | &quot;EXTERNAL&quot; | 
| EXTERNAL_PCV | &quot;EXTERNAL_PCV&quot; | 
| EXTERNAL_PCV_AWS | &quot;EXTERNAL_PCV_AWS&quot; | 
| EXTERNAL_BYOC_CARRIER | &quot;EXTERNAL_BYOC_CARRIER&quot; | 
| EXTERNAL_BYOC_PBX | &quot;EXTERNAL_BYOC_PBX&quot; | 
| STATION_CDM | &quot;STATION_CDM&quot; | 
| STATION_CDM_WEBRTC | &quot;STATION_CDM_WEBRTC&quot; | 
| STATION | &quot;STATION&quot; | 
| TIE | &quot;TIE&quot; | 
| TIE_DIRECT | &quot;TIE_DIRECT&quot; | 
| TIE_INDIRECT | &quot;TIE_INDIRECT&quot; | 
| TIE_CLOUD_PROXY | &quot;TIE_CLOUD_PROXY&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
