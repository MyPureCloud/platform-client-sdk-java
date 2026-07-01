# RatingFilter


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | The comparison operator for review rating filtering. |  |
| **from** | **Integer** | The lower bound for the Between operator |  [optional] |
| **to** | **Integer** | The upper bound for the Between operator |  [optional] |
| **values** | **List&lt;Integer&gt;** | One or more rating values to filter by |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:257.0.0_
