# DependenciesApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredby**](DependenciesApi#getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredby) | Get entities that require the given entity |
| [**getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycounts**](DependenciesApi#getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycounts) | An estimated count of entities that depend on this entity, including indirect dependencies. |
| [**getDependenciesTypeEntityTypeIdEntityIdConnectionsRequires**](DependenciesApi#getDependenciesTypeEntityTypeIdEntityIdConnectionsRequires) | Get entities that the given entity requires |
{: class="table-striped"}


# **getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredby**


> [DependencyEntityListing](DependencyEntityListing) getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredby(entityType, entityId, pageSize, beforeSourceType, beforeSourceId, afterSourceType, afterSourceId)

Get entities that require the given entity

Wraps GET /api/v2/dependencies/type/{entityType}/id/{entityId}/connections/requiredby  

Requires ANY permissions: 

* dependencies:dependency:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.DependenciesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

DependenciesApi apiInstance = new DependenciesApi();
String entityType = "entityType_example"; // String | Entity type
String entityId = "entityId_example"; // String | Entity ID
String pageSize = "25"; // String | Page size (max 100)
String beforeSourceType = "beforeSourceType_example"; // String | Cursor for previous page
String beforeSourceId = "beforeSourceId_example"; // String | Cursor for previous page
String afterSourceType = "afterSourceType_example"; // String | Cursor for next page
String afterSourceId = "afterSourceId_example"; // String | Cursor for next page
try {
    DependencyEntityListing result = apiInstance.getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredby(entityType, entityId, pageSize, beforeSourceType, beforeSourceId, afterSourceType, afterSourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DependenciesApi#getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredby");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityType** | **String**| Entity type |<br />**Values**: Integration, DataAction, Credential 
| **entityId** | **String**| Entity ID | 
| **pageSize** | **String**| Page size (max 100) | [optional] [default to 25] 
| **beforeSourceType** | **String**| Cursor for previous page | [optional] 
| **beforeSourceId** | **String**| Cursor for previous page | [optional] 
| **afterSourceType** | **String**| Cursor for next page | [optional] 
| **afterSourceId** | **String**| Cursor for next page | [optional] 
{: class="table-striped"}


### Return type

[**DependencyEntityListing**](DependencyEntityListing)


# **getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycounts**


> [DependencyCount](DependencyCount) getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycounts(entityType, entityId)

An estimated count of entities that depend on this entity, including indirect dependencies.

Wraps GET /api/v2/dependencies/type/{entityType}/id/{entityId}/connections/requiredbycounts  

Requires ANY permissions: 

* dependencies:dependency:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.DependenciesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

DependenciesApi apiInstance = new DependenciesApi();
String entityType = "entityType_example"; // String | Entity type
String entityId = "entityId_example"; // String | Entity ID
try {
    DependencyCount result = apiInstance.getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycounts(entityType, entityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DependenciesApi#getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycounts");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityType** | **String**| Entity type |<br />**Values**: Integration, DataAction, Credential 
| **entityId** | **String**| Entity ID | 
{: class="table-striped"}


### Return type

[**DependencyCount**](DependencyCount)


# **getDependenciesTypeEntityTypeIdEntityIdConnectionsRequires**


> [DependencyEntityListing](DependencyEntityListing) getDependenciesTypeEntityTypeIdEntityIdConnectionsRequires(entityType, entityId, pageSize, beforeSourceType, beforeSourceId, afterSourceType, afterSourceId)

Get entities that the given entity requires

Wraps GET /api/v2/dependencies/type/{entityType}/id/{entityId}/connections/requires  

Requires ANY permissions: 

* dependencies:dependency:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.DependenciesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

DependenciesApi apiInstance = new DependenciesApi();
String entityType = "entityType_example"; // String | Entity type
String entityId = "entityId_example"; // String | Entity ID
String pageSize = "25"; // String | Page size (max 100)
String beforeSourceType = "beforeSourceType_example"; // String | Cursor for previous page
String beforeSourceId = "beforeSourceId_example"; // String | Cursor for previous page
String afterSourceType = "afterSourceType_example"; // String | Cursor for next page
String afterSourceId = "afterSourceId_example"; // String | Cursor for next page
try {
    DependencyEntityListing result = apiInstance.getDependenciesTypeEntityTypeIdEntityIdConnectionsRequires(entityType, entityId, pageSize, beforeSourceType, beforeSourceId, afterSourceType, afterSourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DependenciesApi#getDependenciesTypeEntityTypeIdEntityIdConnectionsRequires");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityType** | **String**| Entity type |<br />**Values**: Integration, DataAction, Credential 
| **entityId** | **String**| Entity ID | 
| **pageSize** | **String**| Page size (max 100) | [optional] [default to 25] 
| **beforeSourceType** | **String**| Cursor for previous page | [optional] 
| **beforeSourceId** | **String**| Cursor for previous page | [optional] 
| **afterSourceType** | **String**| Cursor for next page | [optional] 
| **afterSourceId** | **String**| Cursor for next page | [optional] 
{: class="table-striped"}


### Return type

[**DependencyEntityListing**](DependencyEntityListing)


_com.mypurecloud.sdk.v2:platform-client-v2:261.0.0_
