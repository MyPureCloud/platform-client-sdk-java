# TelephonyApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getTelephonyAgentGreetings**](TelephonyApi#getTelephonyAgentGreetings) | Get an agent's greetings. |
| [**getTelephonyAgentsGreetingsMe**](TelephonyApi#getTelephonyAgentsGreetingsMe) | Get the agent's own greetings. |
| [**getTelephonyMediaregions**](TelephonyApi#getTelephonyMediaregions) | Retrieve the list of AWS regions media can stream through. |
| [**getTelephonySipmessagesConversation**](TelephonyApi#getTelephonySipmessagesConversation) | Get a SIP message. |
| [**getTelephonySipmessagesConversationHeaders**](TelephonyApi#getTelephonySipmessagesConversationHeaders) | Get SIP headers. |
| [**getTelephonySiptraces**](TelephonyApi#getTelephonySiptraces) | Fetch SIP metadata |
| [**getTelephonySiptracesDownloadDownloadId**](TelephonyApi#getTelephonySiptracesDownloadDownloadId) | Get signed S3 URL for a pcap download |
| [**postTelephonySiptracesDownload**](TelephonyApi#postTelephonySiptracesDownload) | Request a download of a pcap file to S3 |
| [**putTelephonyAgentGreetings**](TelephonyApi#putTelephonyAgentGreetings) | Updates an agent's greetings. |
| [**putTelephonyAgentsGreetingsMe**](TelephonyApi#putTelephonyAgentsGreetingsMe) | Updates the agent's own greetings. |
{: class="table-striped"}


# **getTelephonyAgentGreetings**


> [AgentGreeting](AgentGreeting) getTelephonyAgentGreetings(agentId)

Get an agent's greetings.

getTelephonyAgentGreetings is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/telephony/agents/{agentId}/greetings  

Requires ANY permissions: 

* telephony:otherAgentGreeting:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyApi apiInstance = new TelephonyApi();
String agentId = "agentId_example"; // String | User ID
try {
    AgentGreeting result = apiInstance.getTelephonyAgentGreetings(agentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyApi#getTelephonyAgentGreetings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **agentId** | **String**| User ID | 
{: class="table-striped"}


### Return type

[**AgentGreeting**](AgentGreeting)


# **getTelephonyAgentsGreetingsMe**


> [SelfAgentGreeting](SelfAgentGreeting) getTelephonyAgentsGreetingsMe()

Get the agent's own greetings.

getTelephonyAgentsGreetingsMe is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/telephony/agents/greetings/me  

Requires ANY permissions: 

* telephony:selfAgentGreeting:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyApi apiInstance = new TelephonyApi();
try {
    SelfAgentGreeting result = apiInstance.getTelephonyAgentsGreetingsMe();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyApi#getTelephonyAgentsGreetingsMe");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**SelfAgentGreeting**](SelfAgentGreeting)


# **getTelephonyMediaregions**


> [MediaRegions](MediaRegions) getTelephonyMediaregions()

Retrieve the list of AWS regions media can stream through.

Wraps GET /api/v2/telephony/mediaregions  

Requires ANY permissions: 

* telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyApi apiInstance = new TelephonyApi();
try {
    MediaRegions result = apiInstance.getTelephonyMediaregions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyApi#getTelephonyMediaregions");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**MediaRegions**](MediaRegions)


# **getTelephonySipmessagesConversation**


> [Callmessage](Callmessage) getTelephonySipmessagesConversation(conversationId)

Get a SIP message.

Get the raw form of the SIP message

Wraps GET /api/v2/telephony/sipmessages/conversations/{conversationId}  

Requires ALL permissions: 

* telephony:pcap:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyApi apiInstance = new TelephonyApi();
String conversationId = "conversationId_example"; // String | Conversation id
try {
    Callmessage result = apiInstance.getTelephonySipmessagesConversation(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyApi#getTelephonySipmessagesConversation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation id | 
{: class="table-striped"}


### Return type

[**Callmessage**](Callmessage)


# **getTelephonySipmessagesConversationHeaders**


> [Callheader](Callheader) getTelephonySipmessagesConversationHeaders(conversationId, keys)

Get SIP headers.

Get parsed SIP headers. Returns specific headers if key query parameters are added.

Wraps GET /api/v2/telephony/sipmessages/conversations/{conversationId}/headers  

Requires ALL permissions: 

* telephony:pcap:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyApi apiInstance = new TelephonyApi();
String conversationId = "conversationId_example"; // String | Conversation id
List<String> keys = Arrays.asList(null); // List<String> | comma-separated list of header identifiers to query. e.g. ruri,to,from
try {
    Callheader result = apiInstance.getTelephonySipmessagesConversationHeaders(conversationId, keys);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyApi#getTelephonySipmessagesConversationHeaders");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation id | 
| **keys** | [**List&lt;String&gt;**](String)| comma-separated list of header identifiers to query. e.g. ruri,to,from | [optional] 
{: class="table-striped"}


### Return type

[**Callheader**](Callheader)


# **getTelephonySiptraces**


> [SipSearchResult](SipSearchResult) getTelephonySiptraces(dateStart, dateEnd, callId, toUser, fromUser, conversationId)

Fetch SIP metadata

Fetch SIP metadata that matches a given parameter. If exactMatch is passed as a parameter only sip records that have exactly that value will be returned. For example, some records contain conversationId but not all relevant records for that call may contain the conversationId so only a partial view of the call will be reflected

Wraps GET /api/v2/telephony/siptraces  

Requires ALL permissions: 

* telephony:pcap:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyApi apiInstance = new TelephonyApi();
Date dateStart = new Date(); // Date | Start date of the search. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
Date dateEnd = new Date(); // Date | End date of the search. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
String callId = "callId_example"; // String | unique identification of the placed call
String toUser = "toUser_example"; // String | User to who the call was placed
String fromUser = "fromUser_example"; // String | user who placed the call
String conversationId = "conversationId_example"; // String | Unique identification of the conversation
try {
    SipSearchResult result = apiInstance.getTelephonySiptraces(dateStart, dateEnd, callId, toUser, fromUser, conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyApi#getTelephonySiptraces");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dateStart** | **Date**| Start date of the search. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | 
| **dateEnd** | **Date**| End date of the search. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | 
| **callId** | **String**| unique identification of the placed call | [optional] 
| **toUser** | **String**| User to who the call was placed | [optional] 
| **fromUser** | **String**| user who placed the call | [optional] 
| **conversationId** | **String**| Unique identification of the conversation | [optional] 
{: class="table-striped"}


### Return type

[**SipSearchResult**](SipSearchResult)


# **getTelephonySiptracesDownloadDownloadId**


> [SignedUrlResponse](SignedUrlResponse) getTelephonySiptracesDownloadDownloadId(downloadId)

Get signed S3 URL for a pcap download

Wraps GET /api/v2/telephony/siptraces/download/{downloadId}  

Requires ALL permissions: 

* telephony:pcap:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyApi apiInstance = new TelephonyApi();
String downloadId = "downloadId_example"; // String | unique id for the downloaded file in S3
try {
    SignedUrlResponse result = apiInstance.getTelephonySiptracesDownloadDownloadId(downloadId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyApi#getTelephonySiptracesDownloadDownloadId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **downloadId** | **String**| unique id for the downloaded file in S3 | 
{: class="table-striped"}


### Return type

[**SignedUrlResponse**](SignedUrlResponse)


# **postTelephonySiptracesDownload**


> [SipDownloadResponse](SipDownloadResponse) postTelephonySiptracesDownload(sIPSearchPublicRequest)

Request a download of a pcap file to S3

Wraps POST /api/v2/telephony/siptraces/download  

Requires ALL permissions: 

* telephony:pcap:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyApi apiInstance = new TelephonyApi();
SIPSearchPublicRequest sIPSearchPublicRequest = new SIPSearchPublicRequest(); // SIPSearchPublicRequest | 
try {
    SipDownloadResponse result = apiInstance.postTelephonySiptracesDownload(sIPSearchPublicRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyApi#postTelephonySiptracesDownload");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sIPSearchPublicRequest** | [**SIPSearchPublicRequest**](SIPSearchPublicRequest)|  | 
{: class="table-striped"}


### Return type

[**SipDownloadResponse**](SipDownloadResponse)


# **putTelephonyAgentGreetings**


> [AgentGreeting](AgentGreeting) putTelephonyAgentGreetings(agentId, body)

Updates an agent's greetings.

putTelephonyAgentGreetings is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PUT /api/v2/telephony/agents/{agentId}/greetings  

Requires ANY permissions: 

* telephony:otherAgentGreeting:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyApi apiInstance = new TelephonyApi();
String agentId = "agentId_example"; // String | User ID
AgentGreeting body = new AgentGreeting(); // AgentGreeting | Agent Greeting
try {
    AgentGreeting result = apiInstance.putTelephonyAgentGreetings(agentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyApi#putTelephonyAgentGreetings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **agentId** | **String**| User ID | 
| **body** | [**AgentGreeting**](AgentGreeting)| Agent Greeting | 
{: class="table-striped"}


### Return type

[**AgentGreeting**](AgentGreeting)


# **putTelephonyAgentsGreetingsMe**


> [SelfAgentGreeting](SelfAgentGreeting) putTelephonyAgentsGreetingsMe(body)

Updates the agent's own greetings.

putTelephonyAgentsGreetingsMe is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PUT /api/v2/telephony/agents/greetings/me  

Requires ANY permissions: 

* telephony:selfAgentGreeting:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyApi apiInstance = new TelephonyApi();
SelfAgentGreeting body = new SelfAgentGreeting(); // SelfAgentGreeting | Agent Greeting
try {
    SelfAgentGreeting result = apiInstance.putTelephonyAgentsGreetingsMe(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyApi#putTelephonyAgentsGreetingsMe");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SelfAgentGreeting**](SelfAgentGreeting)| Agent Greeting | 
{: class="table-striped"}


### Return type

[**SelfAgentGreeting**](SelfAgentGreeting)


_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
