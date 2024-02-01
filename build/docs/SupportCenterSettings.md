---
title: SupportCenterSettings
---
## SupportCenterSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enabled** | <!----><!---->**Boolean**<!----> | Whether or not knowledge portal (previously support center) is enabled |  |
| **knowledgeBase** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The knowledge base for knowledge portal (previously support center) |  |
| **customMessages** | <!----><!---->[**List&lt;SupportCenterCustomMessage&gt;**](SupportCenterCustomMessage.html)<!----> | Customizable display texts for knowledge portal (previously support center) |  [optional] |
| **routerType** | [**RouterTypeEnum**](#RouterTypeEnum)<!----> | Router type for knowledge portal (previously support center) |  [optional] |
| **screens** | <!----><!---->[**List&lt;SupportCenterScreen&gt;**](SupportCenterScreen.html)<!----> | Available screens for the knowledge portal (previously support center) with its modules |  |
| **enabledCategories** | <!----><!---->[**List&lt;SupportCenterCategory&gt;**](SupportCenterCategory.html)<!----> | Featured categories for knowledge portal (previously support center) home screen |  |
| **styleSetting** | <!----><!---->[**SupportCenterStyleSetting**](SupportCenterStyleSetting.html)<!----> | Style attributes for knowledge portal (previously support center) |  |
| **feedback** | <!----><!---->[**SupportCenterFeedbackSettings**](SupportCenterFeedbackSettings.html)<!----> | Customer feedback settings |  [optional] |
{: class="table table-striped"}


<a name="RouterTypeEnum"></a>

## Enum: RouterTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| HASH | &quot;Hash&quot; | 
| BROWSER | &quot;Browser&quot; | 
{: class="table table-striped"}



