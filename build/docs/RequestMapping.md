---
title: RequestMapping
---
## RequestMapping


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | <!----><!---->**String**<!----> | Name of the Integration Action Attribute to supply the value for |  [optional] |
| **attributeType** | [**AttributeTypeEnum**](#AttributeTypeEnum)<!----> | Type of the value supplied |  [optional] |
| **mappingType** | [**MappingTypeEnum**](#MappingTypeEnum)<!----> | Method of finding value to use with Attribute |  [optional] |
| **value** | <!----><!---->**String**<!----> | Value to supply for the specified Attribute |  [optional] |
{: class="table table-striped"}


<a name="AttributeTypeEnum"></a>

## Enum: AttributeTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| STRING | &quot;String&quot; | 
| NUMBER | &quot;Number&quot; | 
| INTEGER | &quot;Integer&quot; | 
| BOOLEAN | &quot;Boolean&quot; | 
{: class="table table-striped"}


<a name="MappingTypeEnum"></a>

## Enum: MappingTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| LOOKUP | &quot;Lookup&quot; | 
| HARDCODED | &quot;HardCoded&quot; | 
{: class="table table-striped"}



