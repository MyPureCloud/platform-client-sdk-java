# GreetingsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteGreeting**](GreetingsApi#deleteGreeting) | Deletes a Greeting with the given GreetingId |
| [**getGreeting**](GreetingsApi#getGreeting) | Get a Greeting with the given GreetingId |
| [**getGreetingMedia**](GreetingsApi#getGreetingMedia) | Get media playback URI for this greeting |
| [**getGreetings**](GreetingsApi#getGreetings) | Gets an Organization's Greetings |
| [**getGreetingsDefaults**](GreetingsApi#getGreetingsDefaults) | Get an Organization's DefaultGreetingList |
| [**getGroupGreetings**](GreetingsApi#getGroupGreetings) | Get a list of the Group's Greetings |
| [**getGroupGreetingsDefaults**](GreetingsApi#getGroupGreetingsDefaults) | Grabs the list of Default Greetings given a Group's ID |
| [**getUserGreetings**](GreetingsApi#getUserGreetings) | Get a list of the User's Greetings |
| [**getUserGreetingsDefaults**](GreetingsApi#getUserGreetingsDefaults) | Grabs the list of Default Greetings given a User's ID |
| [**postGreetings**](GreetingsApi#postGreetings) | Create a Greeting for an Organization |
| [**postGroupGreetings**](GreetingsApi#postGroupGreetings) | Creates a Greeting for a Group |
| [**postUserGreetings**](GreetingsApi#postUserGreetings) | Creates a Greeting for a User |
| [**putGreeting**](GreetingsApi#putGreeting) | Updates the Greeting with the given GreetingId |
| [**putGreetingsDefaults**](GreetingsApi#putGreetingsDefaults) | Update an Organization's DefaultGreetingList |
| [**putGroupGreetingsDefaults**](GreetingsApi#putGroupGreetingsDefaults) | Updates the DefaultGreetingList of the specified Group |
| [**putUserGreetingsDefaults**](GreetingsApi#putUserGreetingsDefaults) | Updates the DefaultGreetingList of the specified User |
{: class="table-striped"}


# **deleteGreeting**


> Void deleteGreeting(greetingId)

Deletes a Greeting with the given GreetingId

Wraps DELETE /api/v2/greetings/{greetingId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GreetingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GreetingsApi apiInstance = new GreetingsApi();
String greetingId = "greetingId_example"; // String | Greeting ID
try {
    apiInstance.deleteGreeting(greetingId);
} catch (ApiException e) {
    System.err.println("Exception when calling GreetingsApi#deleteGreeting");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **greetingId** | **String**| Greeting ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **getGreeting**


> [Greeting](Greeting) getGreeting(greetingId)

Get a Greeting with the given GreetingId

Wraps GET /api/v2/greetings/{greetingId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GreetingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GreetingsApi apiInstance = new GreetingsApi();
String greetingId = "greetingId_example"; // String | Greeting ID
try {
    Greeting result = apiInstance.getGreeting(greetingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GreetingsApi#getGreeting");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **greetingId** | **String**| Greeting ID | 
{: class="table-striped"}


### Return type

[**Greeting**](Greeting)


# **getGreetingMedia**


> [GreetingMediaInfo](GreetingMediaInfo) getGreetingMedia(greetingId, formatId)

Get media playback URI for this greeting

Wraps GET /api/v2/greetings/{greetingId}/media  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GreetingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GreetingsApi apiInstance = new GreetingsApi();
String greetingId = "greetingId_example"; // String | Greeting ID
String formatId = "WAV"; // String | The desired media format.
try {
    GreetingMediaInfo result = apiInstance.getGreetingMedia(greetingId, formatId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GreetingsApi#getGreetingMedia");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **greetingId** | **String**| Greeting ID | 
| **formatId** | **String**| The desired media format. | [optional] [default to WAV]<br />**Values**: WAV, WEBM, WAV_ULAW, OGG_VORBIS, OGG_OPUS, MP3, NONE 
{: class="table-striped"}


### Return type

[**GreetingMediaInfo**](GreetingMediaInfo)


# **getGreetings**


> [DomainEntityListing](DomainEntityListing) getGreetings(pageSize, pageNumber)

Gets an Organization's Greetings

Wraps GET /api/v2/greetings  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GreetingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GreetingsApi apiInstance = new GreetingsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    DomainEntityListing result = apiInstance.getGreetings(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GreetingsApi#getGreetings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**DomainEntityListing**](DomainEntityListing)


# **getGreetingsDefaults**


> [DefaultGreetingList](DefaultGreetingList) getGreetingsDefaults()

Get an Organization's DefaultGreetingList

Wraps GET /api/v2/greetings/defaults  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GreetingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GreetingsApi apiInstance = new GreetingsApi();
try {
    DefaultGreetingList result = apiInstance.getGreetingsDefaults();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GreetingsApi#getGreetingsDefaults");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**DefaultGreetingList**](DefaultGreetingList)


# **getGroupGreetings**


> [GreetingListing](GreetingListing) getGroupGreetings(groupId, pageSize, pageNumber)

Get a list of the Group's Greetings

Wraps GET /api/v2/groups/{groupId}/greetings  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GreetingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GreetingsApi apiInstance = new GreetingsApi();
String groupId = "groupId_example"; // String | Group ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    GreetingListing result = apiInstance.getGroupGreetings(groupId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GreetingsApi#getGroupGreetings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**| Group ID | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**GreetingListing**](GreetingListing)


# **getGroupGreetingsDefaults**


> [DefaultGreetingList](DefaultGreetingList) getGroupGreetingsDefaults(groupId)

Grabs the list of Default Greetings given a Group's ID

Wraps GET /api/v2/groups/{groupId}/greetings/defaults  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GreetingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GreetingsApi apiInstance = new GreetingsApi();
String groupId = "groupId_example"; // String | Group ID
try {
    DefaultGreetingList result = apiInstance.getGroupGreetingsDefaults(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GreetingsApi#getGroupGreetingsDefaults");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**| Group ID | 
{: class="table-striped"}


### Return type

[**DefaultGreetingList**](DefaultGreetingList)


# **getUserGreetings**


> [DomainEntityListing](DomainEntityListing) getUserGreetings(userId, pageSize, pageNumber)

Get a list of the User's Greetings

Wraps GET /api/v2/users/{userId}/greetings  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GreetingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GreetingsApi apiInstance = new GreetingsApi();
String userId = "userId_example"; // String | User ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    DomainEntityListing result = apiInstance.getUserGreetings(userId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GreetingsApi#getUserGreetings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**DomainEntityListing**](DomainEntityListing)


# **getUserGreetingsDefaults**


> [DefaultGreetingList](DefaultGreetingList) getUserGreetingsDefaults(userId)

Grabs the list of Default Greetings given a User's ID

Wraps GET /api/v2/users/{userId}/greetings/defaults  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GreetingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GreetingsApi apiInstance = new GreetingsApi();
String userId = "userId_example"; // String | User ID
try {
    DefaultGreetingList result = apiInstance.getUserGreetingsDefaults(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GreetingsApi#getUserGreetingsDefaults");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
{: class="table-striped"}


### Return type

[**DefaultGreetingList**](DefaultGreetingList)


# **postGreetings**


> [Greeting](Greeting) postGreetings(body)

Create a Greeting for an Organization

Wraps POST /api/v2/greetings  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GreetingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GreetingsApi apiInstance = new GreetingsApi();
Greeting body = new Greeting(); // Greeting | The Greeting to create
try {
    Greeting result = apiInstance.postGreetings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GreetingsApi#postGreetings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Greeting**](Greeting)| The Greeting to create | 
{: class="table-striped"}


### Return type

[**Greeting**](Greeting)


# **postGroupGreetings**


> [Greeting](Greeting) postGroupGreetings(groupId, body)

Creates a Greeting for a Group

Wraps POST /api/v2/groups/{groupId}/greetings  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GreetingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GreetingsApi apiInstance = new GreetingsApi();
String groupId = "groupId_example"; // String | Group ID
Greeting body = new Greeting(); // Greeting | The Greeting to create
try {
    Greeting result = apiInstance.postGroupGreetings(groupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GreetingsApi#postGroupGreetings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**| Group ID | 
| **body** | [**Greeting**](Greeting)| The Greeting to create | 
{: class="table-striped"}


### Return type

[**Greeting**](Greeting)


# **postUserGreetings**


> [Greeting](Greeting) postUserGreetings(userId, body)

Creates a Greeting for a User

Wraps POST /api/v2/users/{userId}/greetings  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GreetingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GreetingsApi apiInstance = new GreetingsApi();
String userId = "userId_example"; // String | User ID
Greeting body = new Greeting(); // Greeting | The Greeting to create
try {
    Greeting result = apiInstance.postUserGreetings(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GreetingsApi#postUserGreetings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**Greeting**](Greeting)| The Greeting to create | 
{: class="table-striped"}


### Return type

[**Greeting**](Greeting)


# **putGreeting**


> [Greeting](Greeting) putGreeting(greetingId, body)

Updates the Greeting with the given GreetingId

Wraps PUT /api/v2/greetings/{greetingId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GreetingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GreetingsApi apiInstance = new GreetingsApi();
String greetingId = "greetingId_example"; // String | Greeting ID
Greeting body = new Greeting(); // Greeting | The updated Greeting
try {
    Greeting result = apiInstance.putGreeting(greetingId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GreetingsApi#putGreeting");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **greetingId** | **String**| Greeting ID | 
| **body** | [**Greeting**](Greeting)| The updated Greeting | 
{: class="table-striped"}


### Return type

[**Greeting**](Greeting)


# **putGreetingsDefaults**


> [DefaultGreetingList](DefaultGreetingList) putGreetingsDefaults(body)

Update an Organization's DefaultGreetingList

Wraps PUT /api/v2/greetings/defaults  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GreetingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GreetingsApi apiInstance = new GreetingsApi();
DefaultGreetingList body = new DefaultGreetingList(); // DefaultGreetingList | The updated defaultGreetingList
try {
    DefaultGreetingList result = apiInstance.putGreetingsDefaults(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GreetingsApi#putGreetingsDefaults");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**DefaultGreetingList**](DefaultGreetingList)| The updated defaultGreetingList | 
{: class="table-striped"}


### Return type

[**DefaultGreetingList**](DefaultGreetingList)


# **putGroupGreetingsDefaults**


> [DefaultGreetingList](DefaultGreetingList) putGroupGreetingsDefaults(groupId, body)

Updates the DefaultGreetingList of the specified Group

Wraps PUT /api/v2/groups/{groupId}/greetings/defaults  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GreetingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GreetingsApi apiInstance = new GreetingsApi();
String groupId = "groupId_example"; // String | Group ID
DefaultGreetingList body = new DefaultGreetingList(); // DefaultGreetingList | The updated defaultGreetingList
try {
    DefaultGreetingList result = apiInstance.putGroupGreetingsDefaults(groupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GreetingsApi#putGroupGreetingsDefaults");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **String**| Group ID | 
| **body** | [**DefaultGreetingList**](DefaultGreetingList)| The updated defaultGreetingList | 
{: class="table-striped"}


### Return type

[**DefaultGreetingList**](DefaultGreetingList)


# **putUserGreetingsDefaults**


> [DefaultGreetingList](DefaultGreetingList) putUserGreetingsDefaults(userId, body)

Updates the DefaultGreetingList of the specified User

Wraps PUT /api/v2/users/{userId}/greetings/defaults  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GreetingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GreetingsApi apiInstance = new GreetingsApi();
String userId = "userId_example"; // String | User ID
DefaultGreetingList body = new DefaultGreetingList(); // DefaultGreetingList | The updated defaultGreetingList
try {
    DefaultGreetingList result = apiInstance.putUserGreetingsDefaults(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GreetingsApi#putUserGreetingsDefaults");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
| **body** | [**DefaultGreetingList**](DefaultGreetingList)| The updated defaultGreetingList | 
{: class="table-striped"}


### Return type

[**DefaultGreetingList**](DefaultGreetingList)


_com.mypurecloud.sdk.v2:platform-client-v2:222.1.0_
