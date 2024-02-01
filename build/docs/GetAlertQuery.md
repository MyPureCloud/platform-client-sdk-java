---
title: GetAlertQuery
---
## GetAlertQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **ruleType** | [**RuleTypeEnum**](#RuleTypeEnum)<!----> | The rule type of the alerts the query will return |  |
| **queryType** | [**QueryTypeEnum**](#QueryTypeEnum)<!----> | The type of query being performed. |  |
| **alertStatus** | [**AlertStatusEnum**](#AlertStatusEnum)<!----> | The status of the alerts the query will return. |  [optional] |
| **viewedStatus** | [**ViewedStatusEnum**](#ViewedStatusEnum)<!----> | The view status of the alerts the query will return. |  [optional] |
| **pageNumber** | <!----><!---->**Integer**<!----> | The page number of the queried response |  [optional] |
| **pageSize** | <!----><!---->**Integer**<!----> | The number of entities to return of the queried response.  The max is 25 |  [optional] |
| **sortBy** | [**SortByEnum**](#SortByEnum)<!----> | The field to sort responses by.  The accepted choices are Name and DateStart |  [optional] |
| **sortOrder** | [**SortOrderEnum**](#SortOrderEnum)<!----> | The order in which response will be sorted.  The accepted choices are Asc and Desc |  [optional] |
{: class="table table-striped"}


<a name="RuleTypeEnum"></a>

## Enum: RuleTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CONVERSATION | &quot;Conversation&quot; | 
| PRESENCE | &quot;Presence&quot; | 
| ALL | &quot;All&quot; | 
{: class="table table-striped"}


<a name="QueryTypeEnum"></a>

## Enum: QueryTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INFO | &quot;Info&quot; | 
| COUNT | &quot;Count&quot; | 
{: class="table table-striped"}


<a name="AlertStatusEnum"></a>

## Enum: AlertStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;Active&quot; | 
| INACTIVE | &quot;Inactive&quot; | 
| ALL | &quot;All&quot; | 
{: class="table table-striped"}


<a name="ViewedStatusEnum"></a>

## Enum: ViewedStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNREAD | &quot;Unread&quot; | 
| READ | &quot;Read&quot; | 
| ALL | &quot;All&quot; | 
{: class="table table-striped"}


<a name="SortByEnum"></a>

## Enum: SortByEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NAME | &quot;Name&quot; | 
| DATESTART | &quot;DateStart&quot; | 
{: class="table table-striped"}


<a name="SortOrderEnum"></a>

## Enum: SortOrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASC | &quot;Asc&quot; | 
| DESC | &quot;Desc&quot; | 
{: class="table table-striped"}



