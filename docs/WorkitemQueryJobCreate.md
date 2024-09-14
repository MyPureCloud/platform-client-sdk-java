# WorkitemQueryJobCreate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **pageSize** | **Integer** | The total page size requested. Default 25 |  [optional] |
| **pageNumber** | **Integer** | The page number requested |  [optional] |
| **filters** | [**List&lt;WorkitemQueryJobFilter&gt;**](WorkitemQueryJobFilter) | List of filter objects to be used in the search. |  |
| **expands** | [**List<ExpandsEnum>**](#Enum--ExpandsEnum) | List of entity attributes to be expanded in the result. |  [optional] |
| **attributes** | **List&lt;String&gt;** | List of entity attributes to be retrieved in the result. |  [optional] |
| **sort** | [**WorkitemQueryJobSort**](WorkitemQueryJobSort) | Sort |  [optional] |


## Enum: ExpandsEnum

| Name | Value |
| ---- | ----- |
| TYPE | &quot;type&quot; |
| WORKBIN | &quot;workbin&quot; |
| STATUS | &quot;status&quot; |
| ASSIGNEE | &quot;assignee&quot; |
| REPORTER | &quot;reporter&quot; |
| QUEUE | &quot;queue&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:209.1.0_
