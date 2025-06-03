# WorkitemQueryPostRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **pageSize** | **Integer** | Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an `after` key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 200. |  [optional] |
| **select** | [**SelectEnum**](#Enum--SelectEnum) | Specify the value 'Count' for this parameter in order to return only the record count. |  [optional] |
| **filters** | [**List&lt;WorkitemFilter&gt;**](WorkitemFilter) | List of filter objects to be used in the search. |  |
| **attributes** | **List&lt;String&gt;** | List of entity attributes to be retrieved in the result. |  [optional] |
| **after** | **String** | The cursor that points to the end of the set of entities that has been returned. |  [optional] |
| **sort** | [**WorkitemQuerySort**](WorkitemQuerySort) | Sort |  [optional] |
| **expands** | [**List<ExpandsEnum>**](#Enum--ExpandsEnum) | List of entity attributes to be expanded in the result. |  [optional] |


## Enum: SelectEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COUNT | &quot;Count&quot; | 


## Enum: ExpandsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| TYPE | &quot;type&quot; |
| WORKBIN | &quot;workbin&quot; |
| STATUS | &quot;status&quot; |
| ASSIGNEE | &quot;assignee&quot; |
| REPORTER | &quot;reporter&quot; |
| QUEUE | &quot;queue&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:226.0.0_
