---
title: GenerateShortTermForecastResponse
---
## GenerateShortTermForecastResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**StatusEnum**](#StatusEnum) | The status of the request |  [optional] |
| **result** | [**ShortTermForecast**](ShortTermForecast.html) | The resulting forecast.  May be sent asynchronously via notification depending on the complexity of the forecast |  [optional] |
| **operationId** | **String** | The operation id to watch for on the notification topic |  [optional] |
| **progress** | **Integer** | Percent progress.  Subscribe to the corresponding notification to view progress and await the result |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| PROCESSING | &quot;Processing&quot; |
| COMPLETE | &quot;Complete&quot; |
| ERROR | &quot;Error&quot; |
{: class="table table-striped"}


