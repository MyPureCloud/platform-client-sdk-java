# WfmHistoricalAdherenceBulkResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **job** | [**WfmHistoricalAdherenceBulkJobReference**](WfmHistoricalAdherenceBulkJobReference) | A reference to the job that was started by the request |  [optional] |
| **downloadUrls** | **List&lt;String&gt;** | The uri list to GET the results of the Historical Adherence query. This field is populated only if query state is Complete |  [optional] |
| **downloadResult** | [**WfmHistoricalAdherenceBulkResult**](WfmHistoricalAdherenceBulkResult) | Results will always come via downloadUrls; however the schema is included for documentation |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
