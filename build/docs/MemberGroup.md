---
title: MemberGroup
---
## MemberGroup


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **division** | <!----><!---->[**WritableDivision**](WritableDivision.html)<!----> | The division to which this entity belongs. |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The group type |  [optional] |
| **memberCount** | <!----><!---->**Integer**<!----> | The number of members in this group |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TEAM | &quot;TEAM&quot; | 
| GROUP | &quot;GROUP&quot; | 
| SKILLGROUP | &quot;SKILLGROUP&quot; | 
{: class="table table-striped"}



