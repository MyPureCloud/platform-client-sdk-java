# AdherenceExplanationJob


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of the adherence explanation job |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the adherence explanation job |  [optional] |
| **adherenceExplanation** | [**AdherenceExplanationResponse**](AdherenceExplanationResponse) | The adherence explanation added or modified by the job once complete; may be null if status == 'Error'. Used if type is in [ 'AddExplanation', 'UpdateExplanation' ] |  [optional] |
| **downloadUrl** | **String** | A URL to fetch results of the job. Only set if status == 'Complete' and type is in [ 'QueryAgentExplanations', 'QueryBuExplanations' ] |  [optional] |
| **error** | [**ErrorBody**](ErrorBody) | Error details if status == 'Error' |  [optional] |
| **agentQueryResponseTemplate** | [**AdherenceExplanationListingAgentQueryResponse**](AdherenceExplanationListingAgentQueryResponse) | Schema template for deserializing data returned from the downloadUrl. Use if type == 'QueryAgentExplanations' |  [optional] |
| **buQueryResponseTemplate** | [**AdherenceExplanationListingBuQueryResponse**](AdherenceExplanationListingBuQueryResponse) | Schema template for deserializing data returned from the downloadUrl. Use if type == 'QueryBuExplanations' |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ADDEXPLANATION | &quot;AddExplanation&quot; | 
| UPDATEEXPLANATION | &quot;UpdateExplanation&quot; | 
| QUERYAGENTEXPLANATIONS | &quot;QueryAgentExplanations&quot; | 
| QUERYBUEXPLANATIONS | &quot;QueryBuExplanations&quot; | 


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:220.0.0_
