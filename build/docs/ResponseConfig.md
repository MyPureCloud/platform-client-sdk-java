---
title: ResponseConfig
---
## ResponseConfig


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **translationMap** | <!----><!---->**Map&lt;String, String&gt;**<!----> | Map &#39;attribute name&#39; and &#39;JSON path&#39; pairs used to extract data from REST response. |  [optional] |
| **translationMapDefaults** | <!----><!---->**Map&lt;String, String&gt;**<!----> | Map &#39;attribute name&#39; and &#39;default value&#39; pairs used as fallback values if JSON path extraction fails for specified key. |  [optional] |
| **successTemplate** | <!----><!---->**String**<!----> | Velocity template to build response to return from Action. |  [optional] |
| **successTemplateUri** | <!----><!---->**String**<!----> | URI to retrieve success template. |  [optional] |
{: class="table table-striped"}



