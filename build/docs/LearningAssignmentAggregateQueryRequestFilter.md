# LearningAssignmentAggregateQueryRequestFilter


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The logic used to combine the clauses |  |
| **clauses** | [**List&lt;LearningAssignmentAggregateQueryRequestClause&gt;**](LearningAssignmentAggregateQueryRequestClause) | The list of clauses used to filter the data. Note that clauses must filter by attendeeId and a maximum of 100 user IDs are allowed |  |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AND | &quot;And&quot; | 
| OR | &quot;Or&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:211.0.0_
