# NluDomain


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the NLU domain. |  |
| **language** | **String** | The language culture of the NLU domain, e.g. `en-us`, `de-de`. |  [optional] |
| **draftVersion** | [**NluDomainVersion**](NluDomainVersion) | The draft version of that NLU domain. |  [optional] |
| **lastPublishedVersion** | [**NluDomainVersion**](NluDomainVersion) | The last published version of that NLU domain. |  [optional] |
| **dateCreated** | [**Date**](Date) | The date when the NLU domain was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The date when the NLU domain was updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **engineVersion** | **String** | The version of the NLU engine to use. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
