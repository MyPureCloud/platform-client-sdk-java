# BackgroundAssistantApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**postBackgroundassistantToken**](BackgroundAssistantApi#postBackgroundassistantToken) | Sign identifying information for Genesys Cloud Background Assistant |
| [**postScreenrecordingToken**](BackgroundAssistantApi#postScreenrecordingToken) | Sign identifying information for screen recording |
{: class="table-striped"}


# **postBackgroundassistantToken**


> [SignedData](SignedData) postBackgroundassistantToken(body)

Sign identifying information for Genesys Cloud Background Assistant

postBackgroundassistantToken is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/backgroundassistant/token  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BackgroundAssistantApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BackgroundAssistantApi apiInstance = new BackgroundAssistantApi();
BackgroundAssistantUserAuthenticatedInfo body = new BackgroundAssistantUserAuthenticatedInfo(); // BackgroundAssistantUserAuthenticatedInfo | 
try {
    SignedData result = apiInstance.postBackgroundassistantToken(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BackgroundAssistantApi#postBackgroundassistantToken");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**BackgroundAssistantUserAuthenticatedInfo**](BackgroundAssistantUserAuthenticatedInfo)|  | [optional] 
{: class="table-striped"}


### Return type

[**SignedData**](SignedData)


# **postScreenrecordingToken**


> [SignedData](SignedData) postScreenrecordingToken(body)

Sign identifying information for screen recording

Wraps POST /api/v2/screenrecording/token  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.BackgroundAssistantApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

BackgroundAssistantApi apiInstance = new BackgroundAssistantApi();
BackgroundAssistantUserAuthenticatedInfo body = new BackgroundAssistantUserAuthenticatedInfo(); // BackgroundAssistantUserAuthenticatedInfo | 
try {
    SignedData result = apiInstance.postScreenrecordingToken(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BackgroundAssistantApi#postScreenrecordingToken");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**BackgroundAssistantUserAuthenticatedInfo**](BackgroundAssistantUserAuthenticatedInfo)|  | [optional] 
{: class="table-striped"}


### Return type

[**SignedData**](SignedData)


_com.mypurecloud.sdk.v2:platform-client-v2:261.0.0_
