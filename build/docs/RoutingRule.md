---
title: RoutingRule
---
## RoutingRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> | matching operator.  MEETS_THRESHOLD matches any agent with a score at or above the rule's threshold.  ANY matches all specified agents, regardless of score. |  [optional] |
| **threshold** | <!----><!---->**Integer**<!----> | threshold required for routing attempt (generally an agent score).  may be null for operator ANY. |  [optional] |
| **waitSeconds** | <!----><!---->**Double**<!----> | seconds to wait in this rule before moving to the next |  [optional] |
{: class="table table-striped"}


<a name="OperatorEnum"></a>

## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MEETS_THRESHOLD | &quot;MEETS_THRESHOLD&quot; | 
| ANY | &quot;ANY&quot; | 
{: class="table table-striped"}



