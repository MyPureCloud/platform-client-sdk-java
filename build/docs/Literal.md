# Literal


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **string** | **String** | A string value |  [optional] |
| **integer** | **Integer** | An integer value |  [optional] |
| **number** | **Double** | A decimal value |  [optional] |
| **date** | [**LocalDate**](LocalDate) | A date value, must be in the format of yyyy-MM-dd, e.g. 2024-09-23. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **datetime** | [**Date**](Date) | A date time value, must be in the format of yyyy-MM-dd'T'HH:mm:ss.SSSZ, e.g. 2024-10-02T01:01:01.111Z. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **special** | [**SpecialEnum**](#Enum--SpecialEnum) | A special value enum, such as Wildcard, Null, etc |  [optional] |
| **_boolean** | **Boolean** | A boolean value |  [optional] |


## Enum: SpecialEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| WILDCARD | &quot;Wildcard&quot; | 
| NULL | &quot;Null&quot; | 
| EMPTY | &quot;Empty&quot; | 
| CURRENTTIME | &quot;CurrentTime&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:227.0.0_
