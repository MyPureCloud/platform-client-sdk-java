---
title: UnifiedCommunicationsIntegration
---
## UnifiedCommunicationsIntegration


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **ucIntegrationKey** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | ucIntegrationKey |  |
| **integrationPresenceSource** | [**IntegrationPresenceSourceEnum**](#IntegrationPresenceSourceEnum)<!----> | integrationPresenceType |  |
| **pbxPermission** | <!----><!---->**String**<!----> | pbxPermission |  |
| **icon** | <!----><!---->[**UCIcon**](UCIcon.html)<!----> | icon |  |
| **badgeIcons** | <!----><!---->[**Map&lt;String, UCIcon&gt;**](UCIcon.html)<!----> | badgeIcon |  |
| **i10n** | <!----><!---->[**Map&lt;String, UCI10n&gt;**](UCI10n.html)<!----> | i10n |  |
| **polledPresence** | <!----><!---->**Boolean**<!----> | polledPresence |  |
| **pollIntervalSec** | <!----><!---->**Integer**<!----> | pollIntervalSec |  [optional] |
| **userPermissions** | <!----><!---->**List&lt;String&gt;**<!----> | userPermissions |  |
| **oauthScopes** | <!----><!---->**List&lt;String&gt;**<!----> |  |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="IntegrationPresenceSourceEnum"></a>

## Enum: IntegrationPresenceSourceEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MICROSOFTTEAMS | &quot;MicrosoftTeams&quot; | 
| ZOOMPHONE | &quot;ZoomPhone&quot; | 
| EIGHTBYEIGHT | &quot;EightByEight&quot; | 
{: class="table table-striped"}



