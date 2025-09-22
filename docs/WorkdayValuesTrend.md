# WorkdayValuesTrend


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dateStartWorkday** | [**LocalDate**](LocalDate) | The start workday for the query range for the metric value trend. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **dateEndWorkday** | [**LocalDate**](LocalDate) | The end workday for the query range for the metric value trend. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **dateReferenceWorkday** | [**LocalDate**](LocalDate) | The reference workday used to determine the metric definition. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **division** | [**Division**](Division) | The targeted division for the query |  [optional] |
| **user** | [**UserReference**](UserReference) | The targeted user for the query |  [optional] |
| **timezone** | **String** | The time zone used for aggregating metric values |  [optional] |
| **results** | [**List&lt;WorkdayValuesMetricItem&gt;**](WorkdayValuesMetricItem) | The metric value trends |  [optional] |
| **performanceProfile** | [**AddressableEntityRef**](AddressableEntityRef) | The targeted performance profile for the average points |  [optional] |
| **metric** | [**AddressableEntityRef**](AddressableEntityRef) | The targeted metric for the average points |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:231.0.0_
