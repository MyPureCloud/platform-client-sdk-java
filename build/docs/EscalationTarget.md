# EscalationTarget


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **targetType** | [**TargetTypeEnum**](#Enum--TargetTypeEnum) | Defines the target that the message will be escalated to. |  |
| **destination** | [**DestinationEnum**](#Enum--DestinationEnum) | Defines the destination of the escalation.SourceIntegration means use the SocialMedia Source Integration as the destination.OverrideIntegration means the set integration will be used regardless of the source. |  |
| **override** | [**OverrideEscalationTarget**](OverrideEscalationTarget) | Set the integration ID.Only valid when type is OverrideIntegration. |  [optional] |


## Enum: TargetTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CONVERSATION | &quot;Conversation&quot; | 


## Enum: DestinationEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SOURCEINTEGRATION | &quot;SourceIntegration&quot; | 
| OVERRIDEINTEGRATION | &quot;OverrideIntegration&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:224.0.0_
