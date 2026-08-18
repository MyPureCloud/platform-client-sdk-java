# EngagementFilter


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | The comparison operator for engagement metric filtering. |  |
| **from** | **Integer** | The inclusive lower bound of the engagement metric count. Required when operator is Between, not allowed otherwise. |  [optional] |
| **to** | **Integer** | The inclusive upper bound of the engagement metric count. Required when operator is Between, not allowed otherwise. |  [optional] |
| **value** | **Integer** | The engagement metric count to compare against. Required for every operator except Between, not allowed for Between. |  [optional] |


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EQUALTO | &quot;EqualTo&quot; | 
| GREATERTHAN | &quot;GreaterThan&quot; | 
| GREATERTHANOREQUALTO | &quot;GreaterThanOrEqualTo&quot; | 
| LESSTHAN | &quot;LessThan&quot; | 
| LESSTHANOREQUALTO | &quot;LessThanOrEqualTo&quot; | 
| BETWEEN | &quot;Between&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:260.0.0_
