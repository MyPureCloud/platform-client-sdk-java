# BuQueryAdherenceAdjustmentsRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDate** | [**Date**](Date) | The start timestamp of the range to query in ISO-8601 format |  |
| **endDate** | [**Date**](Date) | The end timestamp of the range to query in ISO-8601 format |  |
| **reasonCodeIds** | **List&lt;String&gt;** | A filter for the reason codes to include. Leave empty or omit entirely for all reason codes |  [optional] |
| **statuses** | [**List<StatusesEnum>**](#Enum--StatusesEnum) | A filter for which adherence adjustment statuses to include. Leave empty or omit entirely for all statuses |  [optional] |
| **userIds** | **List&lt;String&gt;** | A filter for which users within the business unit to query. Leave empty or omit entirely for all users |  [optional] |
| **managementUnitIds** | **List&lt;String&gt;** | A filter for which management units to query. Leave empty or omit entirely for all management units in the business unit |  [optional] |


## Enum: StatusesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| APPROVED | &quot;Approved&quot; |
| DENIED | &quot;Denied&quot; |
| PENDING | &quot;Pending&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:265.1.0_
