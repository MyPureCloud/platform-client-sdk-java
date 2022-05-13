---
title: NamedEntityTypeMechanism
---
## NamedEntityTypeMechanism


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **items** | <!----><!---->[**List&lt;NamedEntityTypeItem&gt;**](NamedEntityTypeItem.html)<!----> | The items that define the named entity type. |  |
| **restricted** | <!----><!---->**Boolean**<!----> | Whether the named entity type is restricted to the items provided. Default: false |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of the mechanism. |  |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DYNAMICLIST | &quot;DynamicList&quot; | 
| LIST | &quot;List&quot; | 
| REGEX | &quot;Regex&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}



