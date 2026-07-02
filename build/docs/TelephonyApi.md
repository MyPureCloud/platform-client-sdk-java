# TelephonyApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteTelephonyOrganizationLinkTargetOrganizationId**](TelephonyApi#deleteTelephonyOrganizationLinkTargetOrganizationId) | Delete a link |
| [**getTelephonyAgentGreetings**](TelephonyApi#getTelephonyAgentGreetings) | Get an agent's greetings. |
| [**getTelephonyAgentsGreetingsMe**](TelephonyApi#getTelephonyAgentsGreetingsMe) | Get the agent's own greetings. |
| [**getTelephonyCallsMetrics**](TelephonyApi#getTelephonyCallsMetrics) | Get the concurrent call metrics for a given organization. |
| [**getTelephonyMediaregions**](TelephonyApi#getTelephonyMediaregions) | Retrieve the list of AWS regions media can stream through. |
| [**getTelephonyNumbersRouting**](TelephonyApi#getTelephonyNumbersRouting) | Get Number Routings by organizationId |
| [**getTelephonyOrganizationLink**](TelephonyApi#getTelephonyOrganizationLink) | Get organization links |
| [**getTelephonyOrganizationLinkRegions**](TelephonyApi#getTelephonyOrganizationLinkRegions) | Get all the replica regions by primary region |
| [**getTelephonySettings**](TelephonyApi#getTelephonySettings) | Get the global telephony configuration. |
| [**getTelephonySipmessagesConversation**](TelephonyApi#getTelephonySipmessagesConversation) | Get a SIP message. |
| [**getTelephonySipmessagesConversationHeaders**](TelephonyApi#getTelephonySipmessagesConversationHeaders) | Get SIP headers. |
| [**getTelephonySiptraces**](TelephonyApi#getTelephonySiptraces) | Fetch SIP metadata |
| [**getTelephonySiptracesDownloadDownloadId**](TelephonyApi#getTelephonySiptracesDownloadDownloadId) | Get signed S3 URL for a pcap download |
| [**patchTelephonyOrganizationLinkApproveRequestingOrganizationId**](TelephonyApi#patchTelephonyOrganizationLinkApproveRequestingOrganizationId) | Approving a requested link |
| [**postTelephonyNumbersRouting**](TelephonyApi#postTelephonyNumbersRouting) | Update the routing of numbers for one or multiple organizations |
| [**postTelephonyNumbersRoutingAll**](TelephonyApi#postTelephonyNumbersRoutingAll) | Re-route all numbers on an organization |
| [**postTelephonyNumbersRoutingReset**](TelephonyApi#postTelephonyNumbersRoutingReset) | Reset routing for organization |
| [**postTelephonyOrganizationLink**](TelephonyApi#postTelephonyOrganizationLink) | Create a link with an organization |
| [**postTelephonySiptracesDownload**](TelephonyApi#postTelephonySiptracesDownload) | Request a download of a pcap file to S3 |
| [**putTelephonyAgentGreetings**](TelephonyApi#putTelephonyAgentGreetings) | Updates an agent's greetings. |
| [**putTelephonyAgentsGreetingsMe**](TelephonyApi#putTelephonyAgentsGreetingsMe) | Updates the agent's own greetings. |
| [**putTelephonySettings**](TelephonyApi#putTelephonySettings) | Update the global telephony configuration. |
{: class="table-striped"}


# **deleteTelephonyOrganizationLinkTargetOrganizationId**


> Void deleteTelephonyOrganizationLinkTargetOrganizationId(targetOrganizationId)

Delete a link

Wraps DELETE /api/v2/telephony/organization/link/{targetOrganizationId}  

Requires ALL permissions: 

* telephony:organizationLink:delete

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
String targetOrganizationId = "targetOrganizationId_example"; // String | targetOrganizationId
try {
    apiInstance.deleteTelephonyOrganizationLinkTargetOrganizationId(targetOrganizationId);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyApi#deleteTelephonyOrganizationLinkTargetOrganizationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **targetOrganizationId** | **String**| targetOrganizationId | 
{: class="table-striped"}


### Return type

null (empty response body)


# **getTelephonyAgentGreetings**


> [AgentGreeting](AgentGreeting) getTelephonyAgentGreetings(agentId)

Get an agent's greetings.

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


# **getTelephonyCallsMetrics**


> [OrganizationCallMetrics](OrganizationCallMetrics) getTelephonyCallsMetrics(metricType)

Get the concurrent call metrics for a given organization.

Wraps GET /api/v2/telephony/calls/metrics  

Requires ANY permissions: 

* telephony:callMetrics:view

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
String metricType = "cloud"; // String | Flag to indicate metric type to fetch.
try {
    OrganizationCallMetrics result = apiInstance.getTelephonyCallsMetrics(metricType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyApi#getTelephonyCallsMetrics");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **metricType** | **String**| Flag to indicate metric type to fetch. | [optional] [default to cloud]<br />**Values**: cloud, premises 
{: class="table-striped"}


### Return type

[**OrganizationCallMetrics**](OrganizationCallMetrics)


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


# **getTelephonyNumbersRouting**


> [NumberRoutingListing](NumberRoutingListing) getTelephonyNumbersRouting(before, after, pageSize, numberId, activeRoutingOrganizationId, ownerOrganizationId, status)

Get Number Routings by organizationId

Wraps GET /api/v2/telephony/numbers/routing  

Requires ALL permissions: 

* telephony:numberRouting:view

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
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
String numberId = "numberId_example"; // String | numberId
String activeRoutingOrganizationId = "activeRoutingOrganizationId_example"; // String | activeRoutingOrganizationId
String ownerOrganizationId = "ownerOrganizationId_example"; // String | ownerOrganizationId
String status = "status_example"; // String | status
try {
    NumberRoutingListing result = apiInstance.getTelephonyNumbersRouting(before, after, pageSize, numberId, activeRoutingOrganizationId, ownerOrganizationId, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyApi#getTelephonyNumbersRouting");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **numberId** | **String**| numberId | [optional] 
| **activeRoutingOrganizationId** | **String**| activeRoutingOrganizationId | [optional] 
| **ownerOrganizationId** | **String**| ownerOrganizationId | [optional] 
| **status** | **String**| status | [optional]<br />**Values**: Normal, Redirected, Pending 
{: class="table-striped"}


### Return type

[**NumberRoutingListing**](NumberRoutingListing)


# **getTelephonyOrganizationLink**


> [List&lt;OrganizationLinkResponse&gt;](OrganizationLinkResponse) getTelephonyOrganizationLink()

Get organization links

Wraps GET /api/v2/telephony/organization/link  

Requires ALL permissions: 

* telephony:organizationLink:view

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
    List<OrganizationLinkResponse> result = apiInstance.getTelephonyOrganizationLink();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyApi#getTelephonyOrganizationLink");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**List&lt;OrganizationLinkResponse&gt;**](OrganizationLinkResponse)


# **getTelephonyOrganizationLinkRegions**


> [List&lt;RegionResponse&gt;](RegionResponse) getTelephonyOrganizationLinkRegions()

Get all the replica regions by primary region

Wraps GET /api/v2/telephony/organization/link/regions  

Requires ALL permissions: 

* telephony:organizationLink:view

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
    List<RegionResponse> result = apiInstance.getTelephonyOrganizationLinkRegions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyApi#getTelephonyOrganizationLinkRegions");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**List&lt;RegionResponse&gt;**](RegionResponse)


# **getTelephonySettings**


> [TelephonySettings](TelephonySettings) getTelephonySettings()

Get the global telephony configuration.

Wraps GET /api/v2/telephony/settings  

Requires ANY permissions: 

* telephony:settings:view

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
    TelephonySettings result = apiInstance.getTelephonySettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyApi#getTelephonySettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**TelephonySettings**](TelephonySettings)


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


# **patchTelephonyOrganizationLinkApproveRequestingOrganizationId**


> Void patchTelephonyOrganizationLinkApproveRequestingOrganizationId(requestingOrganizationId, body)

Approving a requested link

Wraps PATCH /api/v2/telephony/organization/link/approve/{requestingOrganizationId}  

Requires ALL permissions: 

* telephony:organizationLink:edit

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
String requestingOrganizationId = "requestingOrganizationId_example"; // String | requestingOrganizationId
OrganizationLinkApprovalRequest body = new OrganizationLinkApprovalRequest(); // OrganizationLinkApprovalRequest | Approval request body
try {
    apiInstance.patchTelephonyOrganizationLinkApproveRequestingOrganizationId(requestingOrganizationId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyApi#patchTelephonyOrganizationLinkApproveRequestingOrganizationId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **requestingOrganizationId** | **String**| requestingOrganizationId | 
| **body** | [**OrganizationLinkApprovalRequest**](OrganizationLinkApprovalRequest)| Approval request body | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postTelephonyNumbersRouting**


> Void postTelephonyNumbersRouting(body)

Update the routing of numbers for one or multiple organizations

Wraps POST /api/v2/telephony/numbers/routing  

Requires ALL permissions: 

* telephony:numberRouting:edit

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
List<NumberRoutingRequest> body = Arrays.asList(new NumberRoutingRequest()); // List<NumberRoutingRequest> | drRoutingList
try {
    apiInstance.postTelephonyNumbersRouting(body);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyApi#postTelephonyNumbersRouting");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**List&lt;NumberRoutingRequest&gt;**](NumberRoutingRequest)| drRoutingList | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postTelephonyNumbersRoutingAll**


> Void postTelephonyNumbersRoutingAll(body)

Re-route all numbers on an organization

Wraps POST /api/v2/telephony/numbers/routing/all  

Requires ALL permissions: 

* telephony:numberRouting:edit

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
DisasterRecoveryAllRoutingRequest body = new DisasterRecoveryAllRoutingRequest(); // DisasterRecoveryAllRoutingRequest | Value for all routing request body
try {
    apiInstance.postTelephonyNumbersRoutingAll(body);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyApi#postTelephonyNumbersRoutingAll");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**DisasterRecoveryAllRoutingRequest**](DisasterRecoveryAllRoutingRequest)| Value for all routing request body | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postTelephonyNumbersRoutingReset**


> Void postTelephonyNumbersRoutingReset(body)

Reset routing for organization

Wraps POST /api/v2/telephony/numbers/routing/reset  

Requires ALL permissions: 

* telephony:numberRouting:edit

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
NumberRoutingResetOrganizationRequest body = new NumberRoutingResetOrganizationRequest(); // NumberRoutingResetOrganizationRequest | Value for bulk routing request body
try {
    apiInstance.postTelephonyNumbersRoutingReset(body);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyApi#postTelephonyNumbersRoutingReset");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**NumberRoutingResetOrganizationRequest**](NumberRoutingResetOrganizationRequest)| Value for bulk routing request body | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postTelephonyOrganizationLink**


> [OrganizationLink](OrganizationLink) postTelephonyOrganizationLink(body)

Create a link with an organization

Wraps POST /api/v2/telephony/organization/link  

Requires ALL permissions: 

* telephony:organizationLink:add

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
CreateOrganizationLink body = new CreateOrganizationLink(); // CreateOrganizationLink | CreateLinkOrg body
try {
    OrganizationLink result = apiInstance.postTelephonyOrganizationLink(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyApi#postTelephonyOrganizationLink");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateOrganizationLink**](CreateOrganizationLink)| CreateLinkOrg body | 
{: class="table-striped"}


### Return type

[**OrganizationLink**](OrganizationLink)


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


# **putTelephonySettings**


> [TelephonySettings](TelephonySettings) putTelephonySettings(body)

Update the global telephony configuration.

Wraps PUT /api/v2/telephony/settings  

Requires ANY permissions: 

* telephony:settings:edit

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
TelephonySettings body = new TelephonySettings(); // TelephonySettings | Telephony
try {
    TelephonySettings result = apiInstance.putTelephonySettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyApi#putTelephonySettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**TelephonySettings**](TelephonySettings)| Telephony | 
{: class="table-striped"}


### Return type

[**TelephonySettings**](TelephonySettings)


_com.mypurecloud.sdk.v2:platform-client-v2:257.1.0_
