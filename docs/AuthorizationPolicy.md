# AuthorizationPolicy


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **targetResource** | **String** | The targeted resource to which the policy should apply, in the form of domain:entity:action |  [optional] |
| **subject** | [**Subject**](Subject) | The subject to whom the policy will apply, including type and id |  |
| **effect** | [**EffectEnum**](#Enum--EffectEnum) | The effect this policy should have when its conditions are met |  |
| **condition** | **Object** | The condition tree the policy will evaluate |  [optional] |
| **description** | **String** |  |  [optional] |
| **dateModified** | [**Date**](Date) | Date this policy was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **presetAttributes** | [**Map&lt;String, TypedAttribute&gt;**](TypedAttribute) | Map of names and values of preset attributes to use in policy evaluation |  [optional] |
| **active** | **Boolean** | Flag for active enforcement. If this value is false or null, the policy will be saved but will not be checked or enforced on users. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: EffectEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALLOW | &quot;ALLOW&quot; | 
| DENY | &quot;DENY&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:223.0.0_
