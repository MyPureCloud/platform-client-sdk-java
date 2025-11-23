# RecordingForm


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **introduction** | [**RecordingIntroduction**](RecordingIntroduction) | The introduction component, used to give an intro into what the form entails. |  [optional] |
| **formPages** | [**List&lt;RecordingFormPage&gt;**](RecordingFormPage) | Form pages. |  [optional] |
| **receivedMessage** | [**ReceivedReplyMessage**](ReceivedReplyMessage) | Defines the initial prompt message structure containing title and subtitle fields that are displayed to the end user when a form requires completion. |  [optional] |
| **replyMessage** | [**ReceivedReplyMessage**](ReceivedReplyMessage) | The reply message after the user has filled out the form received. |  [optional] |
| **response** | [**List&lt;RecordingFormResponseComponent&gt;**](RecordingFormResponseComponent) | Content of the payload included in the Form response. |  [optional] |
| **originatingMessageId** | **String** | Reference to the id of the original message. |  [optional] |
| **cannedResponseId** | **String** | The id of the canned response which was used to create the form. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:238.0.0_
