# AuthorizationSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **analysisEnabled** | **Boolean** | Boolean showing if organization is opted in or not to unused role/perm analysis |  [optional] |
| **analysisDays** | **Integer** | Integer number of days to analyze user usage |  [optional] |
| **dateLastCalculated** | [**Date**](Date) | The date and time of the most recent unused role calculation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateLastActive** | [**LocalDate**](LocalDate) | The date of the most recent org activity used for analysis. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
