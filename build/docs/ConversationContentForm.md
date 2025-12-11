# ConversationContentForm


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **introduction** | [**ConversationContentIntroduction**](ConversationContentIntroduction) | The intro component, used to give an intro into what the form entails |  [optional] |
| **formPages** | [**List&lt;ConversationFormPage&gt;**](ConversationFormPage) | Form pages |  [optional] |
| **receivedMessage** | [**ConversationContentReceivedReplyMessage**](ConversationContentReceivedReplyMessage) | The message prompt to fill out the form received. |  [optional] |
| **replyMessage** | [**ConversationContentReceivedReplyMessage**](ConversationContentReceivedReplyMessage) | The reply message after the user has filled out the form received. |  [optional] |
| **showSummary** | **Boolean** | Show summary at end of form submission. |  [optional] |
| **response** | [**List&lt;ConversationFormResponseComponent&gt;**](ConversationFormResponseComponent) | Content of the payload included in the Form response. |  [optional] |
| **originatingMessageId** | **String** | Reference to the ID of the original message. |  [optional] |
| **cannedResponseId** | **String** | The id of the canned response which was used to create the form. |  |




_com.mypurecloud.sdk.v2:platform-client-v2:240.0.0_
