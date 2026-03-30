# CaseCreate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **caseplanId** | **String** | The ID of the caseplan to create the case from. |  |
| **ownerId** | **String** | The ID of the owner of the case. |  [optional] |
| **summary** | **String** | Overview information for the Case. Valid length between 3 and 512 characters. |  [optional] |
| **externalContactId** | **String** | The ID of the External Contact associated with the Case. |  |
| **conversationId** | **String** | The ID of conversation associated with the Case. |  [optional] |
| **workitemId** | **String** | The ID of the workitem associated with the Case. |  [optional] |
| **ttlSeconds** | **Integer** | The epoch timestamp in seconds specifying the time-to-live for the lifetime of the Case. Can not be greater than 365 days from the current time. |  [optional] |
| **intake** | [**List&lt;Intake&gt;**](Intake) | The intake data for the Case. Maximum of 10 intake objects allowed. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:250.1.0_
