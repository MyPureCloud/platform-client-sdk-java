---
title: SupportCenterSettings
---
## SupportCenterSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enabled** | <!----><!---->**Boolean**<!----> | Whether or not support center is enabled |  [optional] |
| **knowledgeBase** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The knowledge base for support center |  [optional] |
| **customMessages** | <!----><!---->[**List&lt;SupportCenterCustomMessage&gt;**](SupportCenterCustomMessage.html)<!----> | Customizable display texts for support center |  [optional] |
| **routerType** | [**RouterTypeEnum**](#RouterTypeEnum)<!----> | Router type for support center |  [optional] |
| **screens** | <!----><!---->[**List&lt;SupportCenterScreen&gt;**](SupportCenterScreen.html)<!----> | Available screens for the support center with its modules |  [optional] |
| **enabledCategories** | <!----><!---->[**List&lt;AddressableEntityRef&gt;**](AddressableEntityRef.html)<!----> | Enabled article categories for support center |  [optional] |
| **styleSetting** | <!----><!---->[**SupportCenterStyleSetting**](SupportCenterStyleSetting.html)<!----> | Style attributes for support center |  [optional] |
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



