---
title: UCIntegration
---
## UCIntegration


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **ucIntegrationKey** | <!----><!---->**String**<!----> | ucIntegrationKey |  |
| **integrationPresenceSource** | [**IntegrationPresenceSourceEnum**](#IntegrationPresenceSourceEnum)<!----> | integrationPresenceType |  |
| **pbxPermission** | <!----><!---->**String**<!----> | pbxPermission |  |
| **icon** | <!----><!---->[**UCIcon**](UCIcon.html)<!----> | icon |  |
| **i10n** | <!----><!---->[**Map&lt;String, UCI10n&gt;**](UCI10n.html)<!----> | i10n |  |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="IntegrationPresenceSourceEnum"></a>

## Enum: IntegrationPresenceSourceEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| MICROSOFTTEAMS | &quot;MicrosoftTeams&quot; |
| ZOOMPHONE | &quot;ZoomPhone&quot; |
| RINGCENTRAL | &quot;RingCentral&quot; |
{: class="table table-striped"}



