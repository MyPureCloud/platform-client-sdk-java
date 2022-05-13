---
title: TimeOffLimit
---
## TimeOffLimit


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **granularity** | [**GranularityEnum**](#GranularityEnum)<!----> | Granularity choice for the time off limit |  [optional] |
| **defaultLimitMinutes** | <!----><!---->**Integer**<!----> | The default time off limit value in minutes per granularity interval |  [optional] |
| **metadata** | <!----><!---->[**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.html)<!----> | Version metadata for the time off limit |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="GranularityEnum"></a>

## Enum: GranularityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DAILY | &quot;Daily&quot; | 
{: class="table table-striped"}



