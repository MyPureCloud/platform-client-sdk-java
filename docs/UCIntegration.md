# UCIntegration


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **ucIntegrationKey** | **String** | ucIntegrationKey |  |
| **integrationPresenceSource** | [**IntegrationPresenceSourceEnum**](#Enum--IntegrationPresenceSourceEnum) | integrationPresenceType |  |
| **pbxPermission** | **String** | pbxPermission |  |
| **icon** | [**UCIcon**](UCIcon) | icon |  |
| **badgeIcons** | [**Map&lt;String, UCIcon&gt;**](UCIcon) | badgeIcon |  |
| **i10n** | [**Map&lt;String, UCI10n&gt;**](UCI10n) | i10n |  |
| **polledPresence** | **Boolean** | polledPresence |  |
| **userPermissions** | **List&lt;String&gt;** | userPermissions |  |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


## Enum: IntegrationPresenceSourceEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MICROSOFTTEAMS | &quot;MicrosoftTeams&quot; | 
| ZOOMPHONE | &quot;ZoomPhone&quot; | 
| EIGHTBYEIGHT | &quot;EightByEight&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:207.0.0_
