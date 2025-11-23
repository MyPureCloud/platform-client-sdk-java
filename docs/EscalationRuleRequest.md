# EscalationRuleRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the escalation rule. |  |
| **matchCriteria** | **String** | The criteria that defines when a social media message should be escalated. |  |
| **priority** | **Integer** | The priority of the escalation rule. The lower the number the higer the priority. Once a rule is matched others are skipped. |  |
| **divisionId** | **String** | The ID of the division the social escalation rule belongs to. |  |
| **description** | **String** | A description of the social escalation rule. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the escalation rule. |  [optional] |
| **openEscalation** | [**EscalationTarget**](EscalationTarget) | The target integration configuration used for an open message escalation. |  [optional] |
| **facebookEscalation** | [**EscalationTarget**](EscalationTarget) | The target integration configuration used for a Facebook message escalation. |  [optional] |
| **instagramEscalation** | [**EscalationTarget**](EscalationTarget) | The target integration configuration used for an Instagram message escalation. |  [optional] |
| **twitterEscalation** | [**EscalationTarget**](EscalationTarget) | The target integration configuration used for a X (formerly Twitter) message escalation. |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;Active&quot; | 
| PAUSED | &quot;Paused&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:238.0.0_
