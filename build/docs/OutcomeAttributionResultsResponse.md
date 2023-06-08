---
title: OutcomeAttributionResultsResponse
---
## OutcomeAttributionResultsResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **outcomeId** | <!----><!---->**String**<!----> | ID of Outcome. |  [optional] |
| **index** | <!----><!---->**Integer**<!----> | The index/position of the OutcomeAttribution in the original POST request. |  [optional] |
| **externalContactId** | <!----><!---->**String**<!----> | The external contact ID of the customer who achieved the outcome. |  [optional] |
| **associatedValue** | <!----><!---->[**BigDecimal**](BigDecimal.html)<!----> | The total value associated with the customer's outcome. |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | State of the Outcome Attribution entity. |  |
| **message** | <!----><!---->**String**<!----> | Additional information on the state of the Outcome Attribution entity. |  |
| **touchpoints** | <!----><!---->[**List&lt;TouchpointResponse&gt;**](TouchpointResponse.html)<!----> | List of interactions that led to this outcome being achieved. |  [optional] |
| **createdDate** | <!----><!---->[**Date**](Date.html)<!----> | Date outcome was achieved. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| VALID | &quot;Valid&quot; | 
| INVALID | &quot;Invalid&quot; | 
| FAILED | &quot;Failed&quot; | 
{: class="table table-striped"}



