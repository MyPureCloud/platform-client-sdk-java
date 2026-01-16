# SupportCenterSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enabled** | **Boolean** | Whether or not knowledge portal (previously support center) is enabled |  |
| **knowledgeBase** | [**AddressableEntityRef**](AddressableEntityRef) | The knowledge base for knowledge portal (previously support center) |  |
| **customMessages** | [**List&lt;SupportCenterCustomMessage&gt;**](SupportCenterCustomMessage) | Customizable display texts for knowledge portal (previously support center) |  [optional] |
| **routerType** | [**RouterTypeEnum**](#Enum--RouterTypeEnum) | Router type for knowledge portal (previously support center) |  [optional] |
| **screens** | [**List&lt;SupportCenterScreen&gt;**](SupportCenterScreen) | Available screens for the knowledge portal (previously support center) with its modules |  |
| **enabledCategories** | [**List&lt;SupportCenterCategory&gt;**](SupportCenterCategory) | Featured categories for knowledge portal (previously support center) home screen |  |
| **labelFilter** | [**SupportCenterLabelFilter**](SupportCenterLabelFilter) | Document label filter. If set, only documents having at least one of the specified labels will be returned by knowledge document query operations. |  [optional] |
| **styleSetting** | [**SupportCenterStyleSetting**](SupportCenterStyleSetting) | Style attributes for knowledge portal (previously support center) |  |
| **feedback** | [**SupportCenterFeedbackSettings**](SupportCenterFeedbackSettings) | Customer feedback settings |  [optional] |


## Enum: RouterTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| HASH | &quot;Hash&quot; | 
| BROWSER | &quot;Browser&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:244.0.0_
