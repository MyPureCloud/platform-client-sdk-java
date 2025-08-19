# TaskManagementAggregateQueryPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Optional type, can usually be inferred |  [optional] |
| **dimension** | [**DimensionEnum**](#Enum--DimensionEnum) | Left hand side for dimension predicates |  [optional] |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | Optional operator, default is matches |  [optional] |
| **value** | **String** | Right hand side for dimension predicates |  [optional] |
| **range** | [**NumericRange**](NumericRange) | Right hand side for dimension predicates |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DIMENSION | &quot;dimension&quot; | 
| PROPERTY | &quot;property&quot; | 
| METRIC | &quot;metric&quot; | 


## Enum: DimensionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASSIGNEEID | &quot;assigneeId&quot; | 
| DIVISIONID | &quot;divisionId&quot; | 
| EXTERNALTAG | &quot;externalTag&quot; | 
| QUEUEID | &quot;queueId&quot; | 
| REPORTERID | &quot;reporterId&quot; | 
| REQUESTEDLANGUAGEID | &quot;requestedLanguageId&quot; | 
| REQUESTEDROUTING | &quot;requestedRouting&quot; | 
| REQUESTEDROUTINGSKILLID | &quot;requestedRoutingSkillId&quot; | 
| STATUSCATEGORY | &quot;statusCategory&quot; | 
| STATUSID | &quot;statusId&quot; | 
| TYPEID | &quot;typeId&quot; | 
| USEDROUTING | &quot;usedRouting&quot; | 
| USERID | &quot;userId&quot; | 
| WORKBINID | &quot;workbinId&quot; | 
| WORKITEMID | &quot;workitemId&quot; | 
| WRAPUPCODE | &quot;wrapUpCode&quot; | 


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MATCHES | &quot;matches&quot; | 
| EXISTS | &quot;exists&quot; | 
| NOTEXISTS | &quot;notExists&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.1.0_
