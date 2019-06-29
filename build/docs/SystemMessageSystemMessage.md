---
title: SystemMessageSystemMessage
---
## SystemMessageSystemMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **channelId** | **String** |  |  [optional] |
| **systemTopicType** | [**SystemTopicTypeEnum**](#SystemTopicTypeEnum) |  |  [optional] |
| **correlationId** | **String** |  |  [optional] |
| **organizationId** | **String** |  |  [optional] |
| **userId** | **String** |  |  [optional] |
| **oauthClientId** | **String** |  |  [optional] |
| **reason** | [**ReasonEnum**](#ReasonEnum) |  |  [optional] |
| **message** | **String** |  |  [optional] |
| **data** | **Object** |  |  [optional] |
{: class="table table-striped"}


<a name="SystemTopicTypeEnum"></a>

## Enum: SystemTopicTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| NO_LONGER_SUBSCRIBED | &quot;no_longer_subscribed&quot; |
| SUBSCRIPTION_CHANGED | &quot;subscription_changed&quot; |
{: class="table table-striped"}


<a name="ReasonEnum"></a>

## Enum: ReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ANOTHER_CHANNEL_SUBSCRIBED | &quot;another_channel_subscribed&quot; |
{: class="table table-striped"}



