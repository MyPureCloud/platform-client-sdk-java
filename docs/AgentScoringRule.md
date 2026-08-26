# AgentScoringRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **programId** | **String** | The program ID that this rule belongs to. When provided in request body, this value is ignored in favor of the path parameter. |  [optional] |
| **samplingType** | [**SamplingTypeEnum**](#Enum--SamplingTypeEnum) | Sampling type setting. Valid values: All, Percentage |  |
| **samplingPercentage** | [**BigDecimal**](BigDecimal) | Percentage of interactions to evaluate (0.01-100.00). Required when samplingType is Percentage, null when All. |  [optional] |
| **submissionType** | [**SubmissionTypeEnum**](#Enum--SubmissionTypeEnum) | Submission type for evaluations. Valid values: Automated, Manual |  |
| **evaluationFormContextId** | **String** | The evaluation form contextID to use for scoring. |  |
| **enabled** | **Boolean** | Whether the rule is enabled. |  |
| **published** | **Boolean** | Whether the rule is published. |  [optional] |
| **evaluator** | [**AddressableEntityRef**](AddressableEntityRef) | The evaluator for evaluations created by this rule. |  [optional] |
| **agentToScore** | [**AgentToScoreEnum**](#Enum--AgentToScoreEnum) | Which agent(s) to score. Valid values: First, Last, Each. |  [optional] |
| **dateCreated** | [**Date**](Date) | Date when the rule was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Date when the rule was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: SamplingTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALL | &quot;All&quot; | 
| PERCENTAGE | &quot;Percentage&quot; | 


## Enum: SubmissionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AUTOMATED | &quot;Automated&quot; | 
| MANUAL | &quot;Manual&quot; | 


## Enum: AgentToScoreEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| FIRST | &quot;First&quot; | 
| LAST | &quot;Last&quot; | 
| EACH | &quot;Each&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:261.0.0_
