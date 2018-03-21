---
title: ObjectsApi
---
## ObjectsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getAuthorizationDivisionsLimit**](ObjectsApi.html#getAuthorizationDivisionsLimit) | Returns the maximum allowed number of divisions. |
| [**postAuthorizationDivisionObject**](ObjectsApi.html#postAuthorizationDivisionObject) | Set the division of a list of objects. The objects must all be of the same type: CAMPAIGN, CONTACTLIST, DNCLIST, MANAGEMENTUNIT, FLOW, QUEUE, USER |
{: class="table table-striped"}

<a name="getAuthorizationDivisionsLimit"></a>

# **getAuthorizationDivisionsLimit**

> Integer getAuthorizationDivisionsLimit()

Returns the maximum allowed number of divisions.



Wraps GET /api/v2/authorization/divisions/limit  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ObjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ObjectsApi apiInstance = new ObjectsApi();
try {
    Integer result = apiInstance.getAuthorizationDivisionsLimit();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectsApi#getAuthorizationDivisionsLimit");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

**Integer**

<a name="postAuthorizationDivisionObject"></a>

# **postAuthorizationDivisionObject**

> [List&lt;AuthzTypedObject&gt;](AuthzTypedObject.html) postAuthorizationDivisionObject(divisionId, objectType, body)

Set the division of a list of objects. The objects must all be of the same type: CAMPAIGN, CONTACTLIST, DNCLIST, MANAGEMENTUNIT, FLOW, QUEUE, USER



Wraps POST /api/v2/authorization/divisions/{divisionId}/objects/{objectType}  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ObjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ObjectsApi apiInstance = new ObjectsApi();
String divisionId = "divisionId_example"; // String | Division ID
String objectType = "objectType_example"; // String | The type of the objects. Must be one of the valid object types
List<String> body = Arrays.asList(new List<String>()); // List<String> | Object Id List
try {
    List<AuthzTypedObject> result = apiInstance.postAuthorizationDivisionObject(divisionId, objectType, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectsApi#postAuthorizationDivisionObject");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **divisionId** | **String**| Division ID | |
| **objectType** | **String**| The type of the objects. Must be one of the valid object types |<br />**Values**: QUEUE, CAMPAIGN, CONTACTLIST, DNCLIST, MANAGEMENTUNIT, FLOW, USER |
| **body** | **List&lt;String&gt;**| Object Id List | |
{: class="table table-striped"}

### Return type

[**List&lt;AuthzTypedObject&gt;**](AuthzTypedObject.html)

