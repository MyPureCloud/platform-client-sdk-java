---
title: TeamsApi
---
## TeamsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteTeam**](TeamsApi.html#deleteTeam) | Delete team |
| [**getTeam**](TeamsApi.html#getTeam) | Get team |
| [**getTeams**](TeamsApi.html#getTeams) | Get Team listing |
| [**patchTeam**](TeamsApi.html#patchTeam) | Update team |
| [**postTeams**](TeamsApi.html#postTeams) | Create a team |
| [**postTeamsSearch**](TeamsApi.html#postTeamsSearch) | Search resources. |
{: class="table-striped"}

<a name="deleteTeam"></a>

# **deleteTeam**



> Void deleteTeam(teamId)

Delete team

Wraps DELETE /api/v2/teams/{teamId}  

Requires ANY permissions: 

* groups:team:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | Team ID
try {
    apiInstance.deleteTeam(teamId);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#deleteTeam");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **teamId** | **String**| Team ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="getTeam"></a>

# **getTeam**



> [Team](Team.html) getTeam(teamId)

Get team

Wraps GET /api/v2/teams/{teamId}  

Requires ANY permissions: 

* groups:team:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | Team ID
try {
    Team result = apiInstance.getTeam(teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#getTeam");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **teamId** | **String**| Team ID | 
{: class="table-striped"}


### Return type

[**Team**](Team.html)

<a name="getTeams"></a>

# **getTeams**



> [TeamEntityListing](TeamEntityListing.html) getTeams(pageSize, name, after, before, expand)

Get Team listing

Wraps GET /api/v2/teams  

Requires ANY permissions: 

* groups:team:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TeamsApi apiInstance = new TeamsApi();
Integer pageSize = 25; // Integer | Page size
String name = "name_example"; // String | Return only teams whose names start with this value (case-insensitive matching)
String after = "after_example"; // String | The cursor that points to the next item in the complete list of teams
String before = "before_example"; // String | The cursor that points to the previous item in the complete list of teams
String expand = "expand_example"; // String | Expand the name on each user
try {
    TeamEntityListing result = apiInstance.getTeams(pageSize, name, after, before, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#getTeams");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **name** | **String**| Return only teams whose names start with this value (case-insensitive matching) | [optional] 
| **after** | **String**| The cursor that points to the next item in the complete list of teams | [optional] 
| **before** | **String**| The cursor that points to the previous item in the complete list of teams | [optional] 
| **expand** | **String**| Expand the name on each user | [optional]<br />**Values**: entities.division 
{: class="table-striped"}


### Return type

[**TeamEntityListing**](TeamEntityListing.html)

<a name="patchTeam"></a>

# **patchTeam**



> [Team](Team.html) patchTeam(teamId, body)

Update team

Wraps PATCH /api/v2/teams/{teamId}  

Requires ANY permissions: 

* groups:team:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TeamsApi apiInstance = new TeamsApi();
String teamId = "teamId_example"; // String | Team ID
Team body = new Team(); // Team | Team
try {
    Team result = apiInstance.patchTeam(teamId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#patchTeam");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **teamId** | **String**| Team ID | 
| **body** | [**Team**](Team.html)| Team | 
{: class="table-striped"}


### Return type

[**Team**](Team.html)

<a name="postTeams"></a>

# **postTeams**



> [Team](Team.html) postTeams(body)

Create a team

Wraps POST /api/v2/teams  

Requires ANY permissions: 

* groups:team:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TeamsApi apiInstance = new TeamsApi();
Team body = new Team(); // Team | Team
try {
    Team result = apiInstance.postTeams(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#postTeams");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Team**](Team.html)| Team | 
{: class="table-striped"}


### Return type

[**Team**](Team.html)

<a name="postTeamsSearch"></a>

# **postTeamsSearch**



> [TeamsSearchResponse](TeamsSearchResponse.html) postTeamsSearch(body)

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
import com.mypurecloud.sdk.v2.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TeamsApi apiInstance = new TeamsApi();
TeamSearchRequest body = new TeamSearchRequest(); // TeamSearchRequest | Search request options
try {
    TeamsSearchResponse result = apiInstance.postTeamsSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#postTeamsSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**TeamSearchRequest**](TeamSearchRequest.html)| Search request options | 
{: class="table-striped"}


### Return type

[**TeamsSearchResponse**](TeamsSearchResponse.html)

