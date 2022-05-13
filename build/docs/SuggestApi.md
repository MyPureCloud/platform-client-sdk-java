---
title: SuggestApi
---
## SuggestApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getSearch**](SuggestApi.html#getSearch) | Search using the q64 value returned from a previous search. |
| [**getSearchSuggest**](SuggestApi.html#getSearchSuggest) | Suggest resources using the q64 value returned from a previous suggest query. |
| [**postSearch**](SuggestApi.html#postSearch) | Search resources. |
| [**postSearchSuggest**](SuggestApi.html#postSearchSuggest) | Suggest resources. |
{: class="table-striped"}

<a name="getSearch"></a>

# **getSearch**



> [JsonNodeSearchResponse](JsonNodeSearchResponse.html) getSearch(q64, expand, profile)

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
import com.mypurecloud.sdk.v2.api.SuggestApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SuggestApi apiInstance = new SuggestApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
Boolean profile = true; // Boolean | profile
try {
    JsonNodeSearchResponse result = apiInstance.getSearch(q64, expand, profile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SuggestApi#getSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q64** | **String**| q64 | 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional]<br />**Values**: routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, dateLastLogin, authorization.unusedRoles, team, profileSkills, certifications, locations, groups, skills, languages, languagePreference, employerInfo, biography, callerUser.routingStatus, callerUser.primaryPresence, callerUser.conversationSummary, callerUser.outOfOffice, callerUser.geolocation, images, addressVerificationDetails 
| **profile** | **Boolean**| profile | [optional] [default to true] 
{: class="table-striped"}


### Return type

[**JsonNodeSearchResponse**](JsonNodeSearchResponse.html)

<a name="getSearchSuggest"></a>

# **getSearchSuggest**



> [JsonNodeSearchResponse](JsonNodeSearchResponse.html) getSearchSuggest(q64, expand, profile)

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
import com.mypurecloud.sdk.v2.api.SuggestApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SuggestApi apiInstance = new SuggestApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
Boolean profile = true; // Boolean | profile
try {
    JsonNodeSearchResponse result = apiInstance.getSearchSuggest(q64, expand, profile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SuggestApi#getSearchSuggest");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q64** | **String**| q64 | 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand | [optional]<br />**Values**: routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, dateLastLogin, authorization.unusedRoles, team, profileSkills, certifications, locations, groups, skills, languages, languagePreference, employerInfo, biography, callerUser.routingStatus, callerUser.primaryPresence, callerUser.conversationSummary, callerUser.outOfOffice, callerUser.geolocation, images, addressVerificationDetails 
| **profile** | **Boolean**| profile | [optional] [default to true] 
{: class="table-striped"}


### Return type

[**JsonNodeSearchResponse**](JsonNodeSearchResponse.html)

<a name="postSearch"></a>

# **postSearch**



> [JsonNodeSearchResponse](JsonNodeSearchResponse.html) postSearch(body, profile)

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
import com.mypurecloud.sdk.v2.api.SuggestApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SuggestApi apiInstance = new SuggestApi();
SearchRequest body = new SearchRequest(); // SearchRequest | Search request options
Boolean profile = true; // Boolean | profile
try {
    JsonNodeSearchResponse result = apiInstance.postSearch(body, profile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SuggestApi#postSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SearchRequest**](SearchRequest.html)| Search request options | 
| **profile** | **Boolean**| profile | [optional] [default to true] 
{: class="table-striped"}


### Return type

[**JsonNodeSearchResponse**](JsonNodeSearchResponse.html)

<a name="postSearchSuggest"></a>

# **postSearchSuggest**



> [JsonNodeSearchResponse](JsonNodeSearchResponse.html) postSearchSuggest(body, profile)

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
import com.mypurecloud.sdk.v2.api.SuggestApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SuggestApi apiInstance = new SuggestApi();
SuggestSearchRequest body = new SuggestSearchRequest(); // SuggestSearchRequest | Search request options
Boolean profile = true; // Boolean | profile
try {
    JsonNodeSearchResponse result = apiInstance.postSearchSuggest(body, profile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SuggestApi#postSearchSuggest");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SuggestSearchRequest**](SuggestSearchRequest.html)| Search request options | 
| **profile** | **Boolean**| profile | [optional] [default to true] 
{: class="table-striped"}


### Return type

[**JsonNodeSearchResponse**](JsonNodeSearchResponse.html)

