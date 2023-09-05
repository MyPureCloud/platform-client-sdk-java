---
title: AgentIntegrationsResponse
---
## AgentIntegrationsResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **agent** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The user associated with the integrations |  |
| **selectedIntegration** | <!----><!---->[**WfmIntegrationReference**](WfmIntegrationReference.html)<!----> | The integration selected for the agent. If not set, no integration will be used for the agent |  [optional] |
| **userSelected** | <!----><!---->**Boolean**<!----> | Whether the integration association has been manually selected |  [optional] |
| **associatedIntegrations** | <!----><!---->[**List&lt;AgentIntegrationAssociationResponse&gt;**](AgentIntegrationAssociationResponse.html)<!----> | The list of integrations associated with the agent |  |
{: class="table table-striped"}



