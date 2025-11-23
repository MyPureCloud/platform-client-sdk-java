# WfmAgentHistoricalAdherenceResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **job** | [**WfmAgentHistoricalAdherenceJobReference**](WfmAgentHistoricalAdherenceJobReference) | A reference to the job that was started by the request |  |
| **downloadUrls** | **List&lt;String&gt;** | The url list to GET the results of the agent adherence query. This field is populated only if query state is Complete |  [optional] |
| **result** | [**WfmAgentHistoricalAdherenceResult**](WfmAgentHistoricalAdherenceResult) | Results will come via downloadUrls, however it may come inline if small enough |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:238.0.0_
