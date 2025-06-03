# ConversationContentButtonResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **originatingMessageId** | **String** | Reference to the ID of the original message (e.g., list picker) this button response is replying to. |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Describes the button that resulted in the Button Response. |  [optional] |
| **text** | **String** | The response text from the button click. |  |
| **payload** | **String** | The response payload associated with the clicked button. |  |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BUTTON | &quot;Button&quot; | 
| QUICKREPLY | &quot;QuickReply&quot; | 
| DATEPICKER | &quot;DatePicker&quot; | 
| LISTPICKER | &quot;ListPicker&quot; | 
| FORM | &quot;Form&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:226.0.0_
