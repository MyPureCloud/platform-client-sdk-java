# RelationshipsExportFilter


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eq** | [**RelationshipsExportFieldFilter**](RelationshipsExportFieldFilter) | Filtered field should have the same value |  [optional] |
| **in** | [**RelationshipsExportFieldListFilter**](RelationshipsExportFieldListFilter) | Filtered field should match one of the listed values |  [optional] |
| **lte** | [**RelationshipsExportComparisonFieldFilter**](RelationshipsExportComparisonFieldFilter) | Filtered field should be less than or equal to the value |  [optional] |
| **gte** | [**RelationshipsExportComparisonFieldFilter**](RelationshipsExportComparisonFieldFilter) | Filtered field should be greater than or equal to the value |  [optional] |
| **and** | [**List&lt;RelationshipsExportFilter&gt;**](RelationshipsExportFilter) | Boolean AND combination of filters |  [optional] |
| **or** | [**List&lt;RelationshipsExportFilter&gt;**](RelationshipsExportFilter) | Boolean OR combination of filters |  [optional] |
| **not** | [**RelationshipsExportFilter**](RelationshipsExportFilter) | Boolean negation of filters |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:260.0.0_
