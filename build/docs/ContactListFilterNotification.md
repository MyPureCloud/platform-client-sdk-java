---
title: ContactListFilterNotification
---
## ContactListFilterNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **name** | **String** |  |  [optional] |
| **dateCreated** | [**Date**](Date.html) |  |  [optional] |
| **dateModified** | [**Date**](Date.html) |  |  [optional] |
| **version** | **Integer** |  |  [optional] |
| **contactList** | [**DocumentDataV2NotificationCreatedBy**](DocumentDataV2NotificationCreatedBy.html) |  |  [optional] |
| **contactListColumns** | **List&lt;String&gt;** |  |  [optional] |
| **clauses** | [**List&lt;ContactListFilterNotificationClauses&gt;**](ContactListFilterNotificationClauses.html) |  |  [optional] |
| **filterType** | [**FilterTypeEnum**](#FilterTypeEnum) |  |  [optional] |
| **additionalProperties** | **Object** |  |  [optional] |
{: class="table table-striped"}


<a name="FilterTypeEnum"></a>

## Enum: FilterTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| AND | &quot;AND&quot; |
| OR | &quot;OR&quot; |
{: class="table table-striped"}


