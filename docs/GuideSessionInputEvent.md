# GuideSessionInputEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of input event. |  |
| **text** | **String** | The text content of the input event. |  [optional] |
| **mode** | [**ModeEnum**](#Enum--ModeEnum) | The input mode for this event. |  |
| **invocationId** | **String** | The invocation ID of the input event. |  [optional] |
| **invocations** | [**List&lt;GuideSessionTurnInvocationData&gt;**](GuideSessionTurnInvocationData) | The invocation data of the input event. |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| USERINPUT | &quot;UserInput&quot; | 
| RETURNCONTROL | &quot;ReturnControl&quot; | 
| NOOP | &quot;NoOp&quot; | 


## Enum: ModeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TEXT | &quot;Text&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:244.0.0_
