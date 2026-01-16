# OrganizationPublicApiUsage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **date** | [**LocalDate**](LocalDate) | The date of the usage. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **platform** | **String** | The platform the request(s) is/were made on. |  [optional] |
| **httpMethod** | [**HttpMethodEnum**](#Enum--HttpMethodEnum) | The http method of the request(s) |  [optional] |
| **templateUri** | **String** | The templateUri of the request(s). |  [optional] |
| **requestCount** | **Long** | The total number of requests. |  [optional] |
| **status200** | **Long** | The number of requests resulting in a 2xx HTTP status code. |  [optional] |
| **status300** | **Long** | The number of requests resulting in a 3xx HTTP status code. |  [optional] |
| **status400** | **Long** | The number of requests resulting in a 4xx HTTP status code. |  [optional] |
| **status429** | **Long** | The number of requests resulting in a 429 HTTP status code. |  [optional] |
| **status500** | **Long** | The number of requests resulting in a 5xx HTTP status code. |  [optional] |
| **oauthClient** | [**DomainEntityRef**](DomainEntityRef) | The id of the oauthClient that made the request(s). |  [optional] |
| **user** | [**UserReference**](UserReference) | The id of the user who made the request(s). |  [optional] |


## Enum: HttpMethodEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GET | &quot;GET&quot; | 
| POST | &quot;POST&quot; | 
| PUT | &quot;PUT&quot; | 
| PATCH | &quot;PATCH&quot; | 
| DELETE | &quot;DELETE&quot; | 
| HEAD | &quot;HEAD&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:244.0.0_
