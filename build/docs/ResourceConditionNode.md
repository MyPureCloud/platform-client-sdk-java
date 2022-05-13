---
title: ResourceConditionNode
---
## ResourceConditionNode


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **variableName** | <!----><!---->**String**<!----> |  |  [optional] |
| **conjunction** | [**ConjunctionEnum**](#ConjunctionEnum)<!----> |  |  [optional] |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> |  |  [optional] |
| **operands** | <!----><!---->[**List&lt;ResourceConditionValue&gt;**](ResourceConditionValue.html)<!----> |  |  [optional] |
| **terms** | <!----><!---->[**List&lt;ResourceConditionNode&gt;**](ResourceConditionNode.html)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="ConjunctionEnum"></a>

## Enum: ConjunctionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AND | &quot;AND&quot; | 
| OR | &quot;OR&quot; | 
{: class="table table-striped"}


<a name="OperatorEnum"></a>

## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EQ | &quot;EQ&quot; | 
| IN | &quot;IN&quot; | 
| GE | &quot;GE&quot; | 
| GT | &quot;GT&quot; | 
| LE | &quot;LE&quot; | 
| LT | &quot;LT&quot; | 
{: class="table table-striped"}



