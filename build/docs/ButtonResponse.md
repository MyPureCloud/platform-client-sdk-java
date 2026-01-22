# ButtonResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Button response type that captures Button and QuickReply type responses |  [optional] |
| **text** | **String** | Text to show inside the Button reply. This is also used as the response text after clicking on the Button. |  [optional] |
| **payload** | **String** | Content of the textback payload after clicking a button |  [optional] |
| **messageType** | [**MessageTypeEnum**](#Enum--MessageTypeEnum) | Button response message type that captures QuickReply , Cards and Carousel.This is used  as label for Card selection |  [optional] |
| **originatingMessageId** | **String** | Reference to the ID of the original message (e.g., list picker) this button response is replying to. |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BUTTON | &quot;Button&quot; | 
| QUICKREPLY | &quot;QuickReply&quot; | 
| DATEPICKER | &quot;DatePicker&quot; | 
| LISTPICKER | &quot;ListPicker&quot; | 
| FORM | &quot;Form&quot; | 


## Enum: MessageTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| QUICKREPLY | &quot;QuickReply&quot; | 
| CARD | &quot;Card&quot; | 
| CAROUSEL | &quot;Carousel&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
