---
title: UpdateTriggerRequest
---
## UpdateTriggerRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **version** | <!----><!---->**Long**<!----> | Version of this trigger |  |
| **enabled** | <!----><!---->**Boolean**<!----> | Boolean indicating if Trigger is enabled |  |
| **target** | <!----><!---->[**TriggerTarget**](TriggerTarget.html)<!----> | The target to invoke when a matching event is received |  |
| **matchCriteria** | <!----><!---->[**List&lt;MatchCriteria&gt;**](MatchCriteria.html)<!----> | The configuration for when a trigger is considered to be a match for an event |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the trigger |  |
| **topicName** | <!----><!---->**String**<!----> | The topic that will cause the trigger to be invoked. Must match existing trigger topicName. |  |
| **eventTTLSeconds** | <!----><!---->**Integer**<!----> | Optional length of time that events are meaningful after origination. Events older than this threshold may be dropped if the platform is delayed in processing events. Unset means events are valid indefinitely, otherwise must be set to at least 10 seconds. Only one of eventTTLSeconds or delayBySeconds can be set. |  [optional] |
| **delayBySeconds** | <!----><!---->**Integer**<!----> | Optional delay invoking target after trigger fires. Must be in the range of 60 to 900 seconds. Only one of eventTTLSeconds or delayBySeconds can be set. |  [optional] |
| **description** | <!----><!---->**String**<!----> | Description of the trigger. Can be up to 512 characters in length. |  [optional] |
{: class="table table-striped"}



