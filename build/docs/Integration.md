---
title: Integration
---
## Integration


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the integration, used to distinguish this integration from others of the same type. |  [optional] |
| **integrationType** | <!----><!---->[**IntegrationType**](IntegrationType.html)<!----> | Type of the integration |  [optional] |
| **notes** | <!----><!---->**String**<!----> | Notes about the integration. |  [optional] |
| **intendedState** | [**IntendedStateEnum**](#IntendedStateEnum)<!----> | Configured state of the integration. |  |
| **config** | <!----><!---->[**IntegrationConfigurationInfo**](IntegrationConfigurationInfo.html)<!----> | Configuration information for the integration. |  [optional] |
| **reportedState** | <!----><!---->[**IntegrationStatusInfo**](IntegrationStatusInfo.html)<!----> | Last reported status of the integration. |  [optional] |
| **attributes** | <!----><!---->**Map&lt;String, String&gt;**<!----> | Read-only attributes for the integration. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="IntendedStateEnum"></a>

## Enum: IntendedStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ENABLED | &quot;ENABLED&quot; | 
| DISABLED | &quot;DISABLED&quot; | 
| DELETED | &quot;DELETED&quot; | 
{: class="table table-striped"}



