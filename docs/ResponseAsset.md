# ResponseAsset


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **division** | [**Division**](Division) | The division to which this entity belongs. |  [optional] |
| **contentLength** | **Long** | response asset size in bytes |  [optional] |
| **contentLocation** | **String** | response asset location. |  [optional] |
| **contentType** | **String** | MIME type of response asset |  [optional] |
| **dateCreated** | [**Date**](Date) | Created date of the response asset. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | [**DomainEntityRef**](DomainEntityRef) | User who created the response asset |  [optional] |
| **dateModified** | [**Date**](Date) | Last modified date of the response asset. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedBy** | [**DomainEntityRef**](DomainEntityRef) | User who last modified the response asset |  [optional] |
| **responses** | [**List&lt;DomainEntityRef&gt;**](DomainEntityRef) | Canned responses actively using this asset |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
