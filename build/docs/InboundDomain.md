---
title: InboundDomain
---
## InboundDomain


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | Unique Id of the domain such as: example.com |  [optional] |
| **name** | **String** |  |  [optional] |
| **mxRecordStatus** | [**MxRecordStatusEnum**](#MxRecordStatusEnum) | Mx Record Status |  |
| **subDomain** | **Boolean** | Indicates if this a PureCloud sub-domain.  If true, then the appropriate DNS records are created for sending/receiving email. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="MxRecordStatusEnum"></a>

## Enum: MxRecordStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| VALID | &quot;VALID&quot; |
| INVALID | &quot;INVALID&quot; |
| NOT_AVAILABLE | &quot;NOT_AVAILABLE&quot; |
{: class="table table-striped"}



