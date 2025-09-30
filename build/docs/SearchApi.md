# SearchApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getDocumentationGknSearch**](SearchApi#getDocumentationGknSearch) | Search gkn documentation using the q64 value returned from a previous search |
| [**getDocumentationSearch**](SearchApi#getDocumentationSearch) | Search documentation using the q64 value returned from a previous search |
| [**getGroupsSearch**](SearchApi#getGroupsSearch) | Search groups using the q64 value returned from a previous search |
| [**getLocationsSearch**](SearchApi#getLocationsSearch) | Search locations using the q64 value returned from a previous search |
| [**getSearch**](SearchApi#getSearch) | Search using the q64 value returned from a previous search. |
| [**getSearchSuggest**](SearchApi#getSearchSuggest) | Suggest resources using the q64 value returned from a previous suggest query. |
| [**getTelephonyProvidersEdgesSitesSearch**](SearchApi#getTelephonyProvidersEdgesSitesSearch) | Search sites using the q64 value returned from a previous search |
| [**getUsersSearch**](SearchApi#getUsersSearch) | Search users using the q64 value returned from a previous search |
| [**getVoicemailSearch**](SearchApi#getVoicemailSearch) | Search voicemails using the q64 value returned from a previous search |
| [**postConversationsParticipantsAttributesSearch**](SearchApi#postConversationsParticipantsAttributesSearch) | Search conversations |
| [**postDocumentationAllSearch**](SearchApi#postDocumentationAllSearch) | Search all documents |
| [**postDocumentationGknSearch**](SearchApi#postDocumentationGknSearch) | Search gkn documentation |
| [**postDocumentationSearch**](SearchApi#postDocumentationSearch) | Search documentation |
| [**postGroupsSearch**](SearchApi#postGroupsSearch) | Search groups |
| [**postKnowledgeKnowledgebaseSearch**](SearchApi#postKnowledgeKnowledgebaseSearch) | Search Documents |
| [**postLocationsSearch**](SearchApi#postLocationsSearch) | Search locations |
| [**postSearch**](SearchApi#postSearch) | Search resources. |
| [**postSearchSuggest**](SearchApi#postSearchSuggest) | Suggest resources. |
| [**postSpeechandtextanalyticsTranscriptsSearch**](SearchApi#postSpeechandtextanalyticsTranscriptsSearch) | Search resources. |
| [**postTeamsSearch**](SearchApi#postTeamsSearch) | Search resources. |
| [**postTelephonyProvidersEdgesSitesSearch**](SearchApi#postTelephonyProvidersEdgesSitesSearch) | Search sites |
| [**postUsersSearch**](SearchApi#postUsersSearch) | Search users |
| [**postUsersSearchConversationTarget**](SearchApi#postUsersSearchConversationTarget) | Search users as conversation targets |
| [**postUsersSearchQueuemembersManage**](SearchApi#postUsersSearchQueuemembersManage) | Search manage queue member |
| [**postUsersSearchTeamsAssign**](SearchApi#postUsersSearchTeamsAssign) | Search users assigned to teams |
| [**postVoicemailSearch**](SearchApi#postVoicemailSearch) | Search voicemails |
{: class="table-striped"}


# **getDocumentationGknSearch**


> [GKNDocumentationSearchResponse](GKNDocumentationSearchResponse) getDocumentationGknSearch(q64)

Search gkn documentation using the q64 value returned from a previous search

Wraps GET /api/v2/documentation/gkn/search  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.SearchApi;


SearchApi apiInstance = new SearchApi();
String q64 = "q64_example"; // String | q64
try {
    GKNDocumentationSearchResponse result = apiInstance.getDocumentationGknSearch(q64);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getDocumentationGknSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q64** | **String**| q64 | 
{: class="table-striped"}


### Return type

[**GKNDocumentationSearchResponse**](GKNDocumentationSearchResponse)


# **getDocumentationSearch**


> [DocumentationSearchResponse](DocumentationSearchResponse) getDocumentationSearch(q64)

Search documentation using the q64 value returned from a previous search

Wraps GET /api/v2/documentation/search  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.SearchApi;


SearchApi apiInstance = new SearchApi();
String q64 = "q64_example"; // String | q64
try {
    DocumentationSearchResponse result = apiInstance.getDocumentationSearch(q64);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getDocumentationSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q64** | **String**| q64 | 
{: class="table-striped"}


### Return type

[**DocumentationSearchResponse**](DocumentationSearchResponse)


# **getGroupsSearch**


> [GroupsSearchResponse](GroupsSearchResponse) getGroupsSearch(q64, expand)

Search groups using the q64 value returned from a previous search

Wraps GET /api/v2/groups/search  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList(null); // List<String> | expand
try {
    GroupsSearchResponse result = apiInstance.getGroupsSearch(q64, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getGroupsSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q64** | **String**| q64 | 
| **expand** | [**List&lt;String&gt;**](String)| expand | [optional] 
{: class="table-striped"}


### Return type

[**GroupsSearchResponse**](GroupsSearchResponse)


# **getLocationsSearch**


> [LocationsSearchResponse](LocationsSearchResponse) getLocationsSearch(q64, expand)

Search locations using the q64 value returned from a previous search

Wraps GET /api/v2/locations/search  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList(null); // List<String> | Provides more details about a specified resource
try {
    LocationsSearchResponse result = apiInstance.getLocationsSearch(q64, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getLocationsSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q64** | **String**| q64 | 
| **expand** | [**List&lt;String&gt;**](String)| Provides more details about a specified resource | [optional]<br />**Values**: images, addressVerificationDetails 
{: class="table-striped"}


### Return type

[**LocationsSearchResponse**](LocationsSearchResponse)


# **getSearch**


> [JsonNodeSearchResponse](JsonNodeSearchResponse) getSearch(q64, expand, profile)

Search using the q64 value returned from a previous search.

Wraps GET /api/v2/search  

Requires ANY permissions: 

* directory:user:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
Boolean profile = true; // Boolean | profile
try {
    JsonNodeSearchResponse result = apiInstance.getSearch(q64, expand, profile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q64** | **String**| q64 | 
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand | [optional]<br />**Values**: routingStatus, presence, integrationPresence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, authorization.unusedRoles, team, workPlanBidRanks, externalContactsSettings, groups, profileSkills, certifications, locations, skills, languages, languagePreference, employerInfo, biography, dateLastLogin, dateWelcomeSent, callerUser.routingStatus, callerUser.primaryPresence, callerUser.conversationSummary, callerUser.outOfOffice, callerUser.geolocation, conversations, transcription, images, addressVerificationDetails 
| **profile** | **Boolean**| profile | [optional] [default to true] 
{: class="table-striped"}


### Return type

[**JsonNodeSearchResponse**](JsonNodeSearchResponse)


# **getSearchSuggest**


> [JsonNodeSearchResponse](JsonNodeSearchResponse) getSearchSuggest(q64, expand, profile)

Suggest resources using the q64 value returned from a previous suggest query.

Wraps GET /api/v2/search/suggest  

Requires ANY permissions: 

* directory:user:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
Boolean profile = true; // Boolean | profile
try {
    JsonNodeSearchResponse result = apiInstance.getSearchSuggest(q64, expand, profile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getSearchSuggest");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q64** | **String**| q64 | 
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand | [optional]<br />**Values**: routingStatus, presence, integrationPresence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, authorization.unusedRoles, team, workPlanBidRanks, externalContactsSettings, groups, profileSkills, certifications, locations, skills, languages, languagePreference, employerInfo, biography, dateLastLogin, dateWelcomeSent, callerUser.routingStatus, callerUser.primaryPresence, callerUser.conversationSummary, callerUser.outOfOffice, callerUser.geolocation, conversations, transcription, images, addressVerificationDetails 
| **profile** | **Boolean**| profile | [optional] [default to true] 
{: class="table-striped"}


### Return type

[**JsonNodeSearchResponse**](JsonNodeSearchResponse)


# **getTelephonyProvidersEdgesSitesSearch**


> [SitesSearchResponse](SitesSearchResponse) getTelephonyProvidersEdgesSitesSearch(q64, expand)

Search sites using the q64 value returned from a previous search

Wraps GET /api/v2/telephony/providers/edges/sites/search  

Requires ANY permissions: 

* telephony:plugin:all
* telephony:sites:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList(null); // List<String> | expand
try {
    SitesSearchResponse result = apiInstance.getTelephonyProvidersEdgesSitesSearch(q64, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getTelephonyProvidersEdgesSitesSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q64** | **String**| q64 | 
| **expand** | [**List&lt;String&gt;**](String)| expand | [optional] 
{: class="table-striped"}


### Return type

[**SitesSearchResponse**](SitesSearchResponse)


# **getUsersSearch**


> [UsersSearchResponse](UsersSearchResponse) getUsersSearch(q64, expand, integrationPresenceSource)

Search users using the q64 value returned from a previous search

Wraps GET /api/v2/users/search  

Requires ANY permissions: 

* directory:user:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList(null); // List<String> | expand
String integrationPresenceSource = "integrationPresenceSource_example"; // String | integrationPresenceSource
try {
    UsersSearchResponse result = apiInstance.getUsersSearch(q64, expand, integrationPresenceSource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getUsersSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q64** | **String**| q64 | 
| **expand** | [**List&lt;String&gt;**](String)| expand | [optional] 
| **integrationPresenceSource** | **String**| integrationPresenceSource | [optional]<br />**Values**: MicrosoftTeams, ZoomPhone, EightByEight 
{: class="table-striped"}


### Return type

[**UsersSearchResponse**](UsersSearchResponse)


# **getVoicemailSearch**


> [VoicemailsSearchResponse](VoicemailsSearchResponse) getVoicemailSearch(q64, expand)

Search voicemails using the q64 value returned from a previous search

Wraps GET /api/v2/voicemail/search  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList(null); // List<String> | expand
try {
    VoicemailsSearchResponse result = apiInstance.getVoicemailSearch(q64, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getVoicemailSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q64** | **String**| q64 | 
| **expand** | [**List&lt;String&gt;**](String)| expand | [optional] 
{: class="table-striped"}


### Return type

[**VoicemailsSearchResponse**](VoicemailsSearchResponse)


# **postConversationsParticipantsAttributesSearch**


> [JsonCursorSearchResponse](JsonCursorSearchResponse) postConversationsParticipantsAttributesSearch(body)

Search conversations

Wraps POST /api/v2/conversations/participants/attributes/search  

Requires ANY permissions: 

* conversation:participant:attributesview

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
ConversationParticipantSearchRequest body = new ConversationParticipantSearchRequest(); // ConversationParticipantSearchRequest | Search request options
try {
    JsonCursorSearchResponse result = apiInstance.postConversationsParticipantsAttributesSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postConversationsParticipantsAttributesSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ConversationParticipantSearchRequest**](ConversationParticipantSearchRequest)| Search request options | 
{: class="table-striped"}


### Return type

[**JsonCursorSearchResponse**](JsonCursorSearchResponse)


# **postDocumentationAllSearch**


> [JsonNodeSearchResponse](JsonNodeSearchResponse) postDocumentationAllSearch(body)

Search all documents

postDocumentationAllSearch is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/documentation/all/search  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.SearchApi;


SearchApi apiInstance = new SearchApi();
DocumentationV2SearchRequest body = new DocumentationV2SearchRequest(); // DocumentationV2SearchRequest | Search request options
try {
    JsonNodeSearchResponse result = apiInstance.postDocumentationAllSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postDocumentationAllSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**DocumentationV2SearchRequest**](DocumentationV2SearchRequest)| Search request options | 
{: class="table-striped"}


### Return type

[**JsonNodeSearchResponse**](JsonNodeSearchResponse)


# **postDocumentationGknSearch**


> [GKNDocumentationSearchResponse](GKNDocumentationSearchResponse) postDocumentationGknSearch(body)

Search gkn documentation

Wraps POST /api/v2/documentation/gkn/search  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.SearchApi;


SearchApi apiInstance = new SearchApi();
GKNDocumentationSearchRequest body = new GKNDocumentationSearchRequest(); // GKNDocumentationSearchRequest | Search request options
try {
    GKNDocumentationSearchResponse result = apiInstance.postDocumentationGknSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postDocumentationGknSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**GKNDocumentationSearchRequest**](GKNDocumentationSearchRequest)| Search request options | 
{: class="table-striped"}


### Return type

[**GKNDocumentationSearchResponse**](GKNDocumentationSearchResponse)


# **postDocumentationSearch**


> [DocumentationSearchResponse](DocumentationSearchResponse) postDocumentationSearch(body)

Search documentation

Wraps POST /api/v2/documentation/search  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.SearchApi;


SearchApi apiInstance = new SearchApi();
DocumentationSearchRequest body = new DocumentationSearchRequest(); // DocumentationSearchRequest | Search request options
try {
    DocumentationSearchResponse result = apiInstance.postDocumentationSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postDocumentationSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**DocumentationSearchRequest**](DocumentationSearchRequest)| Search request options | 
{: class="table-striped"}


### Return type

[**DocumentationSearchResponse**](DocumentationSearchResponse)


# **postGroupsSearch**


> [GroupsSearchResponse](GroupsSearchResponse) postGroupsSearch(body)

Search groups

Wraps POST /api/v2/groups/search  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
GroupSearchRequest body = new GroupSearchRequest(); // GroupSearchRequest | Search request options
try {
    GroupsSearchResponse result = apiInstance.postGroupsSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postGroupsSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**GroupSearchRequest**](GroupSearchRequest)| Search request options | 
{: class="table-striped"}


### Return type

[**GroupsSearchResponse**](GroupsSearchResponse)


# **postKnowledgeKnowledgebaseSearch**

:::{"alert":"warning","title":"Deprecated","collapsible":false,"autoCollapse":false}
This resource has been deprecated
:::

> [KnowledgeSearchResponse](KnowledgeSearchResponse) postKnowledgeKnowledgebaseSearch(knowledgeBaseId, body)

Search Documents

Wraps POST /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/search  

Requires ALL permissions: 

* knowledge:knowledgebase:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
KnowledgeSearchRequest body = new KnowledgeSearchRequest(); // KnowledgeSearchRequest | 
try {
    KnowledgeSearchResponse result = apiInstance.postKnowledgeKnowledgebaseSearch(knowledgeBaseId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postKnowledgeKnowledgebaseSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **knowledgeBaseId** | **String**| Knowledge base ID | 
| **body** | [**KnowledgeSearchRequest**](KnowledgeSearchRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**KnowledgeSearchResponse**](KnowledgeSearchResponse)


# **postLocationsSearch**


> [LocationsSearchResponse](LocationsSearchResponse) postLocationsSearch(body)

Search locations

Wraps POST /api/v2/locations/search  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
LocationSearchRequest body = new LocationSearchRequest(); // LocationSearchRequest | Search request options
try {
    LocationsSearchResponse result = apiInstance.postLocationsSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postLocationsSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**LocationSearchRequest**](LocationSearchRequest)| Search request options | 
{: class="table-striped"}


### Return type

[**LocationsSearchResponse**](LocationsSearchResponse)


# **postSearch**


> [JsonNodeSearchResponse](JsonNodeSearchResponse) postSearch(body, profile)

Search resources.

Wraps POST /api/v2/search  

Requires ANY permissions: 

* directory:user:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
SearchRequest body = new SearchRequest(); // SearchRequest | Search request options
Boolean profile = true; // Boolean | profile
try {
    JsonNodeSearchResponse result = apiInstance.postSearch(body, profile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SearchRequest**](SearchRequest)| Search request options | 
| **profile** | **Boolean**| profile | [optional] [default to true] 
{: class="table-striped"}


### Return type

[**JsonNodeSearchResponse**](JsonNodeSearchResponse)


# **postSearchSuggest**


> [JsonNodeSearchResponse](JsonNodeSearchResponse) postSearchSuggest(body, profile)

Suggest resources.

Wraps POST /api/v2/search/suggest  

Requires ANY permissions: 

* directory:user:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
SuggestSearchRequest body = new SuggestSearchRequest(); // SuggestSearchRequest | Search request options
Boolean profile = true; // Boolean | profile
try {
    JsonNodeSearchResponse result = apiInstance.postSearchSuggest(body, profile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postSearchSuggest");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SuggestSearchRequest**](SuggestSearchRequest)| Search request options | 
| **profile** | **Boolean**| profile | [optional] [default to true] 
{: class="table-striped"}


### Return type

[**JsonNodeSearchResponse**](JsonNodeSearchResponse)


# **postSpeechandtextanalyticsTranscriptsSearch**


> [JsonSearchResponse](JsonSearchResponse) postSpeechandtextanalyticsTranscriptsSearch(body)

Search resources.

Wraps POST /api/v2/speechandtextanalytics/transcripts/search  

Requires ANY permissions: 

* analytics:conversationDetail:view
* recording:recording:view
* recording:recordingSegment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
TranscriptSearchRequest body = new TranscriptSearchRequest(); // TranscriptSearchRequest | Search request options
try {
    JsonSearchResponse result = apiInstance.postSpeechandtextanalyticsTranscriptsSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postSpeechandtextanalyticsTranscriptsSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**TranscriptSearchRequest**](TranscriptSearchRequest)| Search request options | 
{: class="table-striped"}


### Return type

[**JsonSearchResponse**](JsonSearchResponse)


# **postTeamsSearch**


> [TeamsSearchResponse](TeamsSearchResponse) postTeamsSearch(body)

Search resources.

Wraps POST /api/v2/teams/search  

Requires ANY permissions: 

* groups:team:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
TeamSearchRequest body = new TeamSearchRequest(); // TeamSearchRequest | Search request options
try {
    TeamsSearchResponse result = apiInstance.postTeamsSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postTeamsSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**TeamSearchRequest**](TeamSearchRequest)| Search request options | 
{: class="table-striped"}


### Return type

[**TeamsSearchResponse**](TeamsSearchResponse)


# **postTelephonyProvidersEdgesSitesSearch**


> [SitesSearchResponse](SitesSearchResponse) postTelephonyProvidersEdgesSitesSearch(body)

Search sites

Wraps POST /api/v2/telephony/providers/edges/sites/search  

Requires ANY permissions: 

* telephony:plugin:all
* telephony:sites:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
SiteSearchRequest body = new SiteSearchRequest(); // SiteSearchRequest | Search request options
try {
    SitesSearchResponse result = apiInstance.postTelephonyProvidersEdgesSitesSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postTelephonyProvidersEdgesSitesSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SiteSearchRequest**](SiteSearchRequest)| Search request options | 
{: class="table-striped"}


### Return type

[**SitesSearchResponse**](SitesSearchResponse)


# **postUsersSearch**


> [UsersSearchResponse](UsersSearchResponse) postUsersSearch(body)

Search users

Wraps POST /api/v2/users/search  

Requires ANY permissions: 

* directory:user:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
UserSearchRequest body = new UserSearchRequest(); // UserSearchRequest | Search request options
try {
    UsersSearchResponse result = apiInstance.postUsersSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postUsersSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**UserSearchRequest**](UserSearchRequest)| Search request options | 
{: class="table-striped"}


### Return type

[**UsersSearchResponse**](UsersSearchResponse)


# **postUsersSearchConversationTarget**


> [UsersSearchResponse](UsersSearchResponse) postUsersSearchConversationTarget(body)

Search users as conversation targets

postUsersSearchConversationTarget is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/users/search/conversation/target  

Requires ANY permissions: 

* conversation:communication:target

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
UserSearchRequest body = new UserSearchRequest(); // UserSearchRequest | Search request options
try {
    UsersSearchResponse result = apiInstance.postUsersSearchConversationTarget(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postUsersSearchConversationTarget");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**UserSearchRequest**](UserSearchRequest)| Search request options | 
{: class="table-striped"}


### Return type

[**UsersSearchResponse**](UsersSearchResponse)


# **postUsersSearchQueuemembersManage**


> [UsersSearchResponse](UsersSearchResponse) postUsersSearchQueuemembersManage(body)

Search manage queue member

postUsersSearchQueuemembersManage is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/users/search/queuemembers/manage  

Requires ANY permissions: 

* routing:queueMember:manage
* routing:queue:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
UserSearchRequest body = new UserSearchRequest(); // UserSearchRequest | Search request options
try {
    UsersSearchResponse result = apiInstance.postUsersSearchQueuemembersManage(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postUsersSearchQueuemembersManage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**UserSearchRequest**](UserSearchRequest)| Search request options | 
{: class="table-striped"}


### Return type

[**UsersSearchResponse**](UsersSearchResponse)


# **postUsersSearchTeamsAssign**


> [UsersSearchResponse](UsersSearchResponse) postUsersSearchTeamsAssign(body)

Search users assigned to teams

Wraps POST /api/v2/users/search/teams/assign  

Requires ANY permissions: 

* groups:team:assign

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
UserSearchRequest body = new UserSearchRequest(); // UserSearchRequest | Search request options
try {
    UsersSearchResponse result = apiInstance.postUsersSearchTeamsAssign(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postUsersSearchTeamsAssign");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**UserSearchRequest**](UserSearchRequest)| Search request options | 
{: class="table-striped"}


### Return type

[**UsersSearchResponse**](UsersSearchResponse)


# **postVoicemailSearch**


> [VoicemailsSearchResponse](VoicemailsSearchResponse) postVoicemailSearch(body)

Search voicemails

Wraps POST /api/v2/voicemail/search  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
VoicemailSearchRequest body = new VoicemailSearchRequest(); // VoicemailSearchRequest | Search request options
try {
    VoicemailsSearchResponse result = apiInstance.postVoicemailSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postVoicemailSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**VoicemailSearchRequest**](VoicemailSearchRequest)| Search request options | 
{: class="table-striped"}


### Return type

[**VoicemailsSearchResponse**](VoicemailsSearchResponse)


_com.mypurecloud.sdk.v2:platform-client-v2:233.0.0_
