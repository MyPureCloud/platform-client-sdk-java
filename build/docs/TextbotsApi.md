---
title: TextbotsApi
---
## TextbotsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**postTextbotsBotsExecute**](TextbotsApi.html#postTextbotsBotsExecute) | Send an intent to a bot to start a dialog/interact with it via text |
{: class="table-striped"}

<a name="postTextbotsBotsExecute"></a>

# **postTextbotsBotsExecute**



> [PostTextResponse](PostTextResponse.html) postTextbotsBotsExecute(postTextRequest)

Send an intent to a bot to start a dialog/interact with it via text

This will either start a bot with the given id or relay a communication to an existing bot session.

Wraps POST /api/v2/textbots/bots/execute  

Requires ANY permissions: 

* textbots:session:execute

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TextbotsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TextbotsApi apiInstance = new TextbotsApi();
PostTextRequest postTextRequest = new PostTextRequest(); // PostTextRequest | 
try {
    PostTextResponse result = apiInstance.postTextbotsBotsExecute(postTextRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextbotsApi#postTextbotsBotsExecute");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postTextRequest** | [**PostTextRequest**](PostTextRequest.html)|  | 
{: class="table-striped"}


### Return type

[**PostTextResponse**](PostTextResponse.html)

