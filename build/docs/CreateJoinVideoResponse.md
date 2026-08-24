# CreateJoinVideoResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **communicationId** | **String** | The communication id for the video or modified by the command. |  [optional] |
| **conversationId** | **String** | The conversation id for the conversation created or modified by the command. |  [optional] |
| **joinCode** | **String** | The join code for the video conference. Only returned by the voice-to-video upgrade endpoint (POST /conversations/videos/{conversationId}/agentconference/communications/{communicationId}); not populated by POST /conversations/videos. Valid until the voice-to-video offer expires (default 5 minutes) or until used by a guest. One-time use. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:260.1.0_
