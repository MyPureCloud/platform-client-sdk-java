---
title: AvailableTopic
---
## AvailableTopic


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **description** | <!----><!---->**String**<!----> |  |  [optional] |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **requiresPermissions** | <!----><!---->**List&lt;String&gt;**<!----> | Permissions required to subscribe to the topic |  [optional] |
| **schema** | <!----><!---->**Map&lt;String, Object&gt;**<!----> |  |  [optional] |
| **requiresCurrentUser** | <!----><!---->**Boolean**<!----> | True if the topic user ID is required to match the subscribing user ID |  [optional] |
| **requiresCurrentUserOrPermission** | <!----><!---->**Boolean**<!----> | True if permissions are only required when the topic user ID does not match the subscribing user ID |  [optional] |
| **transports** | <!---->[**List&lt;TransportsEnum&gt;**](#TransportsEnum)<!----> | Transports that support events for the topic |  [optional] |
{: class="table table-striped"}


<a name="TransportsEnum"></a>

## Enum: TransportsEnum

| Name | Value |
| ---- | ----- |
| ALL | &quot;All&quot; |
| WEBSOCKET | &quot;Websocket&quot; |
| EVENTBRIDGE | &quot;EventBridge&quot; |
{: class="table table-striped"}



