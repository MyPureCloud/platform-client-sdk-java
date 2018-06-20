---
title: AttributesApi
---
## AttributesApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteAttribute**](AttributesApi.html#deleteAttribute) | Delete an existing Attribute. |
| [**getAttribute**](AttributesApi.html#getAttribute) | Get details about an existing attribute. |
| [**getAttributes**](AttributesApi.html#getAttributes) | Gets a list of existing attributes. |
| [**postAttributes**](AttributesApi.html#postAttributes) | Create an attribute. |
| [**postAttributesQuery**](AttributesApi.html#postAttributesQuery) | Query attributes |
| [**putAttribute**](AttributesApi.html#putAttribute) | Update an existing attribute. |
{: class="table table-striped"}

<a name="deleteAttribute"></a>

# **deleteAttribute**



> Void deleteAttribute(attributeId)

Delete an existing Attribute.

This will remove attribute.

Wraps DELETE /api/v2/attributes/{attributeId}  

Requires NO permissions: 


### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AttributesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AttributesApi apiInstance = new AttributesApi();
String attributeId = "attributeId_example"; // String | Attribute ID
try {
    apiInstance.deleteAttribute(attributeId);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributesApi#deleteAttribute");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **attributeId** | **String**| Attribute ID | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="getAttribute"></a>

# **getAttribute**



> [Attribute](Attribute.html) getAttribute(attributeId)

Get details about an existing attribute.



Wraps GET /api/v2/attributes/{attributeId}  

Requires NO permissions: 


### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AttributesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AttributesApi apiInstance = new AttributesApi();
String attributeId = "attributeId_example"; // String | Attribute ID
try {
    Attribute result = apiInstance.getAttribute(attributeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributesApi#getAttribute");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **attributeId** | **String**| Attribute ID | |
{: class="table table-striped"}

### Return type

[**Attribute**](Attribute.html)

<a name="getAttributes"></a>

# **getAttributes**



> [AttributeEntityListing](AttributeEntityListing.html) getAttributes(pageNumber, pageSize)

Gets a list of existing attributes.



Wraps GET /api/v2/attributes  

Requires NO permissions: 


### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AttributesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AttributesApi apiInstance = new AttributesApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    AttributeEntityListing result = apiInstance.getAttributes(pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributesApi#getAttributes");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
{: class="table table-striped"}

### Return type

[**AttributeEntityListing**](AttributeEntityListing.html)

<a name="postAttributes"></a>

# **postAttributes**



> [Attribute](Attribute.html) postAttributes(body)

Create an attribute.



Wraps POST /api/v2/attributes  

Requires NO permissions: 


### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AttributesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AttributesApi apiInstance = new AttributesApi();
Attribute body = new Attribute(); // Attribute | Attribute
try {
    Attribute result = apiInstance.postAttributes(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributesApi#postAttributes");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Attribute**](Attribute.html)| Attribute | |
{: class="table table-striped"}

### Return type

[**Attribute**](Attribute.html)

<a name="postAttributesQuery"></a>

# **postAttributesQuery**



> [AttributeEntityListing](AttributeEntityListing.html) postAttributesQuery(body)

Query attributes



Wraps POST /api/v2/attributes/query  

Requires NO permissions: 


### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AttributesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AttributesApi apiInstance = new AttributesApi();
AttributeQueryRequest body = new AttributeQueryRequest(); // AttributeQueryRequest | query
try {
    AttributeEntityListing result = apiInstance.postAttributesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributesApi#postAttributesQuery");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**AttributeQueryRequest**](AttributeQueryRequest.html)| query | |
{: class="table table-striped"}

### Return type

[**AttributeEntityListing**](AttributeEntityListing.html)

<a name="putAttribute"></a>

# **putAttribute**



> [Attribute](Attribute.html) putAttribute(attributeId, body)

Update an existing attribute.

Fields that can be updated: name, description. The most recent version is required for updates.

Wraps PUT /api/v2/attributes/{attributeId}  

Requires NO permissions: 


### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AttributesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AttributesApi apiInstance = new AttributesApi();
String attributeId = "attributeId_example"; // String | Attribute ID
Attribute body = new Attribute(); // Attribute | Attribute
try {
    Attribute result = apiInstance.putAttribute(attributeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributesApi#putAttribute");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **attributeId** | **String**| Attribute ID | |
| **body** | [**Attribute**](Attribute.html)| Attribute | |
{: class="table table-striped"}

### Return type

[**Attribute**](Attribute.html)

