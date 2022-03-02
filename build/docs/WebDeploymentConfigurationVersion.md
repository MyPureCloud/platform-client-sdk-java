---
title: WebDeploymentConfigurationVersion
---
## WebDeploymentConfigurationVersion


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The configuration version ID |  [optional] |
| **name** | <!----><!---->**String**<!----> | The configuration version name |  |
| **version** | <!----><!---->**String**<!----> | The version of the configuration |  [optional] |
| **description** | <!----><!---->**String**<!----> | The description of the configuration |  [optional] |
| **languages** | <!----><!---->**List&lt;String&gt;**<!----> | A list of languages supported on the configuration required if the messenger is enabled |  [optional] |
| **defaultLanguage** | <!----><!---->**String**<!----> | The default language to use for the configuration required if the messenger is enabled |  [optional] |
| **messenger** | <!----><!---->[**MessengerSettings**](MessengerSettings.html)<!----> | The settings for messenger |  [optional] |
| **position** | <!----><!---->[**PositionSettings**](PositionSettings.html)<!----> | The settings for position |  [optional] |
| **supportCenter** | <!----><!---->[**SupportCenterSettings**](SupportCenterSettings.html)<!----> | The settings for support center |  [optional] |
| **cobrowse** | <!----><!---->[**CobrowseSettings**](CobrowseSettings.html)<!----> | The settings for cobrowse |  [optional] |
| **journeyEvents** | <!----><!---->[**JourneyEventsSettings**](JourneyEventsSettings.html)<!----> | The settings for journey events |  [optional] |
| **authenticationSettings** | <!----><!---->[**AuthenticationSettings**](AuthenticationSettings.html)<!----> | The settings for authenticated deployments |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | The date the configuration version was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | The date the configuration version was most recently modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **datePublished** | <!----><!---->[**Date**](Date.html)<!----> | The date the configuration version was most recently published. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **lastModifiedUser** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | A reference to the user who most recently modified the configuration version |  [optional] |
| **createdUser** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | A reference to the user who created the configuration version |  [optional] |
| **publishedUser** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | A reference to the user who published the configuration version |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The current status of the configuration version |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| PENDING | &quot;Pending&quot; |
| ACTIVE | &quot;Active&quot; |
| INACTIVE | &quot;Inactive&quot; |
| ERROR | &quot;Error&quot; |
| DELETING | &quot;Deleting&quot; |
{: class="table table-striped"}



