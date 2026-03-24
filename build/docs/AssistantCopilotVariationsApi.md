# AssistantCopilotVariationsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteAssistantVariation**](AssistantCopilotVariationsApi#deleteAssistantVariation) | Delete assistant copilot variation by id |
| [**getAssistantVariation**](AssistantCopilotVariationsApi#getAssistantVariation) | Get assistant copilot variation by id |
| [**getAssistantVariations**](AssistantCopilotVariationsApi#getAssistantVariations) | Get variations of an assistant copilot |
| [**postAssistantVariations**](AssistantCopilotVariationsApi#postAssistantVariations) | Create assistant copilot variation |
| [**putAssistantVariation**](AssistantCopilotVariationsApi#putAssistantVariation) | Update assistant copilot variation by id |
{: class="table-striped"}


# **deleteAssistantVariation**


> Void deleteAssistantVariation(assistantId, variationId)

Delete assistant copilot variation by id

Wraps DELETE /api/v2/assistants/{assistantId}/variations/{variationId}  

Requires ALL permissions: 

* assistants:copilot:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AssistantCopilotVariationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AssistantCopilotVariationsApi apiInstance = new AssistantCopilotVariationsApi();
String assistantId = "assistantId_example"; // String | Assistant ID
String variationId = "variationId_example"; // String | Variation ID
try {
    apiInstance.deleteAssistantVariation(assistantId, variationId);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantCopilotVariationsApi#deleteAssistantVariation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assistantId** | **String**| Assistant ID | 
| **variationId** | **String**| Variation ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **getAssistantVariation**


> [AssistantCopilotVariation](AssistantCopilotVariation) getAssistantVariation(assistantId, variationId)

Get assistant copilot variation by id

Wraps GET /api/v2/assistants/{assistantId}/variations/{variationId}  

Requires ALL permissions: 

* assistants:copilot:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AssistantCopilotVariationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AssistantCopilotVariationsApi apiInstance = new AssistantCopilotVariationsApi();
String assistantId = "assistantId_example"; // String | Assistant ID
String variationId = "variationId_example"; // String | Variation ID
try {
    AssistantCopilotVariation result = apiInstance.getAssistantVariation(assistantId, variationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantCopilotVariationsApi#getAssistantVariation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assistantId** | **String**| Assistant ID | 
| **variationId** | **String**| Variation ID | 
{: class="table-striped"}


### Return type

[**AssistantCopilotVariation**](AssistantCopilotVariation)


# **getAssistantVariations**


> [AssistantCopilotVariationListing](AssistantCopilotVariationListing) getAssistantVariations(assistantId)

Get variations of an assistant copilot

Wraps GET /api/v2/assistants/{assistantId}/variations  

Requires ALL permissions: 

* assistants:copilot:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AssistantCopilotVariationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AssistantCopilotVariationsApi apiInstance = new AssistantCopilotVariationsApi();
String assistantId = "assistantId_example"; // String | Assistant ID
try {
    AssistantCopilotVariationListing result = apiInstance.getAssistantVariations(assistantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantCopilotVariationsApi#getAssistantVariations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assistantId** | **String**| Assistant ID | 
{: class="table-striped"}


### Return type

[**AssistantCopilotVariationListing**](AssistantCopilotVariationListing)


# **postAssistantVariations**


> [AssistantCopilotVariation](AssistantCopilotVariation) postAssistantVariations(assistantId, body)

Create assistant copilot variation

Wraps POST /api/v2/assistants/{assistantId}/variations  

Requires ALL permissions: 

* assistants:copilot:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AssistantCopilotVariationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AssistantCopilotVariationsApi apiInstance = new AssistantCopilotVariationsApi();
String assistantId = "assistantId_example"; // String | Assistant ID
AssistantCopilotVariation body = new AssistantCopilotVariation(); // AssistantCopilotVariation | 
try {
    AssistantCopilotVariation result = apiInstance.postAssistantVariations(assistantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantCopilotVariationsApi#postAssistantVariations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assistantId** | **String**| Assistant ID | 
| **body** | [**AssistantCopilotVariation**](AssistantCopilotVariation)|  | 
{: class="table-striped"}


### Return type

[**AssistantCopilotVariation**](AssistantCopilotVariation)


# **putAssistantVariation**


> [AssistantCopilotVariation](AssistantCopilotVariation) putAssistantVariation(assistantId, variationId, body)

Update assistant copilot variation by id

Wraps PUT /api/v2/assistants/{assistantId}/variations/{variationId}  

Requires ALL permissions: 

* assistants:copilot:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AssistantCopilotVariationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AssistantCopilotVariationsApi apiInstance = new AssistantCopilotVariationsApi();
String assistantId = "assistantId_example"; // String | Assistant ID
String variationId = "variationId_example"; // String | Variation ID
AssistantCopilotVariation body = new AssistantCopilotVariation(); // AssistantCopilotVariation | 
try {
    AssistantCopilotVariation result = apiInstance.putAssistantVariation(assistantId, variationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssistantCopilotVariationsApi#putAssistantVariation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assistantId** | **String**| Assistant ID | 
| **variationId** | **String**| Variation ID | 
| **body** | [**AssistantCopilotVariation**](AssistantCopilotVariation)|  | 
{: class="table-striped"}


### Return type

[**AssistantCopilotVariation**](AssistantCopilotVariation)


_com.mypurecloud.sdk.v2:platform-client-v2:250.0.0_
