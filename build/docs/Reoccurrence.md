---
title: Reoccurrence
---
## Reoccurrence


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **start** | <!----><!---->**String**<!----> | The  start date time of the initial occurrence as an ISO-8601 string in UTC time, e.g: 2023-11-21T16:30:25.000Z |  |
| **end** | <!----><!---->**String**<!----> | The end date time of the initial occurrence as an ISO-8601 string in UTC time, e.g: 2023-12-21T16:30:25.000Z |  |
| **timeZone** | <!----><!---->**String**<!----> | The time zone of the schedule e.g.:  America/New_York |  |
| **pattern** | <!----><!---->[**Pattern**](Pattern.html)<!----> | The schedule pattern e.g.: Daily/Weekly |  |
| **range** | <!----><!---->[**Range**](Range.html)<!----> | The schedule range e.g.: EndDate/NoEnd/Numbered |  |
| **alterations** | <!----><!---->[**List&lt;Alteration&gt;**](Alteration.html)<!----> | Modifications to the original recurrence schedule (Exclusions/Inclusions) |  [optional] |
{: class="table table-striped"}



