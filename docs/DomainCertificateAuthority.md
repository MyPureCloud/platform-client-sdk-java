# DomainCertificateAuthority


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the entity. |  |
| **division** | [**Division**](Division) | The division to which this entity belongs. |  [optional] |
| **description** | **String** | The resource's description. |  [optional] |
| **version** | **Integer** | The current version of the resource. |  [optional] |
| **dateCreated** | [**Date**](Date) | The date the resource was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The date of the last modification to the resource. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedBy** | **String** | The ID of the user that last modified the resource. |  [optional] |
| **createdBy** | **String** | The ID of the user that created the resource. |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | Indicates if the resource is active, inactive, or deleted. |  [optional] |
| **modifiedByApp** | **String** | The application that last modified the resource. |  [optional] |
| **createdByApp** | **String** | The application that created the resource. |  [optional] |
| **certificate** | **String** | The authorities signed X509 PEM encoded certificate. |  |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The certificate authorities type.  Managed certificate authorities are generated and maintained by Interactive Intelligence.  These are read-only and not modifiable by clients.  Remote authorities are customer managed. |  |
| **services** | [**List<ServicesEnum>**](#Enum--ServicesEnum) | The service(s) that the authority can be used to authenticate. |  |
| **certificateDetails** | [**List&lt;CertificateDetails&gt;**](CertificateDetails) | The details of the parsed certificate(s). |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;active&quot; | 
| INACTIVE | &quot;inactive&quot; | 
| DELETED | &quot;deleted&quot; | 


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MANAGED | &quot;MANAGED&quot; | 
| REMOTE | &quot;REMOTE&quot; | 


## Enum: ServicesEnum

| Name | Value |
| ---- | ----- |
| SIP | &quot;SIP&quot; |
| PROVISION | &quot;PROVISION&quot; |
| PROVISION_PHONE | &quot;PROVISION_PHONE&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:209.1.0_
