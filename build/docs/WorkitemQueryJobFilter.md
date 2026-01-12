# WorkitemQueryJobFilter


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | Attribute name. Valid filter names are: 'workbinId', 'id', 'typeId', 'priority', 'dateCreated', 'dateDue', 'statusId', 'dateClosed', 'externalContactId', 'assigneeId', 'assignmentState', 'queueId', 'externalTag', 'divisionId' |  |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | Filter operator. |  |
| **values** | **List&lt;String&gt;** | List of values to be used in the filter. |  |


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EQ | &quot;EQ&quot; | 
| NEQ | &quot;NEQ&quot; | 
| GT | &quot;GT&quot; | 
| LT | &quot;LT&quot; | 
| GTE | &quot;GTE&quot; | 
| LTE | &quot;LTE&quot; | 
| IN | &quot;IN&quot; | 
| CONTAINS | &quot;CONTAINS&quot; | 
| BETWEEN | &quot;BETWEEN&quot; | 
| BEGINS_WITH | &quot;BEGINS_WITH&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:243.0.0_
