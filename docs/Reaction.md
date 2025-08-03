# Reaction


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **data** | **String** | Parameter for this reaction. For transfer_flow, this would be the outbound flow id. |  [optional] |
| **name** | **String** | Name of the parameter for this reaction. For transfer_flow, this would be the outbound flow name. |  [optional] |
| **reactionType** | [**ReactionTypeEnum**](#Enum--ReactionTypeEnum) | The reaction to take for a given call analysis result. |  |


## Enum: ReactionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| HANGUP | &quot;hangup&quot; | 
| TRANSFER | &quot;transfer&quot; | 
| TRANSFER_FLOW | &quot;transfer_flow&quot; | 
| PLAY_FILE | &quot;play_file&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.0.0_
