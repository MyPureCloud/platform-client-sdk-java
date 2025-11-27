# AgentIntegrationsResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **agent** | [**UserReference**](UserReference) | The user associated with the integrations |  |
| **selectedIntegration** | [**WfmIntegrationReference**](WfmIntegrationReference) | The integration selected for the agent. If not set, no integration will be used for the agent |  [optional] |
| **userSelected** | **Boolean** | Whether the integration association has been manually selected |  [optional] |
| **associatedIntegrations** | [**List&lt;AgentIntegrationAssociationResponse&gt;**](AgentIntegrationAssociationResponse) | The list of integrations associated with the agent |  |




_com.mypurecloud.sdk.v2:platform-client-v2:239.0.0_
