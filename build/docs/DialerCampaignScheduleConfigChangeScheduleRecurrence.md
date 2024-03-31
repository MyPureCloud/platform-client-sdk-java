---
title: DialerCampaignScheduleConfigChangeScheduleRecurrence
---
## DialerCampaignScheduleConfigChangeScheduleRecurrence


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | the recurrence id |  [optional] |
| **start** | <!----><!---->**String**<!----> | scheduled start time represented as an ISO-8601 string; for example, yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **end** | <!----><!---->**String**<!----> | scheduled end time represented as an ISO-8601 string; for example, yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **timeZone** | <!----><!---->**String**<!----> | the timezone the recurrence will use |  [optional] |
| **range** | <!----><!---->[**DialerCampaignScheduleConfigChangeRecurrenceRange**](DialerCampaignScheduleConfigChangeRecurrenceRange.html)<!----> |  |  [optional] |
| **pattern** | <!----><!---->[**DialerCampaignScheduleConfigChangeRecurrencePattern**](DialerCampaignScheduleConfigChangeRecurrencePattern.html)<!----> |  |  [optional] |
| **alterations** | <!----><!---->[**List&lt;DialerCampaignScheduleConfigChangeAlteration&gt;**](DialerCampaignScheduleConfigChangeAlteration.html)<!----> | modifications to the original recurrence schedule |  [optional] |
| **additionalProperties** | <!----><!---->**Map&lt;String, Object&gt;**<!----> |  |  [optional] |
{: class="table table-striped"}



