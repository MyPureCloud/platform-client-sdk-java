---
title: SearchApi
---
## SearchApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getDocumentationSearch**](SearchApi.html#getDocumentationSearch) | Search documentation using the q64 value returned from a previous search |
| [**getGroupsSearch**](SearchApi.html#getGroupsSearch) | Search groups using the q64 value returned from a previous search |
| [**getLocationsSearch**](SearchApi.html#getLocationsSearch) | Search locations using the q64 value returned from a previous search |
| [**getSearch**](SearchApi.html#getSearch) | Search using the q64 value returned from a previous search. |
| [**getSearchSuggest**](SearchApi.html#getSearchSuggest) | Suggest resources using the q64 value returned from a previous suggest query. |
| [**getUsersSearch**](SearchApi.html#getUsersSearch) | Search users using the q64 value returned from a previous search |
| [**getVoicemailSearch**](SearchApi.html#getVoicemailSearch) | Search voicemails using the q64 value returned from a previous search |
| [**postDocumentationSearch**](SearchApi.html#postDocumentationSearch) | Search documentation |
| [**postGroupsSearch**](SearchApi.html#postGroupsSearch) | Search groups |
| [**postLocationsSearch**](SearchApi.html#postLocationsSearch) | Search locations |
| [**postSearch**](SearchApi.html#postSearch) | Search resources. |
| [**postSearchSuggest**](SearchApi.html#postSearchSuggest) | Suggest resources. |
| [**postUsersSearch**](SearchApi.html#postUsersSearch) | Search users |
| [**postVoicemailSearch**](SearchApi.html#postVoicemailSearch) | Search voicemails |
{: class="table table-striped"}

<a name="getDocumentationSearch"></a>

# **getDocumentationSearch**

> [DocumentationSearchResponse](DocumentationSearchResponse.html) getDocumentationSearch(q64)

Search documentation using the q64 value returned from a previous search



Wraps GET /api/v2/documentation/search  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

SearchApi apiInstance = new SearchApi();
String q64 = "q64_example"; // String | q64
try {
    DocumentationSearchResponse result = apiInstance.getDocumentationSearch(q64);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getDocumentationSearch");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q64** | **String**| q64 | |
{: class="table table-striped"}

### Return type

[**DocumentationSearchResponse**](DocumentationSearchResponse.html)

<a name="getGroupsSearch"></a>

# **getGroupsSearch**

> [GroupsSearchResponse](GroupsSearchResponse.html) getGroupsSearch(q64, expand)

Search groups using the q64 value returned from a previous search



Wraps GET /api/v2/groups/search  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

SearchApi apiInstance = new SearchApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList("expand_example"); // List<String> | expand
try {
    GroupsSearchResponse result = apiInstance.getGroupsSearch(q64, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getGroupsSearch");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q64** | **String**| q64 | |
| **expand** | [**List&lt;String&gt;**](String.html)| expand | [optional] |
{: class="table table-striped"}

### Return type

[**GroupsSearchResponse**](GroupsSearchResponse.html)

<a name="getLocationsSearch"></a>

# **getLocationsSearch**

> [LocationsSearchResponse](LocationsSearchResponse.html) getLocationsSearch(q64, expand)

Search locations using the q64 value returned from a previous search



Wraps GET /api/v2/locations/search  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

SearchApi apiInstance = new SearchApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList("expand_example"); // List<String> | expand
try {
    LocationsSearchResponse result = apiInstance.getLocationsSearch(q64, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getLocationsSearch");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q64** | **String**| q64 | |
| **expand** | [**List&lt;String&gt;**](String.html)| expand | [optional] |
{: class="table table-striped"}

### Return type

[**LocationsSearchResponse**](LocationsSearchResponse.html)

<a name="getSearch"></a>

# **getSearch**

> [JsonNodeSearchResponse](JsonNodeSearchResponse.html) getSearch(q64, expand, profile)

Search using the q64 value returned from a previous search.



Wraps GET /api/v2/search  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

SearchApi apiInstance = new SearchApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
Boolean profile = true; // Boolean | profile
try {
    JsonNodeSearchResponse result = apiInstance.getSearch(q64, expand, profile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getSearch");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q64** | **String**| q64 | |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional]<br />**Values**: routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, profileSkills, locations, groups, callerUser.routingStatus, callerUser.primaryPresence, callerUser.conversationSummary, callerUser.outOfOffice, callerUser.geolocation |
| **profile** | **Boolean**| profile | [optional] [default to true] |
{: class="table table-striped"}

### Return type

[**JsonNodeSearchResponse**](JsonNodeSearchResponse.html)

<a name="getSearchSuggest"></a>

# **getSearchSuggest**

> [JsonNodeSearchResponse](JsonNodeSearchResponse.html) getSearchSuggest(q64, expand, profile)

Suggest resources using the q64 value returned from a previous suggest query.



Wraps GET /api/v2/search/suggest  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

SearchApi apiInstance = new SearchApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
Boolean profile = true; // Boolean | profile
try {
    JsonNodeSearchResponse result = apiInstance.getSearchSuggest(q64, expand, profile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getSearchSuggest");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q64** | **String**| q64 | |
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional]<br />**Values**: routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, profileSkills, locations, groups, callerUser.routingStatus, callerUser.primaryPresence, callerUser.conversationSummary, callerUser.outOfOffice, callerUser.geolocation |
| **profile** | **Boolean**| profile | [optional] [default to true] |
{: class="table table-striped"}

### Return type

[**JsonNodeSearchResponse**](JsonNodeSearchResponse.html)

<a name="getUsersSearch"></a>

# **getUsersSearch**

> [UsersSearchResponse](UsersSearchResponse.html) getUsersSearch(q64, expand)

Search users using the q64 value returned from a previous search



Wraps GET /api/v2/users/search  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

SearchApi apiInstance = new SearchApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList("expand_example"); // List<String> | expand
try {
    UsersSearchResponse result = apiInstance.getUsersSearch(q64, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getUsersSearch");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q64** | **String**| q64 | |
| **expand** | [**List&lt;String&gt;**](String.html)| expand | [optional] |
{: class="table table-striped"}

### Return type

[**UsersSearchResponse**](UsersSearchResponse.html)

<a name="getVoicemailSearch"></a>

# **getVoicemailSearch**

> [VoicemailsSearchResponse](VoicemailsSearchResponse.html) getVoicemailSearch(q64, expand)

Search voicemails using the q64 value returned from a previous search



Wraps GET /api/v2/voicemail/search  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

SearchApi apiInstance = new SearchApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList("expand_example"); // List<String> | expand
try {
    VoicemailsSearchResponse result = apiInstance.getVoicemailSearch(q64, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getVoicemailSearch");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q64** | **String**| q64 | |
| **expand** | [**List&lt;String&gt;**](String.html)| expand | [optional] |
{: class="table table-striped"}

### Return type

[**VoicemailsSearchResponse**](VoicemailsSearchResponse.html)

<a name="postDocumentationSearch"></a>

# **postDocumentationSearch**

> [DocumentationSearchResponse](DocumentationSearchResponse.html) postDocumentationSearch(body)

Search documentation



Wraps POST /api/v2/documentation/search  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

SearchApi apiInstance = new SearchApi();
DocumentationSearchRequest body = new DocumentationSearchRequest(); // DocumentationSearchRequest | Search request options
try {
    DocumentationSearchResponse result = apiInstance.postDocumentationSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postDocumentationSearch");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**DocumentationSearchRequest**](DocumentationSearchRequest.html)| Search request options | |
{: class="table table-striped"}

### Return type

[**DocumentationSearchResponse**](DocumentationSearchResponse.html)

<a name="postGroupsSearch"></a>

# **postGroupsSearch**

> [GroupsSearchResponse](GroupsSearchResponse.html) postGroupsSearch(body)

Search groups



Wraps POST /api/v2/groups/search  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

SearchApi apiInstance = new SearchApi();
GroupSearchRequest body = new GroupSearchRequest(); // GroupSearchRequest | Search request options
try {
    GroupsSearchResponse result = apiInstance.postGroupsSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postGroupsSearch");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**GroupSearchRequest**](GroupSearchRequest.html)| Search request options | |
{: class="table table-striped"}

### Return type

[**GroupsSearchResponse**](GroupsSearchResponse.html)

<a name="postLocationsSearch"></a>

# **postLocationsSearch**

> [LocationsSearchResponse](LocationsSearchResponse.html) postLocationsSearch(body)

Search locations



Wraps POST /api/v2/locations/search  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

SearchApi apiInstance = new SearchApi();
LocationSearchRequest body = new LocationSearchRequest(); // LocationSearchRequest | Search request options
try {
    LocationsSearchResponse result = apiInstance.postLocationsSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postLocationsSearch");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**LocationSearchRequest**](LocationSearchRequest.html)| Search request options | |
{: class="table table-striped"}

### Return type

[**LocationsSearchResponse**](LocationsSearchResponse.html)

<a name="postSearch"></a>

# **postSearch**

> [JsonNodeSearchResponse](JsonNodeSearchResponse.html) postSearch(body, profile)

Search resources.



Wraps POST /api/v2/search  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

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
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SearchRequest**](SearchRequest.html)| Search request options | |
| **profile** | **Boolean**| profile | [optional] [default to true] |
{: class="table table-striped"}

### Return type

[**JsonNodeSearchResponse**](JsonNodeSearchResponse.html)

<a name="postSearchSuggest"></a>

# **postSearchSuggest**

> [JsonNodeSearchResponse](JsonNodeSearchResponse.html) postSearchSuggest(body, profile)

Suggest resources.



Wraps POST /api/v2/search/suggest  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

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
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SuggestSearchRequest**](SuggestSearchRequest.html)| Search request options | |
| **profile** | **Boolean**| profile | [optional] [default to true] |
{: class="table table-striped"}

### Return type

[**JsonNodeSearchResponse**](JsonNodeSearchResponse.html)

<a name="postUsersSearch"></a>

# **postUsersSearch**

> [UsersSearchResponse](UsersSearchResponse.html) postUsersSearch(body)

Search users



Wraps POST /api/v2/users/search  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

SearchApi apiInstance = new SearchApi();
UserSearchRequest body = new UserSearchRequest(); // UserSearchRequest | Search request options
try {
    UsersSearchResponse result = apiInstance.postUsersSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postUsersSearch");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**UserSearchRequest**](UserSearchRequest.html)| Search request options | |
{: class="table table-striped"}

### Return type

[**UsersSearchResponse**](UsersSearchResponse.html)

<a name="postVoicemailSearch"></a>

# **postVoicemailSearch**

> [VoicemailsSearchResponse](VoicemailsSearchResponse.html) postVoicemailSearch(body)

Search voicemails



Wraps POST /api/v2/voicemail/search  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

SearchApi apiInstance = new SearchApi();
VoicemailSearchRequest body = new VoicemailSearchRequest(); // VoicemailSearchRequest | Search request options
try {
    VoicemailsSearchResponse result = apiInstance.postVoicemailSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postVoicemailSearch");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**VoicemailSearchRequest**](VoicemailSearchRequest.html)| Search request options | |
{: class="table table-striped"}

### Return type

[**VoicemailsSearchResponse**](VoicemailsSearchResponse.html)

