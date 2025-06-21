# LocaleInfo


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Status of health computation for this flow version. |  [optional] |
| **errorInfo** | [**FlowHealthErrorInfo**](FlowHealthErrorInfo) | Error details for the flow version, if any. |  [optional] |
| **flowVersionInfo** | [**LocaleFlowVersionInfo**](LocaleFlowVersionInfo) | Info about given flow version. |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:227.0.0_
