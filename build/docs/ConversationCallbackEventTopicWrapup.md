---
title: ConversationCallbackEventTopicWrapup
---
## ConversationCallbackEventTopicWrapup


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **code** | <!----><!---->**String**<!----> | The user configured wrap up code name. |  [optional] |
| **notes** | <!----><!---->**String**<!----> | Text entered by the agent to describe the call or disposition. |  [optional] |
| **tags** | <!----><!---->**List&lt;String&gt;**<!----> | List of tags selected by the agent to describe the call or disposition. |  [optional] |
| **durationSeconds** | <!----><!---->**Integer**<!----> | The length of time in seconds that the agent spent doing after call work., Note, the format of utc-millisec should be ignored, our code generator needs it to generate a Long for us internally |  [optional] |
| **endTime** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp when the wrapup was finished. |  [optional] |
{: class="table table-striped"}



