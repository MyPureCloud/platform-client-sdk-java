---
title: PerformanceProfile
---
## PerformanceProfile


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | A name for this performance profile |  |
| **division** | <!----><!---->[**Division**](Division.html)<!----> | The division for this performance profile associate to |  [optional] |
| **description** | <!----><!---->**String**<!----> | A description about this performance profile |  |
| **metricOrders** | <!----><!---->**List&lt;String&gt;**<!----> | Order of the associated metrics. The list should contain valid ids for metrics |  |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Creation date for this performance profile. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **reportingIntervals** | <!----><!---->[**List&lt;ReportingInterval&gt;**](ReportingInterval.html)<!----> | The reporting interval periods for this performance profile |  [optional] |
| **active** | <!----><!---->**Boolean**<!----> | The flag for active profiles |  [optional] |
| **memberCount** | <!----><!---->**Integer**<!----> | The number of members in this performance profile |  [optional] |
| **maxLeaderboardRankSize** | <!----><!---->**Integer**<!----> | The maximum rank size for the leaderboard. This counts the number of ranks can be retrieved in a leaderboard queries |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



