# CommonRuleBulkUpdateNotificationsRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **ruleIds** | **List&lt;String&gt;** | The user supplied rules ids to be updated |  |
| **properties** | [**ModifiableRuleProperties**](ModifiableRuleProperties) | The rule properties to be updated |  [optional] |
| **typesToAdd** | [**List<TypesToAddEnum>**](#Enum--TypesToAddEnum) | Collection of alerting notification types to add for all entities in the rules |  [optional] |
| **typesToRemove** | [**List<TypesToRemoveEnum>**](#Enum--TypesToRemoveEnum) | Collection of alerting notification types to remove for all entities in the rules |  [optional] |
{: class="table table-striped"}


## Enum: TypesToAddEnum

| Name | Value |
| ---- | ----- |
| SMS | &quot;Sms&quot; |
| DEVICE | &quot;Device&quot; |
| EMAIL | &quot;Email&quot; |
| PUSH | &quot;Push&quot; |
{: class="table table-striped"}


## Enum: TypesToRemoveEnum

| Name | Value |
| ---- | ----- |
| SMS | &quot;Sms&quot; |
| DEVICE | &quot;Device&quot; |
| EMAIL | &quot;Email&quot; |
| PUSH | &quot;Push&quot; |
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
