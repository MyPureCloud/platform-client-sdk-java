# ScimV2SchemaListResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **schemas** | **List&lt;String&gt;** | The list of supported schemas. |  [optional] |
| **totalResults** | **Long** | The total number of results. |  [optional] |
| **startIndex** | **Long** | The 1-based index of the first result returned by this request. Add this to \"itemsPerPage\" when requesting the next page of results. |  [optional] |
| **itemsPerPage** | **Long** | The number of resources returned per page. |  [optional] |
| **resources** | [**List&lt;ScimV2SchemaDefinition&gt;**](ScimV2SchemaDefinition) | The list of requested resources. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:216.0.0_
