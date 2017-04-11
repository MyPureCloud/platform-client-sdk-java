---
title: FlowVersion
---
## FlowVersion


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **commitVersion** | **String** |  |  [optional] |
| **configurationVersion** | **String** |  |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
| **secure** | **Boolean** |  |  [optional] |
| **createdBy** | [**UriReference**](UriReference.html) |  |  [optional] |
| **configurationUri** | **String** |  |  [optional] |
| **dateCreated** | **Long** |  |  [optional] |
| **generationId** | **String** |  |  [optional] |
| **publishResultUri** | **String** |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| PUBLISH | &quot;PUBLISH&quot; |
| CHECKIN | &quot;CHECKIN&quot; |
| SAVE | &quot;SAVE&quot; |
{: class="table table-striped"}


