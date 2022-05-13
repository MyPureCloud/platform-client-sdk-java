---
title: TextbotsApi
---
## TextbotsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getTextbotsBotsSearch**](TextbotsApi.html#getTextbotsBotsSearch) | Find bots using the currently configured friendly name or ID. |
| [**postTextbotsBotflowsSessionTurns**](TextbotsApi.html#postTextbotsBotflowsSessionTurns) | Issue a bot flow turn event |
| [**postTextbotsBotflowsSessions**](TextbotsApi.html#postTextbotsBotflowsSessions) | Create an execution instance of a bot flow definition. |
| [**postTextbotsBotsExecute**](TextbotsApi.html#postTextbotsBotsExecute) | Send an intent to a bot to start a dialog/interact with it via text |
{: class="table-striped"}

<a name="getTextbotsBotsSearch"></a>

# **getTextbotsBotsSearch**



> [BotSearchResponseEntityListing](BotSearchResponseEntityListing.html) getTextbotsBotsSearch(botType, botName, botId, pageSize)

Find bots using the currently configured friendly name or ID.

The name does allow case-insensitive partial string matches or by IDs (up to 50), but not both at the same time. Optionally you can limit the scope of the search by providing one or more bot types.  You can specify the maximum results to return, up to a limit of 100

Wraps GET /api/v2/textbots/bots/search  

Requires ANY permissions: 

* integrations:integration:view

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
List<String> botType = Arrays.asList(null); // List<String> | Bot types
String botName = "botName_example"; // String | Bot name
List<String> botId = Arrays.asList(null); // List<String> | Bot IDs
Integer pageSize = 25; // Integer | The maximum results to return
try {
    BotSearchResponseEntityListing result = apiInstance.getTextbotsBotsSearch(botType, botName, botId, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextbotsApi#getTextbotsBotsSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **botType** | [**List&lt;String&gt;**](String.html)| Bot types | [optional]<br />**Values**: GenesysBotConnector, GenesysDialogEngine, AmazonLex, GoogleDialogFlowES, GoogleDialogFlowCX, NuanceDlg, GenesysBotFlow 
| **botName** | **String**| Bot name | [optional] 
| **botId** | [**List&lt;String&gt;**](String.html)| Bot IDs | [optional] 
| **pageSize** | **Integer**| The maximum results to return | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**BotSearchResponseEntityListing**](BotSearchResponseEntityListing.html)

<a name="postTextbotsBotflowsSessionTurns"></a>

# **postTextbotsBotflowsSessionTurns**



> [TextBotFlowTurnResponse](TextBotFlowTurnResponse.html) postTextbotsBotflowsSessionTurns(sessionId, turnRequest)

Issue a bot flow turn event

Send a turn event to an executing bot flow and produce the next action to take.

Wraps POST /api/v2/textbots/botflows/sessions/{sessionId}/turns  

Requires ANY permissions: 

* textbots:botFlowSession:execute

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
String sessionId = "sessionId_example"; // String | The bot flow session ID, typically obtained from 'POST /api/v2/textbots/botflows/sessions'
TextBotFlowTurnRequest turnRequest = new TextBotFlowTurnRequest(); // TextBotFlowTurnRequest | 
try {
    TextBotFlowTurnResponse result = apiInstance.postTextbotsBotflowsSessionTurns(sessionId, turnRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextbotsApi#postTextbotsBotflowsSessionTurns");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sessionId** | **String**| The bot flow session ID, typically obtained from &#39;POST /api/v2/textbots/botflows/sessions&#39; | 
| **turnRequest** | [**TextBotFlowTurnRequest**](TextBotFlowTurnRequest.html)|  | 
{: class="table-striped"}


### Return type

[**TextBotFlowTurnResponse**](TextBotFlowTurnResponse.html)

<a name="postTextbotsBotflowsSessions"></a>

# **postTextbotsBotflowsSessions**



> [TextBotFlowLaunchResponse](TextBotFlowLaunchResponse.html) postTextbotsBotflowsSessions(launchRequest)

Create an execution instance of a bot flow definition.

The launch is asynchronous; use the returned instance ID to post turns to it using 'POST /api/v2/textbots/botflows/sessions/{sessionId}/turns'.

Wraps POST /api/v2/textbots/botflows/sessions  

Requires ANY permissions: 

* textbots:botFlowSession:execute

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
TextBotFlowLaunchRequest launchRequest = new TextBotFlowLaunchRequest(); // TextBotFlowLaunchRequest | 
try {
    TextBotFlowLaunchResponse result = apiInstance.postTextbotsBotflowsSessions(launchRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextbotsApi#postTextbotsBotflowsSessions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **launchRequest** | [**TextBotFlowLaunchRequest**](TextBotFlowLaunchRequest.html)|  | 
{: class="table-striped"}


### Return type

[**TextBotFlowLaunchResponse**](TextBotFlowLaunchResponse.html)

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

