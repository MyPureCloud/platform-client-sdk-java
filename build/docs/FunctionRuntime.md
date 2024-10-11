# FunctionRuntime


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | Name of the function runtime. |  [optional] |
| **description** | **String** | Description of function runtime. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Availability status of runtime |  [optional] |
| **dateEndOfLife** | [**LocalDate**](LocalDate) | Optional end of life date. Present if the status is Deprecated. Date represents when support for runtime can no longer be guaranteed. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AVAILABLE | &quot;Available&quot; | 
| DEPRECATED | &quot;Deprecated&quot; | 
| UNAVAILABLE | &quot;Unavailable&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:211.0.0_
