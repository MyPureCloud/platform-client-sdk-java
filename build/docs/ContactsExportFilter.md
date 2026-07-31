# ContactsExportFilter


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eq** | [**ContactsExportFieldFilter**](ContactsExportFieldFilter) | Filtered field should have the same value |  [optional] |
| **in** | [**ContactsExportFieldListFilter**](ContactsExportFieldListFilter) | Filtered field should match one of the listed values |  [optional] |
| **lte** | [**ContactsExportComparisonFieldFilter**](ContactsExportComparisonFieldFilter) | Filtered field should be less than or equal to the value |  [optional] |
| **gte** | [**ContactsExportComparisonFieldFilter**](ContactsExportComparisonFieldFilter) | Filtered field should be greater than or equal to the value |  [optional] |
| **and** | [**List&lt;ContactsExportFilter&gt;**](ContactsExportFilter) | Boolean AND combination of filters |  [optional] |
| **or** | [**List&lt;ContactsExportFilter&gt;**](ContactsExportFilter) | Boolean OR combination of filters |  [optional] |
| **not** | [**ContactsExportFilter**](ContactsExportFilter) | Boolean negation of filters |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:259.0.0_
