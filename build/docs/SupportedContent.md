# SupportedContent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | A unique supported content Id. |  |
| **name** | **String** | The name of the supported content profile |  |
| **dateCreated** | [**Date**](Date) | Date this supported content profile was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Date this supported content profile was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | [**DomainEntityRef**](DomainEntityRef) | User reference that created this supported content profile |  [optional] |
| **modifiedBy** | [**DomainEntityRef**](DomainEntityRef) | User reference that modified this supported content profile |  [optional] |
| **version** | **Integer** | Version number |  [optional] |
| **mediaTypes** | [**MediaTypes**](MediaTypes) | Defines the allowable media that may be accepted for an inbound message or to be sent in an outbound message. The following is an example of allowing all inbound media, and for outbound all images and only mpeg video: {   \"mediaTypes\": {     \"allow\": {       \"inbound\": [{\"type\": \"*\\/\\*\"}],       \"outbound\": [{\"type\": \"image/*\"}, {\"type\": \"video/mpeg\"}]     }   } } |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
