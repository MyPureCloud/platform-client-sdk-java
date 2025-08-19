# PatchEntityTypeCriteria


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **key** | **String** | The criteria key. |  [optional] |
| **values** | **List&lt;String&gt;** | The criteria values. |  [optional] |
| **shouldIgnoreCase** | **Boolean** | Should criteria be case insensitive. |  [optional] |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | The comparison operator. |  [optional] |
| **entityType** | [**EntityTypeEnum**](#Enum--EntityTypeEnum) | The entity to match the pattern against. |  [optional] |


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CONTAINSALL | &quot;containsAll&quot; | 
| CONTAINSANY | &quot;containsAny&quot; | 
| NOTCONTAINSALL | &quot;notContainsAll&quot; | 
| NOTCONTAINSANY | &quot;notContainsAny&quot; | 
| EQUAL | &quot;equal&quot; | 
| NOTEQUAL | &quot;notEqual&quot; | 
| GREATERTHAN | &quot;greaterThan&quot; | 
| GREATERTHANOREQUAL | &quot;greaterThanOrEqual&quot; | 
| LESSTHAN | &quot;lessThan&quot; | 
| LESSTHANOREQUAL | &quot;lessThanOrEqual&quot; | 
| STARTSWITH | &quot;startsWith&quot; | 
| ENDSWITH | &quot;endsWith&quot; | 


## Enum: EntityTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| VISIT | &quot;visit&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.1.0_
