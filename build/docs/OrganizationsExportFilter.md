# OrganizationsExportFilter


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eq** | [**OrganizationsExportFieldFilter**](OrganizationsExportFieldFilter) | Filtered field should have the same value |  [optional] |
| **in** | [**OrganizationsExportFieldListFilter**](OrganizationsExportFieldListFilter) | Filtered field should match one of the listed values |  [optional] |
| **lte** | [**OrganizationsExportComparisonFieldFilter**](OrganizationsExportComparisonFieldFilter) | Filtered field should be less than or equal to the value |  [optional] |
| **gte** | [**OrganizationsExportComparisonFieldFilter**](OrganizationsExportComparisonFieldFilter) | Filtered field should be greater than or equal to the value |  [optional] |
| **and** | [**List&lt;OrganizationsExportFilter&gt;**](OrganizationsExportFilter) | Boolean AND combination of filters |  [optional] |
| **or** | [**List&lt;OrganizationsExportFilter&gt;**](OrganizationsExportFilter) | Boolean OR combination of filters |  [optional] |
| **not** | [**OrganizationsExportFilter**](OrganizationsExportFilter) | Boolean negation of filters |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:260.0.0_
