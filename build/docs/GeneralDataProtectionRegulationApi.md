# GeneralDataProtectionRegulationApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getGdprRequest**](GeneralDataProtectionRegulationApi#getGdprRequest) | Get an existing GDPR request |
| [**getGdprRequests**](GeneralDataProtectionRegulationApi#getGdprRequests) | Get all GDPR requests |
| [**getGdprSubjects**](GeneralDataProtectionRegulationApi#getGdprSubjects) | Get GDPR subjects |
| [**postGdprRequests**](GeneralDataProtectionRegulationApi#postGdprRequests) | Submit a new GDPR request |
{: class="table-striped"}


# **getGdprRequest**


> [GDPRRequest](GDPRRequest) getGdprRequest(requestId)

Get an existing GDPR request

Wraps GET /api/v2/gdpr/requests/{requestId}  

Requires ANY permissions: 

* gdpr:request:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GeneralDataProtectionRegulationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GeneralDataProtectionRegulationApi apiInstance = new GeneralDataProtectionRegulationApi();
String requestId = "requestId_example"; // String | Request id
try {
    GDPRRequest result = apiInstance.getGdprRequest(requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralDataProtectionRegulationApi#getGdprRequest");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **requestId** | **String**| Request id | 
{: class="table-striped"}


### Return type

[**GDPRRequest**](GDPRRequest)


# **getGdprRequests**


> [GDPRRequestEntityListing](GDPRRequestEntityListing) getGdprRequests(pageSize, pageNumber)

Get all GDPR requests

Wraps GET /api/v2/gdpr/requests  

Requires ANY permissions: 

* gdpr:request:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GeneralDataProtectionRegulationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GeneralDataProtectionRegulationApi apiInstance = new GeneralDataProtectionRegulationApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    GDPRRequestEntityListing result = apiInstance.getGdprRequests(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralDataProtectionRegulationApi#getGdprRequests");
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

[**GDPRRequestEntityListing**](GDPRRequestEntityListing)


# **getGdprSubjects**


> [GDPRSubjectEntityListing](GDPRSubjectEntityListing) getGdprSubjects(searchType, searchValue)

Get GDPR subjects

Wraps GET /api/v2/gdpr/subjects  

Requires ANY permissions: 

* gdpr:subject:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GeneralDataProtectionRegulationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GeneralDataProtectionRegulationApi apiInstance = new GeneralDataProtectionRegulationApi();
String searchType = "searchType_example"; // String | Search Type
String searchValue = "searchValue_example"; // String | Search Value
try {
    GDPRSubjectEntityListing result = apiInstance.getGdprSubjects(searchType, searchValue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralDataProtectionRegulationApi#getGdprSubjects");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **searchType** | **String**| Search Type |<br />**Values**: NAME, ADDRESS, PHONE, EMAIL, TWITTER, INSTAGRAM, FACEBOOK 
| **searchValue** | **String**| Search Value | 
{: class="table-striped"}


### Return type

[**GDPRSubjectEntityListing**](GDPRSubjectEntityListing)


# **postGdprRequests**


> [GDPRRequest](GDPRRequest) postGdprRequests(body, deleteConfirmed)

Submit a new GDPR request

Wraps POST /api/v2/gdpr/requests  

Requires ANY permissions: 

* gdpr:request:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GeneralDataProtectionRegulationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GeneralDataProtectionRegulationApi apiInstance = new GeneralDataProtectionRegulationApi();
GDPRRequest body = new GDPRRequest(); // GDPRRequest | GDPR request
Boolean deleteConfirmed = false; // Boolean | Confirm delete
try {
    GDPRRequest result = apiInstance.postGdprRequests(body, deleteConfirmed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralDataProtectionRegulationApi#postGdprRequests");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**GDPRRequest**](GDPRRequest)| GDPR request | 
| **deleteConfirmed** | **Boolean**| Confirm delete | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**GDPRRequest**](GDPRRequest)


_com.mypurecloud.sdk.v2:platform-client-v2:229.1.0_
