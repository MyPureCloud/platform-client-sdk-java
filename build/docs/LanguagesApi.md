---
title: LanguagesApi
---
## LanguagesApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteLanguage**](LanguagesApi.html#deleteLanguage) | Delete Language (Deprecated) |
| [**deleteRoutingLanguage**](LanguagesApi.html#deleteRoutingLanguage) | Delete Language |
| [**getLanguage**](LanguagesApi.html#getLanguage) | Get language (Deprecated) |
| [**getLanguages**](LanguagesApi.html#getLanguages) | Get the list of supported languages. (Deprecated) |
| [**getLanguagesTranslations**](LanguagesApi.html#getLanguagesTranslations) | Get all available languages for translation |
| [**getLanguagesTranslationsBuiltin**](LanguagesApi.html#getLanguagesTranslationsBuiltin) | Get the builtin translation for a language |
| [**getLanguagesTranslationsOrganization**](LanguagesApi.html#getLanguagesTranslationsOrganization) | Get effective translation for an organization by language |
| [**getLanguagesTranslationsUser**](LanguagesApi.html#getLanguagesTranslationsUser) | Get effective language translation for a user |
| [**getRoutingLanguage**](LanguagesApi.html#getRoutingLanguage) | Get language |
| [**postLanguages**](LanguagesApi.html#postLanguages) | Create Language (Deprecated) |
{: class="table-striped"}

<a name="deleteLanguage"></a>

# **deleteLanguage**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> Void deleteLanguage(languageId)

Delete Language (Deprecated)

This endpoint is deprecated. It has been moved to /routing/languages/{languageId}

Wraps DELETE /api/v2/languages/{languageId}  

Requires ANY permissions: 

* routing:skill:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LanguagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LanguagesApi apiInstance = new LanguagesApi();
String languageId = "languageId_example"; // String | Language ID
try {
    apiInstance.deleteLanguage(languageId);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguagesApi#deleteLanguage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **languageId** | **String**| Language ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteRoutingLanguage"></a>

# **deleteRoutingLanguage**



> Void deleteRoutingLanguage(languageId)

Delete Language

Wraps DELETE /api/v2/routing/languages/{languageId}  

Requires ANY permissions: 

* routing:skill:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LanguagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LanguagesApi apiInstance = new LanguagesApi();
String languageId = "languageId_example"; // String | Language ID
try {
    apiInstance.deleteRoutingLanguage(languageId);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguagesApi#deleteRoutingLanguage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **languageId** | **String**| Language ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="getLanguage"></a>

# **getLanguage**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [Language](Language.html) getLanguage(languageId)

Get language (Deprecated)

This endpoint is deprecated. It has been moved to /routing/languages/{languageId}

Wraps GET /api/v2/languages/{languageId}  

Requires ANY permissions: 

* routing:skill:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LanguagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LanguagesApi apiInstance = new LanguagesApi();
String languageId = "languageId_example"; // String | Language ID
try {
    Language result = apiInstance.getLanguage(languageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguagesApi#getLanguage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **languageId** | **String**| Language ID | 
{: class="table-striped"}


### Return type

[**Language**](Language.html)

<a name="getLanguages"></a>

# **getLanguages**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [LanguageEntityListing](LanguageEntityListing.html) getLanguages(pageSize, pageNumber, sortOrder, name)

Get the list of supported languages. (Deprecated)

This endpoint is deprecated. It has been moved to /routing/languages

Wraps GET /api/v2/languages  

Requires ANY permissions: 

* routing:skill:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LanguagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LanguagesApi apiInstance = new LanguagesApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "ASC"; // String | Ascending or descending sort order
String name = "name_example"; // String | Name
try {
    LanguageEntityListing result = apiInstance.getLanguages(pageSize, pageNumber, sortOrder, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguagesApi#getLanguages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to ASC]<br />**Values**: ascending, descending 
| **name** | **String**| Name | [optional] 
{: class="table-striped"}


### Return type

[**LanguageEntityListing**](LanguageEntityListing.html)

<a name="getLanguagesTranslations"></a>

# **getLanguagesTranslations**



> [AvailableTranslations](AvailableTranslations.html) getLanguagesTranslations()

Get all available languages for translation

Wraps GET /api/v2/languages/translations  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LanguagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LanguagesApi apiInstance = new LanguagesApi();
try {
    AvailableTranslations result = apiInstance.getLanguagesTranslations();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguagesApi#getLanguagesTranslations");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**AvailableTranslations**](AvailableTranslations.html)

<a name="getLanguagesTranslationsBuiltin"></a>

# **getLanguagesTranslationsBuiltin**



> Map&lt;String, Object&gt; getLanguagesTranslationsBuiltin(language)

Get the builtin translation for a language

Wraps GET /api/v2/languages/translations/builtin  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LanguagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LanguagesApi apiInstance = new LanguagesApi();
String language = "language_example"; // String | The language of the builtin translation to retrieve
try {
    Map<String, Object> result = apiInstance.getLanguagesTranslationsBuiltin(language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguagesApi#getLanguagesTranslationsBuiltin");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **language** | **String**| The language of the builtin translation to retrieve | 
{: class="table-striped"}


### Return type

**Map&lt;String, Object&gt;**

<a name="getLanguagesTranslationsOrganization"></a>

# **getLanguagesTranslationsOrganization**



> Map&lt;String, Object&gt; getLanguagesTranslationsOrganization(language)

Get effective translation for an organization by language

Wraps GET /api/v2/languages/translations/organization  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LanguagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LanguagesApi apiInstance = new LanguagesApi();
String language = "language_example"; // String | The language of the translation to retrieve for the organization
try {
    Map<String, Object> result = apiInstance.getLanguagesTranslationsOrganization(language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguagesApi#getLanguagesTranslationsOrganization");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **language** | **String**| The language of the translation to retrieve for the organization | 
{: class="table-striped"}


### Return type

**Map&lt;String, Object&gt;**

<a name="getLanguagesTranslationsUser"></a>

# **getLanguagesTranslationsUser**



> Map&lt;String, Object&gt; getLanguagesTranslationsUser(userId)

Get effective language translation for a user

Wraps GET /api/v2/languages/translations/users/{userId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LanguagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LanguagesApi apiInstance = new LanguagesApi();
String userId = "userId_example"; // String | The user id
try {
    Map<String, Object> result = apiInstance.getLanguagesTranslationsUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguagesApi#getLanguagesTranslationsUser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| The user id | 
{: class="table-striped"}


### Return type

**Map&lt;String, Object&gt;**

<a name="getRoutingLanguage"></a>

# **getRoutingLanguage**



> [Language](Language.html) getRoutingLanguage(languageId)

Get language

Wraps GET /api/v2/routing/languages/{languageId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LanguagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LanguagesApi apiInstance = new LanguagesApi();
String languageId = "languageId_example"; // String | Language ID
try {
    Language result = apiInstance.getRoutingLanguage(languageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguagesApi#getRoutingLanguage");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **languageId** | **String**| Language ID | 
{: class="table-striped"}


### Return type

[**Language**](Language.html)

<a name="postLanguages"></a>

# **postLanguages**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [Language](Language.html) postLanguages(body)

Create Language (Deprecated)

This endpoint is deprecated. It has been moved to /routing/languages

Wraps POST /api/v2/languages  

Requires ANY permissions: 

* routing:skill:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LanguagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LanguagesApi apiInstance = new LanguagesApi();
Language body = new Language(); // Language | Language
try {
    Language result = apiInstance.postLanguages(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguagesApi#postLanguages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Language**](Language.html)| Language | 
{: class="table-striped"}


### Return type

[**Language**](Language.html)

