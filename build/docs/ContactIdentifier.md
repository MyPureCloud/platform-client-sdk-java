# ContactIdentifier


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of this identifier |  |
| **value** | **String** | The string value of the identifier. Will vary in syntax by type. |  |
| **dateCreated** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SOCIALLINE | &quot;SocialLine&quot; | 
| SOCIALFACEBOOK | &quot;SocialFacebook&quot; | 
| SOCIALTWITTER | &quot;SocialTwitter&quot; | 
| SOCIALWHATSAPP | &quot;SocialWhatsapp&quot; | 
| EMAIL | &quot;Email&quot; | 
| PHONE | &quot;Phone&quot; | 
| COOKIE | &quot;Cookie&quot; | 
| EXTERNALID | &quot;ExternalId&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
