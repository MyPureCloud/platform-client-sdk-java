---
title: DialerRulesetConfigChangeCondition
---
## DialerRulesetConfigChangeCondition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | **String** |  |  [optional] |
| **inverted** | **Boolean** |  |  [optional] |
| **attributeName** | **String** |  |  [optional] |
| **value** | **String** |  |  [optional] |
| **valueType** | [**ValueTypeEnum**](#ValueTypeEnum) |  |  [optional] |
| **operator** | [**OperatorEnum**](#OperatorEnum) |  |  [optional] |
| **codes** | **List&lt;String&gt;** |  |  [optional] |
| **propertyType** | [**PropertyTypeEnum**](#PropertyTypeEnum) |  |  [optional] |
| **property** | **String** |  |  [optional] |
| **dataNotFoundResolution** | **Boolean** |  |  [optional] |
| **contactIdField** | **String** |  |  [optional] |
| **callAnalysisResultField** | **String** |  |  [optional] |
| **agentWrapupField** | **String** |  |  [optional] |
| **contactColumnToDataActionFieldMappings** | [**List&lt;DialerRulesetConfigChangeContactColumnToDataActionFieldMapping&gt;**](DialerRulesetConfigChangeContactColumnToDataActionFieldMapping.html) |  |  [optional] |
| **predicates** | [**List&lt;DialerRulesetConfigChangeDataActionConditionPredicate&gt;**](DialerRulesetConfigChangeDataActionConditionPredicate.html) |  |  [optional] |
| **dataAction** | [**DialerRulesetConfigChangeUriReference**](DialerRulesetConfigChangeUriReference.html) |  |  [optional] |
| **additionalProperties** | **Object** |  |  [optional] |
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
{: class="table table-striped"}


<a name="PropertyTypeEnum"></a>

## Enum: PropertyTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| LAST_ATTEMPT_BY_COLUMN | &quot;LAST_ATTEMPT_BY_COLUMN&quot; |
| LAST_ATTEMPT_OVERALL | &quot;LAST_ATTEMPT_OVERALL&quot; |
| LAST_RESULT_BY_COLUMN | &quot;LAST_RESULT_BY_COLUMN&quot; |
| LAST_RESULT_OVERALL | &quot;LAST_RESULT_OVERALL&quot; |
{: class="table table-striped"}



