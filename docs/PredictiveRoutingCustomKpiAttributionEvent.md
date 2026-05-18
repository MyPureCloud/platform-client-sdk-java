# PredictiveRoutingCustomKpiAttributionEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventId** | **String** | A unique (UUID) eventId for this event |  |
| **eventDateTime** | [**Date**](Date) | A timestamp as epoch representing the time this event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **externalContactId** | **String** | The UUID of the external contact associated with this event |  [optional] |
| **conversationId** | **String** | The UUID of the conversation associated with this event |  [optional] |
| **agentId** | **String** | The UUID of the agent associated with this event |  [optional] |
| **kpiId** | **String** | The UUID of the KPI associated with this event |  |
| **associatedValue** | **Double** | The value associated with this outcome attribution |  |




_com.mypurecloud.sdk.v2:platform-client-v2:253.2.0_
