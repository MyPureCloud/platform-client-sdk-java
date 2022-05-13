---
title: Organization
---
## Organization


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **defaultLanguage** | <!----><!---->**String**<!----> | The default language for this organization. Example: 'en' |  [optional] |
| **defaultCountryCode** | <!----><!---->**String**<!----> | The default country code for this organization. Example: 'US' |  [optional] |
| **thirdPartyOrgName** | <!----><!---->**String**<!----> | The short name for the organization. This field is globally unique and cannot be changed. |  [optional] |
| **thirdPartyURI** | <!----><!---->**String**<!----> |  |  [optional] |
| **domain** | <!----><!---->**String**<!----> |  |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | The current version of the organization. |  |
| **state** | [**StateEnum**](#StateEnum)<!----> | The current state. Examples are active, inactive, deleted. |  [optional] |
| **defaultSiteId** | <!----><!---->**String**<!----> |  |  [optional] |
| **supportURI** | <!----><!---->**String**<!----> | Email address where support tickets are sent to. |  [optional] |
| **voicemailEnabled** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **productPlatform** | [**ProductPlatformEnum**](#ProductPlatformEnum)<!----> | Organizations Originating Platform. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
| **features** | <!----><!---->**Map&lt;String, Boolean&gt;**<!----> | The state of features available for the organization. |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;active&quot; | 
| INACTIVE | &quot;inactive&quot; | 
| DELETED | &quot;deleted&quot; | 
{: class="table table-striped"}


<a name="ProductPlatformEnum"></a>

## Enum: ProductPlatformEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GENESYSCLOUD | &quot;GenesysCloud&quot; | 
| PURECLOUD | &quot;PureCloud&quot; | 
| PUREENGAGE | &quot;PureEngage&quot; | 
| PUREENGAGECLOUD | &quot;PureEngageCloud&quot; | 
| PURECONNECT | &quot;PureConnect&quot; | 
| PURECONNECTCLOUD | &quot;PureConnectCloud&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}



