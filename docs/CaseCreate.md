# CaseCreate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **caseplanId** | **String** | The ID of the Caseplan used to create the Case. |  |
| **ownerId** | **String** | The ID of the owner of the Case. |  [optional] |
| **summary** | **String** | Overview information for the Case. Valid length between 3 and 512 characters. |  [optional] |
| **externalContactId** | **String** | The ID of the External Contact associated with the Case. |  |
| **conversationId** | **String** | The ID of the Conversation associated with the Case. |  [optional] |
| **workitemId** | **String** | The ID of the Workitem associated with the Case. |  [optional] |
| **ttlSeconds** | **Integer** | Epoch timestamp in seconds for the Case time-to-live. Cannot be more than 365 days after the current time. |  [optional] |
| **intake** | [**List&lt;Intake&gt;**](Intake) | The intake data for the Case. Maximum of 10 intake objects allowed. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:257.0.0_
