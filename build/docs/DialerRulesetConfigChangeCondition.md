# DialerRulesetConfigChangeCondition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dataAction** | [**DialerRulesetConfigChangeUriReference**](DialerRulesetConfigChangeUriReference) | A UriReference for a resource |  [optional] |
| **additionalProperties** | **Map&lt;String, Object&gt;** |  |  [optional] |
| **type** | **String** | The type of the condition |  [optional] |
| **inverted** | **Boolean** | Indicates whether to evaluate for the opposite of the stated condition; default is false |  [optional] |
| **attributeName** | **String** | An attribute name associated with the condition (applies only to certain rule conditions) |  [optional] |
| **value** | **String** | A value associated with the condition |  [optional] |
| **valueType** | [**ValueTypeEnum**](#Enum--ValueTypeEnum) | Determines the type of the value associated with the condition |  [optional] |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | An operation type for condition evaluation |  [optional] |
| **codes** | **List&lt;String&gt;** | List of wrap-up code identifiers (used only in conditions of type 'wrapupCondition') |  [optional] |
| **propertyType** | [**PropertyTypeEnum**](#Enum--PropertyTypeEnum) | Determines the type of the property associated with the condition |  [optional] |
| **property** | **String** | A value associated with the property type of this condition |  [optional] |
| **dataNotFoundResolution** | **Boolean** | The result of this condition if the data action returns a result indicating there was no data. Required for a DataActionCondition. |  [optional] |
| **contactIdField** | **String** | The input field from the data action that the contactId will be passed to for this condition. Valid for a dataActionCondition. |  [optional] |
| **callAnalysisResultField** | **String** | The input field from the data action that the callAnalysisResult will be passed to for this condition. Valid for a wrapup dataActionCondition. |  [optional] |
| **agentWrapupField** | **String** | The input field from the data action that the agentWrapup will be passed to for this condition. Valid for a wrapup dataActionCondition. |  [optional] |
| **contactColumnToDataActionFieldMappings** | [**List&lt;DialerRulesetConfigChangeContactColumnToDataActionFieldMapping&gt;**](DialerRulesetConfigChangeContactColumnToDataActionFieldMapping) | A list of mappings defining which contact data fields will be passed to which data action input fields for this condition. Valid for a dataActionCondition. |  [optional] |
| **predicates** | [**List&lt;DialerRulesetConfigChangeDataActionConditionPredicate&gt;**](DialerRulesetConfigChangeDataActionConditionPredicate) | A list of predicates defining the comparisons to use for this condition. Required for a dataActionCondition. |  [optional] |


## Enum: ValueTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| STRING | &quot;STRING&quot; | 
| NUMERIC | &quot;NUMERIC&quot; | 
| DATETIME | &quot;DATETIME&quot; | 
| PERIOD | &quot;PERIOD&quot; | 


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EQUALS | &quot;EQUALS&quot; | 
| LESS_THAN | &quot;LESS_THAN&quot; | 
| LESS_THAN_EQUALS | &quot;LESS_THAN_EQUALS&quot; | 
| GREATER_THAN | &quot;GREATER_THAN&quot; | 
| GREATER_THAN_EQUALS | &quot;GREATER_THAN_EQUALS&quot; | 
| CONTAINS | &quot;CONTAINS&quot; | 
| BEGINS_WITH | &quot;BEGINS_WITH&quot; | 
| ENDS_WITH | &quot;ENDS_WITH&quot; | 
| BEFORE | &quot;BEFORE&quot; | 
| AFTER | &quot;AFTER&quot; | 


## Enum: PropertyTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| LAST_ATTEMPT_BY_COLUMN | &quot;LAST_ATTEMPT_BY_COLUMN&quot; | 
| LAST_ATTEMPT_OVERALL | &quot;LAST_ATTEMPT_OVERALL&quot; | 
| LAST_RESULT_BY_COLUMN | &quot;LAST_RESULT_BY_COLUMN&quot; | 
| LAST_RESULT_OVERALL | &quot;LAST_RESULT_OVERALL&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:209.0.1_
