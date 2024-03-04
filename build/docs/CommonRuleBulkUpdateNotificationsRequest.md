---
title: CommonRuleBulkUpdateNotificationsRequest
---
## CommonRuleBulkUpdateNotificationsRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **ruleIds** | <!----><!---->**List&lt;String&gt;**<!----> | The user supplied rules ids to be updated |  |
| **properties** | <!----><!---->[**ModifiableRuleProperties**](ModifiableRuleProperties.html)<!----> | The rule properties to be updated |  [optional] |
| **typesToAdd** | <!---->[**List&lt;TypesToAddEnum&gt;**](#TypesToAddEnum)<!----> | Collection of alerting notification types to add for all entities in the rules |  [optional] |
| **typesToRemove** | <!---->[**List&lt;TypesToRemoveEnum&gt;**](#TypesToRemoveEnum)<!----> | Collection of alerting notification types to remove for all entities in the rules |  [optional] |
{: class="table table-striped"}


<a name="TypesToAddEnum"></a>

## Enum: TypesToAddEnum

| Name | Value |
| ---- | ----- |
| SMS | &quot;Sms&quot; |
| DEVICE | &quot;Device&quot; |
| EMAIL | &quot;Email&quot; |
| PUSH | &quot;Push&quot; |
{: class="table table-striped"}


<a name="TypesToRemoveEnum"></a>

## Enum: TypesToRemoveEnum

| Name | Value |
| ---- | ----- |
| SMS | &quot;Sms&quot; |
| DEVICE | &quot;Device&quot; |
| EMAIL | &quot;Email&quot; |
| PUSH | &quot;Push&quot; |
{: class="table table-striped"}



