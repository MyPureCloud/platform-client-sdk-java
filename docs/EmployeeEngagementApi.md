# EmployeeEngagementApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteEmployeeengagementCelebration**](EmployeeEngagementApi#deleteEmployeeengagementCelebration) | Deletes a celebration |
| [**getEmployeeengagementCelebrations**](EmployeeEngagementApi#getEmployeeengagementCelebrations) | Get all celebrations |
| [**getEmployeeengagementRecognition**](EmployeeEngagementApi#getEmployeeengagementRecognition) | Gets a single recognition |
| [**patchEmployeeengagementCelebration**](EmployeeEngagementApi#patchEmployeeengagementCelebration) | Set a state for a celebration |
| [**postEmployeeengagementRecognitions**](EmployeeEngagementApi#postEmployeeengagementRecognitions) | Creates a recognition |
{: class="table-striped"}


# **deleteEmployeeengagementCelebration**



> Void deleteEmployeeengagementCelebration(celebrationId)

Deletes a celebration

Wraps DELETE /api/v2/employeeengagement/celebrations/{celebrationId}  

Requires ANY permissions: 

* engagement:celebration:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.EmployeeEngagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

EmployeeEngagementApi apiInstance = new EmployeeEngagementApi();
String celebrationId = "celebrationId_example"; // String | The ID of the celebration
try {
    apiInstance.deleteEmployeeengagementCelebration(celebrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeEngagementApi#deleteEmployeeengagementCelebration");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **celebrationId** | **String**| The ID of the celebration | 
{: class="table-striped"}


### Return type

null (empty response body)


# **getEmployeeengagementCelebrations**



> [GetCelebrationListing](GetCelebrationListing) getEmployeeengagementCelebrations(pageNumber, pageSize)

Get all celebrations

Wraps GET /api/v2/employeeengagement/celebrations  

Requires ANY permissions: 

* engagement:celebration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.EmployeeEngagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

EmployeeEngagementApi apiInstance = new EmployeeEngagementApi();
Integer pageNumber = 1; // Integer | 
Integer pageSize = 25; // Integer | 
try {
    GetCelebrationListing result = apiInstance.getEmployeeengagementCelebrations(pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeEngagementApi#getEmployeeengagementCelebrations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**|  | [optional] [default to 1] 
| **pageSize** | **Integer**|  | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**GetCelebrationListing**](GetCelebrationListing)


# **getEmployeeengagementRecognition**



> [Recognition](Recognition) getEmployeeengagementRecognition(recognitionId)

Gets a single recognition

Wraps GET /api/v2/employeeengagement/recognitions/{recognitionId}  

Requires ANY permissions: 

* engagement:recognition:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.EmployeeEngagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

EmployeeEngagementApi apiInstance = new EmployeeEngagementApi();
String recognitionId = "recognitionId_example"; // String | The Recognition ID
try {
    Recognition result = apiInstance.getEmployeeengagementRecognition(recognitionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeEngagementApi#getEmployeeengagementRecognition");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **recognitionId** | **String**| The Recognition ID | 
{: class="table-striped"}


### Return type

[**Recognition**](Recognition)


# **patchEmployeeengagementCelebration**



> Void patchEmployeeengagementCelebration(celebrationId, body)

Set a state for a celebration

Wraps PATCH /api/v2/employeeengagement/celebrations/{celebrationId}  

Requires ANY permissions: 

* engagement:celebration:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.EmployeeEngagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

EmployeeEngagementApi apiInstance = new EmployeeEngagementApi();
String celebrationId = "celebrationId_example"; // String | The ID of the celebration
CelebrationStateParam body = new CelebrationStateParam(); // CelebrationStateParam | Patch Celebration state
try {
    apiInstance.patchEmployeeengagementCelebration(celebrationId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeEngagementApi#patchEmployeeengagementCelebration");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **celebrationId** | **String**| The ID of the celebration | 
| **body** | [**CelebrationStateParam**](CelebrationStateParam)| Patch Celebration state | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postEmployeeengagementRecognitions**



> [RecognitionBase](RecognitionBase) postEmployeeengagementRecognitions(body)

Creates a recognition

Wraps POST /api/v2/employeeengagement/recognitions  

Requires ANY permissions: 

* engagement:recognition:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.EmployeeEngagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

EmployeeEngagementApi apiInstance = new EmployeeEngagementApi();
CreateRecognition body = new CreateRecognition(); // CreateRecognition | Create Recognition
try {
    RecognitionBase result = apiInstance.postEmployeeengagementRecognitions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeEngagementApi#postEmployeeengagementRecognitions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateRecognition**](CreateRecognition)| Create Recognition | 
{: class="table-striped"}


### Return type

[**RecognitionBase**](RecognitionBase)


_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
