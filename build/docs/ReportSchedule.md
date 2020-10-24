---
title: ReportSchedule
---
## ReportSchedule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **quartzCronExpression** | <!----><!---->**String**<!----> | Quartz Cron Expression |  |
| **nextFireTime** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **description** | <!----><!---->**String**<!----> |  |  [optional] |
| **timeZone** | <!----><!---->**String**<!----> |  |  [optional] |
| **timePeriod** | <!----><!---->**String**<!----> |  |  [optional] |
| **interval** | <!----><!---->**String**<!----> | Interval. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **reportFormat** | <!----><!---->**String**<!----> |  |  [optional] |
| **locale** | <!----><!---->**String**<!----> |  |  [optional] |
| **enabled** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **reportId** | <!----><!---->**String**<!----> | Report ID |  |
| **parameters** | <!----><!---->**Map&lt;String, Object&gt;**<!----> |  |  [optional] |
| **lastRun** | <!----><!---->[**ReportRunEntry**](ReportRunEntry.html)<!----> |  |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



