---
title: EmergencyLocation
---
## EmergencyLocation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **address** | <!----><!---->[**LocationAddress**](LocationAddress.html)<!----> | Emergency address |  |
| **did** | <!----><!---->**String**<!----> | Phone number in E164 format |  |
| **source** | [**SourceEnum**](#SourceEnum)<!----> | source |  |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="SourceEnum"></a>

## Enum: SourceEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ADMIN | &quot;Admin&quot; | 
| USER | &quot;User&quot; | 
{: class="table table-striped"}



