# BuQueryAdherenceExplanationsRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDate** | [**Date**](Date) | The start date of the range to query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **endDate** | [**Date**](Date) | The end date of the range to query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **managementUnitIds** | **List&lt;String&gt;** | A filter for which management units to query. Leave empty or omit entirely for all management units in the business unit |  [optional] |
| **agentIds** | **List&lt;String&gt;** | A filter for which agents within the business unit to query. Leave empty or omit entirely for all agents in the business unit (or management units if specified) |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:218.0.0_
