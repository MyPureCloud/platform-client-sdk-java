# ResponseConfig


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **translationMap** | **Map&lt;String, String&gt;** | Map 'attribute name' and 'JSON path' pairs used to extract data from REST response. |  [optional] |
| **translationMapDefaults** | **Map&lt;String, String&gt;** | Map 'attribute name' and 'default value' pairs used as fallback values if JSON path extraction fails for specified key. |  [optional] |
| **successTemplate** | **String** | Velocity template to build response to return from Action. |  [optional] |
| **successTemplateUri** | **String** | URI to retrieve success template. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:210.0.0_
