---
title: UserBestPointsItem
---
## UserBestPointsItem


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **granularityType** | [**GranularityTypeEnum**](#GranularityTypeEnum)<!----> | Best points aggregation interval granularity |  [optional] |
| **points** | <!----><!---->**Integer**<!----> | Gamification points |  [optional] |
| **dateStartWorkday** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | Start workday of the best points aggregation interval. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **dateEndWorkday** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | End workday of the best points aggregation interval. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **rank** | <!----><!---->**Integer**<!----> | The rank of this user |  [optional] |
{: class="table table-striped"}


<a name="GranularityTypeEnum"></a>

## Enum: GranularityTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MONTHLY | &quot;Monthly&quot; | 
| WEEKLY | &quot;Weekly&quot; | 
| DAILY | &quot;Daily&quot; | 
{: class="table table-striped"}



