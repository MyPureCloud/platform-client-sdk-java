# AppleIntegration


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | A unique integration Id. |  |
| **name** | **String** | The name of the Apple messaging integration. |  |
| **supportedContent** | [**SupportedContentReference**](SupportedContentReference) | Defines the SupportedContent profile configured for an integration |  [optional] |
| **messagingSetting** | [**MessagingSettingReference**](MessagingSettingReference) |  |  [optional] |
| **messagesForBusinessId** | **String** | The Apple Messages for Business Id for the Apple messaging integration. |  |
| **businessName** | **String** | The name of the business. |  [optional] |
| **logoUrl** | **String** | The url of the businesses logo. |  [optional] |
| **status** | **String** | The status of the Apple Integration |  [optional] |
| **recipient** | [**DomainEntityRef**](DomainEntityRef) | The recipient associated to the Apple messaging Integration. This recipient is used to associate a flow to an integration |  [optional] |
| **dateCreated** | [**Date**](Date) | Date this Integration was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Date this Integration was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | [**DomainEntityRef**](DomainEntityRef) | User reference that created this Integration |  [optional] |
| **modifiedBy** | [**DomainEntityRef**](DomainEntityRef) | User reference that last modified this Integration |  [optional] |
| **createStatus** | [**CreateStatusEnum**](#Enum--CreateStatusEnum) | Status of asynchronous create operation |  [optional] |
| **createError** | [**ErrorBody**](ErrorBody) | Error information returned, if createStatus is set to Error |  [optional] |
| **appleIMessageApp** | [**AppleIMessageApp**](AppleIMessageApp) | Interactive Application (iMessage App) Settings. |  [optional] |
| **appleAuthentication** | [**AppleAuthentication**](AppleAuthentication) | The Apple Messages for Business authentication setting. |  [optional] |
| **applePay** | [**ApplePay**](ApplePay) | Apple Pay settings. |  [optional] |
| **identityResolution** | [**AppleIdentityResolutionConfig**](AppleIdentityResolutionConfig) | The configuration to control identity resolution. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: CreateStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INITIATED | &quot;Initiated&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:239.0.0_
