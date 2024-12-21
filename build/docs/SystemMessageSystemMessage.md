# SystemMessageSystemMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **channelId** | **String** |  |  [optional] |
| **systemTopicType** | [**SystemTopicTypeEnum**](#Enum--SystemTopicTypeEnum) |  |  [optional] |
| **correlationId** | **String** |  |  [optional] |
| **organizationId** | **String** |  |  [optional] |
| **userId** | **String** |  |  [optional] |
| **oauthClientId** | **String** |  |  [optional] |
| **reason** | [**ReasonEnum**](#Enum--ReasonEnum) |  |  [optional] |
| **message** | **String** |  |  [optional] |
| **data** | **Map&lt;String, Object&gt;** |  |  [optional] |


## Enum: SystemTopicTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NO_LONGER_SUBSCRIBED | &quot;no_longer_subscribed&quot; | 
| SUBSCRIPTION_CHANGED | &quot;subscription_changed&quot; | 
| TOKEN_REVOKED | &quot;token_revoked&quot; | 


## Enum: ReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ANOTHER_CHANNEL_SUBSCRIBED | &quot;another_channel_subscribed&quot; | 
| USER_TOKENS_REVOKED | &quot;user_tokens_revoked&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:217.0.0_
