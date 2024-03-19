---
title: JourneyEventDefinition
---
## JourneyEventDefinition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the event definition |  |
| **source** | [**SourceEnum**](#SourceEnum)<!----> | The source of the event definition |  |
| **description** | <!----><!---->**String**<!----> | The description of this event definition |  |
| **jsonSchema** | <!----><!---->[**JsonSchemaDocument**](JsonSchemaDocument.html)<!----> | The JSON schema of this event definition |  |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="SourceEnum"></a>

## Enum: SourceEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NATIVE | &quot;Native&quot; | 
| CUSTOM | &quot;Custom&quot; | 
{: class="table table-striped"}



