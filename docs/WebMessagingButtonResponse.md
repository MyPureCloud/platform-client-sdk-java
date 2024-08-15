# WebMessagingButtonResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | An ID assigned to the button response (Deprecated). |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Describes the button that resulted in the Button Response. |  [optional] |
| **text** | **String** | The response text from the button click. |  |
| **payload** | **String** | The response payload associated with the clicked button. |  |
{: class="table table-striped"}


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BUTTON | &quot;Button&quot; | 
| QUICKREPLY | &quot;QuickReply&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:207.0.0_
