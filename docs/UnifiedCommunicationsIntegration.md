# UnifiedCommunicationsIntegration


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **ucIntegrationKey** | [**AddressableEntityRef**](AddressableEntityRef) | ucIntegrationKey |  |
| **integrationPresenceSource** | [**IntegrationPresenceSourceEnum**](#Enum--IntegrationPresenceSourceEnum) | integrationPresenceType |  |
| **pbxPermission** | **String** | pbxPermission |  |
| **icon** | [**UCIcon**](UCIcon) | icon |  |
| **badgeIcons** | [**Map&lt;String, UCIcon&gt;**](UCIcon) | badgeIcon |  |
| **i10n** | [**Map&lt;String, UCI10n&gt;**](UCI10n) | i10n |  |
| **polledPresence** | **Boolean** | polledPresence |  |
| **pollIntervalSec** | **Integer** | pollIntervalSec |  [optional] |
| **includeBadge** | **Boolean** | includeBadge |  [optional] |
| **userPermissions** | **List&lt;String&gt;** | userPermissions |  |
| **oauthScopes** | **List&lt;String&gt;** |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: IntegrationPresenceSourceEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MICROSOFTTEAMS | &quot;MicrosoftTeams&quot; | 
| ZOOMPHONE | &quot;ZoomPhone&quot; | 
| EIGHTBYEIGHT | &quot;EightByEight&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
