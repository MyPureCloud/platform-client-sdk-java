# CobrowseSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enabled** | **Boolean** | Whether or not cobrowse is enabled |  [optional] |
| **allowAgentControl** | **Boolean** | Whether the viewer should have option to request control |  [optional] |
| **allowAgentNavigation** | **Boolean** | Whether the viewer should have option to request navigation |  [optional] |
| **allowDraw** | **Boolean** | Should cobrowse draw be enabled |  [optional] |
| **maskSelectors** | **List&lt;String&gt;** | Mask patterns that will apply to pages being shared |  [optional] |
| **channels** | [**List<ChannelsEnum>**](#Enum--ChannelsEnum) | Cobrowse channels for web messenger |  [optional] |
| **readonlySelectors** | **List&lt;String&gt;** | Readonly patterns that will apply to pages being shared |  [optional] |
| **pauseCriteria** | [**List&lt;PauseCriteria&gt;**](PauseCriteria) | Pause criteria that will pause cobrowse if some of them are met in the user's URL |  [optional] |


## Enum: ChannelsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| WEBMESSAGING | &quot;Webmessaging&quot; |
| VOICE | &quot;Voice&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:227.0.0_
