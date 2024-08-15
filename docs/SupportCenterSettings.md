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
| **styleSetting** | [**SupportCenterStyleSetting**](SupportCenterStyleSetting) | Style attributes for knowledge portal (previously support center) |  |
| **feedback** | [**SupportCenterFeedbackSettings**](SupportCenterFeedbackSettings) | Customer feedback settings |  [optional] |
{: class="table table-striped"}


## Enum: RouterTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| HASH | &quot;Hash&quot; | 
| BROWSER | &quot;Browser&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:207.0.0_
