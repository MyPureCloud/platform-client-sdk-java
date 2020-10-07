---
title: GoogleDialogflowCustomSettings
---
## GoogleDialogflowCustomSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **environment** | <!----><!---->**String**<!----> | If set this environment will be used to initiate the dialogflow bot, otherwise the default configuration will be used.  See https://cloud.google.com/dialogflow/docs/agents-versions |  [optional] |
| **eventName** | <!----><!---->**String**<!----> | If set this eventName will be used to initiate the dialogflow bot rather than language processing on the input text.  See https://cloud.google.com/dialogflow/es/docs/events-overview |  [optional] |
| **webhookQueryParameters** | <!----><!---->**Map&lt;String, String&gt;**<!----> | Parameters passed to the fulfillment webhook of the bot (if any). |  [optional] |
| **eventInputParameters** | <!----><!---->**Map&lt;String, String&gt;**<!----> | Parameters passed to the event input of the bot. |  [optional] |
{: class="table table-striped"}



