---
title: Trigger
---
## Trigger


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the trigger |  [optional] |
| **topicName** | <!----><!---->**String**<!----> | The topic that will cause the trigger to be invoked |  [optional] |
| **target** | <!----><!---->[**TriggerTarget**](TriggerTarget.html)<!----> | The target to invoke when a matching event is received |  [optional] |
| **version** | <!----><!---->**Long**<!----> | Version of this trigger |  [optional] |
| **enabled** | <!----><!---->**Boolean**<!----> | Whether or not the trigger is enabled |  [optional] |
| **matchCriteria** | <!----><!---->[**List&lt;MatchCriteria&gt;**](MatchCriteria.html)<!----> | The configuration for when a trigger is considered to be a match for an event |  [optional] |
| **eventTTLSeconds** | <!----><!---->**Integer**<!----> | Optional length of time that events are meaningful after origination. Events older than this threshold may be dropped if the platform is delayed in processing events. Unset means events are valid indefinitely, otherwise must be set to at least 10 seconds. Only one of eventTTLSeconds or delayBySeconds can be set. |  [optional] |
| **delayBySeconds** | <!----><!---->**Integer**<!----> | Optional delay invoking target after trigger fires. Must be in the range of 60 to 900 seconds. Only one of eventTTLSeconds or delayBySeconds can be set. |  [optional] |
| **description** | <!----><!---->**String**<!----> | Description of the trigger. Can be up to 512 characters in length. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



