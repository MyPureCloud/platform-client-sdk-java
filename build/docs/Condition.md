---
title: Condition
---
## Condition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of the condition. |  [optional] |
| **inverted** | <!----><!---->**Boolean**<!----> | If true, inverts the result of evaluating this Condition. Default is false. |  [optional] |
| **attributeName** | <!----><!---->**String**<!----> | An attribute name associated with this Condition. Required for a contactAttributeCondition. |  [optional] |
| **value** | <!----><!---->**String**<!----> | A value associated with this Condition. This could be text, a number, or a relative time. Not used for a DataActionCondition. |  [optional] |
| **valueType** | [**ValueTypeEnum**](#ValueTypeEnum)<!----> | The type of the value associated with this Condition. Not used for a DataActionCondition. |  [optional] |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> | An operation with which to evaluate the Condition. Not used for a DataActionCondition. |  [optional] |
| **codes** | <!----><!---->**List&lt;String&gt;**<!----> | List of wrap-up code identifiers. Required for a wrapupCondition. |  [optional] |
| **property** | <!----><!---->**String**<!----> | A value associated with the property type of this Condition. Required for a contactPropertyCondition. |  [optional] |
| **propertyType** | [**PropertyTypeEnum**](#PropertyTypeEnum)<!----> | The type of the property associated with this Condition. Required for a contactPropertyCondition. |  [optional] |
| **dataAction** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The Data Action to use for this condition. Required for a dataActionCondition. |  [optional] |
| **dataNotFoundResolution** | <!----><!---->**Boolean**<!----> | The result of this condition if the data action returns a result indicating there was no data. Required for a DataActionCondition. |  [optional] |
| **contactIdField** | <!----><!---->**String**<!----> | The input field from the data action that the contactId will be passed to for this condition. Valid for a dataActionCondition. |  [optional] |
| **callAnalysisResultField** | <!----><!---->**String**<!----> | The input field from the data action that the callAnalysisResult will be passed to for this condition. Valid for a wrapup dataActionCondition. |  [optional] |
| **agentWrapupField** | <!----><!---->**String**<!----> | The input field from the data action that the agentWrapup will be passed to for this condition. Valid for a wrapup dataActionCondition. |  [optional] |
| **contactColumnToDataActionFieldMappings** | <!----><!---->[**List&lt;ContactColumnToDataActionFieldMapping&gt;**](ContactColumnToDataActionFieldMapping.html)<!----> | A list of mappings defining which contact data fields will be passed to which data action input fields for this condition. Valid for a dataActionCondition. |  [optional] |
| **predicates** | <!----><!---->[**List&lt;DataActionConditionPredicate&gt;**](DataActionConditionPredicate.html)<!----> | A list of predicates defining the comparisons to use for this condition. Required for a dataActionCondition. |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| WRAPUPCONDITION | &quot;wrapupCondition&quot; |
| CONTACTATTRIBUTECONDITION | &quot;contactAttributeCondition&quot; |
| PHONENUMBERCONDITION | &quot;phoneNumberCondition&quot; |
| PHONENUMBERTYPECONDITION | &quot;phoneNumberTypeCondition&quot; |
| CALLANALYSISCONDITION | &quot;callAnalysisCondition&quot; |
| CONTACTPROPERTYCONDITION | &quot;contactPropertyCondition&quot; |
| DATAACTIONCONDITION | &quot;dataActionCondition&quot; |
{: class="table table-striped"}


<a name="ValueTypeEnum"></a>

## Enum: ValueTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| STRING | &quot;STRING&quot; |
| NUMERIC | &quot;NUMERIC&quot; |
| DATETIME | &quot;DATETIME&quot; |
| PERIOD | &quot;PERIOD&quot; |
{: class="table table-striped"}


<a name="OperatorEnum"></a>

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
| IN | &quot;IN&quot; |
{: class="table table-striped"}


<a name="PropertyTypeEnum"></a>

## Enum: PropertyTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| LAST_ATTEMPT_BY_COLUMN | &quot;LAST_ATTEMPT_BY_COLUMN&quot; |
| LAST_ATTEMPT_OVERALL | &quot;LAST_ATTEMPT_OVERALL&quot; |
| LAST_WRAPUP_BY_COLUMN | &quot;LAST_WRAPUP_BY_COLUMN&quot; |
| LAST_WRAPUP_OVERALL | &quot;LAST_WRAPUP_OVERALL&quot; |
{: class="table table-striped"}



