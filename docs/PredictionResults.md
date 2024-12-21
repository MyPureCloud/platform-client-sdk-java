# PredictionResults


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **intent** | [**IntentEnum**](#Enum--IntentEnum) | Indicates the media type scope of this estimated wait time |  [optional] |
| **formula** | [**FormulaEnum**](#Enum--FormulaEnum) | Indicates the estimated wait time Formula |  |
| **estimatedWaitTimeSeconds** | **Integer** | Estimated wait time in seconds |  |
| **label** | [**AddressableEntityRef**](AddressableEntityRef) | This specifies the interaction label scoped to this estimated wait time calculation |  [optional] |


## Enum: IntentEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALL | &quot;ALL&quot; | 
| CALL | &quot;CALL&quot; | 
| CALLBACK | &quot;CALLBACK&quot; | 
| CHAT | &quot;CHAT&quot; | 
| EMAIL | &quot;EMAIL&quot; | 
| SOCIALEXPRESSION | &quot;SOCIALEXPRESSION&quot; | 
| VIDEOCOMM | &quot;VIDEOCOMM&quot; | 
| MESSAGE | &quot;MESSAGE&quot; | 


## Enum: FormulaEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BEST | &quot;BEST&quot; | 
| SIMPLE | &quot;SIMPLE&quot; | 
| ABANDON | &quot;ABANDON&quot; | 
| PATIENCE_ABANDON | &quot;PATIENCE_ABANDON&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:217.0.0_
