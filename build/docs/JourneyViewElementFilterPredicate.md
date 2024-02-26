---
title: JourneyViewElementFilterPredicate
---
## JourneyViewElementFilterPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dimension** | <!----><!---->**String**<!----> | the element's attribute being filtered on |  |
| **values** | <!----><!---->**List&lt;String&gt;**<!----> | the values of the attribute to filter on |  |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> | Optional operator, default is Matches. Valid values: Matches |  [optional] |
| **noValue** | <!----><!---->**Boolean**<!----> | set this to true if no specific value to be considered |  [optional] |
{: class="table table-striped"}


<a name="OperatorEnum"></a>

## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MATCHES | &quot;Matches&quot; | 
| NOTMATCHES | &quot;NotMatches&quot; | 
{: class="table table-striped"}



