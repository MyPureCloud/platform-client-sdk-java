---
title: LicenseApi
---
## LicenseApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getLicenseDefinition**](LicenseApi.html#getLicenseDefinition) | Get PureCloud license definition. |
| [**getLicenseDefinitions**](LicenseApi.html#getLicenseDefinitions) | Get all PureCloud license definitions available for the organization. |
| [**getLicenseToggle**](LicenseApi.html#getLicenseToggle) | Get PureCloud license feature toggle value. |
| [**getLicenseUser**](LicenseApi.html#getLicenseUser) | Get licenses for specified user. |
| [**getLicenseUsers**](LicenseApi.html#getLicenseUsers) | Get a page of users and their licenses |
| [**postLicenseInfer**](LicenseApi.html#postLicenseInfer) | Get a list of licenses inferred based on a list of roleIds |
| [**postLicenseOrganization**](LicenseApi.html#postLicenseOrganization) | Update the organization&#39;s license assignments in a batch. |
| [**postLicenseToggle**](LicenseApi.html#postLicenseToggle) | Switch PureCloud license feature toggle value. |
| [**postLicenseUsers**](LicenseApi.html#postLicenseUsers) | Fetch user licenses in a batch. |
{: class="table-striped"}

<a name="getLicenseDefinition"></a>

# **getLicenseDefinition**



> [LicenseDefinition](LicenseDefinition.html) getLicenseDefinition(licenseId)

Get PureCloud license definition.



Wraps GET /api/v2/license/definitions/{licenseId}  

Requires ANY permissions: 

* authorization:grant:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LicenseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LicenseApi apiInstance = new LicenseApi();
String licenseId = "licenseId_example"; // String | ID
try {
    LicenseDefinition result = apiInstance.getLicenseDefinition(licenseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseApi#getLicenseDefinition");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **licenseId** | **String**| ID | 
{: class="table-striped"}


### Return type

[**LicenseDefinition**](LicenseDefinition.html)

<a name="getLicenseDefinitions"></a>

# **getLicenseDefinitions**



> [List&lt;LicenseDefinition&gt;](LicenseDefinition.html) getLicenseDefinitions()

Get all PureCloud license definitions available for the organization.



Wraps GET /api/v2/license/definitions  

Requires ANY permissions: 

* authorization:grant:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LicenseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LicenseApi apiInstance = new LicenseApi();
try {
    List<LicenseDefinition> result = apiInstance.getLicenseDefinitions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseApi#getLicenseDefinitions");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**List&lt;LicenseDefinition&gt;**](LicenseDefinition.html)

<a name="getLicenseToggle"></a>

# **getLicenseToggle**



> [LicenseOrgToggle](LicenseOrgToggle.html) getLicenseToggle(featureName)

Get PureCloud license feature toggle value.



Wraps GET /api/v2/license/toggles/{featureName}  

Requires ANY permissions: 

* authorization:grant:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LicenseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LicenseApi apiInstance = new LicenseApi();
String featureName = "featureName_example"; // String | featureName
try {
    LicenseOrgToggle result = apiInstance.getLicenseToggle(featureName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseApi#getLicenseToggle");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **featureName** | **String**| featureName | 
{: class="table-striped"}


### Return type

[**LicenseOrgToggle**](LicenseOrgToggle.html)

<a name="getLicenseUser"></a>

# **getLicenseUser**



> [LicenseUser](LicenseUser.html) getLicenseUser(userId)

Get licenses for specified user.



Wraps GET /api/v2/license/users/{userId}  

Requires ANY permissions: 

* authorization:grant:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LicenseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LicenseApi apiInstance = new LicenseApi();
String userId = "userId_example"; // String | ID
try {
    LicenseUser result = apiInstance.getLicenseUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseApi#getLicenseUser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| ID | 
{: class="table-striped"}


### Return type

[**LicenseUser**](LicenseUser.html)

<a name="getLicenseUsers"></a>

# **getLicenseUsers**



> [UserLicensesEntityListing](UserLicensesEntityListing.html) getLicenseUsers(pageSize, pageNumber)

Get a page of users and their licenses

Retrieve a page of users in an organization along with the licenses they possess.

Wraps GET /api/v2/license/users  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LicenseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LicenseApi apiInstance = new LicenseApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    UserLicensesEntityListing result = apiInstance.getLicenseUsers(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseApi#getLicenseUsers");
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

[**UserLicensesEntityListing**](UserLicensesEntityListing.html)

<a name="postLicenseInfer"></a>

# **postLicenseInfer**



> List&lt;String&gt; postLicenseInfer(body)

Get a list of licenses inferred based on a list of roleIds



Wraps POST /api/v2/license/infer  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LicenseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LicenseApi apiInstance = new LicenseApi();
List<String> body = Arrays.asList(new List<String>()); // List<String> | The roleIds to use while inferring licenses
try {
    List<String> result = apiInstance.postLicenseInfer(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseApi#postLicenseInfer");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **List&lt;String&gt;**| The roleIds to use while inferring licenses | [optional] 
{: class="table-striped"}


### Return type

**List&lt;String&gt;**

<a name="postLicenseOrganization"></a>

# **postLicenseOrganization**



> [List&lt;LicenseUpdateStatus&gt;](LicenseUpdateStatus.html) postLicenseOrganization(body)

Update the organization&#39;s license assignments in a batch.



Wraps POST /api/v2/license/organization  

Requires ANY permissions: 

* authorization:grant:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LicenseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LicenseApi apiInstance = new LicenseApi();
LicenseBatchAssignmentRequest body = new LicenseBatchAssignmentRequest(); // LicenseBatchAssignmentRequest | The license assignments to update.
try {
    List<LicenseUpdateStatus> result = apiInstance.postLicenseOrganization(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseApi#postLicenseOrganization");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**LicenseBatchAssignmentRequest**](LicenseBatchAssignmentRequest.html)| The license assignments to update. | [optional] 
{: class="table-striped"}


### Return type

[**List&lt;LicenseUpdateStatus&gt;**](LicenseUpdateStatus.html)

<a name="postLicenseToggle"></a>

# **postLicenseToggle**



> [LicenseOrgToggle](LicenseOrgToggle.html) postLicenseToggle(featureName)

Switch PureCloud license feature toggle value.



Wraps POST /api/v2/license/toggles/{featureName}  

Requires ANY permissions: 

* authorization:grant:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LicenseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LicenseApi apiInstance = new LicenseApi();
String featureName = "featureName_example"; // String | featureName
try {
    LicenseOrgToggle result = apiInstance.postLicenseToggle(featureName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseApi#postLicenseToggle");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **featureName** | **String**| featureName | 
{: class="table-striped"}


### Return type

[**LicenseOrgToggle**](LicenseOrgToggle.html)

<a name="postLicenseUsers"></a>

# **postLicenseUsers**



> [Map&lt;String, Object&gt;](Map.html) postLicenseUsers(body)

Fetch user licenses in a batch.



Wraps POST /api/v2/license/users  

Requires ANY permissions: 

* authorization:grant:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LicenseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LicenseApi apiInstance = new LicenseApi();
List<String> body = Arrays.asList(new List<String>()); // List<String> | The user IDs to fetch.
try {
    Map<String, Object> result = apiInstance.postLicenseUsers(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseApi#postLicenseUsers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **List&lt;String&gt;**| The user IDs to fetch. | [optional] 
{: class="table-striped"}


### Return type

[**Map&lt;String, Object&gt;**](Map.html)

