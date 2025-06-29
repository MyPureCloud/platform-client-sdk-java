# InstagramIntegration


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | A unique Integration ID. |  |
| **name** | **String** | The name of the Instagram Integration |  |
| **supportedContent** | [**SupportedContentReference**](SupportedContentReference) | Defines the SupportedContent profile configured for an integration |  [optional] |
| **messagingSetting** | [**MessagingSettingReference**](MessagingSettingReference) |  |  [optional] |
| **appId** | **String** | The App ID from Facebook |  |
| **pageId** | **String** | The Page ID from Instagram messenger |  [optional] |
| **instagramId** | **String** | The ID from Instagram messenger |  [optional] |
| **instagramUsername** | **String** | The Username from Instagram messenger |  [optional] |
| **instagramName** | **String** | The name from Instagram messenger |  [optional] |
| **instagramProfileImageUrl** | **String** | The url of the profile image from Instagram messenger |  [optional] |
| **status** | **String** | The status of the Instagram Integration |  [optional] |
| **recipient** | [**DomainEntityRef**](DomainEntityRef) | The recipient reference associated to the Instagram Integration. This recipient is used to associate a flow to an integration |  [optional] |
| **dateCreated** | [**Date**](Date) | Date this Integration was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Date this Integration was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | [**DomainEntityRef**](DomainEntityRef) | User reference that created this Integration |  [optional] |
| **modifiedBy** | [**DomainEntityRef**](DomainEntityRef) | User reference that last modified this Integration |  [optional] |
| **version** | **Integer** | Version number required for updates. |  |
| **createStatus** | [**CreateStatusEnum**](#Enum--CreateStatusEnum) | Status of asynchronous create operation |  [optional] |
| **createError** | [**ErrorBody**](ErrorBody) | Error information returned, if createStatus is set to Error |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: CreateStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INITIATED | &quot;Initiated&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
