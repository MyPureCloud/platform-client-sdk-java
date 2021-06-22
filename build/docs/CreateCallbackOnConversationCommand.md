---
title: CreateCallbackOnConversationCommand
---
## CreateCallbackOnConversationCommand


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **scriptId** | <!----><!---->**String**<!----> | The identifier of the script to be used for the callback |  [optional] |
| **queueId** | <!----><!---->**String**<!----> | The identifier of the queue to be used for the callback. Either queueId or routingData is required. |  [optional] |
| **routingData** | <!----><!---->[**RoutingData**](RoutingData.html)<!----> | The routing data to be used for the callback. Either queueId or routingData is required. |  [optional] |
| **callbackUserName** | <!----><!---->**String**<!----> | The name of the party to be called back. |  [optional] |
| **callbackNumbers** | <!----><!---->**List&lt;String&gt;**<!----> | A list of phone numbers for the callback. |  |
| **callbackScheduledTime** | <!----><!---->[**Date**](Date.html)<!----> | The scheduled date-time for the callback as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **countryCode** | <!----><!---->**String**<!----> | The country code to be associated with the callback numbers. |  [optional] |
| **validateCallbackNumbers** | <!----><!---->**Boolean**<!----> | Whether or not to validate the callback numbers for phone number format. |  [optional] |
| **data** | <!----><!---->**Map&lt;String, String&gt;**<!----> | A map of key-value pairs containing additional data that can be associated to the callback. These values will appear in the attributes property on the conversation participant. Example: { \&quot;notes\&quot;: \&quot;ready to close the deal!\&quot;, \&quot;customerPreferredName\&quot;: \&quot;Doc\&quot; } |  [optional] |
| **callerId** | <!----><!---->**String**<!----> | The phone number displayed to recipients when a phone call is placed as part of the callback. Must conform to the E.164 format. May be overridden by other settings in the system such as external trunk settings. Telco support for \&quot;callerId\&quot; varies. |  [optional] |
| **callerIdName** | <!----><!---->**String**<!----> | The name displayed to recipients when a phone call is placed as part of the callback. May be overridden by other settings in the system such as external trunk settings. Telco support for \&quot;callerIdName\&quot; varies. |  [optional] |
{: class="table table-striped"}



