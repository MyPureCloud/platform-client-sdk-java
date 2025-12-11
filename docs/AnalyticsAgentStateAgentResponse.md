# AnalyticsAgentStateAgentResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userId** | **String** | User Id - only returned if division is covered by agentStateNames permission |  [optional] |
| **divisionId** | **String** | Division Id |  [optional] |
| **userName** | **String** | User name - only returned if division is covered by agentStateNames permission |  [optional] |
| **managerId** | **String** | The user that this user reports to |  [optional] |
| **sessionCount** | **Integer** | The count of sessions |  [optional] |
| **sessions** | [**List&lt;AnalyticsAgentStateAgentSessionResult&gt;**](AnalyticsAgentStateAgentSessionResult) | List of sessions |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:240.0.0_
