# WfmHistoricalShrinkageResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **operationId** | **String** | The operationId for which to listen |  [optional] |
| **downloadUrls** | **List&lt;String&gt;** | The url list to GET the results of the Historical Shrinkage query. This field is populated only if query state is Complete |  [optional] |
| **downloadResult** | [**HistoricalShrinkageResultListing**](HistoricalShrinkageResultListing) | Result will always come via downloadUrls; however the schema is included for documentation |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | The state of the shrinkage query |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
