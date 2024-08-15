# PredictionResults


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **intent** | [**IntentEnum**](#Enum--IntentEnum) | Indicates the media type scope of this estimated wait time |  [optional] |
| **formula** | [**FormulaEnum**](#Enum--FormulaEnum) | Indicates the estimated wait time Formula |  |
| **estimatedWaitTimeSeconds** | **Integer** | Estimated wait time in seconds |  |
{: class="table table-striped"}


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
{: class="table table-striped"}


## Enum: FormulaEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BEST | &quot;BEST&quot; | 
| SIMPLE | &quot;SIMPLE&quot; | 
| ABANDON | &quot;ABANDON&quot; | 
| PATIENCE_ABANDON | &quot;PATIENCE_ABANDON&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:207.0.0_
