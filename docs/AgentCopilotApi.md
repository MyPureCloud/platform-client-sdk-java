# AgentCopilotApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getAssistantCopilot**](AgentCopilotApi#getAssistantCopilot) | Get copilot configuration of an assistant. |
| [**getAssistantsCopilotFeaturesupport**](AgentCopilotApi#getAssistantsCopilotFeaturesupport) | Get information about the support of features for all the languages or only for a certain language. |
| [**putAssistantCopilot**](AgentCopilotApi#putAssistantCopilot) | Update agent copilot configuration |
{: class="table-striped"}


# **getAssistantCopilot**


> [Copilot](Copilot) getAssistantCopilot(assistantId)

Get copilot configuration of an assistant.

Wraps GET /api/v2/assistants/{assistantId}/copilot  

Requires ALL permissions: 

* assistants:copilot:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AgentCopilotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AgentCopilotApi apiInstance = new AgentCopilotApi();
String assistantId = "assistantId_example"; // String | Assistant ID
try {
    Copilot result = apiInstance.getAssistantCopilot(assistantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentCopilotApi#getAssistantCopilot");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assistantId** | **String**| Assistant ID | 
{: class="table-striped"}


### Return type

[**Copilot**](Copilot)


# **getAssistantsCopilotFeaturesupport**


> [LanguageSupportResponse](LanguageSupportResponse) getAssistantsCopilotFeaturesupport(language)

Get information about the support of features for all the languages or only for a certain language.

Wraps GET /api/v2/assistants/copilot/featuresupport  

Requires ALL permissions: 

* assistants:copilot:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AgentCopilotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AgentCopilotApi apiInstance = new AgentCopilotApi();
String language = "language_example"; // String | Which language are the features supported for
try {
    LanguageSupportResponse result = apiInstance.getAssistantsCopilotFeaturesupport(language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentCopilotApi#getAssistantsCopilotFeaturesupport");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **language** | **String**| Which language are the features supported for | [optional] 
{: class="table-striped"}


### Return type

[**LanguageSupportResponse**](LanguageSupportResponse)


# **putAssistantCopilot**


> [Copilot](Copilot) putAssistantCopilot(assistantId, body)

Update agent copilot configuration

Wraps PUT /api/v2/assistants/{assistantId}/copilot  

Requires ALL permissions: 

* assistants:copilot:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AgentCopilotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AgentCopilotApi apiInstance = new AgentCopilotApi();
String assistantId = "assistantId_example"; // String | Assistant ID
Copilot body = new Copilot(); // Copilot | 
try {
    Copilot result = apiInstance.putAssistantCopilot(assistantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentCopilotApi#putAssistantCopilot");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assistantId** | **String**| Assistant ID | 
| **body** | [**Copilot**](Copilot)|  | 
{: class="table-striped"}


### Return type

[**Copilot**](Copilot)


_com.mypurecloud.sdk.v2:platform-client-v2:233.0.0_
