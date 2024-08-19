# Library


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The library name. |  |
| **version** | **Integer** | Current version for this resource. |  [optional] |
| **createdBy** | [**User**](User) | User that created the library. |  [optional] |
| **dateCreated** | [**Date**](Date) | The date and time the response was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **responseType** | [**ResponseTypeEnum**](#Enum--ResponseTypeEnum) | This value is deprecated. Responses representing message templates may be added to any library. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


## Enum: ResponseTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MESSAGINGTEMPLATE | &quot;MessagingTemplate&quot; | 
| CAMPAIGNSMSTEMPLATE | &quot;CampaignSmsTemplate&quot; | 
| CAMPAIGNEMAILTEMPLATE | &quot;CampaignEmailTemplate&quot; | 
| FOOTER | &quot;Footer&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
