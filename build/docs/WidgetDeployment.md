---
title: WidgetDeployment
---
## WidgetDeployment


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **description** | <!----><!---->**String**<!----> | A human-readable description of this Deployment. |  [optional] |
| **authenticationRequired** | <!----><!---->**Boolean**<!----> | When true, the customer members starting a chat must be authenticated by supplying their JWT to the create operation. |  [optional] |
| **disabled** | <!----><!---->**Boolean**<!----> | When true, all create chat operations using this Deployment will be rejected. |  [optional] |
| **flow** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The URI of the Inbound Chat Flow to run when new chats are initiated under this Deployment. |  [optional] |
| **allowedDomains** | <!----><!---->**List&lt;String&gt;**<!----> | The list of domains that are approved to use this Deployment; the list will be added to CORS headers for ease of web use. |  [optional] |
| **clientType** | [**ClientTypeEnum**](#ClientTypeEnum)<!----> | The type of display widget for which this Deployment is configured, which controls the administrator settings shown. |  [optional] |
| **clientConfig** | <!----><!---->[**WidgetClientConfig**](WidgetClientConfig.html)<!----> | The client configuration options that should be made available to the clients of this Deployment. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="ClientTypeEnum"></a>

## Enum: ClientTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| V1 | &quot;v1&quot; | 
| V2 | &quot;v2&quot; | 
| V1_HTTP | &quot;v1-http&quot; | 
| THIRD_PARTY | &quot;third-party&quot; | 
{: class="table table-striped"}



