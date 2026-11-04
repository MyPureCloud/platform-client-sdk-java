# SimilarCustomerIntentResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | Name of the customer intent |  |
| **description** | **String** | Description of the customer intent |  |
| **expiryTime** | **Integer** | Expiry time in hours of the customer intent |  |
| **distance** | **Double** | The distance score indicating similarity (lower is more similar) |  [optional] |
| **category** | [**SimilarEntityRef**](SimilarEntityRef) | The category of the similar customer intent |  [optional] |
| **dateCreated** | [**Date**](Date) | Creation date of the customer intent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:267.0.0_
