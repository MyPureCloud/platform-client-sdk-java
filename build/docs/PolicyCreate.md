# PolicyCreate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The policy name. |  |
| **modifiedDate** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdDate** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **order** | **Integer** |  |  [optional] |
| **description** | **String** |  |  [optional] |
| **enabled** | **Boolean** |  |  [optional] |
| **mediaPolicies** | [**MediaPolicies**](MediaPolicies) | Conditions and actions per media type |  [optional] |
| **conditions** | [**PolicyConditions**](PolicyConditions) | Conditions |  [optional] |
| **actions** | [**PolicyActions**](PolicyActions) | Actions |  [optional] |
| **policyErrors** | [**PolicyErrors**](PolicyErrors) |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:233.0.0_
