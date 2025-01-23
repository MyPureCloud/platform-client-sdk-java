# ContentButtonResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | An ID assigned to the button response (Deprecated). |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Describes the button that resulted in the Button Response. |  |
| **text** | **String** | The response text from the button click. |  |
| **payload** | **String** | The response payload associated with the clicked button. |  |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BUTTON | &quot;Button&quot; | 
| DATEPICKER | &quot;DatePicker&quot; | 
| QUICKREPLY | &quot;QuickReply&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:218.0.0_
