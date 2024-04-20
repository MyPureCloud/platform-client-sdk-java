---
title: SpeechTextAnalyticsApi
---
## SpeechTextAnalyticsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackId**](SpeechTextAnalyticsApi.html#deleteSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackId) | Delete a Speech & Text Analytics DictionaryFeedback by Id |
| [**deleteSpeechandtextanalyticsProgram**](SpeechTextAnalyticsApi.html#deleteSpeechandtextanalyticsProgram) | Delete a Speech & Text Analytics program by id |
| [**deleteSpeechandtextanalyticsSentimentfeedback**](SpeechTextAnalyticsApi.html#deleteSpeechandtextanalyticsSentimentfeedback) | Delete All Speech & Text Analytics SentimentFeedback |
| [**deleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackId**](SpeechTextAnalyticsApi.html#deleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackId) | Delete a Speech & Text Analytics SentimentFeedback by Id |
| [**deleteSpeechandtextanalyticsTopic**](SpeechTextAnalyticsApi.html#deleteSpeechandtextanalyticsTopic) | Delete a Speech & Text Analytics topic by id |
| [**getSpeechandtextanalyticsConversation**](SpeechTextAnalyticsApi.html#getSpeechandtextanalyticsConversation) | Get Speech and Text Analytics for a specific conversation |
| [**getSpeechandtextanalyticsConversationCommunicationTranscripturl**](SpeechTextAnalyticsApi.html#getSpeechandtextanalyticsConversationCommunicationTranscripturl) | Get the pre-signed S3 URL for the transcript of a specific communication of a conversation |
| [**getSpeechandtextanalyticsConversationCommunicationTranscripturls**](SpeechTextAnalyticsApi.html#getSpeechandtextanalyticsConversationCommunicationTranscripturls) | Get the list of pre-signed S3 URL for the transcripts of a specific communication of a conversation |
| [**getSpeechandtextanalyticsDictionaryfeedback**](SpeechTextAnalyticsApi.html#getSpeechandtextanalyticsDictionaryfeedback) | Get the list of Speech & Text Analytics dictionary feedbacks |
| [**getSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackId**](SpeechTextAnalyticsApi.html#getSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackId) | Get a Speech & Text Analytics dictionary feedback by id |
| [**getSpeechandtextanalyticsProgram**](SpeechTextAnalyticsApi.html#getSpeechandtextanalyticsProgram) | Get a Speech & Text Analytics program by id |
| [**getSpeechandtextanalyticsProgramMappings**](SpeechTextAnalyticsApi.html#getSpeechandtextanalyticsProgramMappings) | Get Speech & Text Analytics program mappings to queues and flows by id |
| [**getSpeechandtextanalyticsProgramTranscriptionengines**](SpeechTextAnalyticsApi.html#getSpeechandtextanalyticsProgramTranscriptionengines) | Get transcription engine settings of a program |
| [**getSpeechandtextanalyticsPrograms**](SpeechTextAnalyticsApi.html#getSpeechandtextanalyticsPrograms) | Get the list of Speech & Text Analytics programs |
| [**getSpeechandtextanalyticsProgramsGeneralJob**](SpeechTextAnalyticsApi.html#getSpeechandtextanalyticsProgramsGeneralJob) | Get a Speech & Text Analytics general program job by id |
| [**getSpeechandtextanalyticsProgramsMappings**](SpeechTextAnalyticsApi.html#getSpeechandtextanalyticsProgramsMappings) | Get the list of Speech & Text Analytics programs mappings to queues and flows |
| [**getSpeechandtextanalyticsProgramsPublishjob**](SpeechTextAnalyticsApi.html#getSpeechandtextanalyticsProgramsPublishjob) | Get a Speech & Text Analytics publish programs job by id |
| [**getSpeechandtextanalyticsProgramsTranscriptionenginesDialects**](SpeechTextAnalyticsApi.html#getSpeechandtextanalyticsProgramsTranscriptionenginesDialects) | Get supported dialects for each transcription engine |
| [**getSpeechandtextanalyticsProgramsUnpublished**](SpeechTextAnalyticsApi.html#getSpeechandtextanalyticsProgramsUnpublished) | Get the list of Speech & Text Analytics unpublished programs |
| [**getSpeechandtextanalyticsSentimentDialects**](SpeechTextAnalyticsApi.html#getSpeechandtextanalyticsSentimentDialects) | Get the list of Speech & Text Analytics sentiment supported dialects |
| [**getSpeechandtextanalyticsSentimentfeedback**](SpeechTextAnalyticsApi.html#getSpeechandtextanalyticsSentimentfeedback) | Get the list of Speech & Text Analytics SentimentFeedback |
| [**getSpeechandtextanalyticsSettings**](SpeechTextAnalyticsApi.html#getSpeechandtextanalyticsSettings) | Get Speech And Text Analytics Settings |
| [**getSpeechandtextanalyticsTopic**](SpeechTextAnalyticsApi.html#getSpeechandtextanalyticsTopic) | Get a Speech & Text Analytics topic by id |
| [**getSpeechandtextanalyticsTopics**](SpeechTextAnalyticsApi.html#getSpeechandtextanalyticsTopics) | Get the list of Speech & Text Analytics topics |
| [**getSpeechandtextanalyticsTopicsDialects**](SpeechTextAnalyticsApi.html#getSpeechandtextanalyticsTopicsDialects) | Get list of supported Speech & Text Analytics topics dialects |
| [**getSpeechandtextanalyticsTopicsGeneral**](SpeechTextAnalyticsApi.html#getSpeechandtextanalyticsTopicsGeneral) | Get the Speech & Text Analytics general topics for a given dialect |
| [**getSpeechandtextanalyticsTopicsGeneralStatus**](SpeechTextAnalyticsApi.html#getSpeechandtextanalyticsTopicsGeneralStatus) | Get the list of general topics from the org and the system with their current status |
| [**getSpeechandtextanalyticsTopicsPublishjob**](SpeechTextAnalyticsApi.html#getSpeechandtextanalyticsTopicsPublishjob) | Get a Speech & Text Analytics publish topics job by id |
| [**patchSpeechandtextanalyticsSettings**](SpeechTextAnalyticsApi.html#patchSpeechandtextanalyticsSettings) | Patch Speech And Text Analytics Settings |
| [**postSpeechandtextanalyticsDictionaryfeedback**](SpeechTextAnalyticsApi.html#postSpeechandtextanalyticsDictionaryfeedback) | Create a Speech & Text Analytics DictionaryFeedback |
| [**postSpeechandtextanalyticsPrograms**](SpeechTextAnalyticsApi.html#postSpeechandtextanalyticsPrograms) | Create new Speech & Text Analytics program |
| [**postSpeechandtextanalyticsProgramsGeneralJobs**](SpeechTextAnalyticsApi.html#postSpeechandtextanalyticsProgramsGeneralJobs) | Create new Speech & Text Analytics general program job |
| [**postSpeechandtextanalyticsProgramsPublishjobs**](SpeechTextAnalyticsApi.html#postSpeechandtextanalyticsProgramsPublishjobs) | Create new Speech & Text Analytics publish programs job |
| [**postSpeechandtextanalyticsSentimentfeedback**](SpeechTextAnalyticsApi.html#postSpeechandtextanalyticsSentimentfeedback) | Create a Speech & Text Analytics SentimentFeedback |
| [**postSpeechandtextanalyticsTopics**](SpeechTextAnalyticsApi.html#postSpeechandtextanalyticsTopics) | Create new Speech & Text Analytics topic |
| [**postSpeechandtextanalyticsTopicsPublishjobs**](SpeechTextAnalyticsApi.html#postSpeechandtextanalyticsTopicsPublishjobs) | Create new Speech & Text Analytics publish topics job |
| [**postSpeechandtextanalyticsTranscriptsSearch**](SpeechTextAnalyticsApi.html#postSpeechandtextanalyticsTranscriptsSearch) | Search resources. |
| [**putSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackId**](SpeechTextAnalyticsApi.html#putSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackId) | Update existing Speech & Text Analytics dictionary feedback by id |
| [**putSpeechandtextanalyticsProgram**](SpeechTextAnalyticsApi.html#putSpeechandtextanalyticsProgram) | Update existing Speech & Text Analytics program |
| [**putSpeechandtextanalyticsProgramMappings**](SpeechTextAnalyticsApi.html#putSpeechandtextanalyticsProgramMappings) | Set Speech & Text Analytics program mappings to queues and flows |
| [**putSpeechandtextanalyticsProgramTranscriptionengines**](SpeechTextAnalyticsApi.html#putSpeechandtextanalyticsProgramTranscriptionengines) | Update transcription engine settings of a program |
| [**putSpeechandtextanalyticsSettings**](SpeechTextAnalyticsApi.html#putSpeechandtextanalyticsSettings) | Update Speech And Text Analytics Settings |
| [**putSpeechandtextanalyticsTopic**](SpeechTextAnalyticsApi.html#putSpeechandtextanalyticsTopic) | Update existing Speech & Text Analytics topic |
{: class="table-striped"}

<a name="deleteSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackId"></a>

# **deleteSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackId**



> Void deleteSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackId(dictionaryFeedbackId)

Delete a Speech & Text Analytics DictionaryFeedback by Id

Wraps DELETE /api/v2/speechandtextanalytics/dictionaryfeedback/{dictionaryFeedbackId}  

Requires ALL permissions: 

* speechAndTextAnalytics:dictionaryterm:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String dictionaryFeedbackId = "dictionaryFeedbackId_example"; // String | The Id of the Dictionary Feedback
try {
    apiInstance.deleteSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackId(dictionaryFeedbackId);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#deleteSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dictionaryFeedbackId** | **String**| The Id of the Dictionary Feedback | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteSpeechandtextanalyticsProgram"></a>

# **deleteSpeechandtextanalyticsProgram**



> Void deleteSpeechandtextanalyticsProgram(programId, forceDelete)

Delete a Speech & Text Analytics program by id

Wraps DELETE /api/v2/speechandtextanalytics/programs/{programId}  

Requires ALL permissions: 

* speechAndTextAnalytics:program:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String programId = "programId_example"; // String | The id of the program
Boolean forceDelete = false; // Boolean | Indicates whether the program is forced to be deleted or not. Required when the program to delete is the default program.
try {
    apiInstance.deleteSpeechandtextanalyticsProgram(programId, forceDelete);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#deleteSpeechandtextanalyticsProgram");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **programId** | **String**| The id of the program | 
| **forceDelete** | **Boolean**| Indicates whether the program is forced to be deleted or not. Required when the program to delete is the default program. | [optional] [default to false]<br />**Values**: true, false 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteSpeechandtextanalyticsSentimentfeedback"></a>

# **deleteSpeechandtextanalyticsSentimentfeedback**



> Void deleteSpeechandtextanalyticsSentimentfeedback()

Delete All Speech & Text Analytics SentimentFeedback

Wraps DELETE /api/v2/speechandtextanalytics/sentimentfeedback  

Requires ALL permissions: 

* speechAndTextAnalytics:feedback:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
try {
    apiInstance.deleteSpeechandtextanalyticsSentimentfeedback();
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#deleteSpeechandtextanalyticsSentimentfeedback");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

null (empty response body)

<a name="deleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackId"></a>

# **deleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackId**



> Void deleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackId(sentimentFeedbackId)

Delete a Speech & Text Analytics SentimentFeedback by Id

Wraps DELETE /api/v2/speechandtextanalytics/sentimentfeedback/{sentimentFeedbackId}  

Requires ALL permissions: 

* speechAndTextAnalytics:feedback:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String sentimentFeedbackId = "sentimentFeedbackId_example"; // String | The Id of the SentimentFeedback
try {
    apiInstance.deleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackId(sentimentFeedbackId);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#deleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sentimentFeedbackId** | **String**| The Id of the SentimentFeedback | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteSpeechandtextanalyticsTopic"></a>

# **deleteSpeechandtextanalyticsTopic**



> Void deleteSpeechandtextanalyticsTopic(topicId)

Delete a Speech & Text Analytics topic by id

Wraps DELETE /api/v2/speechandtextanalytics/topics/{topicId}  

Requires ALL permissions: 

* speechAndTextAnalytics:topic:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String topicId = "topicId_example"; // String | The id of the topic
try {
    apiInstance.deleteSpeechandtextanalyticsTopic(topicId);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#deleteSpeechandtextanalyticsTopic");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topicId** | **String**| The id of the topic | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="getSpeechandtextanalyticsConversation"></a>

# **getSpeechandtextanalyticsConversation**



> [ConversationMetrics](ConversationMetrics.html) getSpeechandtextanalyticsConversation(conversationId)

Get Speech and Text Analytics for a specific conversation

Wraps GET /api/v2/speechandtextanalytics/conversations/{conversationId}  

Requires ALL permissions: 

* recording:recording:view
* speechAndTextAnalytics:data:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String conversationId = "conversationId_example"; // String | Conversation Id
try {
    ConversationMetrics result = apiInstance.getSpeechandtextanalyticsConversation(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsConversation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation Id | 
{: class="table-striped"}


### Return type

[**ConversationMetrics**](ConversationMetrics.html)

<a name="getSpeechandtextanalyticsConversationCommunicationTranscripturl"></a>

# **getSpeechandtextanalyticsConversationCommunicationTranscripturl**



> [TranscriptUrl](TranscriptUrl.html) getSpeechandtextanalyticsConversationCommunicationTranscripturl(conversationId, communicationId)

Get the pre-signed S3 URL for the transcript of a specific communication of a conversation

Wraps GET /api/v2/speechandtextanalytics/conversations/{conversationId}/communications/{communicationId}/transcripturl  

Requires ALL permissions: 

* recording:recording:view
* speechAndTextAnalytics:data:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String communicationId = "communicationId_example"; // String | Communication ID
try {
    TranscriptUrl result = apiInstance.getSpeechandtextanalyticsConversationCommunicationTranscripturl(conversationId, communicationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsConversationCommunicationTranscripturl");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation ID | 
| **communicationId** | **String**| Communication ID | 
{: class="table-striped"}


### Return type

[**TranscriptUrl**](TranscriptUrl.html)

<a name="getSpeechandtextanalyticsConversationCommunicationTranscripturls"></a>

# **getSpeechandtextanalyticsConversationCommunicationTranscripturls**



> [TranscriptUrls](TranscriptUrls.html) getSpeechandtextanalyticsConversationCommunicationTranscripturls(conversationId, communicationId)

Get the list of pre-signed S3 URL for the transcripts of a specific communication of a conversation

Wraps GET /api/v2/speechandtextanalytics/conversations/{conversationId}/communications/{communicationId}/transcripturls  

Requires ANY permissions: 

* recording:recording:view
* recording:recordingSegment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String communicationId = "communicationId_example"; // String | Communication ID
try {
    TranscriptUrls result = apiInstance.getSpeechandtextanalyticsConversationCommunicationTranscripturls(conversationId, communicationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsConversationCommunicationTranscripturls");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation ID | 
| **communicationId** | **String**| Communication ID | 
{: class="table-striped"}


### Return type

[**TranscriptUrls**](TranscriptUrls.html)

<a name="getSpeechandtextanalyticsDictionaryfeedback"></a>

# **getSpeechandtextanalyticsDictionaryfeedback**



> [DictionaryFeedbackEntityListing](DictionaryFeedbackEntityListing.html) getSpeechandtextanalyticsDictionaryfeedback(dialect, nextPage, pageSize)

Get the list of Speech & Text Analytics dictionary feedbacks

Wraps GET /api/v2/speechandtextanalytics/dictionaryfeedback  

Requires ALL permissions: 

* speechAndTextAnalytics:dictionaryterm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String dialect = en-US; // String | The key for filter the listing by dialect, dialect format is {language}-{country} where language follows ISO 639-1 standard and country follows ISO 3166-1 alpha 2 standard
String nextPage = "nextPage_example"; // String | The key for listing the next page
Integer pageSize = 500; // Integer | The page size for the listing
try {
    DictionaryFeedbackEntityListing result = apiInstance.getSpeechandtextanalyticsDictionaryfeedback(dialect, nextPage, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsDictionaryfeedback");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dialect** | **String**| The key for filter the listing by dialect, dialect format is {language}-{country} where language follows ISO 639-1 standard and country follows ISO 3166-1 alpha 2 standard | [optional] [default to null] 
| **nextPage** | **String**| The key for listing the next page | [optional] 
| **pageSize** | **Integer**| The page size for the listing | [optional] [default to 500] 
{: class="table-striped"}


### Return type

[**DictionaryFeedbackEntityListing**](DictionaryFeedbackEntityListing.html)

<a name="getSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackId"></a>

# **getSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackId**



> [DictionaryFeedback](DictionaryFeedback.html) getSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackId(dictionaryFeedbackId)

Get a Speech & Text Analytics dictionary feedback by id

Wraps GET /api/v2/speechandtextanalytics/dictionaryfeedback/{dictionaryFeedbackId}  

Requires ALL permissions: 

* speechAndTextAnalytics:dictionaryterm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String dictionaryFeedbackId = "dictionaryFeedbackId_example"; // String | The Id of the Dictionary Feedback
try {
    DictionaryFeedback result = apiInstance.getSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackId(dictionaryFeedbackId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dictionaryFeedbackId** | **String**| The Id of the Dictionary Feedback | 
{: class="table-striped"}


### Return type

[**DictionaryFeedback**](DictionaryFeedback.html)

<a name="getSpeechandtextanalyticsProgram"></a>

# **getSpeechandtextanalyticsProgram**



> [Program](Program.html) getSpeechandtextanalyticsProgram(programId)

Get a Speech & Text Analytics program by id

Wraps GET /api/v2/speechandtextanalytics/programs/{programId}  

Requires ALL permissions: 

* speechAndTextAnalytics:program:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String programId = "programId_example"; // String | The id of the program
try {
    Program result = apiInstance.getSpeechandtextanalyticsProgram(programId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsProgram");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **programId** | **String**| The id of the program | 
{: class="table-striped"}


### Return type

[**Program**](Program.html)

<a name="getSpeechandtextanalyticsProgramMappings"></a>

# **getSpeechandtextanalyticsProgramMappings**



> [ProgramMappings](ProgramMappings.html) getSpeechandtextanalyticsProgramMappings(programId)

Get Speech & Text Analytics program mappings to queues and flows by id

Wraps GET /api/v2/speechandtextanalytics/programs/{programId}/mappings  

Requires ALL permissions: 

* speechAndTextAnalytics:program:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String programId = "programId_example"; // String | The id of the program
try {
    ProgramMappings result = apiInstance.getSpeechandtextanalyticsProgramMappings(programId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsProgramMappings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **programId** | **String**| The id of the program | 
{: class="table-striped"}


### Return type

[**ProgramMappings**](ProgramMappings.html)

<a name="getSpeechandtextanalyticsProgramTranscriptionengines"></a>

# **getSpeechandtextanalyticsProgramTranscriptionengines**



> [ProgramTranscriptionEngines](ProgramTranscriptionEngines.html) getSpeechandtextanalyticsProgramTranscriptionengines(programId)

Get transcription engine settings of a program

Wraps GET /api/v2/speechandtextanalytics/programs/{programId}/transcriptionengines  

Requires ALL permissions: 

* speechAndTextAnalytics:program:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String programId = "programId_example"; // String | The id of the program
try {
    ProgramTranscriptionEngines result = apiInstance.getSpeechandtextanalyticsProgramTranscriptionengines(programId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsProgramTranscriptionengines");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **programId** | **String**| The id of the program | 
{: class="table-striped"}


### Return type

[**ProgramTranscriptionEngines**](ProgramTranscriptionEngines.html)

<a name="getSpeechandtextanalyticsPrograms"></a>

# **getSpeechandtextanalyticsPrograms**



> [ProgramsEntityListing](ProgramsEntityListing.html) getSpeechandtextanalyticsPrograms(nextPage, pageSize, state)

Get the list of Speech & Text Analytics programs

Wraps GET /api/v2/speechandtextanalytics/programs  

Requires ALL permissions: 

* speechAndTextAnalytics:program:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String nextPage = "nextPage_example"; // String | The key for listing the next page
Integer pageSize = 20; // Integer | The page size for the listing
String state = "state_example"; // String | Program state. Defaults to Latest
try {
    ProgramsEntityListing result = apiInstance.getSpeechandtextanalyticsPrograms(nextPage, pageSize, state);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsPrograms");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **nextPage** | **String**| The key for listing the next page | [optional] 
| **pageSize** | **Integer**| The page size for the listing | [optional] [default to 20] 
| **state** | **String**| Program state. Defaults to Latest | [optional]<br />**Values**: Latest, Published 
{: class="table-striped"}


### Return type

[**ProgramsEntityListing**](ProgramsEntityListing.html)

<a name="getSpeechandtextanalyticsProgramsGeneralJob"></a>

# **getSpeechandtextanalyticsProgramsGeneralJob**



> [GeneralProgramJob](GeneralProgramJob.html) getSpeechandtextanalyticsProgramsGeneralJob(jobId)

Get a Speech & Text Analytics general program job by id

Wraps GET /api/v2/speechandtextanalytics/programs/general/jobs/{jobId}  

Requires ALL permissions: 

* speechAndTextAnalytics:program:add
* speechAndTextAnalytics:program:edit
* speechAndTextAnalytics:topic:add
* speechAndTextAnalytics:topic:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String jobId = "jobId_example"; // String | The id of the publish programs job
try {
    GeneralProgramJob result = apiInstance.getSpeechandtextanalyticsProgramsGeneralJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsProgramsGeneralJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| The id of the publish programs job | 
{: class="table-striped"}


### Return type

[**GeneralProgramJob**](GeneralProgramJob.html)

<a name="getSpeechandtextanalyticsProgramsMappings"></a>

# **getSpeechandtextanalyticsProgramsMappings**



> [ProgramsMappingsEntityListing](ProgramsMappingsEntityListing.html) getSpeechandtextanalyticsProgramsMappings(nextPage, pageSize)

Get the list of Speech & Text Analytics programs mappings to queues and flows

Wraps GET /api/v2/speechandtextanalytics/programs/mappings  

Requires ALL permissions: 

* speechAndTextAnalytics:program:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String nextPage = "nextPage_example"; // String | The key for listing the next page
Integer pageSize = 20; // Integer | The page size for the listing
try {
    ProgramsMappingsEntityListing result = apiInstance.getSpeechandtextanalyticsProgramsMappings(nextPage, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsProgramsMappings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **nextPage** | **String**| The key for listing the next page | [optional] 
| **pageSize** | **Integer**| The page size for the listing | [optional] [default to 20] 
{: class="table-striped"}


### Return type

[**ProgramsMappingsEntityListing**](ProgramsMappingsEntityListing.html)

<a name="getSpeechandtextanalyticsProgramsPublishjob"></a>

# **getSpeechandtextanalyticsProgramsPublishjob**



> [ProgramJob](ProgramJob.html) getSpeechandtextanalyticsProgramsPublishjob(jobId)

Get a Speech & Text Analytics publish programs job by id

Wraps GET /api/v2/speechandtextanalytics/programs/publishjobs/{jobId}  

Requires ALL permissions: 

* speechAndTextAnalytics:program:publish

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String jobId = "jobId_example"; // String | The id of the publish programs job
try {
    ProgramJob result = apiInstance.getSpeechandtextanalyticsProgramsPublishjob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsProgramsPublishjob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| The id of the publish programs job | 
{: class="table-striped"}


### Return type

[**ProgramJob**](ProgramJob.html)

<a name="getSpeechandtextanalyticsProgramsTranscriptionenginesDialects"></a>

# **getSpeechandtextanalyticsProgramsTranscriptionenginesDialects**



> [SupportedDialectsEntityListing](SupportedDialectsEntityListing.html) getSpeechandtextanalyticsProgramsTranscriptionenginesDialects()

Get supported dialects for each transcription engine

Wraps GET /api/v2/speechandtextanalytics/programs/transcriptionengines/dialects  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
try {
    SupportedDialectsEntityListing result = apiInstance.getSpeechandtextanalyticsProgramsTranscriptionenginesDialects();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsProgramsTranscriptionenginesDialects");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**SupportedDialectsEntityListing**](SupportedDialectsEntityListing.html)

<a name="getSpeechandtextanalyticsProgramsUnpublished"></a>

# **getSpeechandtextanalyticsProgramsUnpublished**



> [UnpublishedProgramsEntityListing](UnpublishedProgramsEntityListing.html) getSpeechandtextanalyticsProgramsUnpublished(nextPage, pageSize)

Get the list of Speech & Text Analytics unpublished programs

Wraps GET /api/v2/speechandtextanalytics/programs/unpublished  

Requires ALL permissions: 

* speechAndTextAnalytics:program:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String nextPage = "nextPage_example"; // String | The key for listing the next page
Integer pageSize = 20; // Integer | The page size for the listing
try {
    UnpublishedProgramsEntityListing result = apiInstance.getSpeechandtextanalyticsProgramsUnpublished(nextPage, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsProgramsUnpublished");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **nextPage** | **String**| The key for listing the next page | [optional] 
| **pageSize** | **Integer**| The page size for the listing | [optional] [default to 20] 
{: class="table-striped"}


### Return type

[**UnpublishedProgramsEntityListing**](UnpublishedProgramsEntityListing.html)

<a name="getSpeechandtextanalyticsSentimentDialects"></a>

# **getSpeechandtextanalyticsSentimentDialects**



> [EntityListing](EntityListing.html) getSpeechandtextanalyticsSentimentDialects()

Get the list of Speech & Text Analytics sentiment supported dialects

Wraps GET /api/v2/speechandtextanalytics/sentiment/dialects  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
try {
    EntityListing result = apiInstance.getSpeechandtextanalyticsSentimentDialects();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsSentimentDialects");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**EntityListing**](EntityListing.html)

<a name="getSpeechandtextanalyticsSentimentfeedback"></a>

# **getSpeechandtextanalyticsSentimentfeedback**



> [SentimentFeedbackEntityListing](SentimentFeedbackEntityListing.html) getSpeechandtextanalyticsSentimentfeedback(dialect)

Get the list of Speech & Text Analytics SentimentFeedback

Wraps GET /api/v2/speechandtextanalytics/sentimentfeedback  

Requires ALL permissions: 

* speechAndTextAnalytics:feedback:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String dialect = en-US; // String | The key for filter the listing by dialect, dialect format is {language}-{country} where language follows ISO 639-1 standard and country follows ISO 3166-1 alpha 2 standard
try {
    SentimentFeedbackEntityListing result = apiInstance.getSpeechandtextanalyticsSentimentfeedback(dialect);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsSentimentfeedback");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dialect** | **String**| The key for filter the listing by dialect, dialect format is {language}-{country} where language follows ISO 639-1 standard and country follows ISO 3166-1 alpha 2 standard | [optional] [default to null] 
{: class="table-striped"}


### Return type

[**SentimentFeedbackEntityListing**](SentimentFeedbackEntityListing.html)

<a name="getSpeechandtextanalyticsSettings"></a>

# **getSpeechandtextanalyticsSettings**



> [SpeechTextAnalyticsSettingsResponse](SpeechTextAnalyticsSettingsResponse.html) getSpeechandtextanalyticsSettings()

Get Speech And Text Analytics Settings

Wraps GET /api/v2/speechandtextanalytics/settings  

Requires ALL permissions: 

* speechAndTextAnalytics:settings:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
try {
    SpeechTextAnalyticsSettingsResponse result = apiInstance.getSpeechandtextanalyticsSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**SpeechTextAnalyticsSettingsResponse**](SpeechTextAnalyticsSettingsResponse.html)

<a name="getSpeechandtextanalyticsTopic"></a>

# **getSpeechandtextanalyticsTopic**



> [Topic](Topic.html) getSpeechandtextanalyticsTopic(topicId)

Get a Speech & Text Analytics topic by id

Wraps GET /api/v2/speechandtextanalytics/topics/{topicId}  

Requires ALL permissions: 

* speechAndTextAnalytics:topic:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String topicId = "topicId_example"; // String | The id of the topic
try {
    Topic result = apiInstance.getSpeechandtextanalyticsTopic(topicId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsTopic");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topicId** | **String**| The id of the topic | 
{: class="table-striped"}


### Return type

[**Topic**](Topic.html)

<a name="getSpeechandtextanalyticsTopics"></a>

# **getSpeechandtextanalyticsTopics**



> [TopicsEntityListing](TopicsEntityListing.html) getSpeechandtextanalyticsTopics(nextPage, pageSize, state, name, ids, dialects, sortBy, sortOrder)

Get the list of Speech & Text Analytics topics

Wraps GET /api/v2/speechandtextanalytics/topics  

Requires ALL permissions: 

* speechAndTextAnalytics:topic:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String nextPage = "nextPage_example"; // String | The key for listing the next page
Integer pageSize = 20; // Integer | The page size for the listing. The max that will be returned is 500.
String state = "state_example"; // String | Topic state. Defaults to latest
String name = "name_example"; // String | Case insensitive partial name to filter by
List<String> ids = Arrays.asList(null); // List<String> | Comma separated Topic IDs to filter by. Cannot be used with other filters. Maximum of 50 IDs allowed.
List<String> dialects = Arrays.asList(null); // List<String> | Comma separated dialect strings to filter by. Maximum of 15 dialects allowed.
String sortBy = "sortBy_example"; // String | Sort results by. Defaults to name
String sortOrder = "sortOrder_example"; // String | Sort order. Defaults to asc
try {
    TopicsEntityListing result = apiInstance.getSpeechandtextanalyticsTopics(nextPage, pageSize, state, name, ids, dialects, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsTopics");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **nextPage** | **String**| The key for listing the next page | [optional] 
| **pageSize** | **Integer**| The page size for the listing. The max that will be returned is 500. | [optional] [default to 20] 
| **state** | **String**| Topic state. Defaults to latest | [optional]<br />**Values**: latest, published 
| **name** | **String**| Case insensitive partial name to filter by | [optional] 
| **ids** | [**List&lt;String&gt;**](String.html)| Comma separated Topic IDs to filter by. Cannot be used with other filters. Maximum of 50 IDs allowed. | [optional] 
| **dialects** | [**List&lt;String&gt;**](String.html)| Comma separated dialect strings to filter by. Maximum of 15 dialects allowed. | [optional]<br />**Values**: en-US, es-US, en-AU, en-GB, en-ZA, es-ES, en-IN, fr-FR, fr-CA, it-IT, de-DE, pt-BR, pl-PL, pt-PT, nl-NL, ko-KR 
| **sortBy** | **String**| Sort results by. Defaults to name | [optional]<br />**Values**: name 
| **sortOrder** | **String**| Sort order. Defaults to asc | [optional]<br />**Values**: asc, desc 
{: class="table-striped"}


### Return type

[**TopicsEntityListing**](TopicsEntityListing.html)

<a name="getSpeechandtextanalyticsTopicsDialects"></a>

# **getSpeechandtextanalyticsTopicsDialects**



> [EntityListing](EntityListing.html) getSpeechandtextanalyticsTopicsDialects()

Get list of supported Speech & Text Analytics topics dialects

Wraps GET /api/v2/speechandtextanalytics/topics/dialects  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
try {
    EntityListing result = apiInstance.getSpeechandtextanalyticsTopicsDialects();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsTopicsDialects");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**EntityListing**](EntityListing.html)

<a name="getSpeechandtextanalyticsTopicsGeneral"></a>

# **getSpeechandtextanalyticsTopicsGeneral**



> [GeneralTopicsEntityListing](GeneralTopicsEntityListing.html) getSpeechandtextanalyticsTopicsGeneral(dialect)

Get the Speech & Text Analytics general topics for a given dialect

Wraps GET /api/v2/speechandtextanalytics/topics/general  

Requires ALL permissions: 

* speechAndTextAnalytics:topic:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String dialect = "dialect_example"; // String | The dialect of the general topics, dialect format is {language}-{country} where language follows ISO 639-1 standard and country follows ISO 3166-1 alpha 2 standard
try {
    GeneralTopicsEntityListing result = apiInstance.getSpeechandtextanalyticsTopicsGeneral(dialect);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsTopicsGeneral");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dialect** | **String**| The dialect of the general topics, dialect format is {language}-{country} where language follows ISO 639-1 standard and country follows ISO 3166-1 alpha 2 standard | [optional]<br />**Values**: ar-001, ar-AE, ar-BH, ar-EG, ar-IL, ar-SA, ar-TN, da-DK, de-CH, de-DE, en-AU, en-GB, en-HK, en-IE, en-IN, en-NZ, en-SG, en-US, en-ZA, es-ES, es-US, fi-FI, fr-CA, fr-FR, he-IL, it-IT, ja-JP, ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, sv-SE 
{: class="table-striped"}


### Return type

[**GeneralTopicsEntityListing**](GeneralTopicsEntityListing.html)

<a name="getSpeechandtextanalyticsTopicsGeneralStatus"></a>

# **getSpeechandtextanalyticsTopicsGeneralStatus**



> [UnifiedGeneralTopicEntityListing](UnifiedGeneralTopicEntityListing.html) getSpeechandtextanalyticsTopicsGeneralStatus(dialect)

Get the list of general topics from the org and the system with their current status

Wraps GET /api/v2/speechandtextanalytics/topics/general/status  

Requires ALL permissions: 

* speechAndTextAnalytics:topic:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String dialect = "dialect_example"; // String | The dialect of the general topics, dialect format is {language}-{country} where language follows ISO 639-1 standard and country follows ISO 3166-1 alpha 2 standard
try {
    UnifiedGeneralTopicEntityListing result = apiInstance.getSpeechandtextanalyticsTopicsGeneralStatus(dialect);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsTopicsGeneralStatus");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dialect** | **String**| The dialect of the general topics, dialect format is {language}-{country} where language follows ISO 639-1 standard and country follows ISO 3166-1 alpha 2 standard | [optional]<br />**Values**: ar-001, ar-AE, ar-BH, ar-EG, ar-IL, ar-SA, ar-TN, da-DK, de-CH, de-DE, en-AU, en-GB, en-HK, en-IE, en-IN, en-NZ, en-SG, en-US, en-ZA, es-ES, es-US, fi-FI, fr-CA, fr-FR, he-IL, it-IT, ja-JP, ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, sv-SE 
{: class="table-striped"}


### Return type

[**UnifiedGeneralTopicEntityListing**](UnifiedGeneralTopicEntityListing.html)

<a name="getSpeechandtextanalyticsTopicsPublishjob"></a>

# **getSpeechandtextanalyticsTopicsPublishjob**



> [TopicJob](TopicJob.html) getSpeechandtextanalyticsTopicsPublishjob(jobId)

Get a Speech & Text Analytics publish topics job by id

Wraps GET /api/v2/speechandtextanalytics/topics/publishjobs/{jobId}  

Requires ALL permissions: 

* speechAndTextAnalytics:topic:publish

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String jobId = "jobId_example"; // String | The id of the publish topics job
try {
    TopicJob result = apiInstance.getSpeechandtextanalyticsTopicsPublishjob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsTopicsPublishjob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| The id of the publish topics job | 
{: class="table-striped"}


### Return type

[**TopicJob**](TopicJob.html)

<a name="patchSpeechandtextanalyticsSettings"></a>

# **patchSpeechandtextanalyticsSettings**



> [SpeechTextAnalyticsSettingsResponse](SpeechTextAnalyticsSettingsResponse.html) patchSpeechandtextanalyticsSettings(body)

Patch Speech And Text Analytics Settings

Wraps PATCH /api/v2/speechandtextanalytics/settings  

Requires ALL permissions: 

* speechAndTextAnalytics:settings:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
SpeechTextAnalyticsSettingsRequest body = new SpeechTextAnalyticsSettingsRequest(); // SpeechTextAnalyticsSettingsRequest | Speech And Text Analytics Settings
try {
    SpeechTextAnalyticsSettingsResponse result = apiInstance.patchSpeechandtextanalyticsSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#patchSpeechandtextanalyticsSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SpeechTextAnalyticsSettingsRequest**](SpeechTextAnalyticsSettingsRequest.html)| Speech And Text Analytics Settings | 
{: class="table-striped"}


### Return type

[**SpeechTextAnalyticsSettingsResponse**](SpeechTextAnalyticsSettingsResponse.html)

<a name="postSpeechandtextanalyticsDictionaryfeedback"></a>

# **postSpeechandtextanalyticsDictionaryfeedback**



> [DictionaryFeedback](DictionaryFeedback.html) postSpeechandtextanalyticsDictionaryfeedback(body)

Create a Speech & Text Analytics DictionaryFeedback

Wraps POST /api/v2/speechandtextanalytics/dictionaryfeedback  

Requires ALL permissions: 

* speechAndTextAnalytics:dictionaryterm:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
DictionaryFeedback body = new DictionaryFeedback(); // DictionaryFeedback | The DictionaryFeedback to create
try {
    DictionaryFeedback result = apiInstance.postSpeechandtextanalyticsDictionaryfeedback(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#postSpeechandtextanalyticsDictionaryfeedback");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**DictionaryFeedback**](DictionaryFeedback.html)| The DictionaryFeedback to create | 
{: class="table-striped"}


### Return type

[**DictionaryFeedback**](DictionaryFeedback.html)

<a name="postSpeechandtextanalyticsPrograms"></a>

# **postSpeechandtextanalyticsPrograms**



> [Program](Program.html) postSpeechandtextanalyticsPrograms(body)

Create new Speech & Text Analytics program

Wraps POST /api/v2/speechandtextanalytics/programs  

Requires ALL permissions: 

* speechAndTextAnalytics:program:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
ProgramRequest body = new ProgramRequest(); // ProgramRequest | The program to create
try {
    Program result = apiInstance.postSpeechandtextanalyticsPrograms(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#postSpeechandtextanalyticsPrograms");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ProgramRequest**](ProgramRequest.html)| The program to create | 
{: class="table-striped"}


### Return type

[**Program**](Program.html)

<a name="postSpeechandtextanalyticsProgramsGeneralJobs"></a>

# **postSpeechandtextanalyticsProgramsGeneralJobs**



> [GeneralProgramJob](GeneralProgramJob.html) postSpeechandtextanalyticsProgramsGeneralJobs(body)

Create new Speech & Text Analytics general program job

Wraps POST /api/v2/speechandtextanalytics/programs/general/jobs  

Requires ALL permissions: 

* speechAndTextAnalytics:program:add
* speechAndTextAnalytics:program:edit
* speechAndTextAnalytics:topic:add
* speechAndTextAnalytics:topic:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
GeneralProgramJobRequest body = new GeneralProgramJobRequest(); // GeneralProgramJobRequest | The general programs job to create
try {
    GeneralProgramJob result = apiInstance.postSpeechandtextanalyticsProgramsGeneralJobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#postSpeechandtextanalyticsProgramsGeneralJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**GeneralProgramJobRequest**](GeneralProgramJobRequest.html)| The general programs job to create | 
{: class="table-striped"}


### Return type

[**GeneralProgramJob**](GeneralProgramJob.html)

<a name="postSpeechandtextanalyticsProgramsPublishjobs"></a>

# **postSpeechandtextanalyticsProgramsPublishjobs**



> [ProgramJob](ProgramJob.html) postSpeechandtextanalyticsProgramsPublishjobs(body)

Create new Speech & Text Analytics publish programs job

Wraps POST /api/v2/speechandtextanalytics/programs/publishjobs  

Requires ALL permissions: 

* speechAndTextAnalytics:program:publish

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
ProgramJobRequest body = new ProgramJobRequest(); // ProgramJobRequest | The publish programs job to create
try {
    ProgramJob result = apiInstance.postSpeechandtextanalyticsProgramsPublishjobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#postSpeechandtextanalyticsProgramsPublishjobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ProgramJobRequest**](ProgramJobRequest.html)| The publish programs job to create | 
{: class="table-striped"}


### Return type

[**ProgramJob**](ProgramJob.html)

<a name="postSpeechandtextanalyticsSentimentfeedback"></a>

# **postSpeechandtextanalyticsSentimentfeedback**



> [SentimentFeedback](SentimentFeedback.html) postSpeechandtextanalyticsSentimentfeedback(body)

Create a Speech & Text Analytics SentimentFeedback

Wraps POST /api/v2/speechandtextanalytics/sentimentfeedback  

Requires ALL permissions: 

* speechAndTextAnalytics:feedback:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
SentimentFeedback body = new SentimentFeedback(); // SentimentFeedback | The SentimentFeedback to create
try {
    SentimentFeedback result = apiInstance.postSpeechandtextanalyticsSentimentfeedback(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#postSpeechandtextanalyticsSentimentfeedback");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SentimentFeedback**](SentimentFeedback.html)| The SentimentFeedback to create | 
{: class="table-striped"}


### Return type

[**SentimentFeedback**](SentimentFeedback.html)

<a name="postSpeechandtextanalyticsTopics"></a>

# **postSpeechandtextanalyticsTopics**



> [Topic](Topic.html) postSpeechandtextanalyticsTopics(body)

Create new Speech & Text Analytics topic

Wraps POST /api/v2/speechandtextanalytics/topics  

Requires ALL permissions: 

* speechAndTextAnalytics:topic:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
TopicRequest body = new TopicRequest(); // TopicRequest | The topic to create
try {
    Topic result = apiInstance.postSpeechandtextanalyticsTopics(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#postSpeechandtextanalyticsTopics");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**TopicRequest**](TopicRequest.html)| The topic to create | 
{: class="table-striped"}


### Return type

[**Topic**](Topic.html)

<a name="postSpeechandtextanalyticsTopicsPublishjobs"></a>

# **postSpeechandtextanalyticsTopicsPublishjobs**



> [TopicJob](TopicJob.html) postSpeechandtextanalyticsTopicsPublishjobs(body)

Create new Speech & Text Analytics publish topics job

Wraps POST /api/v2/speechandtextanalytics/topics/publishjobs  

Requires ALL permissions: 

* speechAndTextAnalytics:topic:publish

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
TopicJobRequest body = new TopicJobRequest(); // TopicJobRequest | The publish topics job to create
try {
    TopicJob result = apiInstance.postSpeechandtextanalyticsTopicsPublishjobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#postSpeechandtextanalyticsTopicsPublishjobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**TopicJobRequest**](TopicJobRequest.html)| The publish topics job to create | 
{: class="table-striped"}


### Return type

[**TopicJob**](TopicJob.html)

<a name="postSpeechandtextanalyticsTranscriptsSearch"></a>

# **postSpeechandtextanalyticsTranscriptsSearch**



> [JsonSearchResponse](JsonSearchResponse.html) postSpeechandtextanalyticsTranscriptsSearch(body)

Search resources.

Wraps POST /api/v2/speechandtextanalytics/transcripts/search  

Requires ANY permissions: 

* analytics:conversationDetail:view
* recording:recording:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
TranscriptSearchRequest body = new TranscriptSearchRequest(); // TranscriptSearchRequest | Search request options
try {
    JsonSearchResponse result = apiInstance.postSpeechandtextanalyticsTranscriptsSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#postSpeechandtextanalyticsTranscriptsSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**TranscriptSearchRequest**](TranscriptSearchRequest.html)| Search request options | 
{: class="table-striped"}


### Return type

[**JsonSearchResponse**](JsonSearchResponse.html)

<a name="putSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackId"></a>

# **putSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackId**



> [DictionaryFeedback](DictionaryFeedback.html) putSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackId(dictionaryFeedbackId, body)

Update existing Speech & Text Analytics dictionary feedback by id

Wraps PUT /api/v2/speechandtextanalytics/dictionaryfeedback/{dictionaryFeedbackId}  

Requires ALL permissions: 

* speechAndTextAnalytics:dictionaryterm:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String dictionaryFeedbackId = "dictionaryFeedbackId_example"; // String | The Id of the Dictionary Feedback
DictionaryFeedback body = new DictionaryFeedback(); // DictionaryFeedback | 
try {
    DictionaryFeedback result = apiInstance.putSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackId(dictionaryFeedbackId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#putSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dictionaryFeedbackId** | **String**| The Id of the Dictionary Feedback | 
| **body** | [**DictionaryFeedback**](DictionaryFeedback.html)|  | [optional] 
{: class="table-striped"}


### Return type

[**DictionaryFeedback**](DictionaryFeedback.html)

<a name="putSpeechandtextanalyticsProgram"></a>

# **putSpeechandtextanalyticsProgram**



> [Program](Program.html) putSpeechandtextanalyticsProgram(programId, body)

Update existing Speech & Text Analytics program

Wraps PUT /api/v2/speechandtextanalytics/programs/{programId}  

Requires ALL permissions: 

* speechAndTextAnalytics:program:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String programId = "programId_example"; // String | The id of the program
ProgramRequest body = new ProgramRequest(); // ProgramRequest | The program to update
try {
    Program result = apiInstance.putSpeechandtextanalyticsProgram(programId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#putSpeechandtextanalyticsProgram");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **programId** | **String**| The id of the program | 
| **body** | [**ProgramRequest**](ProgramRequest.html)| The program to update | 
{: class="table-striped"}


### Return type

[**Program**](Program.html)

<a name="putSpeechandtextanalyticsProgramMappings"></a>

# **putSpeechandtextanalyticsProgramMappings**



> [ProgramMappings](ProgramMappings.html) putSpeechandtextanalyticsProgramMappings(programId, body)

Set Speech & Text Analytics program mappings to queues and flows

Wraps PUT /api/v2/speechandtextanalytics/programs/{programId}/mappings  

Requires ALL permissions: 

* speechAndTextAnalytics:program:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String programId = "programId_example"; // String | The id of the program
ProgramMappingsRequest body = new ProgramMappingsRequest(); // ProgramMappingsRequest | The program to set mappings for
try {
    ProgramMappings result = apiInstance.putSpeechandtextanalyticsProgramMappings(programId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#putSpeechandtextanalyticsProgramMappings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **programId** | **String**| The id of the program | 
| **body** | [**ProgramMappingsRequest**](ProgramMappingsRequest.html)| The program to set mappings for | 
{: class="table-striped"}


### Return type

[**ProgramMappings**](ProgramMappings.html)

<a name="putSpeechandtextanalyticsProgramTranscriptionengines"></a>

# **putSpeechandtextanalyticsProgramTranscriptionengines**



> [ProgramTranscriptionEngines](ProgramTranscriptionEngines.html) putSpeechandtextanalyticsProgramTranscriptionengines(programId, body)

Update transcription engine settings of a program

Wraps PUT /api/v2/speechandtextanalytics/programs/{programId}/transcriptionengines  

Requires ALL permissions: 

* speechAndTextAnalytics:program:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String programId = "programId_example"; // String | The id of the program
TranscriptionEnginesRequest body = new TranscriptionEnginesRequest(); // TranscriptionEnginesRequest | Program transcription engine setting
try {
    ProgramTranscriptionEngines result = apiInstance.putSpeechandtextanalyticsProgramTranscriptionengines(programId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#putSpeechandtextanalyticsProgramTranscriptionengines");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **programId** | **String**| The id of the program | 
| **body** | [**TranscriptionEnginesRequest**](TranscriptionEnginesRequest.html)| Program transcription engine setting | 
{: class="table-striped"}


### Return type

[**ProgramTranscriptionEngines**](ProgramTranscriptionEngines.html)

<a name="putSpeechandtextanalyticsSettings"></a>

# **putSpeechandtextanalyticsSettings**



> [SpeechTextAnalyticsSettingsResponse](SpeechTextAnalyticsSettingsResponse.html) putSpeechandtextanalyticsSettings(body)

Update Speech And Text Analytics Settings

Wraps PUT /api/v2/speechandtextanalytics/settings  

Requires ALL permissions: 

* speechAndTextAnalytics:settings:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
SpeechTextAnalyticsSettingsRequest body = new SpeechTextAnalyticsSettingsRequest(); // SpeechTextAnalyticsSettingsRequest | Speech And Text Analytics Settings
try {
    SpeechTextAnalyticsSettingsResponse result = apiInstance.putSpeechandtextanalyticsSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#putSpeechandtextanalyticsSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SpeechTextAnalyticsSettingsRequest**](SpeechTextAnalyticsSettingsRequest.html)| Speech And Text Analytics Settings | 
{: class="table-striped"}


### Return type

[**SpeechTextAnalyticsSettingsResponse**](SpeechTextAnalyticsSettingsResponse.html)

<a name="putSpeechandtextanalyticsTopic"></a>

# **putSpeechandtextanalyticsTopic**



> [Topic](Topic.html) putSpeechandtextanalyticsTopic(topicId, body)

Update existing Speech & Text Analytics topic

Wraps PUT /api/v2/speechandtextanalytics/topics/{topicId}  

Requires ALL permissions: 

* speechAndTextAnalytics:topic:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String topicId = "topicId_example"; // String | The id of the topic
TopicRequest body = new TopicRequest(); // TopicRequest | The topic to update
try {
    Topic result = apiInstance.putSpeechandtextanalyticsTopic(topicId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#putSpeechandtextanalyticsTopic");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topicId** | **String**| The id of the topic | 
| **body** | [**TopicRequest**](TopicRequest.html)| The topic to update | 
{: class="table-striped"}


### Return type

[**Topic**](Topic.html)

