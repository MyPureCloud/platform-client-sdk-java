# SocialMediaApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteSocialmediaTopic**](SocialMediaApi#deleteSocialmediaTopic) | Delete a social topic. |
| [**deleteSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId**](SocialMediaApi#deleteSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId) | Delete a Facebook data ingestion rule. |
| [**deleteSocialmediaTopicDataingestionrulesOpenOpenId**](SocialMediaApi#deleteSocialmediaTopicDataingestionrulesOpenOpenId) | Delete a open data ingestion rule. |
| [**deleteSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId**](SocialMediaApi#deleteSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId) | Delete a X (formally Twitter) data ingestion rule. |
| [**getSocialmediaTopic**](SocialMediaApi#getSocialmediaTopic) | Get a single social topic. |
| [**getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId**](SocialMediaApi#getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId) | Get a single Facebook data ingestion rule. |
| [**getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersion**](SocialMediaApi#getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersion) | Get a single Facebook data ingestion rule version. |
| [**getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersions**](SocialMediaApi#getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersions) | Get the Facebook data ingestion rule versions. |
| [**getSocialmediaTopicDataingestionrulesOpenOpenId**](SocialMediaApi#getSocialmediaTopicDataingestionrulesOpenOpenId) | Get a single open data ingestion rule. |
| [**getSocialmediaTopicDataingestionrulesOpenOpenIdVersion**](SocialMediaApi#getSocialmediaTopicDataingestionrulesOpenOpenIdVersion) | Get a single Open data ingestion rule version. |
| [**getSocialmediaTopicDataingestionrulesOpenOpenIdVersions**](SocialMediaApi#getSocialmediaTopicDataingestionrulesOpenOpenIdVersions) | Get the Open data ingestion rule versions. |
| [**getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId**](SocialMediaApi#getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId) | Get a single X (formally Twitter) data ingestion rule. |
| [**getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersion**](SocialMediaApi#getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersion) | Get a single X (formally Twitter) data ingestion rule version. |
| [**getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersions**](SocialMediaApi#getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersions) | Get the Open data ingestion rule versions. |
| [**getSocialmediaTopics**](SocialMediaApi#getSocialmediaTopics) | Retrieve all social topics. |
| [**patchSocialmediaTopic**](SocialMediaApi#patchSocialmediaTopic) | Update a social topic. |
| [**patchSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId**](SocialMediaApi#patchSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId) | Update the status of a Facebook data ingestion rule. |
| [**patchSocialmediaTopicDataingestionrulesOpenOpenId**](SocialMediaApi#patchSocialmediaTopicDataingestionrulesOpenOpenId) | Update the status of a open data ingestion rule. |
| [**patchSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId**](SocialMediaApi#patchSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId) | Update the status of a X (formally Twitter) data ingestion rule. |
| [**postSocialmediaTopicDataingestionrulesFacebook**](SocialMediaApi#postSocialmediaTopicDataingestionrulesFacebook) | Create an Facebook data ingestion rule. |
| [**postSocialmediaTopicDataingestionrulesOpen**](SocialMediaApi#postSocialmediaTopicDataingestionrulesOpen) | Create an open data ingestion rule. |
| [**postSocialmediaTopicDataingestionrulesTwitter**](SocialMediaApi#postSocialmediaTopicDataingestionrulesTwitter) | Create an twitter data ingestion rule. |
| [**postSocialmediaTopics**](SocialMediaApi#postSocialmediaTopics) | Create a social topic. |
| [**putSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId**](SocialMediaApi#putSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId) | Update the Facebook data ingestion rule. |
| [**putSocialmediaTopicDataingestionrulesOpenOpenId**](SocialMediaApi#putSocialmediaTopicDataingestionrulesOpenOpenId) | Update the open data ingestion rule. |
| [**putSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId**](SocialMediaApi#putSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId) | Update the X (formally Twitter) data ingestion rule. |
{: class="table-striped"}


# **deleteSocialmediaTopic**


> Void deleteSocialmediaTopic(topicId, hardDelete)

Delete a social topic.

deleteSocialmediaTopic is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps DELETE /api/v2/socialmedia/topics/{topicId}  

Requires ANY permissions: 

* socialmedia:topic:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SocialMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SocialMediaApi apiInstance = new SocialMediaApi();
String topicId = "topicId_example"; // String | topicId
Boolean hardDelete = true; // Boolean | Determines whether a Social topic should be soft-deleted or hard-deleted (permanently removed). Set to false (soft-delete) by default.
try {
    apiInstance.deleteSocialmediaTopic(topicId, hardDelete);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialMediaApi#deleteSocialmediaTopic");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topicId** | **String**| topicId | 
| **hardDelete** | **Boolean**| Determines whether a Social topic should be soft-deleted or hard-deleted (permanently removed). Set to false (soft-delete) by default. | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId**


> Void deleteSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId(topicId, facebookIngestionRuleId, hardDelete)

Delete a Facebook data ingestion rule.

deleteSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps DELETE /api/v2/socialmedia/topics/{topicId}/dataingestionrules/facebook/{facebookIngestionRuleId}  

Requires ANY permissions: 

* socialmedia:facebookDataIngestionRule:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SocialMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SocialMediaApi apiInstance = new SocialMediaApi();
String topicId = "topicId_example"; // String | topicId
String facebookIngestionRuleId = "facebookIngestionRuleId_example"; // String | facebookIngestionRuleId
Boolean hardDelete = false; // Boolean | Determines whether a Facebook data ingestion rule should be soft-deleted (have it's state set to deleted) or hard-deleted (permanently removed). Set to false (soft-delete) by default.
try {
    apiInstance.deleteSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId(topicId, facebookIngestionRuleId, hardDelete);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialMediaApi#deleteSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topicId** | **String**| topicId | 
| **facebookIngestionRuleId** | **String**| facebookIngestionRuleId | 
| **hardDelete** | **Boolean**| Determines whether a Facebook data ingestion rule should be soft-deleted (have it&#39;s state set to deleted) or hard-deleted (permanently removed). Set to false (soft-delete) by default. | [optional] [default to false] 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteSocialmediaTopicDataingestionrulesOpenOpenId**


> Void deleteSocialmediaTopicDataingestionrulesOpenOpenId(topicId, openId, hardDelete)

Delete a open data ingestion rule.

deleteSocialmediaTopicDataingestionrulesOpenOpenId is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps DELETE /api/v2/socialmedia/topics/{topicId}/dataingestionrules/open/{openId}  

Requires ANY permissions: 

* socialmedia:openDataIngestionRule:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SocialMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SocialMediaApi apiInstance = new SocialMediaApi();
String topicId = "topicId_example"; // String | topicId
String openId = "openId_example"; // String | openId
Boolean hardDelete = false; // Boolean | Determines whether a open data ingestion rule should be soft-deleted (have it's state set to deleted) or hard-deleted (permanently removed). Set to false (soft-delete) by default.
try {
    apiInstance.deleteSocialmediaTopicDataingestionrulesOpenOpenId(topicId, openId, hardDelete);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialMediaApi#deleteSocialmediaTopicDataingestionrulesOpenOpenId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topicId** | **String**| topicId | 
| **openId** | **String**| openId | 
| **hardDelete** | **Boolean**| Determines whether a open data ingestion rule should be soft-deleted (have it&#39;s state set to deleted) or hard-deleted (permanently removed). Set to false (soft-delete) by default. | [optional] [default to false] 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId**


> Void deleteSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId(topicId, twitterIngestionRuleId, hardDelete)

Delete a X (formally Twitter) data ingestion rule.

deleteSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps DELETE /api/v2/socialmedia/topics/{topicId}/dataingestionrules/twitter/{twitterIngestionRuleId}  

Requires ANY permissions: 

* socialmedia:twitterDataIngestionRule:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SocialMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SocialMediaApi apiInstance = new SocialMediaApi();
String topicId = "topicId_example"; // String | topicId
String twitterIngestionRuleId = "twitterIngestionRuleId_example"; // String | twitterIngestionRuleId
Boolean hardDelete = false; // Boolean | Determines whether a X (formally Twitter) data ingestion rule should be soft-deleted (have it's state set to deleted) or hard-deleted (permanently removed). Set to false (soft-delete) by default.
try {
    apiInstance.deleteSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId(topicId, twitterIngestionRuleId, hardDelete);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialMediaApi#deleteSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topicId** | **String**| topicId | 
| **twitterIngestionRuleId** | **String**| twitterIngestionRuleId | 
| **hardDelete** | **Boolean**| Determines whether a X (formally Twitter) data ingestion rule should be soft-deleted (have it&#39;s state set to deleted) or hard-deleted (permanently removed). Set to false (soft-delete) by default. | [optional] [default to false] 
{: class="table-striped"}


### Return type

null (empty response body)


# **getSocialmediaTopic**


> [SocialTopicResponse](SocialTopicResponse) getSocialmediaTopic(topicId, includeDeleted)

Get a single social topic.

getSocialmediaTopic is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/socialmedia/topics/{topicId}  

Requires ANY permissions: 

* socialmedia:topic:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SocialMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SocialMediaApi apiInstance = new SocialMediaApi();
String topicId = "topicId_example"; // String | topicId
Boolean includeDeleted = true; // Boolean | Determines whether to include soft-deleted items in the result.
try {
    SocialTopicResponse result = apiInstance.getSocialmediaTopic(topicId, includeDeleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialMediaApi#getSocialmediaTopic");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topicId** | **String**| topicId | 
| **includeDeleted** | **Boolean**| Determines whether to include soft-deleted items in the result. | [optional] 
{: class="table-striped"}


### Return type

[**SocialTopicResponse**](SocialTopicResponse)


# **getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId**


> [FacebookDataIngestionRuleResponse](FacebookDataIngestionRuleResponse) getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId(topicId, facebookIngestionRuleId, includeDeleted)

Get a single Facebook data ingestion rule.

getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/socialmedia/topics/{topicId}/dataingestionrules/facebook/{facebookIngestionRuleId}  

Requires ALL permissions: 

* socialmedia:facebookDataIngestionRule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SocialMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SocialMediaApi apiInstance = new SocialMediaApi();
String topicId = "topicId_example"; // String | topicId
String facebookIngestionRuleId = "facebookIngestionRuleId_example"; // String | facebookIngestionRuleId
Boolean includeDeleted = true; // Boolean | Determines whether to include soft-deleted items in the result.
try {
    FacebookDataIngestionRuleResponse result = apiInstance.getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId(topicId, facebookIngestionRuleId, includeDeleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialMediaApi#getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topicId** | **String**| topicId | 
| **facebookIngestionRuleId** | **String**| facebookIngestionRuleId | 
| **includeDeleted** | **Boolean**| Determines whether to include soft-deleted items in the result. | [optional] 
{: class="table-striped"}


### Return type

[**FacebookDataIngestionRuleResponse**](FacebookDataIngestionRuleResponse)


# **getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersion**


> [FacebookDataIngestionRuleVersionResponse](FacebookDataIngestionRuleVersionResponse) getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersion(topicId, facebookIngestionRuleId, dataIngestionRuleVersion, includeDeleted)

Get a single Facebook data ingestion rule version.

getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/socialmedia/topics/{topicId}/dataingestionrules/facebook/{facebookIngestionRuleId}/versions/{dataIngestionRuleVersion}  

Requires ALL permissions: 

* socialmedia:facebookDataIngestionRule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SocialMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SocialMediaApi apiInstance = new SocialMediaApi();
String topicId = "topicId_example"; // String | topicId
String facebookIngestionRuleId = "facebookIngestionRuleId_example"; // String | facebookIngestionRuleId
String dataIngestionRuleVersion = "dataIngestionRuleVersion_example"; // String | version
Boolean includeDeleted = true; // Boolean | Determines whether to include soft-deleted item in the result.
try {
    FacebookDataIngestionRuleVersionResponse result = apiInstance.getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersion(topicId, facebookIngestionRuleId, dataIngestionRuleVersion, includeDeleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialMediaApi#getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersion");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topicId** | **String**| topicId | 
| **facebookIngestionRuleId** | **String**| facebookIngestionRuleId | 
| **dataIngestionRuleVersion** | **String**| version | 
| **includeDeleted** | **Boolean**| Determines whether to include soft-deleted item in the result. | [optional] 
{: class="table-striped"}


### Return type

[**FacebookDataIngestionRuleVersionResponse**](FacebookDataIngestionRuleVersionResponse)


# **getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersions**


> [FacebookDataIngestionRuleVersionResponseEntityListing](FacebookDataIngestionRuleVersionResponseEntityListing) getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersions(topicId, facebookIngestionRuleId, pageNumber, pageSize, includeDeleted)

Get the Facebook data ingestion rule versions.

getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/socialmedia/topics/{topicId}/dataingestionrules/facebook/{facebookIngestionRuleId}/versions  

Requires ALL permissions: 

* socialmedia:facebookDataIngestionRule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SocialMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SocialMediaApi apiInstance = new SocialMediaApi();
String topicId = "topicId_example"; // String | topicId
String facebookIngestionRuleId = "facebookIngestionRuleId_example"; // String | facebookIngestionRuleId
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
Boolean includeDeleted = true; // Boolean | Determines whether to include soft-deleted items in the result.
try {
    FacebookDataIngestionRuleVersionResponseEntityListing result = apiInstance.getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersions(topicId, facebookIngestionRuleId, pageNumber, pageSize, includeDeleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialMediaApi#getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topicId** | **String**| topicId | 
| **facebookIngestionRuleId** | **String**| facebookIngestionRuleId | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **includeDeleted** | **Boolean**| Determines whether to include soft-deleted items in the result. | [optional] 
{: class="table-striped"}


### Return type

[**FacebookDataIngestionRuleVersionResponseEntityListing**](FacebookDataIngestionRuleVersionResponseEntityListing)


# **getSocialmediaTopicDataingestionrulesOpenOpenId**


> [OpenDataIngestionRuleResponse](OpenDataIngestionRuleResponse) getSocialmediaTopicDataingestionrulesOpenOpenId(topicId, openId, includeDeleted)

Get a single open data ingestion rule.

getSocialmediaTopicDataingestionrulesOpenOpenId is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/socialmedia/topics/{topicId}/dataingestionrules/open/{openId}  

Requires ALL permissions: 

* socialmedia:openDataIngestionRule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SocialMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SocialMediaApi apiInstance = new SocialMediaApi();
String topicId = "topicId_example"; // String | topicId
String openId = "openId_example"; // String | openId
Boolean includeDeleted = true; // Boolean | Determines whether to include soft-deleted items in the result.
try {
    OpenDataIngestionRuleResponse result = apiInstance.getSocialmediaTopicDataingestionrulesOpenOpenId(topicId, openId, includeDeleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialMediaApi#getSocialmediaTopicDataingestionrulesOpenOpenId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topicId** | **String**| topicId | 
| **openId** | **String**| openId | 
| **includeDeleted** | **Boolean**| Determines whether to include soft-deleted items in the result. | [optional] 
{: class="table-striped"}


### Return type

[**OpenDataIngestionRuleResponse**](OpenDataIngestionRuleResponse)


# **getSocialmediaTopicDataingestionrulesOpenOpenIdVersion**


> [OpenDataIngestionRuleVersionResponse](OpenDataIngestionRuleVersionResponse) getSocialmediaTopicDataingestionrulesOpenOpenIdVersion(topicId, openId, dataIngestionRuleVersion, includeDeleted)

Get a single Open data ingestion rule version.

getSocialmediaTopicDataingestionrulesOpenOpenIdVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/socialmedia/topics/{topicId}/dataingestionrules/open/{openId}/versions/{dataIngestionRuleVersion}  

Requires ALL permissions: 

* socialmedia:openDataIngestionRule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SocialMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SocialMediaApi apiInstance = new SocialMediaApi();
String topicId = "topicId_example"; // String | topicId
String openId = "openId_example"; // String | openId
String dataIngestionRuleVersion = "dataIngestionRuleVersion_example"; // String | version
Boolean includeDeleted = true; // Boolean | Determines whether to include soft-deleted item in the result.
try {
    OpenDataIngestionRuleVersionResponse result = apiInstance.getSocialmediaTopicDataingestionrulesOpenOpenIdVersion(topicId, openId, dataIngestionRuleVersion, includeDeleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialMediaApi#getSocialmediaTopicDataingestionrulesOpenOpenIdVersion");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topicId** | **String**| topicId | 
| **openId** | **String**| openId | 
| **dataIngestionRuleVersion** | **String**| version | 
| **includeDeleted** | **Boolean**| Determines whether to include soft-deleted item in the result. | [optional] 
{: class="table-striped"}


### Return type

[**OpenDataIngestionRuleVersionResponse**](OpenDataIngestionRuleVersionResponse)


# **getSocialmediaTopicDataingestionrulesOpenOpenIdVersions**


> [OpenDataIngestionRuleVersionResponseEntityListing](OpenDataIngestionRuleVersionResponseEntityListing) getSocialmediaTopicDataingestionrulesOpenOpenIdVersions(topicId, openId, pageNumber, pageSize, includeDeleted)

Get the Open data ingestion rule versions.

getSocialmediaTopicDataingestionrulesOpenOpenIdVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/socialmedia/topics/{topicId}/dataingestionrules/open/{openId}/versions  

Requires ALL permissions: 

* socialmedia:openDataIngestionRule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SocialMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SocialMediaApi apiInstance = new SocialMediaApi();
String topicId = "topicId_example"; // String | topicId
String openId = "openId_example"; // String | openId
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
Boolean includeDeleted = true; // Boolean | Determines whether to include soft-deleted items in the result.
try {
    OpenDataIngestionRuleVersionResponseEntityListing result = apiInstance.getSocialmediaTopicDataingestionrulesOpenOpenIdVersions(topicId, openId, pageNumber, pageSize, includeDeleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialMediaApi#getSocialmediaTopicDataingestionrulesOpenOpenIdVersions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topicId** | **String**| topicId | 
| **openId** | **String**| openId | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **includeDeleted** | **Boolean**| Determines whether to include soft-deleted items in the result. | [optional] 
{: class="table-striped"}


### Return type

[**OpenDataIngestionRuleVersionResponseEntityListing**](OpenDataIngestionRuleVersionResponseEntityListing)


# **getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId**


> [TwitterDataIngestionRuleResponse](TwitterDataIngestionRuleResponse) getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId(topicId, twitterIngestionRuleId, includeDeleted)

Get a single X (formally Twitter) data ingestion rule.

getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/socialmedia/topics/{topicId}/dataingestionrules/twitter/{twitterIngestionRuleId}  

Requires ALL permissions: 

* socialmedia:twitterDataIngestionRule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SocialMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SocialMediaApi apiInstance = new SocialMediaApi();
String topicId = "topicId_example"; // String | topicId
String twitterIngestionRuleId = "twitterIngestionRuleId_example"; // String | twitterIngestionRuleId
Boolean includeDeleted = true; // Boolean | Determines whether to include soft-deleted items in the result.
try {
    TwitterDataIngestionRuleResponse result = apiInstance.getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId(topicId, twitterIngestionRuleId, includeDeleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialMediaApi#getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topicId** | **String**| topicId | 
| **twitterIngestionRuleId** | **String**| twitterIngestionRuleId | 
| **includeDeleted** | **Boolean**| Determines whether to include soft-deleted items in the result. | [optional] 
{: class="table-striped"}


### Return type

[**TwitterDataIngestionRuleResponse**](TwitterDataIngestionRuleResponse)


# **getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersion**


> [TwitterDataIngestionRuleVersionResponse](TwitterDataIngestionRuleVersionResponse) getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersion(topicId, twitterIngestionRuleId, dataIngestionRuleVersion, includeDeleted)

Get a single X (formally Twitter) data ingestion rule version.

getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/socialmedia/topics/{topicId}/dataingestionrules/twitter/{twitterIngestionRuleId}/versions/{dataIngestionRuleVersion}  

Requires ALL permissions: 

* socialmedia:twitterDataIngestionRule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SocialMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SocialMediaApi apiInstance = new SocialMediaApi();
String topicId = "topicId_example"; // String | topicId
String twitterIngestionRuleId = "twitterIngestionRuleId_example"; // String | twitterIngestionRuleId
String dataIngestionRuleVersion = "dataIngestionRuleVersion_example"; // String | version
Boolean includeDeleted = true; // Boolean | Determines whether to include soft-deleted item in the result.
try {
    TwitterDataIngestionRuleVersionResponse result = apiInstance.getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersion(topicId, twitterIngestionRuleId, dataIngestionRuleVersion, includeDeleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialMediaApi#getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersion");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topicId** | **String**| topicId | 
| **twitterIngestionRuleId** | **String**| twitterIngestionRuleId | 
| **dataIngestionRuleVersion** | **String**| version | 
| **includeDeleted** | **Boolean**| Determines whether to include soft-deleted item in the result. | [optional] 
{: class="table-striped"}


### Return type

[**TwitterDataIngestionRuleVersionResponse**](TwitterDataIngestionRuleVersionResponse)


# **getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersions**


> [TwitterDataIngestionRuleVersionResponseEntityListing](TwitterDataIngestionRuleVersionResponseEntityListing) getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersions(topicId, twitterIngestionRuleId, pageNumber, pageSize, includeDeleted)

Get the Open data ingestion rule versions.

getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/socialmedia/topics/{topicId}/dataingestionrules/twitter/{twitterIngestionRuleId}/versions  

Requires ALL permissions: 

* socialmedia:twitterDataIngestionRule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SocialMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SocialMediaApi apiInstance = new SocialMediaApi();
String topicId = "topicId_example"; // String | topicId
String twitterIngestionRuleId = "twitterIngestionRuleId_example"; // String | twitterIngestionRuleId
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
Boolean includeDeleted = true; // Boolean | Determines whether to include soft-deleted items in the result.
try {
    TwitterDataIngestionRuleVersionResponseEntityListing result = apiInstance.getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersions(topicId, twitterIngestionRuleId, pageNumber, pageSize, includeDeleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialMediaApi#getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topicId** | **String**| topicId | 
| **twitterIngestionRuleId** | **String**| twitterIngestionRuleId | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **includeDeleted** | **Boolean**| Determines whether to include soft-deleted items in the result. | [optional] 
{: class="table-striped"}


### Return type

[**TwitterDataIngestionRuleVersionResponseEntityListing**](TwitterDataIngestionRuleVersionResponseEntityListing)


# **getSocialmediaTopics**


> [SocialTopicResponseEntityListing](SocialTopicResponseEntityListing) getSocialmediaTopics(pageNumber, pageSize, divisionIds, includeDeleted)

Retrieve all social topics.

getSocialmediaTopics is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/socialmedia/topics  

Requires ANY permissions: 

* socialmedia:topic:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SocialMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SocialMediaApi apiInstance = new SocialMediaApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
List<String> divisionIds = Arrays.asList(null); // List<String> | One or more division IDs. If nothing is provided, the social topics associated withthe list of divisions that the user has access to will be returned.
Boolean includeDeleted = true; // Boolean | Determines whether to include soft-deleted items in the result.
try {
    SocialTopicResponseEntityListing result = apiInstance.getSocialmediaTopics(pageNumber, pageSize, divisionIds, includeDeleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialMediaApi#getSocialmediaTopics");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **divisionIds** | [**List&lt;String&gt;**](String)| One or more division IDs. If nothing is provided, the social topics associated withthe list of divisions that the user has access to will be returned. | [optional] 
| **includeDeleted** | **Boolean**| Determines whether to include soft-deleted items in the result. | [optional] 
{: class="table-striped"}


### Return type

[**SocialTopicResponseEntityListing**](SocialTopicResponseEntityListing)


# **patchSocialmediaTopic**


> [SocialTopicResponse](SocialTopicResponse) patchSocialmediaTopic(topicId, body)

Update a social topic.

patchSocialmediaTopic is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PATCH /api/v2/socialmedia/topics/{topicId}  

Requires ALL permissions: 

* socialmedia:topic:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SocialMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SocialMediaApi apiInstance = new SocialMediaApi();
String topicId = "topicId_example"; // String | topicId
SocialTopicPatchRequest body = new SocialTopicPatchRequest(); // SocialTopicPatchRequest | 
try {
    SocialTopicResponse result = apiInstance.patchSocialmediaTopic(topicId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialMediaApi#patchSocialmediaTopic");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topicId** | **String**| topicId | 
| **body** | [**SocialTopicPatchRequest**](SocialTopicPatchRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**SocialTopicResponse**](SocialTopicResponse)


# **patchSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId**


> [FacebookDataIngestionRuleResponse](FacebookDataIngestionRuleResponse) patchSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId(topicId, facebookIngestionRuleId, body)

Update the status of a Facebook data ingestion rule.

patchSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PATCH /api/v2/socialmedia/topics/{topicId}/dataingestionrules/facebook/{facebookIngestionRuleId}  

Requires ALL permissions: 

* socialmedia:facebookDataIngestionRule:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SocialMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SocialMediaApi apiInstance = new SocialMediaApi();
String topicId = "topicId_example"; // String | topicId
String facebookIngestionRuleId = "facebookIngestionRuleId_example"; // String | facebookIngestionRuleId
DataIngestionRuleStatusPatchRequest body = new DataIngestionRuleStatusPatchRequest(); // DataIngestionRuleStatusPatchRequest | 
try {
    FacebookDataIngestionRuleResponse result = apiInstance.patchSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId(topicId, facebookIngestionRuleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialMediaApi#patchSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topicId** | **String**| topicId | 
| **facebookIngestionRuleId** | **String**| facebookIngestionRuleId | 
| **body** | [**DataIngestionRuleStatusPatchRequest**](DataIngestionRuleStatusPatchRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**FacebookDataIngestionRuleResponse**](FacebookDataIngestionRuleResponse)


# **patchSocialmediaTopicDataingestionrulesOpenOpenId**


> [OpenDataIngestionRuleResponse](OpenDataIngestionRuleResponse) patchSocialmediaTopicDataingestionrulesOpenOpenId(topicId, openId, body)

Update the status of a open data ingestion rule.

patchSocialmediaTopicDataingestionrulesOpenOpenId is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PATCH /api/v2/socialmedia/topics/{topicId}/dataingestionrules/open/{openId}  

Requires ALL permissions: 

* socialmedia:openDataIngestionRule:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SocialMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SocialMediaApi apiInstance = new SocialMediaApi();
String topicId = "topicId_example"; // String | topicId
String openId = "openId_example"; // String | openId
DataIngestionRuleStatusPatchRequest body = new DataIngestionRuleStatusPatchRequest(); // DataIngestionRuleStatusPatchRequest | 
try {
    OpenDataIngestionRuleResponse result = apiInstance.patchSocialmediaTopicDataingestionrulesOpenOpenId(topicId, openId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialMediaApi#patchSocialmediaTopicDataingestionrulesOpenOpenId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topicId** | **String**| topicId | 
| **openId** | **String**| openId | 
| **body** | [**DataIngestionRuleStatusPatchRequest**](DataIngestionRuleStatusPatchRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**OpenDataIngestionRuleResponse**](OpenDataIngestionRuleResponse)


# **patchSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId**


> [TwitterDataIngestionRuleResponse](TwitterDataIngestionRuleResponse) patchSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId(topicId, twitterIngestionRuleId, body)

Update the status of a X (formally Twitter) data ingestion rule.

patchSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PATCH /api/v2/socialmedia/topics/{topicId}/dataingestionrules/twitter/{twitterIngestionRuleId}  

Requires ALL permissions: 

* socialmedia:twitterDataIngestionRule:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SocialMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SocialMediaApi apiInstance = new SocialMediaApi();
String topicId = "topicId_example"; // String | topicId
String twitterIngestionRuleId = "twitterIngestionRuleId_example"; // String | twitterIngestionRuleId
DataIngestionRuleStatusPatchRequest body = new DataIngestionRuleStatusPatchRequest(); // DataIngestionRuleStatusPatchRequest | 
try {
    TwitterDataIngestionRuleResponse result = apiInstance.patchSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId(topicId, twitterIngestionRuleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialMediaApi#patchSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topicId** | **String**| topicId | 
| **twitterIngestionRuleId** | **String**| twitterIngestionRuleId | 
| **body** | [**DataIngestionRuleStatusPatchRequest**](DataIngestionRuleStatusPatchRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**TwitterDataIngestionRuleResponse**](TwitterDataIngestionRuleResponse)


# **postSocialmediaTopicDataingestionrulesFacebook**


> [FacebookDataIngestionRuleResponse](FacebookDataIngestionRuleResponse) postSocialmediaTopicDataingestionrulesFacebook(topicId, body)

Create an Facebook data ingestion rule.

postSocialmediaTopicDataingestionrulesFacebook is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/socialmedia/topics/{topicId}/dataingestionrules/facebook  

Requires ANY permissions: 

* socialmedia:facebookDataIngestionRule:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SocialMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SocialMediaApi apiInstance = new SocialMediaApi();
String topicId = "topicId_example"; // String | topicId
FacebookDataIngestionRuleRequest body = new FacebookDataIngestionRuleRequest(); // FacebookDataIngestionRuleRequest | 
try {
    FacebookDataIngestionRuleResponse result = apiInstance.postSocialmediaTopicDataingestionrulesFacebook(topicId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialMediaApi#postSocialmediaTopicDataingestionrulesFacebook");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topicId** | **String**| topicId | 
| **body** | [**FacebookDataIngestionRuleRequest**](FacebookDataIngestionRuleRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**FacebookDataIngestionRuleResponse**](FacebookDataIngestionRuleResponse)


# **postSocialmediaTopicDataingestionrulesOpen**


> [OpenDataIngestionRuleResponse](OpenDataIngestionRuleResponse) postSocialmediaTopicDataingestionrulesOpen(topicId, body)

Create an open data ingestion rule.

postSocialmediaTopicDataingestionrulesOpen is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/socialmedia/topics/{topicId}/dataingestionrules/open  

Requires ANY permissions: 

* socialmedia:openDataIngestionRule:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SocialMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SocialMediaApi apiInstance = new SocialMediaApi();
String topicId = "topicId_example"; // String | topicId
OpenDataIngestionRuleRequest body = new OpenDataIngestionRuleRequest(); // OpenDataIngestionRuleRequest | 
try {
    OpenDataIngestionRuleResponse result = apiInstance.postSocialmediaTopicDataingestionrulesOpen(topicId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialMediaApi#postSocialmediaTopicDataingestionrulesOpen");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topicId** | **String**| topicId | 
| **body** | [**OpenDataIngestionRuleRequest**](OpenDataIngestionRuleRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**OpenDataIngestionRuleResponse**](OpenDataIngestionRuleResponse)


# **postSocialmediaTopicDataingestionrulesTwitter**


> [TwitterDataIngestionRuleResponse](TwitterDataIngestionRuleResponse) postSocialmediaTopicDataingestionrulesTwitter(topicId, body)

Create an twitter data ingestion rule.

postSocialmediaTopicDataingestionrulesTwitter is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/socialmedia/topics/{topicId}/dataingestionrules/twitter  

Requires ANY permissions: 

* socialmedia:twitterDataIngestionRule:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SocialMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SocialMediaApi apiInstance = new SocialMediaApi();
String topicId = "topicId_example"; // String | topicId
TwitterDataIngestionRuleRequest body = new TwitterDataIngestionRuleRequest(); // TwitterDataIngestionRuleRequest | 
try {
    TwitterDataIngestionRuleResponse result = apiInstance.postSocialmediaTopicDataingestionrulesTwitter(topicId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialMediaApi#postSocialmediaTopicDataingestionrulesTwitter");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topicId** | **String**| topicId | 
| **body** | [**TwitterDataIngestionRuleRequest**](TwitterDataIngestionRuleRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**TwitterDataIngestionRuleResponse**](TwitterDataIngestionRuleResponse)


# **postSocialmediaTopics**


> [SocialTopicResponse](SocialTopicResponse) postSocialmediaTopics(body)

Create a social topic.

postSocialmediaTopics is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/socialmedia/topics  

Requires ANY permissions: 

* socialmedia:topic:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SocialMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SocialMediaApi apiInstance = new SocialMediaApi();
SocialTopicRequest body = new SocialTopicRequest(); // SocialTopicRequest | 
try {
    SocialTopicResponse result = apiInstance.postSocialmediaTopics(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialMediaApi#postSocialmediaTopics");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SocialTopicRequest**](SocialTopicRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**SocialTopicResponse**](SocialTopicResponse)


# **putSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId**


> [FacebookDataIngestionRuleResponse](FacebookDataIngestionRuleResponse) putSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId(topicId, facebookIngestionRuleId, body)

Update the Facebook data ingestion rule.

putSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PUT /api/v2/socialmedia/topics/{topicId}/dataingestionrules/facebook/{facebookIngestionRuleId}  

Requires ALL permissions: 

* socialmedia:facebookDataIngestionRule:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SocialMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SocialMediaApi apiInstance = new SocialMediaApi();
String topicId = "topicId_example"; // String | topicId
String facebookIngestionRuleId = "facebookIngestionRuleId_example"; // String | facebookIngestionRuleId
FacebookDataIngestionRuleRequest body = new FacebookDataIngestionRuleRequest(); // FacebookDataIngestionRuleRequest | 
try {
    FacebookDataIngestionRuleResponse result = apiInstance.putSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId(topicId, facebookIngestionRuleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialMediaApi#putSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topicId** | **String**| topicId | 
| **facebookIngestionRuleId** | **String**| facebookIngestionRuleId | 
| **body** | [**FacebookDataIngestionRuleRequest**](FacebookDataIngestionRuleRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**FacebookDataIngestionRuleResponse**](FacebookDataIngestionRuleResponse)


# **putSocialmediaTopicDataingestionrulesOpenOpenId**


> [OpenDataIngestionRuleResponse](OpenDataIngestionRuleResponse) putSocialmediaTopicDataingestionrulesOpenOpenId(topicId, openId, body)

Update the open data ingestion rule.

putSocialmediaTopicDataingestionrulesOpenOpenId is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PUT /api/v2/socialmedia/topics/{topicId}/dataingestionrules/open/{openId}  

Requires ALL permissions: 

* socialmedia:openDataIngestionRule:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SocialMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SocialMediaApi apiInstance = new SocialMediaApi();
String topicId = "topicId_example"; // String | topicId
String openId = "openId_example"; // String | openId
OpenDataIngestionRuleRequest body = new OpenDataIngestionRuleRequest(); // OpenDataIngestionRuleRequest | 
try {
    OpenDataIngestionRuleResponse result = apiInstance.putSocialmediaTopicDataingestionrulesOpenOpenId(topicId, openId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialMediaApi#putSocialmediaTopicDataingestionrulesOpenOpenId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topicId** | **String**| topicId | 
| **openId** | **String**| openId | 
| **body** | [**OpenDataIngestionRuleRequest**](OpenDataIngestionRuleRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**OpenDataIngestionRuleResponse**](OpenDataIngestionRuleResponse)


# **putSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId**


> [TwitterDataIngestionRuleResponse](TwitterDataIngestionRuleResponse) putSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId(topicId, twitterIngestionRuleId, body)

Update the X (formally Twitter) data ingestion rule.

putSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PUT /api/v2/socialmedia/topics/{topicId}/dataingestionrules/twitter/{twitterIngestionRuleId}  

Requires ALL permissions: 

* socialmedia:twitterDataIngestionRule:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SocialMediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SocialMediaApi apiInstance = new SocialMediaApi();
String topicId = "topicId_example"; // String | topicId
String twitterIngestionRuleId = "twitterIngestionRuleId_example"; // String | twitterIngestionRuleId
TwitterDataIngestionRuleRequest body = new TwitterDataIngestionRuleRequest(); // TwitterDataIngestionRuleRequest | 
try {
    TwitterDataIngestionRuleResponse result = apiInstance.putSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId(topicId, twitterIngestionRuleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialMediaApi#putSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topicId** | **String**| topicId | 
| **twitterIngestionRuleId** | **String**| twitterIngestionRuleId | 
| **body** | [**TwitterDataIngestionRuleRequest**](TwitterDataIngestionRuleRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**TwitterDataIngestionRuleResponse**](TwitterDataIngestionRuleResponse)


_com.mypurecloud.sdk.v2:platform-client-v2:216.0.0_
