---
title: ScimMetadata
---
## ScimMetadata


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum)<!----> | The type of SCIM resource. |  [optional] |
| **lastModified** | <!----><!---->[**Date**](Date.html)<!----> | The last time that the resource was modified. Date time is represented as an \"ISO-8601 string\", for example, yyyy-MM-ddTHH:mm:ss.SSSZ. Not included with \"Schema\" and \"ResourceType\" resources. |  [optional] |
| **location** | <!----><!---->**String**<!----> | The URI of the resource. |  [optional] |
| **version** | <!----><!---->**String**<!----> | The version of the resource. Matches the ETag HTTP response header. Not included with \"Schema\" and \"ResourceType\" resources. |  [optional] |
{: class="table table-striped"}


<a name="ResourceTypeEnum"></a>

## Enum: ResourceTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| USER | &quot;User&quot; | 
| GROUP | &quot;Group&quot; | 
| SERVICEPROVIDERCONFIG | &quot;ServiceProviderConfig&quot; | 
| RESOURCETYPE | &quot;ResourceType&quot; | 
| SCHEMA | &quot;Schema&quot; | 
{: class="table table-striped"}



