# ContentCardAction


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Describes the type of action. |  [optional] |
| **text** | **String** | The response text from the button click. |  [optional] |
| **payload** | **String** | Text to be returned as the payload from a ButtonResponse when a button is clicked. The payload and text are a combination which will have to be unique across each card and carousel in order to determine which button was clicked in that card or carousel. |  [optional] |
| **url** | **String** | A URL of a web page to direct the user to. |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| LINK | &quot;Link&quot; | 
| POSTBACK | &quot;Postback&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:240.0.0_
