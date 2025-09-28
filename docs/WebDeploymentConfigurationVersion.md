# WebDeploymentConfigurationVersion


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The configuration version ID |  [optional] |
| **name** | **String** | The configuration version name |  |
| **version** | **String** | The version of the configuration |  [optional] |
| **headlessMode** | [**WebDeploymentHeadlessMode**](WebDeploymentHeadlessMode) | Headless Mode Support which Controls UI components. When enabled, native UI components will be disabled and allows for custom-built UI. |  [optional] |
| **description** | **String** | The description of the configuration |  [optional] |
| **languages** | **List&lt;String&gt;** | A list of languages supported on the configuration required if the messenger is enabled |  [optional] |
| **defaultLanguage** | **String** | The default language to use for the configuration required if the messenger is enabled |  [optional] |
| **customI18nLabels** | [**List&lt;CustomI18nLabels&gt;**](CustomI18nLabels) | The localization settings for homescreen app |  [optional] |
| **messenger** | [**MessengerSettings**](MessengerSettings) | The settings for messenger |  [optional] |
| **position** | [**PositionSettings**](PositionSettings) | The settings for position |  [optional] |
| **supportCenter** | [**SupportCenterSettings**](SupportCenterSettings) | The settings for knowledge portal (previously support center) |  [optional] |
| **cobrowse** | [**CobrowseSettings**](CobrowseSettings) | The settings for cobrowse |  [optional] |
| **journeyEvents** | [**JourneyEventsSettings**](JourneyEventsSettings) | The settings for journey events |  [optional] |
| **authenticationSettings** | [**AuthenticationSettings**](AuthenticationSettings) | The settings for authenticated deployments |  [optional] |
| **video** | [**VideoSettings**](VideoSettings) | The settings for video |  [optional] |
| **dateCreated** | [**Date**](Date) | The date the configuration version was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The date the configuration version was most recently modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **datePublished** | [**Date**](Date) | The date the configuration version was most recently published. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **lastModifiedUser** | [**AddressableEntityRef**](AddressableEntityRef) | A reference to the user who most recently modified the configuration version |  [optional] |
| **createdUser** | [**AddressableEntityRef**](AddressableEntityRef) | A reference to the user who created the configuration version |  [optional] |
| **publishedUser** | [**AddressableEntityRef**](AddressableEntityRef) | A reference to the user who published the configuration version |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The current status of the configuration version |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| ACTIVE | &quot;Active&quot; | 
| INACTIVE | &quot;Inactive&quot; | 
| ERROR | &quot;Error&quot; | 
| DELETING | &quot;Deleting&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:232.0.0_
