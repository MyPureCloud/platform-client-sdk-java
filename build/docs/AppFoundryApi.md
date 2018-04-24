---
title: AppFoundryApi
---
## AppFoundryApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getAppfoundryPlatformNameCategories**](AppFoundryApi.html#getAppfoundryPlatformNameCategories) | Return a structured hierarchy of available listing categories |
| [**getAppfoundryPlatformNameCategory**](AppFoundryApi.html#getAppfoundryPlatformNameCategory) | Get listings that are part of the specified root category or a contained subcategory |
| [**getAppfoundryPlatformNameCategorySubCategoryName**](AppFoundryApi.html#getAppfoundryPlatformNameCategorySubCategoryName) | Get listings that are part of the specified subcategory |
{: class="table table-striped"}

<a name="getAppfoundryPlatformNameCategories"></a>

# **getAppfoundryPlatformNameCategories**

> [List&lt;AppFoundryListingCategory&gt;](AppFoundryListingCategory.html) getAppfoundryPlatformNameCategories(platformName)

Return a structured hierarchy of available listing categories



Wraps GET /api/v2/appfoundry/{platformName}/categories  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AppFoundryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AppFoundryApi apiInstance = new AppFoundryApi();
String platformName = "platformName_example"; // String | 
try {
    List<AppFoundryListingCategory> result = apiInstance.getAppfoundryPlatformNameCategories(platformName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppFoundryApi#getAppfoundryPlatformNameCategories");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **platformName** | **String**|  | |
{: class="table table-striped"}

### Return type

[**List&lt;AppFoundryListingCategory&gt;**](AppFoundryListingCategory.html)

<a name="getAppfoundryPlatformNameCategory"></a>

# **getAppfoundryPlatformNameCategory**

> [PagedListingEntity](PagedListingEntity.html) getAppfoundryPlatformNameCategory(platformName, categoryName, pageSize, pageNumber, sortBy, expand, nextPage, previousPage)

Get listings that are part of the specified root category or a contained subcategory



Wraps GET /api/v2/appfoundry/{platformName}/categories/{categoryName}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AppFoundryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AppFoundryApi apiInstance = new AppFoundryApi();
String platformName = "platformName_example"; // String | 
String categoryName = "categoryName_example"; // String | Name of category to request listings from
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<Object> expand = null; // List<Object> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
try {
    PagedListingEntity result = apiInstance.getAppfoundryPlatformNameCategory(platformName, categoryName, pageSize, pageNumber, sortBy, expand, nextPage, previousPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppFoundryApi#getAppfoundryPlatformNameCategory");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **platformName** | **String**|  | |
| **categoryName** | **String**| Name of category to request listings from | |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] |
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] |
| **sortBy** | **String**| variable name requested to sort by | [optional] |
| **expand** | [**List&lt;Object&gt;**](Object.html)| variable name requested by expand list | [optional] |
| **nextPage** | **String**| next page token | [optional] |
| **previousPage** | **String**| Previous page token | [optional] |
{: class="table table-striped"}

### Return type

[**PagedListingEntity**](PagedListingEntity.html)

<a name="getAppfoundryPlatformNameCategorySubCategoryName"></a>

# **getAppfoundryPlatformNameCategorySubCategoryName**

> [PagedListingEntity](PagedListingEntity.html) getAppfoundryPlatformNameCategorySubCategoryName(platformName, categoryName, subCategoryName, pageSize, pageNumber, sortBy, expand, nextPage, previousPage)

Get listings that are part of the specified subcategory



Wraps GET /api/v2/appfoundry/{platformName}/categories/{categoryName}/{subCategoryName}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.AppFoundryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AppFoundryApi apiInstance = new AppFoundryApi();
String platformName = "platformName_example"; // String | 
String categoryName = "categoryName_example"; // String | Name of category to request listings from
String subCategoryName = "subCategoryName_example"; // String | Name of subcategory to request listings from
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<Object> expand = null; // List<Object> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
try {
    PagedListingEntity result = apiInstance.getAppfoundryPlatformNameCategorySubCategoryName(platformName, categoryName, subCategoryName, pageSize, pageNumber, sortBy, expand, nextPage, previousPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppFoundryApi#getAppfoundryPlatformNameCategorySubCategoryName");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **platformName** | **String**|  | |
| **categoryName** | **String**| Name of category to request listings from | |
| **subCategoryName** | **String**| Name of subcategory to request listings from | |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] |
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] |
| **sortBy** | **String**| variable name requested to sort by | [optional] |
| **expand** | [**List&lt;Object&gt;**](Object.html)| variable name requested by expand list | [optional] |
| **nextPage** | **String**| next page token | [optional] |
| **previousPage** | **String**| Previous page token | [optional] |
{: class="table table-striped"}

### Return type

[**PagedListingEntity**](PagedListingEntity.html)

