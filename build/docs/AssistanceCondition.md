# AssistanceCondition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | The operator for the assistance condition. The operator defines whether the listed topicIds should EXIST or NOTEXIST for the condition to be evaluated as true. |  [optional] |
| **topicIds** | **List&lt;String&gt;** | List of topicIds within the assistance condition which would be combined together using logical OR operator. Eg ( topicId_1 || topicId_2 ) . |  [optional] |


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EXISTS | &quot;EXISTS&quot; | 
| NOTEXISTS | &quot;NOTEXISTS&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
