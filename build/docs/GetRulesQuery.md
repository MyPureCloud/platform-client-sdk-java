---
title: GetRulesQuery
---
## GetRulesQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **ruleType** | [**RuleTypeEnum**](#RuleTypeEnum)<!----> | The rule type of the alerts the query will return |  |
| **queryType** | [**QueryTypeEnum**](#QueryTypeEnum)<!----> | The type of query being performed. |  |
| **enabledType** | [**EnabledTypeEnum**](#EnabledTypeEnum)<!----> | The state of the rule the query will return.  The accepted choices are Enabled, Disabled, or All |  [optional] |
| **pageNumber** | <!----><!---->**Integer**<!----> | The page number of the queried response |  [optional] |
| **pageSize** | <!----><!---->**Integer**<!----> | The number of entities to return of the queried response.  The max is 25 |  [optional] |
| **sortBy** | [**SortByEnum**](#SortByEnum)<!----> | The field to sort responses by.  The accepted choices are Name and DateStart |  [optional] |
| **sortOrder** | [**SortOrderEnum**](#SortOrderEnum)<!----> | The order in which response will be sorted.  The accepted choices are Asc and Desc |  [optional] |
| **ruleName** | <!----><!---->**String**<!----> | The name of the rule being queries. |  [optional] |
| **nameSearchType** | [**NameSearchTypeEnum**](#NameSearchTypeEnum)<!----> | Specifies how strict the name search needs to be. Expected values are Exact and Contains if querying by name. |  [optional] |
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


<a name="EnabledTypeEnum"></a>

## Enum: EnabledTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ENABLED | &quot;Enabled&quot; | 
| DISABLED | &quot;Disabled&quot; | 
| ALL | &quot;All&quot; | 
{: class="table table-striped"}


<a name="SortByEnum"></a>

## Enum: SortByEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NAME | &quot;Name&quot; | 
| DATECREATED | &quot;DateCreated&quot; | 
{: class="table table-striped"}


<a name="SortOrderEnum"></a>

## Enum: SortOrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASC | &quot;Asc&quot; | 
| DESC | &quot;Desc&quot; | 
{: class="table table-striped"}


<a name="NameSearchTypeEnum"></a>

## Enum: NameSearchTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EXACT | &quot;Exact&quot; | 
| CONTAINS | &quot;Contains&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}



