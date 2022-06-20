---
title: UserSearchRequest
---
## UserSearchRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **sortOrder** | [**SortOrderEnum**](#SortOrderEnum)<!----> | The sort order for results |  [optional] |
| **sortBy** | <!----><!---->**String**<!----> | The field in the resource that you want to sort the results by |  [optional] |
| **pageSize** | <!----><!---->**Integer**<!----> | The number of results per page |  [optional] |
| **pageNumber** | <!----><!---->**Integer**<!----> | The page of resources you want to retrieve |  [optional] |
| **sort** | <!----><!---->[**List&lt;SearchSort&gt;**](SearchSort.html)<!----> | Multi-value sort order, list of multiple sort values |  [optional] |
| **expand** | <!----><!---->**List&lt;String&gt;**<!----> | Provides more details about a specified resource |  [optional] |
| **query** | <!----><!---->[**List&lt;UserSearchCriteria&gt;**](UserSearchCriteria.html)<!----> |  |  [optional] |
| **integrationPresenceSource** | [**IntegrationPresenceSourceEnum**](#IntegrationPresenceSourceEnum)<!----> | Gets an integration presence for users instead of their defaults. This parameter will only be used when presence is provided as an \"expand\". When using this parameter the maximum number of users that can be returned is 100. |  [optional] |
| **enforcePermissions** | <!----><!---->**Boolean**<!----> | This property only applies to api/v2/user/search; when set to true add additional search criteria to filter users by: directory:user:view |  [optional] |
{: class="table table-striped"}


<a name="SortOrderEnum"></a>

## Enum: SortOrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASC | &quot;ASC&quot; | 
| DESC | &quot;DESC&quot; | 
| SCORE | &quot;SCORE&quot; | 
{: class="table table-striped"}


<a name="IntegrationPresenceSourceEnum"></a>

## Enum: IntegrationPresenceSourceEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MICROSOFTTEAMS | &quot;MicrosoftTeams&quot; | 
| ZOOMPHONE | &quot;ZoomPhone&quot; | 
| EIGHTBYEIGHT | &quot;EightByEight&quot; | 
{: class="table table-striped"}



