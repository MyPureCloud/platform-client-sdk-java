---
title: SiteConnection
---
## SiteConnection


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> |  |  [optional] |
| **managed** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Connection method from site to site (Direct, Indirect, CloudProxy |  [optional] |
| **enabled** | <!----><!---->**Boolean**<!----> | Indicates if the current site is linked |  [optional] |
| **mediaModel** | [**MediaModelEnum**](#MediaModelEnum)<!----> | Media model for the current site. |  [optional] |
| **edgeList** | <!----><!---->[**List&lt;ConnectedEdge&gt;**](ConnectedEdge.html)<!----> | All of the edges to which the site connects |  [optional] |
| **coreSite** | <!----><!---->**Boolean**<!----> | The core site |  [optional] |
| **primaryCoreSites** | <!----><!---->[**List&lt;DomainEntityRef&gt;**](DomainEntityRef.html)<!----> | List of site ids names and selfUris for the primary core sites |  [optional] |
| **secondaryCoreSites** | <!----><!---->[**List&lt;DomainEntityRef&gt;**](DomainEntityRef.html)<!----> | List of site ids names and selfUris for the secondary core sites |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DIRECT | &quot;Direct&quot; | 
| INDIRECT | &quot;Indirect&quot; | 
| CLOUDPROXY | &quot;CloudProxy&quot; | 
{: class="table table-striped"}


<a name="MediaModelEnum"></a>

## Enum: MediaModelEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PREMISES | &quot;Premises&quot; | 
| CLOUD | &quot;Cloud&quot; | 
{: class="table table-striped"}



