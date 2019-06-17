---
title: ScimMetadata
---
## ScimMetadata


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) | Resource type |  [optional] |
| **lastModified** | [**Date**](Date.html) | Last Modified ISO6501 (UTC). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **location** | **String** | URI location of resource |  [optional] |
| **version** | **String** | ETag version of resource [RFC7232] |  [optional] |
{: class="table table-striped"}


<a name="ResourceTypeEnum"></a>

## Enum: ResourceTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| USER | &quot;User&quot; |
| GROUP | &quot;Group&quot; |
| SERVICEPROVIDERCONFIG | &quot;ServiceProviderConfig&quot; |
{: class="table table-striped"}



