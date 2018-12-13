---
title: OrganizationApi
---
## OrganizationApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getFieldconfig**](OrganizationApi.html#getFieldconfig) | Fetch field config for an entity type |
| [**getOrganizationsMe**](OrganizationApi.html#getOrganizationsMe) | Get organization. |
| [**patchOrganizationsFeature**](OrganizationApi.html#patchOrganizationsFeature) | Update organization |
| [**putOrganizationsMe**](OrganizationApi.html#putOrganizationsMe) | Update organization. |
{: class="table table-striped"}

<a name="getFieldconfig"></a>

# **getFieldconfig**



> [FieldConfig](FieldConfig.html) getFieldconfig(type)

Fetch field config for an entity type



Wraps GET /api/v2/fieldconfig  

Requires NO permissions: 


### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud OAuth
OAuth PureCloud OAuth = (OAuth) defaultClient.getAuthentication("PureCloud OAuth");
PureCloud OAuth.setAccessToken("YOUR ACCESS TOKEN");

OrganizationApi apiInstance = new OrganizationApi();
String type = "type_example"; // String | Field type
try {
    FieldConfig result = apiInstance.getFieldconfig(type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getFieldconfig");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **type** | **String**| Field type |<br />**Values**: person, group, org, externalContact |
{: class="table table-striped"}

### Return type

[**FieldConfig**](FieldConfig.html)

<a name="getOrganizationsMe"></a>

# **getOrganizationsMe**



> [Organization](Organization.html) getOrganizationsMe()

Get organization.



Wraps GET /api/v2/organizations/me  

Requires NO permissions: 


### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud OAuth
OAuth PureCloud OAuth = (OAuth) defaultClient.getAuthentication("PureCloud OAuth");
PureCloud OAuth.setAccessToken("YOUR ACCESS TOKEN");

OrganizationApi apiInstance = new OrganizationApi();
try {
    Organization result = apiInstance.getOrganizationsMe();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationsMe");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**Organization**](Organization.html)

<a name="patchOrganizationsFeature"></a>

# **patchOrganizationsFeature**



> [OrganizationFeatures](OrganizationFeatures.html) patchOrganizationsFeature(featureName, enabled)

Update organization



Wraps PATCH /api/v2/organizations/features/{featureName}  

Requires ANY permissions: 

* admin

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud OAuth
OAuth PureCloud OAuth = (OAuth) defaultClient.getAuthentication("PureCloud OAuth");
PureCloud OAuth.setAccessToken("YOUR ACCESS TOKEN");

OrganizationApi apiInstance = new OrganizationApi();
String featureName = "featureName_example"; // String | Organization feature
FeatureState enabled = new FeatureState(); // FeatureState | New state of feature
try {
    OrganizationFeatures result = apiInstance.patchOrganizationsFeature(featureName, enabled);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#patchOrganizationsFeature");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **featureName** | **String**| Organization feature |<br />**Values**: realtimeCIC, purecloud, hipaa, ucEnabled, pci, purecloudVoice, xmppFederation, chat, informalPhotos, directory, contactCenter, unifiedCommunications, custserv |
| **enabled** | [**FeatureState**](FeatureState.html)| New state of feature | |
{: class="table table-striped"}

### Return type

[**OrganizationFeatures**](OrganizationFeatures.html)

<a name="putOrganizationsMe"></a>

# **putOrganizationsMe**



> [Organization](Organization.html) putOrganizationsMe(body)

Update organization.



Wraps PUT /api/v2/organizations/me  

Requires ANY permissions: 

* admin

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud OAuth
OAuth PureCloud OAuth = (OAuth) defaultClient.getAuthentication("PureCloud OAuth");
PureCloud OAuth.setAccessToken("YOUR ACCESS TOKEN");

OrganizationApi apiInstance = new OrganizationApi();
Organization body = new Organization(); // Organization | Organization
try {
    Organization result = apiInstance.putOrganizationsMe(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#putOrganizationsMe");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Organization**](Organization.html)| Organization | [optional] |
{: class="table table-striped"}

### Return type

[**Organization**](Organization.html)

