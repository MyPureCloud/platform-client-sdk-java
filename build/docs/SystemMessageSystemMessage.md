---
title: SystemMessageSystemMessage
---
## SystemMessageSystemMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **channelId** | <!----><!---->**String**<!----> |  |  [optional] |
| **systemTopicType** | [**SystemTopicTypeEnum**](#SystemTopicTypeEnum)<!----> |  |  [optional] |
| **correlationId** | <!----><!---->**String**<!----> |  |  [optional] |
| **organizationId** | <!----><!---->**String**<!----> |  |  [optional] |
| **userId** | <!----><!---->**String**<!----> |  |  [optional] |
| **oauthClientId** | <!----><!---->**String**<!----> |  |  [optional] |
| **reason** | [**ReasonEnum**](#ReasonEnum)<!----> |  |  [optional] |
| **message** | <!----><!---->**String**<!----> |  |  [optional] |
| **data** | <!----><!---->[**Map&lt;String, SystemMessageObject&gt;**](SystemMessageObject.html)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="SystemTopicTypeEnum"></a>

## Enum: SystemTopicTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| NO_LONGER_SUBSCRIBED | &quot;no_longer_subscribed&quot; |
| SUBSCRIPTION_CHANGED | &quot;subscription_changed&quot; |
| TOKEN_REVOKED | &quot;token_revoked&quot; |
{: class="table table-striped"}


<a name="ReasonEnum"></a>

## Enum: ReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ANOTHER_CHANNEL_SUBSCRIBED | &quot;another_channel_subscribed&quot; |
| USER_TOKENS_REVOKED | &quot;user_tokens_revoked&quot; |
{: class="table table-striped"}



