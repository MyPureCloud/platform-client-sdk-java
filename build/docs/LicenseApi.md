---
title: LicenseApi
---
## LicenseApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getLicenseDefinition**](LicenseApi.html#getLicenseDefinition) | Get PureCloud license definition. |
| [**getLicenseDefinitions**](LicenseApi.html#getLicenseDefinitions) | Get all PureCloud license definitions available for the organization. |
| [**getLicenseOrganization**](LicenseApi.html#getLicenseOrganization) | Get license assignments for the organization. |
| [**getLicenseToggle**](LicenseApi.html#getLicenseToggle) | Get PureCloud license feature toggle value. |
| [**getLicenseUser**](LicenseApi.html#getLicenseUser) | Get licenses for specified user. |
| [**postLicenseOrganization**](LicenseApi.html#postLicenseOrganization) | Update the organization&#39;s license assignments in a batch. |
| [**postLicenseToggle**](LicenseApi.html#postLicenseToggle) | Switch PureCloud license feature toggle value. |
| [**postLicenseUsers**](LicenseApi.html#postLicenseUsers) | Fetch user licenses in a batch. |
{: class="table table-striped"}

<a name="getLicenseDefinition"></a>

# **getLicenseDefinition**

> [LicenseDefinition](LicenseDefinition.html) getLicenseDefinition(licenseId)

Get PureCloud license definition.



Wraps GET /api/v2/license/definitions/{licenseId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.LicenseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

LicenseApi apiInstance = new LicenseApi();
String licenseId = "licenseId_example"; // String | ID
try {
    LicenseDefinition result = apiInstance.getLicenseDefinition(licenseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseApi#getLicenseDefinition");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **licenseId** | **String**| ID | |
{: class="table table-striped"}

### Return type

[**LicenseDefinition**](LicenseDefinition.html)

<a name="getLicenseDefinitions"></a>

# **getLicenseDefinitions**

> [List&lt;LicenseDefinition&gt;](LicenseDefinition.html) getLicenseDefinitions()

Get all PureCloud license definitions available for the organization.



Wraps GET /api/v2/license/definitions  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.LicenseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

LicenseApi apiInstance = new LicenseApi();
try {
    List<LicenseDefinition> result = apiInstance.getLicenseDefinitions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseApi#getLicenseDefinitions");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**List&lt;LicenseDefinition&gt;**](LicenseDefinition.html)

<a name="getLicenseOrganization"></a>

# **getLicenseOrganization**

> [LicenseOrganization](LicenseOrganization.html) getLicenseOrganization()

Get license assignments for the organization.



Wraps GET /api/v2/license/organization  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.LicenseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

LicenseApi apiInstance = new LicenseApi();
try {
    LicenseOrganization result = apiInstance.getLicenseOrganization();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseApi#getLicenseOrganization");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**LicenseOrganization**](LicenseOrganization.html)

<a name="getLicenseToggle"></a>

# **getLicenseToggle**

> [LicenseOrgToggle](LicenseOrgToggle.html) getLicenseToggle(featureName)

Get PureCloud license feature toggle value.



Wraps GET /api/v2/license/toggles/{featureName}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.LicenseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

LicenseApi apiInstance = new LicenseApi();
String featureName = "featureName_example"; // String | featureName
try {
    LicenseOrgToggle result = apiInstance.getLicenseToggle(featureName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseApi#getLicenseToggle");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **featureName** | **String**| featureName | |
{: class="table table-striped"}

### Return type

[**LicenseOrgToggle**](LicenseOrgToggle.html)

<a name="getLicenseUser"></a>

# **getLicenseUser**

> [LicenseUser](LicenseUser.html) getLicenseUser(userId)

Get licenses for specified user.



Wraps GET /api/v2/license/users/{userId}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.LicenseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

LicenseApi apiInstance = new LicenseApi();
String userId = "userId_example"; // String | ID
try {
    LicenseUser result = apiInstance.getLicenseUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseApi#getLicenseUser");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| ID | |
{: class="table table-striped"}

### Return type

[**LicenseUser**](LicenseUser.html)

<a name="postLicenseOrganization"></a>

# **postLicenseOrganization**

> [List&lt;LicenseUpdateStatus&gt;](LicenseUpdateStatus.html) postLicenseOrganization(body)

Update the organization&#39;s license assignments in a batch.



Wraps POST /api/v2/license/organization  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.LicenseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

LicenseApi apiInstance = new LicenseApi();
LicenseBatchAssignmentRequest body = new LicenseBatchAssignmentRequest(); // LicenseBatchAssignmentRequest | The license assignments to update.
try {
    List<LicenseUpdateStatus> result = apiInstance.postLicenseOrganization(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseApi#postLicenseOrganization");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**LicenseBatchAssignmentRequest**](LicenseBatchAssignmentRequest.html)| The license assignments to update. | [optional] |
{: class="table table-striped"}

### Return type

[**List&lt;LicenseUpdateStatus&gt;**](LicenseUpdateStatus.html)

<a name="postLicenseToggle"></a>

# **postLicenseToggle**

> [LicenseOrgToggle](LicenseOrgToggle.html) postLicenseToggle(featureName)

Switch PureCloud license feature toggle value.



Wraps POST /api/v2/license/toggles/{featureName}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.LicenseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

LicenseApi apiInstance = new LicenseApi();
String featureName = "featureName_example"; // String | featureName
try {
    LicenseOrgToggle result = apiInstance.postLicenseToggle(featureName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseApi#postLicenseToggle");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **featureName** | **String**| featureName | |
{: class="table table-striped"}

### Return type

[**LicenseOrgToggle**](LicenseOrgToggle.html)

<a name="postLicenseUsers"></a>

# **postLicenseUsers**

> [Map&lt;String, Object&gt;](Map.html) postLicenseUsers(body)

Fetch user licenses in a batch.



Wraps POST /api/v2/license/users  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.LicenseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

LicenseApi apiInstance = new LicenseApi();
List<String> body = Arrays.asList(new List<String>()); // List<String> | The user IDs to fetch.
try {
    Map<String, Object> result = apiInstance.postLicenseUsers(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseApi#postLicenseUsers");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **List&lt;String&gt;**| The user IDs to fetch. | [optional] |
{: class="table table-striped"}

### Return type

[**Map&lt;String, Object&gt;**](Map.html)

