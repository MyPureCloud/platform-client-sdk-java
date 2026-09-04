# RoutingSkill


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the skill. |  |
| **division** | [**Division**](Division) | The id of the division this skill belongs to. |  [optional] |
| **dateModified** | [**Date**](Date) | Date last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | The current state for this skill. |  [optional] |
| **version** | **String** | Required when updating. Version must be the current version. Only the system can assign version. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;active&quot; | 
| INACTIVE | &quot;inactive&quot; | 
| DELETED | &quot;deleted&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:262.0.0_
