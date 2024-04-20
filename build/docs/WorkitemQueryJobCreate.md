---
title: WorkitemQueryJobCreate
---
## WorkitemQueryJobCreate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **pageSize** | <!----><!---->**Integer**<!----> | The total page size requested. Default 25 |  [optional] |
| **pageNumber** | <!----><!---->**Integer**<!----> | The page number requested |  [optional] |
| **filters** | <!----><!---->[**List&lt;WorkitemQueryJobFilter&gt;**](WorkitemQueryJobFilter.html)<!----> | List of filter objects to be used in the search. |  |
| **expands** | <!---->[**List&lt;ExpandsEnum&gt;**](#ExpandsEnum)<!----> | List of entity attributes to be expanded in the result. |  [optional] |
| **attributes** | <!----><!---->**List&lt;String&gt;**<!----> | List of entity attributes to be retrieved in the result. |  [optional] |
| **sort** | <!----><!---->[**WorkitemQueryJobSort**](WorkitemQueryJobSort.html)<!----> | Sort |  [optional] |
{: class="table table-striped"}


<a name="ExpandsEnum"></a>

## Enum: ExpandsEnum

| Name | Value |
| ---- | ----- |
| TYPE | &quot;type&quot; |
| WORKBIN | &quot;workbin&quot; |
| STATUS | &quot;status&quot; |
| ASSIGNEE | &quot;assignee&quot; |
| REPORTER | &quot;reporter&quot; |
| QUEUE | &quot;queue&quot; |
{: class="table table-striped"}



