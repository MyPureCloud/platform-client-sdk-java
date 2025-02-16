# ConversationParticipantSearchRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **sortOrder** | [**SortOrderEnum**](#Enum--SortOrderEnum) | The sort order for results |  [optional] |
| **sortBy** | **String** | The field in the resource that you want to sort the results by |  [optional] |
| **sort** | [**List&lt;SearchSort&gt;**](SearchSort) | Multi-value sort order, list of multiple sort values |  [optional] |
| **returnFields** | **List&lt;String&gt;** |  |  [optional] |
| **query** | [**List&lt;ConversationParticipantSearchCriteria&gt;**](ConversationParticipantSearchCriteria) |  |  [optional] |
| **cursor** | **String** |  |  [optional] |


## Enum: SortOrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASC | &quot;ASC&quot; | 
| DESC | &quot;DESC&quot; | 
| SCORE | &quot;SCORE&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:220.0.0_
